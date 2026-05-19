package testCases;

import testBase.BaseClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.Homepage;

public class TS10_InformationTest extends BaseClass {

    Homepage home;

    @BeforeMethod
    public void setupDriver() {

        home = new Homepage(driver);

        logger.info("Homepage object initialized successfully");
    }

    @Test(priority = 1)
    public void testTermsAndConditionsPage() {

        logger.info("***** Starting test: testTermsAndConditionsPage *****");

        logger.info("Clicking on Terms And Conditions page link");

        clickElement(home.getTermsAndConditionsPageLink());

        String expectedUrl = "https://www.paytm.bank.in/Terms&Conditions";
        String expectedTitle = "Paytm Payments Bank || Terms & Conditions";

        logger.info("Verifying Terms And Conditions page URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testTermsAndConditionsPage *****");
    }

    @Test(priority = 2)
    public void testDisclaimersPage() {

        logger.info("***** Starting test: testDisclaimersPage *****");

        logger.info("Clicking on Disclaimers page link");

        clickElement(home.getDisclaimersPageLink());

        String expectedUrl = "https://www.paytm.bank.in/Disclaimer";
        String expectedTitle = "Paytm Payments Bank || Disclaimer";

        logger.info("Verifying Disclaimers page URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testDisclaimersPage *****");
    }

    @Test(priority = 3)
    public void testPrivacyPolicyPage() {

        logger.info("***** Starting test: testPrivacyPolicyPage *****");

        logger.info("Clicking on Privacy Policy page link");

        clickElement(home.getPrivacyPolicyPageLink());

        String expectedUrl = "https://www.paytm.bank.in/PrivacyPolicy";
        String expectedTitle = "Paytm Payments Bank || Privacy Policy";

        logger.info("Verifying Privacy Policy page URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testPrivacyPolicyPage *****");
    }

    @Test(priority = 4)
    public void testImportantNoticesPage() {

        logger.info("***** Starting test: testImportantNoticesPage *****");

        logger.info("Clicking on Important Notices page link");

        clickElement(home.getImportantNoticesPageLink());

        String expectedUrl = "https://www.paytm.bank.in/notices";
        String expectedTitle = "Paytm Payments Bank || Notices";

        logger.info("Verifying Important Notices page URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testImportantNoticesPage *****");
    }

    @Test(priority = 5)
    public void testRegulatoryDisclosuresPage() {

        logger.info("***** Starting test: testRegulatoryDisclosuresPage *****");

        logger.info("Clicking on Regulatory Disclosures page link");

        clickElement(home.getRegulatoryDisclosurePageLink());

        String expectedUrl = "https://www.paytm.bank.in/Disclosure";
        String expectedTitle = "Paytm Payments Bank || Disclosure";

        logger.info("Verifying Regulatory Disclosures page URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testRegulatoryDisclosuresPage *****");
    }

    @Test(priority = 6)
    public void testSafetyAndSecurityPage() {

        logger.info("***** Starting test: testSafetyAndSecurityPage *****");

        logger.info("Clicking on Safety And Security page link");

        clickElement(home.getSafetyAndSecurityPageLink());

        String expectedUrl = "https://www.paytm.bank.in/safety";
        String expectedTitle = "Paytm Payments Bank || Safety";

        logger.info("Verifying Safety And Security page URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testSafetyAndSecurityPage *****");
    }

    @Test(priority = 7)
    public void testDICGCInsuranceCover() {

        logger.info("***** Starting test: testDICGCInsuranceCover *****");

        logger.info("Clicking on DICGC Insurance Cover page link");

        clickElement(home.getDicgcInsuranceCoverPageLink());

        String expectedUrl = "https://www.paytm.bank.in/dicgc-insurance-cover";
        String expectedTitle = "Paytm Payments Bank || DICGC Insurance Cover";

        logger.info("Verifying DICGC Insurance Cover page URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testDICGCInsuranceCover *****");
    }

    @Test(priority = 8)
    public void testRatesAndCharges() {

        logger.info("***** Starting test: testRatesAndCharges *****");

        logger.info("Clicking on Rates And Charges page link");

        clickElement(home.getRatesAndChargesPageLink2());

        String expectedUrl = "https://www.paytm.bank.in/ratesCharges";
        String expectedTitle = "Paytm Payments Bank || Rates And Charges";

        logger.info("Verifying Rates And Charges page URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testRatesAndCharges *****");
    }

    @Test(priority = 9)
    public void testSelectionProcessForIndependentDirectors() {

        logger.info("***** Starting test: testSelectionProcessForIndependentDirectors *****");

        logger.info("Clicking on Selection Process For Independent Directors PDF link");

        clickElement(home.getSelectionProcessForIndependentDirectorsPageLink());

        String expectedUrl = "https://www.paytm.bank.in/Information/Selection-Process-for-Independent-Directors.pdf";
        String expectedTitle = "";

        logger.info("Verifying Selection Process For Independent Directors PDF URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testSelectionProcessForIndependentDirectors *****");
    }

    @Test(priority = 10)
    public void testCodeOfConductForIndependentDirectors() {

        logger.info("***** Starting test: testCodeOfConductForIndependentDirectors *****");

        logger.info("Clicking on Code Of Conduct For Independent Directors PDF link");

        clickElement(home.getCodeOfConductForIndependentDirectorsPageLink());

        String expectedUrl = "https://www.paytm.bank.in/Information/Code-of-Conduct-for-Independent-Directors.pdf";
        String expectedTitle = "";

        logger.info("Verifying Code Of Conduct For Independent Directors PDF URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testCodeOfConductForIndependentDirectors *****");
    }

    @Test(priority = 11)
    public void testCodeOfConductForEmployees() {

        logger.info("***** Starting test: testCodeOfConductForEmployees *****");

        logger.info("Clicking on Code Of Conduct For Employees PDF link");

        clickElement(home.getCodeOfConductForEmployeesPageLink());

        String expectedUrl = "https://www.paytm.bank.in/Information/Code-of-Conduct-for-Employees.pdf";
        String expectedTitle = "";

        logger.info("Verifying Code Of Conduct For Employees PDF URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testCodeOfConductForEmployees *****");
    }
}