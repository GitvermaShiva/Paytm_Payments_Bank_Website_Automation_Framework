package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.Homepage;

public class LoginButtonTest extends BaseClass {

    Homepage home;

    @BeforeMethod
     public void hoverLoginButton() {
         home = new Homepage(driver);
         hoverOverElement(home.getLoginButton());
     }

     @Test(priority = 1)
     public void testCorporateBankingLoginPage() {
         clickElement(home.getCorporateBankingPageLink());
         driver.switchTo().window(driver.getWindowHandles().stream().skip(1).findFirst().orElseThrow(() -> new RuntimeException("New window not found")));
         driver.manage().timeouts().pageLoadTimeout(java.time.Duration.ofSeconds(10));
         String expectedUrl = "https://netbanking.paytm.bank.in/";
         String expectedTitle = "Paytm Payments Bank || Corporate Login";
         verifyPageURLAndTitle(expectedUrl, expectedTitle);
     }

     @Test(priority = 2)
     public void testPersonalBankingLoginPage() {
        clickElement(home.getPersonalBankingPageLink());
        driver.switchTo().window(driver.getWindowHandles().stream().skip(1).findFirst().orElseThrow(() -> new RuntimeException("New window not found")));
        driver.manage().timeouts().pageLoadTimeout(java.time.Duration.ofSeconds(10));
        String expectedUrl = "https://webapp.paytm.bank.in/";
        String expectedTitle = "Paytm Payments Bank || Personal Login";
        verifyPageURLAndTitle(expectedUrl, expectedTitle);
     }
}
