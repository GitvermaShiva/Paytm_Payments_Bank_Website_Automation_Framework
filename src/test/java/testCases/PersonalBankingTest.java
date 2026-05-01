package testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.Homepage;

public class PersonalBankingTest extends BaseClass{

    Homepage home;

    @BeforeMethod
    public void hoverPersonalBankingButton(){
        home=new Homepage(driver);
        hoverOverElement(home.getPersonalBankingButton());
    }

    @Test(priority = 1)
    public void testSavingsAccountPage(){
        clickElement(home.getSavingsAccountPageLink());
        driver.manage().timeouts().pageLoadTimeout(java.time.Duration.ofSeconds(10));
        //The dropdown window should be hidden after clicking the link, so we need to hover over the Personal Banking button again to reveal the dropdown and access the elements on the Savings Account page
        String expectedUrl = "https://www.paytm.bank.in/personal-banking/savings-account";
        String expectedTitle = "Paytm Payments Bank || Savings Account";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }

    @Test(priority = 2)
    public void testWalletPage(){
        clickElement(home.getWalletPageLink());
        driver.manage().timeouts().pageLoadTimeout(java.time.Duration.ofSeconds(10));
        String expectedUrl = "https://www.paytm.bank.in/personal-banking/wallet";
        String expectedTitle = "Paytm Payments Bank || Wallet";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }
    
    @Test(priority = 3)
    public void testDebitCardsPage(){
        clickElement(home.getDebitCardsPageLink());
        driver.manage().timeouts().pageLoadTimeout(java.time.Duration.ofSeconds(10));
        String expectedUrl = "https://www.paytm.bank.in/personal-banking/debit-cards";
        String expectedTitle = "Paytm Payments Bank || Debit Cards";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }
    
    @Test(priority = 4)
    public void testPaytmPaymentsBankAgentPage(){
        clickElement(home.getPaytmPaymentsBankAgentPageLink());
        driver.manage().timeouts().pageLoadTimeout(java.time.Duration.ofSeconds(10));
        String expectedUrl = "https://www.paytm.bank.in/personal-banking/paytm-payments-bank-agent";
        String expectedTitle = "Paytm Payments Bank || Paytm Payments Bank Agent";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }

    @Test(priority = 5)
    public void testFASTagPage(){
        clickElement(home.getFastagPageLink());
        driver.manage().timeouts().pageLoadTimeout(java.time.Duration.ofSeconds(10));
        String expectedUrl = "https://www.paytm.bank.in/personal-banking/fastag";
        String expectedTitle = "Paytm Payments Bank || FASTag";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }
}
