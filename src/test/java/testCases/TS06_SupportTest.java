package testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.Homepage;
import testBase.BaseClass;

public class TS06_SupportTest extends BaseClass {

    Homepage home;

    @BeforeMethod
    public void hoverSupportButton() {

        home = new Homepage(driver);

        logger.info("Hovering over Support button");

        hoverOverElement(home.getSupportButton());

        logger.info("Support dropdown displayed successfully");
    }

    @Test(priority = 1)
    public void testSupportContactUsPage() {

        logger.info("***** Starting test: testSupportContactUsPage *****");

        logger.info("Clicking on Support Contact Us page link");

        clickElement(home.getSupportContactUsPageLink());

        String expectedUrl = "https://www.paytm.bank.in/contact";
        String expectedTitle = "Paytm Payments Bank || Contact Us";

        logger.info("Verifying Support Contact Us page URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testSupportContactUsPage *****");
    }

    @Test(priority = 2)
    public void testRatesAndChargesPage() {

        logger.info("***** Starting test: testRatesAndChargesPage *****");

        logger.info("Clicking on Rates And Charges page link");

        clickElement(home.getRatesAndChargesPageLink());

        String expectedUrl = "https://www.paytm.bank.in/ratesCharges";
        String expectedTitle = "Paytm Payments Bank || Rates And Charges";

        logger.info("Verifying Rates And Charges page URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testRatesAndChargesPage *****");
    }

    @Test(priority = 3)
    public void testFAQsPage() {

        logger.info("***** Starting test: testFAQsPage *****");

        logger.info("Clicking on FAQs page link");

        clickElement(home.getFaqsPageLink());

        String expectedUrl = "https://www.paytm.bank.in/faqs";
        String expectedTitle = "Paytm Payments Bank || Faqs";

        logger.info("Verifying FAQs page URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testFAQsPage *****");
    }
}