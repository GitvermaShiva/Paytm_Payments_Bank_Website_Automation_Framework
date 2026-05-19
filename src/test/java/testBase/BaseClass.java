package testBase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Properties;
import org.apache.logging.log4j.Logger;

public class BaseClass {

    public static WebDriver driver;
    public WebDriverWait wait;
    public Logger logger;
    public Properties properties;

    @BeforeClass
    @Parameters({"Execution_Environment","os", "browser", "headless"})
    public void setup(String exe_env, String os, String browser, boolean headless) throws Exception {

        // Initialize logger
        logger = LogManager.getLogger(this.getClass());
        logger.info("Setting up the test environment...");

        // Load properties file
        properties = new Properties();
        FileInputStream file = new FileInputStream("./src/test/resources/config.properties");
        properties.load(file);
        file.close();

        if(exe_env.equals("remote")) {
            logger.info("Remote Environment Setup");

            String hubURL = properties.getProperty("Hub_URL");

            DesiredCapabilities capabilities = new DesiredCapabilities();

            //os
            switch(os){
                case "windows":
                    capabilities.setPlatform(Platform.WINDOWS);
                    break;
                case "mac":
                    capabilities.setPlatform(Platform.MAC);
                    break;
                case "linux":
                    capabilities.setPlatform(Platform.LINUX);
                    break;
                default:
                    logger.warn("Unsupported OS specified. Defaulting to LINUX.");
                    capabilities.setPlatform(Platform.LINUX);
            }

            //browser
            switch(browser){
                case "chrome":
                    capabilities.setBrowserName("chrome");
                    break;
                case "firefox":
                    capabilities.setBrowserName("firefox");
                    break;
                case "edge":
                    capabilities.setBrowserName("edge");
                    break;
                default:
                    logger.warn("Unsupported browser specified. Defaulting to Chrome.");
            }

            driver = new RemoteWebDriver(new URL(hubURL), capabilities);
        }

        if(exe_env.equals("local")) {

            logger.info("Local Environment Setup");

            // Browser
            switch (browser.toLowerCase()) {

                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions chromeOptions = new ChromeOptions();
                    if(headless) {
                        logger.info("Launching Chrome browser in Headless mode");
                        chromeOptions.addArguments("--headless=new");
                        driver = new ChromeDriver(chromeOptions);
                    }else{
                        driver = new ChromeDriver();
                    }
                    break;

                case "firefox":

                    WebDriverManager.firefoxdriver().setup();
                    FirefoxOptions firefoxOptions = new FirefoxOptions();
                    if(headless) {
                        logger.info("Launching Firefox browser in Headless mode");
                        firefoxOptions.addArguments("--headless=new");
                        driver = new FirefoxDriver(firefoxOptions);
                    }else{
                        driver = new FirefoxDriver();
                    }
                    break;

                case "edge":

                    WebDriverManager.edgedriver().setup();
                    EdgeOptions edgeOptions = new EdgeOptions();
                    if(headless) {
                        logger.info("Launching Edge browser in Headless mode");
                        edgeOptions.addArguments("--headless=new");
                        driver = new EdgeDriver(edgeOptions);
                    }else{
                        driver = new EdgeDriver();
                    }
                    break;

                default:

                    logger.warn("Unsupported browser specified. Defaulting to Chrome.");
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
            }
        }

        // Initialize WebDriverWait
        wait= new WebDriverWait(driver, Duration.ofSeconds(5));
        
        // Set implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        // Navigate to the application URL
        driver.get(properties.getProperty("app_URL"));
        driver.manage().window().maximize();

        //Removing banner from the homepage
        removeBannerIfPresent();
    }

    public void removeBannerIfPresent(){

        // Wait for modal button and remove banner
        try {
            WebElement closeButton = wait.until(
                    ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='closeModalBtn']"))
            );
            closeButton.click();
        } catch (Exception e) {
            System.out.println("Modal close button not found or not clickable: " + e.getMessage());
        }
    }

    public void hoverOverElement(WebElement element) {
        Actions act = new Actions(driver);
        //wait.until(ExpectedConditions.visibilityOf(element));
        act.moveToElement(element).perform();
    }

    public void clickElement(WebElement element) {
        Actions act = new Actions(driver);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        act.moveToElement(element).click().perform();
        driver.manage().timeouts().pageLoadTimeout(java.time.Duration.ofSeconds(10));
    }

    public void verifyPageURLAndTitle(String expectedUrl, String expectedTitle) {
        SoftAssert softAssert = new SoftAssert();

        logger.info("Waiting for expected URL: " + expectedUrl);

        wait.until(ExpectedConditions.urlToBe(expectedUrl));
        String currentUrl = driver.getCurrentUrl();

        logger.info("Waiting for expected page title: " + expectedTitle);

        wait.until(ExpectedConditions.titleIs(expectedTitle));
        String currentTitle = driver.getTitle();


        logger.info("Verifying current URL with expected URL");

        softAssert.assertEquals(currentUrl, expectedUrl, "URL mismatch");

        logger.info("Verifying current title with expected title");

        softAssert.assertEquals(currentTitle, expectedTitle, "Title mismatch");

        // Check if it's a PDF and navigate back to homepage if it is
        if (currentUrl.contains(".pdf")) {

            logger.info("PDF page detected. Navigating back to homepage");

            driver.navigate().to("https://www.paytm.bank.in/");

            logger.info("Homepage opened successfully");

            removeBannerIfPresent();
        }

        softAssert.assertAll();

        logger.info("Page URL and Title verification completed successfully");
    }

    public void scrollToElement(WebElement element) {
        Actions act = new Actions(driver);
        wait.until(ExpectedConditions.visibilityOf(element));
        act.moveToElement(element).perform();
    }

    public static String captureScreenshot(String testName) throws IOException {

        String timeStamp = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss")
                .format(new Date());

        TakesScreenshot ts = (TakesScreenshot) driver;

        File sourceFile = ts.getScreenshotAs(OutputType.FILE);

        String targetFilePath = System.getProperty("user.dir")
                + "\\Screenshots\\" + testName + "_" + timeStamp + ".png";

        File targetFile = new File(targetFilePath);

        FileUtils.copyFile(sourceFile, targetFile);

        return targetFilePath;
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
