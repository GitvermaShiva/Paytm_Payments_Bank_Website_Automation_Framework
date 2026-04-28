package testCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
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
    public void setup() throws Exception {

        // Initialize logger
        logger = Logger.getLogger(BaseClass.class.getName());
        logger.info("Setting up the test environment...");

        // Load properties file
        properties = new Properties();
        FileInputStream file = new FileInputStream("./src/test/resources/config.properties");
        properties.load(file);
        file.close();

        // Initialize WebDriver with WebDriverManager
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        
        // Set implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        // Navigate to the application URL
        String baseUrl = properties.getProperty("app_URL", "https://www.paytm.bank.in/");
        driver.get(baseUrl);
        driver.manage().window().maximize();

        // Wait for modal button and remove banner
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement closeButton = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='closeModalBtn']"))
            );
            closeButton.click();
        } catch (Exception e) {
            System.out.println("Modal close button not found or not clickable: " + e.getMessage());
        }
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
