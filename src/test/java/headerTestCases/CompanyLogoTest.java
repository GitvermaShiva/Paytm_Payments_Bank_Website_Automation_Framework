package headerTestCases;

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
     }

     @Test(priority = 1)
     public void testCompanyLogoVisible() {
         SoftAssert softAssert = new SoftAssert();

         softAssert.assertTrue(home.getHomePageLink().isDisplayed(), "Company logo is not visible on the homepage.");

         softAssert.assertAll();
     }

     @Test(priority = 2)
     public void testCompanyLogoClickable() {
            clickElement(home.getHomePageLink());
            String expectedUrl = "https://www.paytm.bank.in/home";
            String expectedTitle = "Paytm Payments Bank || Home";
            verifyPageURLAndTitle(expectedUrl, expectedTitle);

            softAssert.assertAll();
     }
}
