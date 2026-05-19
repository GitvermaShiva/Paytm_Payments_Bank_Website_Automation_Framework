package testCases;

import testBase.BaseClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.Homepage;

public class TS09_CompanyFooterTest extends BaseClass {

    Homepage home;

    @BeforeMethod
    public void setupDriver() {

        home = new Homepage(driver);

        logger.info("Homepage object initialized successfully");
    }

    @Test(priority = 1)
    public void testAboutUsPage() {

        logger.info("***** Starting test: testAboutUsPage *****");

        logger.info("Clicking on About Us page link");

        clickElement(home.getAboutUsPageLink2());

        String expectedUrl = "https://www.paytm.bank.in/about";
        String expectedTitle = "Paytm Payments Bank || About Us";

        logger.info("Verifying About Us page URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testAboutUsPage *****");
    }

    @Test(priority = 2)
    public void testFAQsPage() {

        logger.info("***** Starting test: testFAQsPage *****");

        logger.info("Clicking on FAQs page link");

        clickElement(home.getFaqsPageLink2());

        String expectedUrl = "https://www.paytm.bank.in/faqs";
        String expectedTitle = "Paytm Payments Bank || Faqs";

        logger.info("Verifying FAQs page URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testFAQsPage *****");
    }

    @Test(priority = 5)
    public void testContactUsPage() {

        logger.info("***** Starting test: testContactUsPage *****");

        logger.info("Clicking on Contact Us page link");

        clickElement(home.getContactUsPageLink2());

        String expectedUrl = "https://www.paytm.bank.in/contact";
        String expectedTitle = "Paytm Payments Bank || Contact Us";

        logger.info("Verifying Contact Us page URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testContactUsPage *****");
    }

    @Test(priority = 6)
    public void testActiveKYCPointsPage() {

        logger.info("***** Starting test: testActiveKYCPointsPage *****");

        logger.info("Clicking on Active KYC Points page link");

        clickElement(home.getActiveKYCPointsPageLink());

        String expectedUrl = "https://www.paytm.bank.in/kyc";
        String expectedTitle = "Paytm Payments Bank || Kyc";

        logger.info("Verifying Active KYC Points page URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testActiveKYCPointsPage *****");
    }

    @Test(priority = 7)
    public void testRegisterKYCPointPage() {

        logger.info("***** Starting test: testRegisterKYCPointPage *****");

        logger.info("Clicking on Register KYC Point page link");

        clickElement(home.getRegisterKYCPointPageLink());

        String expectedUrl = "https://www.paytm.bank.in/bca/registration-form";
        String expectedTitle = "Paytm Payments Bank";

        logger.info("Verifying Register KYC Point page URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testRegisterKYCPointPage *****");
    }

    @Test(priority = 8)
    public void testTerminateKYCPointsPage() {

        logger.info("***** Starting test: testTerminateKYCPointsPage *****");

        logger.info("Clicking on Terminate KYC Points page link");

        clickElement(home.getTerminateKYCPointsPageLink());

        String expectedUrl = "https://www.paytm.bank.in/terminated-kyc-points";
        String expectedTitle = "Paytm Payments Bank || Terminated KYC Points";

        logger.info("Verifying Terminate KYC Points page URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testTerminateKYCPointsPage *****");
    }

    @Test(priority = 9)
    public void testCareersPage() {

        logger.info("***** Starting test: testCareersPage *****");

        logger.info("Clicking on Careers page link");

        clickElement(home.getCareersPageLink2());

        String expectedUrl = "https://jobs.lever.co/paytmbank";
        String expectedTitle = "Not found -- 404 error";

        logger.info("Verifying Careers page URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testCareersPage *****");
    }
}