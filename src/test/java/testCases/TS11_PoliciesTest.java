package testCases;

import testBase.BaseClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.Homepage;

public class TS11_PoliciesTest extends BaseClass {

    Homepage home;

    @BeforeMethod
    public void setupDriver(){

        home = new Homepage(driver);

        logger.info("Homepage object initialized successfully");
    }

    @Test(priority = 1)
    public void testCitizenCharterPage() {

        logger.info("***** Starting test: testCitizenCharterPage *****");

        logger.info("Clicking on Citizen Charter page link");

        clickElement(home.getCitizenCharterPageLink());

        String expectedUrl = "https://www.paytm.bank.in/Policies/Citizens-Charter-for-Paytm-Payments-Bank";
        String expectedTitle = "Paytm Payments Bank || Policy || Citizen's Charter for Paytm Payments Bank";

        logger.info("Verifying Citizen Charter page URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testCitizenCharterPage *****");
    }

    @Test(priority = 2)
    public void testDepositAndInterestRatePolicyPage() {

        logger.info("***** Starting test: testDepositAndInterestRatePolicyPage *****");

        logger.info("Clicking on Deposit And Interest Rate Policy PDF link");

        clickElement(home.getDepositAndInterestRatePolicyPageLink());

        String expectedUrl = "https://www.paytm.bank.in/Policies/Deposit-and-Interest-Rate-policy.pdf";
        String expectedTitle = "";

        logger.info("Verifying Deposit And Interest Rate Policy PDF URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testDepositAndInterestRatePolicyPage *****");
    }

    @Test(priority = 3)
    public void testCustomerCompensationPolicyPage() {

        logger.info("***** Starting test: testCustomerCompensationPolicyPage *****");

        logger.info("Clicking on Customer Compensation Policy page link");

        clickElement(home.getCustomerCompensationPolicyPageLink());

        String expectedUrl = "https://www.paytm.bank.in/Policies/Customer-Compensation-Policy-for-Paytm-Payments-Bank";
        String expectedTitle = "Paytm Payments Bank || Policy || Customer Compensation Policy";

        logger.info("Verifying Customer Compensation Policy page URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testCustomerCompensationPolicyPage *****");
    }

    @Test(priority = 4)
    public void testCustomerGrievanceRedressalPolicyPage() {

        logger.info("***** Starting test: testCustomerGrievanceRedressalPolicyPage *****");

        logger.info("Clicking on Customer Grievance Redressal Policy page link");

        clickElement(home.getCustomerGrievanceRedressalPolicyPageLink());

        String expectedUrl = "https://www.paytm.bank.in/Policies/Customer-Grievance-Redressal-Policy-for-Paytm-Payments-Bank";
        String expectedTitle = "Paytm Payments Bank || Policy || Customer Grievance Redressal Policy";

        logger.info("Verifying Customer Grievance Redressal Policy page URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testCustomerGrievanceRedressalPolicyPage *****");
    }

    @Test(priority = 5)
    public void testCharterOfCustomerRightsPage(){

        logger.info("***** Starting test: testCharterOfCustomerRightsPage *****");

        logger.info("Clicking on Charter Of Customer Rights page link");

        clickElement(home.getCharterOfCustomerRightsPageLink());

        String expectedUrl = "Paytm Payments Bank || Policy || Customer Grievance Redressal Policy";
        String expectedTitle = "Paytm Payments Bank || Policy || Charter Of Customer Rights";

        logger.info("Verifying Charter Of Customer Rights page URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testCharterOfCustomerRightsPage *****");
    }

    @Test(priority = 6)
    public void testWhistleBlowerPolicyPage() {

        logger.info("***** Starting test: testWhistleBlowerPolicyPage *****");

        logger.info("Clicking on Whistle Blower Policy PDF link");

        clickElement(home.getWhistleBlowerPolicyPageLink());

        String expectedUrl = "https://www.paytm.bank.in/Policies/Whisle-Blower-Policy.pdf";
        String expectedTitle = "";

        logger.info("Verifying Whistle Blower Policy PDF URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testWhistleBlowerPolicyPage *****");
    }

    @Test(priority = 7)
    public void testCodeOfCommitmentPage() {

        logger.info("***** Starting test: testCodeOfCommitmentPage *****");

        logger.info("Clicking on Code Of Commitment page link");

        clickElement(home.getCodeOfCommitmentPageLink());

        String expectedUrl = "https://www.paytm.bank.in/Policies/code-of-commitment";
        String expectedTitle = "Paytm Payments Bank || Policy || Code Of Commitment";

        logger.info("Verifying Code Of Commitment page URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testCodeOfCommitmentPage *****");
    }

    @Test(priority = 8)
    public void testAadhaarDataPrivacyPolicyPage() {

        logger.info("***** Starting test: testAadhaarDataPrivacyPolicyPage *****");

        logger.info("Clicking on Aadhaar Data Privacy Policy page link");

        clickElement(home.getAadhaarDataPrivacyPolicyPageLink());

        String expectedUrl = "https://www.paytm.bank.in/Policies/aadhaar-data-privacy-policy";
        String expectedTitle = "Paytm Payments Bank || Policy || Aadhaar Data Privacy Policy";

        logger.info("Verifying Aadhaar Data Privacy Policy page URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testAadhaarDataPrivacyPolicyPage *****");
    }

