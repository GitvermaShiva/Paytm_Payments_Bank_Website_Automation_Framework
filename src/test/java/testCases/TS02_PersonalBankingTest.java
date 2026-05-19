package testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.Homepage;
import testBase.BaseClass;

public class TS02_PersonalBankingTest extends BaseClass {

    Homepage home;

    @BeforeMethod
    public void hoverPersonalBankingButton(){
        home = new Homepage(driver);

        logger.info("Hovering over Personal Banking button");

        hoverOverElement(home.getPersonalBankingButton());

        logger.info("Personal Banking dropdown displayed successfully");
    }

    @Test(priority = 1)
    public void testSavingsAccountPage(){

        logger.info("***** Starting test: testSavingsAccountPage *****");

        logger.info("Clicking on Savings Account page link");

        clickElement(home.getSavingsAccountPageLink());

        String expectedUrl = "https://www.paytm.bank.in/personal-banking/savings-account";
        String expectedTitle = "Paytm Payments Bank || Savings Account";

        logger.info("Verifying Savings Account page URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testSavingsAccountPage *****");
    }

    @Test(priority = 2)
    public void testWalletPage(){

        logger.info("***** Starting test: testWalletPage *****");

        logger.info("Clicking on Wallet page link");

        clickElement(home.getWalletPageLink());

        String expectedUrl = "https://www.paytm.bank.in/personal-banking/wallet";
        String expectedTitle = "Paytm Payments Bank || Wallet";

        logger.info("Verifying Wallet page URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testWalletPage *****");
    }

    @Test(priority = 3)
    public void testDebitCardsPage(){

        logger.info("***** Starting test: testDebitCardsPage *****");

        logger.info("Clicking on Debit Cards page link");

        clickElement(home.getDebitCardsPageLink());

        String expectedUrl = "https://www.paytm.bank.in/personal-banking/debit-cards";
        String expectedTitle = "Paytm Payments Bank || Debit Cards";

        logger.info("Verifying Debit Cards page URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testDebitCardsPage *****");
    }

    @Test(priority = 4)
    public void testPaytmPaymentsBankAgentPage(){

        logger.info("***** Starting test: testPaytmPaymentsBankAgentPage *****");

        logger.info("Clicking on Paytm Payments Bank Agent page link");

        clickElement(home.getPaytmPaymentsBankAgentPageLink());

        String expectedUrl = "https://www.paytm.bank.in/personal-banking/paytm-payments-bank-agent";
        String expectedTitle = "Paytm Payments Bank || Paytm Payments Bank Agent";

        logger.info("Verifying Paytm Payments Bank Agent page URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testPaytmPaymentsBankAgentPage *****");
    }

    @Test(priority = 5)
    public void testFASTagPage(){

        logger.info("***** Starting test: testFASTagPage *****");

        logger.info("Clicking on FASTag page link");

        clickElement(home.getFastagPageLink());

        String expectedUrl = "https://www.paytm.bank.in/personal-banking/fastag";
        String expectedTitle = "Paytm Payments Bank || FASTag";

        logger.info("Verifying FASTag page URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testFASTagPage *****");
    }
}