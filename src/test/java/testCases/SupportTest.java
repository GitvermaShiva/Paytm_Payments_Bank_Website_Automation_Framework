package testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.Homepage;

public class SupportTest extends BaseClass {

    Homepage home;

    @BeforeMethod
     public void hoverSupportButton() {
         home = new Homepage(driver);
         hoverOverElement(home.getSupportButton());
     }

     @Test(priority = 1)
     public void testSupportContactUsPage() {
            clickElement(home.getSupportContactUsPageLink());
            driver.manage().timeouts().pageLoadTimeout(java.time.Duration.ofSeconds(10));
            String expectedUrl = "https://www.paytm.bank.in/contact-us";
            String expectedTitle = "Paytm Payments Bank || Contact Us";
            verifyPageURLAndTitle(expectedUrl, expectedTitle);
     }

     @Test(priority = 2)
        public void testLodgeAComplaintPage() {
            clickElement(home.getLodgeAComplaintPageLink());
            driver.manage().timeouts().pageLoadTimeout(java.time.Duration.ofSeconds(10));
            String expectedUrl = "https://www.paytm.bank.in/lodge-a-complaint";
            String expectedTitle = "Paytm Payments Bank || Lodge a Complaint";
            verifyPageURLAndTitle(expectedUrl, expectedTitle);
     }

     @Test(priority = 3)
        public void testRatesAndChargesPage() {
            clickElement(home.getRatesAndChargesPageLink());
            driver.manage().timeouts().pageLoadTimeout(java.time.Duration.ofSeconds(10));
            String expectedUrl = "https://www.paytm.bank.in/rates-and-charges";
            String expectedTitle = "Paytm Payments Bank || Rates and Charges";
            verifyPageURLAndTitle(expectedUrl, expectedTitle);
     }

     @Test(priority = 4)
        public void testFAQsPage() {
            clickElement(home.getFaqsPageLink());
            driver.manage().timeouts().pageLoadTimeout(java.time.Duration.ofSeconds(10));
            String expectedUrl = "https://www.paytm.bank.in/faqs";
            String expectedTitle = "Paytm Payments Bank || FAQs";
            verifyPageURLAndTitle(expectedUrl, expectedTitle);
     }
}
