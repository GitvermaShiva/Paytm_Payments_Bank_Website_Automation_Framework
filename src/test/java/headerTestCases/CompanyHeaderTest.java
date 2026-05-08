package headerTestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.Homepage;

public class CompanyHeaderTest extends BaseClass {

    Homepage home;

    @BeforeMethod
    public void hoverLoanReferralButton() {
        home = new Homepage(driver);
        hoverOverElement(home.getCompanyButton());
    }

    @Test(priority = 1)
    public void testAboutUsPage() {
        clickElement(home.getAboutUsPageLink());
        String expectedUrl = "https://www.paytm.bank.in/about";
        String expectedTitle = "Paytm Payments Bank || About Us";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }

    @Test(priority = 2)
    public void testBoardOfDirectorsPage() {
        clickElement(home.getBoardOfDirectorsPageLink());
        String expectedUrl = "https://www.paytm.bank.in/board-of-directors";
        String expectedTitle = "Paytm Payments Bank || Board Of Directors";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }

    @Test(priority = 3)
    public void testContactUsPage() {
        clickElement(home.getContactUsPageLink());
        String expectedUrl = "https://www.paytm.bank.in/contact";
        String expectedTitle = "Paytm Payments Bank || Contact Us";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }

    @Test(priority = 4)
    public void testCareerPage() {
        clickElement(home.getCareersPageLink());
        String expectedUrl = "https://jobs.lever.co/paytmbank";
        String expectedTitle = "Not found -- 404 error";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }
}
