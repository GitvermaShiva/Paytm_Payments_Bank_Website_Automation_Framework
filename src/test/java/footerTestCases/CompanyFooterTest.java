package footerTestCases;

import headerTestCases.BaseClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.Homepage;

public class CompanyFooterTest extends BaseClass {

    Homepage home;

    @BeforeMethod
    public void setupDriver() {
        home = new Homepage(driver);
    }

    @Test(priority = 1)
    public void testAboutUsPage() {
        clickElement(home.getAboutUsPageLink2());
        String expectedUrl = "https://www.paytm.bank.in/about";
        String expectedTitle = "Paytm Payments Bank || About Us";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }

    @Test(priority = 2)
    public void testFAQsPage() {
        clickElement(home.getFaqsPageLink2());
        String expectedUrl = "https://www.paytm.bank.in/faqs";
        String expectedTitle = "Paytm Payments Bank || Faqs";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }

    @Test(priority = 5)
    public void testContactUsPage() {
        clickElement(home.getContactUsPageLink2());
        String expectedUrl = "https://www.paytm.bank.in/contact";
        String expectedTitle = "Paytm Payments Bank || Contact Us";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }

    @Test(priority = 6)
    public void testActiveKYCPointsPage() {
        clickElement(home.getActiveKYCPointsPageLink());
        String expectedUrl = "https://www.paytm.bank.in/kyc";
        String expectedTitle = "Paytm Payments Bank || Kyc";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }

    @Test(priority = 7)
    public void testRegisterKYCPointPage() {
        clickElement(home.getRegisterKYCPointPageLink());
        String expectedUrl = "https://www.paytm.bank.in/bca/registration-form";
        String expectedTitle = "Paytm Payments Bank";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }

    @Test(priority = 8)
    public void testTerminateKYCPointsPage() {
        clickElement(home.getTerminateKYCPointsPageLink());
        String expectedUrl = "https://www.paytm.bank.in/terminated-kyc-points";
        String expectedTitle = "Paytm Payments Bank || Terminated KYC Points";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }

     @Test(priority = 9)
    public void testCareersPage() {
         clickElement(home.getCareersPageLink2());
         String expectedUrl = "https://jobs.lever.co/paytmbank";
         String expectedTitle = "Not found -- 404 error";
         verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }
}
