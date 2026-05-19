package testCases;

import testBase.BaseClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.Homepage;

public class TS08_ProductsTest extends BaseClass {

    Homepage home;

    @BeforeMethod
    public void setupDriver() {

        home = new Homepage(driver);

        logger.info("Homepage object initialized successfully");
    }

    @Test(priority = 1)
    public void testSavingsBankAccountPage() throws InterruptedException {

        logger.info("***** Starting test: testSavingsBankAccountPage *****");

        logger.info("Clicking on Savings Bank Account page link");

        clickElement(home.getSavingsBankAccountPageLink());

        String expectedUrl = "https://www.paytm.bank.in/products#SavingsAccount";
        String expectedTitle = "Paytm Payments Bank || Products";

        logger.info("Verifying Savings Bank Account page URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testSavingsBankAccountPage *****");
    }

    @Test(priority = 2)
    public void testBusinessAccountPage(){

        logger.info("***** Starting test: testBusinessAccountPage *****");

        logger.info("Clicking on Business Account page link");

        clickElement(home.getBusinessAccountPageLink());

        String expectedUrl = "https://www.paytm.bank.in/business-banking";
        String expectedTitle = "Paytm Payments Bank || Business Banking";

        logger.info("Verifying Business Account page URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testBusinessAccountPage *****");
    }

    @Test(priority = 3)
    public void testDebitAndATMCardPage(){

        logger.info("***** Starting test: testDebitAndATMCardPage *****");

        logger.info("Clicking on Debit And ATM Card page link");

        clickElement(home.getDebitAndAtmCardPageLink());

        String expectedUrl = "https://www.paytm.bank.in/products#DebitCardMain";
        String expectedTitle = "Paytm Payments Bank || Products";

        logger.info("Verifying Debit And ATM Card page URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testDebitAndATMCardPage *****");
    }

    @Test(priority = 4)
    public void testPPBWalletPage(){

        logger.info("***** Starting test: testPPBWalletPage *****");

        logger.info("Clicking on PPB Wallet page link");

        clickElement(home.getPaytmPaymentsBankWalletPageLink());

        String expectedUrl = "https://www.paytm.bank.in/products#wallet";
        String expectedTitle = "Paytm Payments Bank || Products";

        logger.info("Verifying PPB Wallet page URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testPPBWalletPage *****");
    }

    @Test(priority = 5)
    public void testPaymentsPage(){

        logger.info("***** Starting test: testPaymentsPage *****");

        logger.info("Clicking on Payments page link");

        clickElement(home.getPaymentsPageLink());

        String expectedUrl = "https://www.paytm.bank.in/products#makePayment";
        String expectedTitle = "Paytm Payments Bank || Products";

        logger.info("Verifying Payments page URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testPaymentsPage *****");
    }

    @Test(priority = 6)
    public void testFoodWalletPage(){

        logger.info("***** Starting test: testFoodWalletPage *****");

        logger.info("Clicking on Food Wallet page link");

        clickElement(home.getFoodWalletPageLink());

        String expectedUrl = "https://www.paytm.bank.in/products#foodWallet";
        String expectedTitle = "Paytm Payments Bank || Products";

        logger.info("Verifying Food Wallet page URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testFoodWalletPage *****");
    }

    @Test(priority = 7)
    public void testNACHRecurringPage(){

        logger.info("***** Starting test: testNACHRecurringPage *****");

        logger.info("Clicking on NACH Recurring page link");

        clickElement(home.getNachRecurringPageLink());

        String expectedUrl = "https://www.paytm.bank.in/products#nach";
        String expectedTitle = "Paytm Payments Bank || Products";

        logger.info("Verifying NACH Recurring page URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testNACHRecurringPage *****");
    }

    @Test(priority = 8)
    public void testFASTagPage(){

        logger.info("***** Starting test: testFASTagPage *****");

        logger.info("Scrolling to FASTag page link");

        scrollToElement(home.getFastagPageLink2());

        logger.info("Clicking on FASTag page link");

        clickElement(home.getFastagPageLink2());

        logger.info("Setting page load timeout");

        driver.manage().timeouts().pageLoadTimeout(java.time.Duration.ofSeconds(10));

        String expectedUrl = "https://www.paytm.bank.in/products#fastag";
        String expectedTitle = "Paytm Payments Bank || Products";

        logger.info("Verifying FASTag page URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testFASTagPage *****");
    }

    @Test(priority = 9)
    public void testFixedDepositePage(){

        logger.info("***** Starting test: testFixedDepositePage *****");

        logger.info("Clicking on Fixed Deposit page link");

        clickElement(home.getFixedDepositPageLink());

        String expectedUrl = "https://www.paytm.bank.in/products/fixed-deposit";
        String expectedTitle = "Paytm Payments Bank || Fixed Deposit Product";

        logger.info("Verifying Fixed Deposit page URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testFixedDepositePage *****");
    }

    @Test(priority = 10)
    public void testBasicSavingsBankDepositeAccountPage(){

        logger.info("***** Starting test: testBasicSavingsBankDepositeAccountPage *****");

        logger.info("Clicking on BSBD Account page link");

        clickElement(home.getBsbdAccountPageLink());

        String expectedUrl = "https://www.paytm.bank.in/bsbd";
        String expectedTitle = "Paytm Payments Bank | Basic Savings Bank Deposit Product";

        logger.info("Verifying BSBD Account page URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testBasicSavingsBankDepositeAccountPage *****");
    }

    @Test(priority = 11)
    public void testAEPSPage(){

        logger.info("***** Starting test: testAEPSPage *****");

        logger.info("Clicking on AEPS page link");

        clickElement(home.getAepsPageLink());

        String expectedUrl = "https://www.paytm.bank.in/products/aeps";
        String expectedTitle = "Paytm Payments Bank || Aadhaar Enabled Payment System Product";

        logger.info("Verifying AEPS page URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testAEPSPage *****");
    }
}