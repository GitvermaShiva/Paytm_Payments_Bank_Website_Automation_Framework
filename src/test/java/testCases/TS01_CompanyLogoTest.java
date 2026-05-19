package testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageObjects.Homepage;
import testBase.BaseClass;

public class TS01_CompanyLogoTest extends BaseClass {

    Homepage home;
    SoftAssert softAssert;

    @BeforeMethod
    public void setUp() {
        logger.info("Initializing Homepage object");

        home = new Homepage(driver);
        softAssert = new SoftAssert();
    }

    @Test(priority = 1)
    public void testCompanyLogoVisible() {

        logger.info("***** Starting test: testCompanyLogoVisible *****");

        logger.info("Verifying company logo visibility on homepage");

        softAssert.assertTrue(
                home.getHomePageLink().isDisplayed(),
                "Company logo is not visible on the homepage."
        );

        softAssert.assertAll();

        logger.info("***** Finished test: testCompanyLogoVisible *****");
    }

    @Test(priority = 2)
    public void testCompanyLogoClickable() {

        logger.info("***** Starting test: testCompanyLogoClickable *****");

        logger.info("Clicking on company logo");

        clickElement(home.getHomePageLink());

        String expectedUrl = "https://www.paytm.bank.in/home";
        String expectedTitle = "Paytm Payments Bank || Home";

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        softAssert.assertAll();

        logger.info("***** Finished test: testCompanyLogoClickable *****");
    }
}