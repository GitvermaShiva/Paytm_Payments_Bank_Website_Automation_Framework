package headerTestCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.net.URL;
import java.time.Duration;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.logging.Logger;

public class BaseClass {

    public WebDriver driver;
    public WebDriverWait wait;
    public Logger logger;
    public Properties properties;

    @BeforeClass
    @Parameters({"Execution_Environment","os", "browser"})
    public void setup(String exe_env, String os, String browser) throws Exception {

        // Initialize logger
        logger = Logger.getLogger(BaseClass.class.getName());
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
                    logger.warning("Unsupported OS specified. Defaulting to LINUX.");
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
                    logger.warning("Unsupported browser specified. Defaulting to Chrome.");
            }

            driver = new RemoteWebDriver(new URL(hubURL), capabilities);
        }

        // Initialize WebDriver with WebDriverManager

        if(exe_env.equals("local")) {
            logger.info("Local Environment Setup");

            //browser
            switch (browser) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
                default:
                    logger.warning("Unsupported browser specified. Defaulting to Chrome.");
            }
        }

        // Initialize WebDriverWait
        wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        
        // Set implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
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
        Actions actions = new Actions(driver);
        wait.until(ExpectedConditions.visibilityOf(element));
        actions.moveToElement(element).perform();
    }

    public void clickElement(WebElement element) {
        Actions actions = new Actions(driver);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        actions.moveToElement(element).click().perform();
        driver.manage().timeouts().pageLoadTimeout(java.time.Duration.ofSeconds(10));
    }

    public void verifyPageURLAndTitle(String expectedUrl, String expectedTitle) {
        SoftAssert softAssert = new SoftAssert();

        //wait.until(ExpectedConditions.urlToBe(expectedUrl));
        String currentUrl = driver.getCurrentUrl();

        //wait.until(ExpectedConditions.titleIs(expectedTitle));
        String currentTitle = driver.getTitle();

        softAssert.assertEquals(currentUrl, expectedUrl, "URL mismatch");
        softAssert.assertEquals(currentTitle, expectedTitle, "Title mismatch");

        // Check if it's a PDF and navigate back to homepage if it is
        if (currentUrl.contains(".pdf")) {
            driver.navigate().to("https://www.paytm.bank.in/");
            removeBannerIfPresent();
        }

        softAssert.assertAll();
    }

    public void scrollToElement(WebElement element) {
        Actions actions = new Actions(driver);
        wait.until(ExpectedConditions.visibilityOf(element));
        actions.moveToElement(element).perform();
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
