package footerTestCases;

import headerTestCases.BaseClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.Homepage;

public class InformationTest extends BaseClass {

    Homepage home;

    @BeforeMethod
    public void setupDriver() {
        home = new Homepage(driver);
    }

    @Test(priority = 1)
    public void testTermsAndConditionsPage() {
        clickElement(home.getTermsAndConditionsPageLink());
        String expectedUrl = "https://www.paytm.bank.in/Terms&Conditions";
        String expectedTitle = "Paytm Payments Bank || Terms & Conditions";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }

    @Test(priority = 2)
    public void testDisclaimersPage() {
        clickElement(home.getDisclaimersPageLink());
        String expectedUrl = "https://www.paytm.bank.in/Disclaimer";
        String expectedTitle = "Paytm Payments Bank || Disclaimer";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }

    @Test(priority = 3)
    public void testPrivacyPolicyPage() {
        clickElement(home.getPrivacyPolicyPageLink());
        String expectedUrl = "https://www.paytm.bank.in/PrivacyPolicy";
        String expectedTitle = "Paytm Payments Bank || Privacy Policy";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }

    @Test(priority = 4)
    public void testImportantNoticesPage() {
        clickElement(home.getImportantNoticesPageLink());
        String expectedUrl = "https://www.paytm.bank.in/notices";
        String expectedTitle = "Paytm Payments Bank || Notices";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }

    @Test(priority = 5)
    public void testRegulatoryDisclosuresPage() {
        clickElement(home.getRegulatoryDisclosurePageLink());
        String expectedUrl = "https://www.paytm.bank.in/Disclosure";
        String expectedTitle = "Paytm Payments Bank || Disclosure";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }

    @Test(priority = 6)
    public void testSafetyAndSecurityPage() {
        clickElement(home.getSafetyAndSecurityPageLink());
        String expectedUrl = "https://www.paytm.bank.in/safety";
        String expectedTitle = "Paytm Payments Bank || Safety";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }

    @Test(priority = 7)
    public void testDICGCInsuranceCover() {
        clickElement(home.getDicgcInsuranceCoverPageLink());
        String expectedUrl = "https://www.paytm.bank.in/dicgc-insurance-cover";
        String expectedTitle = "Paytm Payments Bank || DICGC Insurance Cover";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }

    @Test(priority = 8)
    public void testRatesAndCharges() {
        clickElement(home.getRatesAndChargesPageLink2());
        String expectedUrl = "https://www.paytm.bank.in/ratesCharges";
        String expectedTitle = "Paytm Payments Bank || Rates And Charges";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }

    @Test(priority = 9)
    public void testSelectionProcessForIndependentDirectors() {
        clickElement(home.getSelectionProcessForIndependentDirectorsPageLink());
        String expectedUrl = "https://www.paytm.bank.in/Information/Selection-Process-for-Independent-Directors.pdf";
        String expectedTitle = "";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }

    @Test(priority = 10)
    public void testCodeOfConductForIndependentDirectors() {
        clickElement(home.getCodeOfConductForIndependentDirectorsPageLink());
        String expectedUrl = "https://www.paytm.bank.in/Information/Code-of-Conduct-for-Independent-Directors.pdf";
        String expectedTitle = "";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }

    @Test(priority = 11)
    public void testCodeOfConductForEmployees() {
        clickElement(home.getCodeOfConductForEmployeesPageLink());
        String expectedUrl = "https://www.paytm.bank.in/Information/Code-of-Conduct-for-Employees.pdf";
        String expectedTitle = "";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }
}
