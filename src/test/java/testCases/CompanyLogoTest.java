package testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageObjects.Homepage;

public class CompanyLogoTest extends BaseClass {

     Homepage home;
     SoftAssert softAssert;

     @BeforeMethod
     public void setUp() {
         home = new Homepage(driver);
         softAssert = new SoftAssert();
     }

     @Test(priority = 1)
     public void testCompanyLogoVisible() {
         softAssert.assertTrue(home.getHomePageLink().isDisplayed(), "Company logo is not visible on the homepage.");

         softAssert.assertAll();
     }

     @Test(priority = 2)
     public void testCompanyLogoClickable() {
            softAssert.assertTrue(home.getHomePageLink().isEnabled(), "Company logo is not clickable on the homepage.");

            clickElement(home.getHomePageLink());
            driver.manage().timeouts().pageLoadTimeout(java.time.Duration.ofSeconds(10));
            String expectedUrl = "https://www.paytm.bank.in/home";
            String expectedTitle = "Paytm Payments Bank || Home";
            verifyPageURLAndTitle(expectedUrl, expectedTitle);

            softAssert.assertAll();
     }
}
