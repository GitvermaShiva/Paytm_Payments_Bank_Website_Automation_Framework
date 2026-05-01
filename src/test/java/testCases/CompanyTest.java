package testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.Homepage;

public class CompanyTest extends BaseClass {

    Homepage home;

    @BeforeMethod
    public void hoverLoanReferralButton() {
        home = new Homepage(driver);
        hoverOverElement(home.getCompanyButton());
    }

    @Test(priority = 1)
    public void testAboutUsPage() {
        clickElement(home.getAboutUsPageLink());
        driver.manage().timeouts().pageLoadTimeout(java.time.Duration.ofSeconds(10));
        String expectedUrl = "https://www.paytm.bank.in/about-us";
        String expectedTitle = "Paytm Payments Bank || About Us";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }

    @Test(priority = 2)
    public void testBoardOfDirectorsPage() {
        clickElement(home.getBoardOfDirectorsPageLink());
        driver.manage().timeouts().pageLoadTimeout(java.time.Duration.ofSeconds(10));
        String expectedUrl = "https://www.paytm.bank.in/board-of-directors";
        String expectedTitle = "Paytm Payments Bank || Board of Directors";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }

    @Test(priority = 3)
    public void testContactUsPage() {
        clickElement(home.getContactUsPageLink());
        driver.manage().timeouts().pageLoadTimeout(java.time.Duration.ofSeconds(10));
        String expectedUrl = "https://www.paytm.bank.in/contact-us";
        String expectedTitle = "Paytm Payments Bank || Contact Us";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }

    @Test(priority = 4)
    public void testCareerPage() {
        clickElement(home.getCareersPageLink());
        driver.manage().timeouts().pageLoadTimeout(java.time.Duration.ofSeconds(10));
        String expectedUrl = "https://www.paytm.bank.in/careera";
        String expectedTitle = "Paytm Payments Bank || Careers";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }
}