    @Test(priority = 9)
    public void testDoorstepBankingPolicyPage() {

        logger.info("***** Starting test: testDoorstepBankingPolicyPage *****");

        logger.info("Clicking on Doorstep Banking Policy PDF link");

        clickElement(home.getDoorstepBankingPolicyPageLink());

        String expectedUrl = "https://www.paytm.bank.in/Policies/doorstep_banking_policy_v8.pdf";
        String expectedTitle = "";

        logger.info("Verifying Doorstep Banking Policy PDF URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testDoorstepBankingPolicyPage *****");
    }

    @Test(priority = 10)
    public void testFraudPreventionPage() {

        logger.info("***** Starting test: testFraudPreventionPage *****");

        logger.info("Clicking on Fraud Prevention page link");

        clickElement(home.getFraudPreventionPageLink());

        String expectedUrl = "https://www.paytm.bank.in/fraud-prevention";
        String expectedTitle = "Paytm Payments Bank || Fraud Prevention";

        logger.info("Verifying Fraud Prevention page URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testFraudPreventionPage *****");
    }

    @Test(priority = 11)
    public void testPolicyOnAppointmentOfStatutoryAuditorPage() {

        logger.info("***** Starting test: testPolicyOnAppointmentOfStatutoryAuditorPage *****");

        logger.info("Clicking on Policy On Appointment Of Statutory Auditor PDF link");

        clickElement(home.getPolicyOnAppointmentOfStatutoryAuditorPageLink());

        String expectedUrl = "https://www.paytm.bank.in/Policies/Policy-on-appointment-of-Statutory-Auditor.pdf";
        String expectedTitle = "";

        logger.info("Verifying Policy On Appointment Of Statutory Auditor PDF URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testPolicyOnAppointmentOfStatutoryAuditorPage *****");
    }

    @Test(priority = 12)
    public void testContactDetailsOfPNOPage() {

        logger.info("***** Starting test: testContactDetailsOfPNOPage *****");

        logger.info("Clicking on Contact Details Of PNO PDF link");

        clickElement(home.getContactDetailsOfPNOPageLink());

        String expectedUrl = "https://www.paytm.bank.in/Policies/Details-of-PNO.pdf?v=2.0";
        String expectedTitle = "";

        logger.info("Verifying Contact Details Of PNO PDF URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testContactDetailsOfPNOPage *****");
    }

    @Test(priority = 13)
    public void testContactDetailsOfLendersGROPage() {

        logger.info("***** Starting test: testContactDetailsOfLendersGROPage *****");

        logger.info("Clicking on Contact Details Of Lenders GRO PDF link");

        clickElement(home.getContactDetailsOfLendersGROPageLink());

        String expectedUrl = "https://www.paytm.bank.in/Policies/contact-details-of-lender-GRO.pdf";
        String expectedTitle = "";

        logger.info("Verifying Contact Details Of Lenders GRO PDF URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testContactDetailsOfLendersGROPage *****");
    }

    @Test(priority = 14)
    public void testCorporateSocialResponsibilityPolicyPage() {

        logger.info("***** Starting test: testCorporateSocialResponsibilityPolicyPage *****");

        logger.info("Clicking on Corporate Social Responsibility Policy PDF link");

        clickElement(home.getCorporateSocialResponsibilityPolicyPageLink());

        String expectedUrl = "https://www.paytm.bank.in/Policies/Corporate-Social-Responsibility-Policy.pdf";
        String expectedTitle = "";

        logger.info("Verifying Corporate Social Responsibility Policy PDF URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testCorporateSocialResponsibilityPolicyPage *****");
    }

    @Test(priority = 15)
    public void testNominationAndRenumerationPolicyPage() {

        logger.info("***** Starting test: testNominationAndRenumerationPolicyPage *****");

        logger.info("Clicking on Nomination And Renumeration Policy PDF link");

        clickElement(home.getNominationAndRenumerationPolicyPageLink());

        String expectedUrl = "https://www.paytm.bank.in/Policies/Nomination-and-Renumeration-Policy.pdf";
        String expectedTitle = "";

        logger.info("Verifying Nomination And Renumeration Policy PDF URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testNominationAndRenumerationPolicyPage *****");
    }

    @Test(priority = 16)
    public void testNachAndChequeDishonourPolicyPage() {

        logger.info("***** Starting test: testNachAndChequeDishonourPolicyPage *****");

        logger.info("Clicking on NACH And Cheque Dishonour Policy PDF link");

        clickElement(home.getNachAndChequeDishonourPolicyPageLink());

        String expectedUrl = "https://www.paytm.bank.in/Policies/NACH-and-Cheque-Dishonour-Policy.pdf";
        String expectedTitle = "";

        logger.info("Verifying NACH And Cheque Dishonour Policy PDF URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testNachAndChequeDishonourPolicyPage *****");
    }

    @Test(priority = 17)
    public void testAntiBriberyPolicyPage() {

        logger.info("***** Starting test: testAntiBriberyPolicyPage *****");

        logger.info("Clicking on Anti Bribery Policy PDF link");

        clickElement(home.getAntiBriberyPolicyPageLink());

        String expectedUrl = "https://www.paytm.bank.in/Policies/Anit-Bribery-Policy.pdf";
        String expectedTitle = "";

        logger.info("Verifying Anti Bribery Policy PDF URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testAntiBriberyPolicyPage *****");
    }
}