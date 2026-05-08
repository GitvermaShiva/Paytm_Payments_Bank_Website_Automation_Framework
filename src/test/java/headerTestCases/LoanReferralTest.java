package headerTestCases;

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
        String expectedUrl = "https://www.paytm.bank.in/loan-referral";
        String expectedTitle = "Paytm Payments Bank || Loan Referral";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }
}
