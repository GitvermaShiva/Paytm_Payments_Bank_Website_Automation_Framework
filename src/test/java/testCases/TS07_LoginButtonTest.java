package testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.Homepage;
import testBase.BaseClass;

public class TS07_LoginButtonTest extends BaseClass {

    Homepage home;

    @BeforeMethod
    public void hoverLoginButton() {

        home = new Homepage(driver);

        logger.info("Hovering over Login button");

        hoverOverElement(home.getLoginButton());

        logger.info("Login dropdown displayed successfully");
    }

    @Test(priority = 1)
    public void testCorporateBankingLoginPage() {

        logger.info("***** Starting test: testCorporateBankingLoginPage *****");

        logger.info("Clicking on Corporate Banking Login page link");

        clickElement(home.getCorporateBankingPageLink());

        logger.info("Switching to newly opened Corporate Banking Login window");

        driver.switchTo().window(
                driver.getWindowHandles()
                        .stream()
                        .skip(1)
                        .findFirst()
                        .orElseThrow(() -> new RuntimeException("New window not found"))
        );


        driver.manage().timeouts().pageLoadTimeout(java.time.Duration.ofSeconds(10));

        String expectedUrl = "https://netbanking.paytm.bank.in/";
        String expectedTitle = "Paytm Payments Bank | Login";

        logger.info("Verifying Corporate Banking Login page URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testCorporateBankingLoginPage *****");
    }

    @Test(priority = 2)
    public void testPersonalBankingLoginPage() {

        logger.info("***** Starting test: testPersonalBankingLoginPage *****");

        logger.info("Clicking on Personal Banking Login page link");

        clickElement(home.getPersonalBankingPageLink());

        logger.info("Switching to newly opened Personal Banking Login window");

        driver.switchTo().window(
                driver.getWindowHandles()
                        .stream()
                        .skip(1)
                        .findFirst()
                        .orElseThrow(() -> new RuntimeException("New window not found"))
        );

        driver.manage().timeouts().pageLoadTimeout(java.time.Duration.ofSeconds(10));

        String expectedUrl = "https://webapp.paytm.bank.in/";
        String expectedTitle = "Paytm Payments Bank | Login";

        logger.info("Verifying Personal Banking Login page URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testPersonalBankingLoginPage *****");
    }
}