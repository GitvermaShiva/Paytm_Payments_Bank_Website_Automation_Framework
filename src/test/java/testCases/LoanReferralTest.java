package testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.Homepage;

public class LoanReferralTest extends BaseClass {

    Homepage home;

    @BeforeMethod
    public void hoverLoanReferralButton() {
        home = new Homepage(driver);
        hoverOverElement(home.getLoanReferralButton());
    }

    @Test
    public void testLoanReferralPage() {
        clickElement(home.getLoanReferralPageLink());
        driver.manage().timeouts().pageLoadTimeout(java.time.Duration.ofSeconds(10));
        String expectedUrl = "https://www.paytm.bank.in/loan-referral/personal-loan-referral";
        String expectedTitle = "Paytm Payments Bank || Personal Loan Referral";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }
}
