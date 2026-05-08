package footerTestCases;

import headerTestCases.BaseClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.Homepage;

public class ProductsTest extends BaseClass {

    Homepage home;

    @BeforeMethod
    public void setupDriver() {
        home = new Homepage(driver);
    }

    @Test(priority = 1)
    public void testSavingsBankAccountPage() throws InterruptedException {
        clickElement(home.getSavingsBankAccountPageLink());
        String expectedUrl = "https://www.paytm.bank.in/products#SavingsAccount";
        String expectedTitle = "Paytm Payments Bank || Products";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }

    @Test(priority = 2)
    public void testBusinessAccountPage(){
        clickElement(home.getBusinessAccountPageLink());
        String expectedUrl = "https://www.paytm.bank.in/business-banking";
        String expectedTitle = "Paytm Payments Bank || Business Banking";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }

    @Test(priority = 3)
    public void testDebitAndATMCardPage(){
        clickElement(home.getDebitAndAtmCardPageLink());
        String expectedUrl = "https://www.paytm.bank.in/products#DebitCardMain";
        String expectedTitle = "Paytm Payments Bank || Products";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }

    @Test(priority = 4)
    public void testPPBWalletPage(){
        clickElement(home.getPaytmPaymentsBankWalletPageLink());
        String expectedUrl = "https://www.paytm.bank.in/products#wallet";
        String expectedTitle = "Paytm Payments Bank || Products";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }

    @Test(priority = 5)
    public void testPaymentsPage(){
        clickElement(home.getPaymentsPageLink());
        String expectedUrl = "https://www.paytm.bank.in/products#makePayment";
        String expectedTitle = "Paytm Payments Bank || Products";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }

    @Test(priority = 6)
    public void testFoodWalletPage(){
        clickElement(home.getFoodWalletPageLink());
        String expectedUrl = "https://www.paytm.bank.in/products#foodWallet";
        String expectedTitle = "Paytm Payments Bank || Products";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }

    @Test(priority = 7)
    public void testNACHRecurringPage(){
        clickElement(home.getNachRecurringPageLink());
        String expectedUrl = "https://www.paytm.bank.in/products#nach";
        String expectedTitle = "Paytm Payments Bank || Products";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }

    @Test(priority = 8)
    public void testFASTagPage(){
        scrollToElement(home.getFastagPageLink2());
        clickElement(home.getFastagPageLink2());
        driver.manage().timeouts().pageLoadTimeout(java.time.Duration.ofSeconds(10));
        String expectedUrl = "https://www.paytm.bank.in/products#fastag";
        String expectedTitle = "Paytm Payments Bank || Products";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }

    @Test(priority = 9)
    public void testFixedDepositePage(){
        clickElement(home.getFixedDepositPageLink());
        String expectedUrl = "https://www.paytm.bank.in/products/fixed-deposit";
        String expectedTitle = "Paytm Payments Bank || Fixed Deposit Product";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }

    @Test(priority = 10)
    public void testBasicSavingsBankDepositeAccountPage(){
        clickElement(home.getBsbdAccountPageLink());
        String expectedUrl = "https://www.paytm.bank.in/bsbd";
        String expectedTitle = "Paytm Payments Bank | Basic Savings Bank Deposit Product";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }

    @Test(priority = 11)
    public void testAEPSPage(){
        clickElement(home.getAepsPageLink());
        String expectedUrl = "https://www.paytm.bank.in/products/aeps";
        String expectedTitle = "Paytm Payments Bank || Aadhaar Enabled Payment System Product";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
    }
}
