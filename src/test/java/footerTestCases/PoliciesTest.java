package footerTestCases;

import headerTestCases.BaseClass;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.Homepage;

public class PoliciesTest extends BaseClass {

    Homepage home;

    @BeforeMethod
    public void setupDriver(){
        home = new Homepage(driver);
    }

    @Test(priority = 1)
    public void testCitizenCharterPage() {
        clickElement(home.getCitizenCharterPageLink());
        String expectedUrl = "https://www.paytm.bank.in/Policies/Citizens-Charter-for-Paytm-Payments-Bank";
        String expectedTitle = "Paytm Payments Bank || Policy || Citizen's Charter for Paytm Payments Bank";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }

    @Test(priority = 2)
    public void testDepositAndInterestRatePolicyPage() {
        clickElement(home.getDepositAndInterestRatePolicyPageLink());
        String expectedUrl = "https://www.paytm.bank.in/Policies/Deposit-and-Interest-Rate-policy.pdf";
        String expectedTitle = "";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }

    @Test(priority = 3)
    public void testCustomerCompensationPolicyPage() {
        clickElement(home.getCustomerCompensationPolicyPageLink());
        String expectedUrl = "https://www.paytm.bank.in/Policies/Customer-Compensation-Policy-for-Paytm-Payments-Bank";
        String expectedTitle = "Paytm Payments Bank || Policy || Customer Compensation Policy";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }

    @Test(priority = 4)
    public void testCustomerGrievanceRedressalPolicyPage() {
        clickElement(home.getCustomerGrievanceRedressalPolicyPageLink());
        String expectedUrl = "https://www.paytm.bank.in/Policies/Customer-Grievance-Redressal-Policy-for-Paytm-Payments-Bank";
        String expectedTitle = "Paytm Payments Bank || Policy || Customer Grievance Redressal Policy";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }

    @Test(priority = 5)
    public void testCharterOfCustomerRightsPage(){
        clickElement(home.getCharterOfCustomerRightsPageLink());
        String expectedUrl = "Paytm Payments Bank || Policy || Customer Grievance Redressal Policy";
        String expectedTitle = "Paytm Payments Bank || Policy || Charter Of Customer Rights";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }

    @Test(priority = 6)
    public void testWhistleBlowerPolicyPage() {
        clickElement(home.getWhistleBlowerPolicyPageLink());
        String expectedUrl = "https://www.paytm.bank.in/Policies/Whisle-Blower-Policy.pdf";
        String expectedTitle = "";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }

    @Test(priority = 7)
    public void testCodeOfCommitmentPage() {
        clickElement(home.getCodeOfCommitmentPageLink());
        String expectedUrl = "https://www.paytm.bank.in/Policies/code-of-commitment";
        String expectedTitle = "Paytm Payments Bank || Policy || Code Of Commitment";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }

    @Test(priority = 8)
    public void testAadhaarDataPrivacyPolicyPage() {
        clickElement(home.getAadhaarDataPrivacyPolicyPageLink());
        String expectedUrl = "https://www.paytm.bank.in/Policies/aadhaar-data-privacy-policy";
        String expectedTitle = "Paytm Payments Bank || Policy || Aadhaar Data Privacy Policy";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }

    @Test(priority = 9)
    public void testDoorstepBankingPolicyPage() {
        clickElement(home.getDoorstepBankingPolicyPageLink());
        String expectedUrl = "https://www.paytm.bank.in/Policies/doorstep_banking_policy_v8.pdf";
        String expectedTitle = "";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }

    @Test(priority = 10)
    public void testFraudPreventionPage() {
        clickElement(home.getFraudPreventionPageLink());
        String expectedUrl = "https://www.paytm.bank.in/fraud-prevention";
        String expectedTitle = "Paytm Payments Bank || Fraud Prevention";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }

    @Test(priority = 11)
    public void testPolicyOnAppointmentOfStatutoryAuditorPage() {
        clickElement(home.getPolicyOnAppointmentOfStatutoryAuditorPageLink());
        String expectedUrl = "https://www.paytm.bank.in/Policies/Policy-on-appointment-of-Statutory-Auditor.pdf";
        String expectedTitle = "";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }

    @Test(priority = 12)
    public void testContactDetailsOfPNOPage() {
        clickElement(home.getContactDetailsOfPNOPageLink());
        String expectedUrl = "https://www.paytm.bank.in/Policies/Details-of-PNO.pdf?v=2.0";
        String expectedTitle = "";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }

    @Test(priority = 13)
    public void testContactDetailsOfLendersGROPage() {
        clickElement(home.getContactDetailsOfLendersGROPageLink());
        String expectedUrl = "https://www.paytm.bank.in/Policies/contact-details-of-lender-GRO.pdf";
        String expectedTitle = "";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }

    @Test(priority = 14)
    public void testCorporateSocialResponsibilityPolicyPage() {
        clickElement(home.getCorporateSocialResponsibilityPolicyPageLink());
        String expectedUrl = "https://www.paytm.bank.in/Policies/Corporate-Social-Responsibility-Policy.pdf";
        String expectedTitle = "";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }

    @Test(priority = 15)
    public void testNominationAndRenumerationPolicyPage() {
        clickElement(home.getNominationAndRenumerationPolicyPageLink());
        String expectedUrl = "https://www.paytm.bank.in/Policies/Nomination-and-Renumeration-Policy.pdf";
        String expectedTitle = "";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }

    @Test(priority = 16)
    public void testNachAndChequeDishonourPolicyPage() {
        clickElement(home.getNachAndChequeDishonourPolicyPageLink());
        String expectedUrl = "https://www.paytm.bank.in/Policies/NACH-and-Cheque-Dishonour-Policy.pdf";
        String expectedTitle = "";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }

    @Test(priority = 17)
    public void testAntiBriberyPolicyPage() {
        clickElement(home.getAntiBriberyPolicyPageLink());
        String expectedUrl = "https://www.paytm.bank.in/Policies/Anit-Bribery-Policy.pdf";
        String expectedTitle = "";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }
}

