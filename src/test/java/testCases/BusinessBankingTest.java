package testCases;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.Homepage;

public class BusinessBankingTest extends BaseClass {

    Homepage home;

    @BeforeMethod
    public void hoverBusinessBankingButton(){
        home = new Homepage(driver);
        hoverOverElement(home.getBusinessBankingButton());
    }

    @Test
    public void testBusinessAccountPage(){
        clickElement(home.getBusinessAccountPageLink());
        driver.manage().timeouts().pageLoadTimeout(java.time.Duration.ofSeconds(10));
        String expectedUrl = "https://www.paytm.bank.in/business-banking/business-account";
        String expectedTitle = "Paytm Payments Bank || Business Account";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }

    @Test
    public void testSalaryAccountPage(){
        clickElement(home.getSalaryAccountPageLink());
        driver.manage().timeouts().pageLoadTimeout(java.time.Duration.ofSeconds(10));
        String expectedUrl = "https://www.paytm.bank.in/business-banking/salary-account";
        String expectedTitle = "Paytm Payments Bank || Salary Account";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }
}
