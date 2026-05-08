package headerTestCases;

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
            String expectedUrl = "https://www.paytm.bank.in/contact";
            String expectedTitle = "Paytm Payments Bank || Contact Us";
            verifyPageURLAndTitle(expectedUrl, expectedTitle);
     }

     @Test(priority = 2)
        public void testRatesAndChargesPage() {
            clickElement(home.getRatesAndChargesPageLink());
            String expectedUrl = "https://www.paytm.bank.in/ratesCharges";
            String expectedTitle = "Paytm Payments Bank || Rates And Charges";
            verifyPageURLAndTitle(expectedUrl, expectedTitle);
     }

     @Test(priority = 3)
        public void testFAQsPage() {
            clickElement(home.getFaqsPageLink());
            String expectedUrl = "https://www.paytm.bank.in/faqs";
            String expectedTitle = "Paytm Payments Bank || Faqs";
            verifyPageURLAndTitle(expectedUrl, expectedTitle);
     }
}
