package testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.Homepage;
import testBase.BaseClass;

public class TS05_CompanyHeaderTest extends BaseClass {

    Homepage home;

    @BeforeMethod
    public void hoverLoanReferralButton() {

        home = new Homepage(driver);

        logger.info("Hovering over Company button");

        hoverOverElement(home.getCompanyButton());

        logger.info("Company dropdown displayed successfully");
    }

    @Test(priority = 1)
    public void testAboutUsPage() {

        logger.info("***** Starting test: testAboutUsPage *****");

        logger.info("Clicking on About Us page link");

        clickElement(home.getAboutUsPageLink());

        String expectedUrl = "https://www.paytm.bank.in/about";
        String expectedTitle = "Paytm Payments Bank || About Us";

        logger.info("Verifying About Us page URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testAboutUsPage *****");
    }

    @Test(priority = 2)
    public void testBoardOfDirectorsPage() {

        logger.info("***** Starting test: testBoardOfDirectorsPage *****");

        logger.info("Clicking on Board Of Directors page link");

        clickElement(home.getBoardOfDirectorsPageLink());

        String expectedUrl = "https://www.paytm.bank.in/board-of-directors";
        String expectedTitle = "Paytm Payments Bank || Board Of Directors";

        logger.info("Verifying Board Of Directors page URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testBoardOfDirectorsPage *****");
    }

    @Test(priority = 3)
    public void testContactUsPage() {

        logger.info("***** Starting test: testContactUsPage *****");

        logger.info("Clicking on Contact Us page link");

        clickElement(home.getContactUsPageLink());

        String expectedUrl = "https://www.paytm.bank.in/contact";
        String expectedTitle = "Paytm Payments Bank || Contact Us";

        logger.info("Verifying Contact Us page URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testContactUsPage *****");
    }

    @Test(priority = 4)
    public void testCareerPage() {

        logger.info("***** Starting test: testCareerPage *****");

        logger.info("Clicking on Careers page link");

        clickElement(home.getCareersPageLink());

        String expectedUrl = "https://jobs.lever.co/paytmbank";
        String expectedTitle = "Not found -- 404 error";

        logger.info("Verifying Careers page URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testCareerPage *****");
    }
}