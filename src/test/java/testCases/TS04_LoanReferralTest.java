package testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.Homepage;
import testBase.BaseClass;

public class TS04_LoanReferralTest extends BaseClass {

    Homepage home;

    @BeforeMethod
    public void hoverLoanReferralButton() {

        home = new Homepage(driver);

        logger.info("Hovering over Loan Referral button");

        hoverOverElement(home.getLoanReferralButton());

        logger.info("Loan Referral dropdown displayed successfully");
    }

    @Test(priority = 1)
    public void testLoanReferralPage() {

        logger.info("***** Starting test: testLoanReferralPage *****");

        logger.info("Clicking on Loan Referral page link");

        clickElement(home.getLoanReferralPageLink());

        String expectedUrl = "https://www.paytm.bank.in/loan-referral";
        String expectedTitle = "Paytm Payments Bank || Loan Referral";

        logger.info("Verifying Loan Referral page URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testLoanReferralPage *****");
    }
}