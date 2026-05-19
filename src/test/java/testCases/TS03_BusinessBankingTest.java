package testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.Homepage;
import testBase.BaseClass;

public class TS03_BusinessBankingTest extends BaseClass {

    Homepage home;

    @BeforeMethod
    public void hoverBusinessBankingButton(){

        home = new Homepage(driver);

        logger.info("Hovering over Business Banking button");

        hoverOverElement(home.getBusinessBankingButton());

        logger.info("Business Banking dropdown displayed successfully");
    }

    @Test(priority = 1)
    public void testBusinessAccountPage(){

        logger.info("***** Starting test: testBusinessAccountPage *****");

        logger.info("Clicking on Business Account page link");

        clickElement(home.getBusinessAccountPageLink());

        String expectedUrl = "https://www.paytm.bank.in/business-banking/business-account";
        String expectedTitle = "Paytm Payments Bank || Business Account";

        logger.info("Verifying Business Account page URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testBusinessAccountPage *****");
    }

    @Test(priority = 2)
    public void testSalaryAccountPage(){

        logger.info("***** Starting test: testSalaryAccountPage *****");

        logger.info("Clicking on Salary Account page link");

        clickElement(home.getSalaryAccountPageLink());

        String expectedUrl = "https://www.paytm.bank.in/business-banking/salary-account";
        String expectedTitle = "Paytm Payments Bank || Salary Account";

        logger.info("Verifying Salary Account page URL and title");

        verifyPageURLAndTitle(expectedUrl, expectedTitle);

        logger.info("***** Finished test: testSalaryAccountPage *****");
    }
}