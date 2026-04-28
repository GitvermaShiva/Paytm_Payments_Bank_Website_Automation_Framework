package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageObjects.HeaderURLs;
import utilities.ExcelUtility;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HeaderURLsTest extends BaseClass {
    
    @Test
    public void verifyHeaderURLs() throws IOException {
        SoftAssert softAssert = new SoftAssert();

        String excelPath = "D:\\Downloads\\Paytm_Payments_Bank_Website_Automation_Framework\\TestData\\PaytmBankURLTitle.xlsx";
        String sheetName = "Header";

        HeaderURLs headerURLs = new HeaderURLs(driver);
        List<WebElement> URLs = headerURLs.getHeaderURLs();

        // Collect all hrefs first to avoid stale element issues
        // Collect all hrefs first to avoid stale element issues
        List<String> hrefs = new ArrayList<>();
        for (WebElement url : URLs) {
            String href = url.getAttribute("href");
            if (href != null) {
                hrefs.add(href);
            }
        }

        // Hit each URL and verify the page title
        // Hit each URL and verify the page title
        for (String href : hrefs) {
            driver.navigate().to(href);
            String currentUrl = driver.getCurrentUrl();
            String pageTitle = driver.getTitle();
            System.out.println("URL: " + currentUrl + " | Page Title: " + pageTitle);

            // Add assertions here to verify the page title if needed
            // Add assertions here to verify the page title if needed
            softAssert.assertNotNull(pageTitle, "Page title is null for URL: " + currentUrl);
            softAssert.assertFalse(pageTitle.isEmpty(), "Page title is empty for URL: " + currentUrl);

            //Store the URL in First Column and Page Title in Third Column of Excel Sheet
            //Store the URL in First Column and Page Title in Third Column of Excel Sheet
            ExcelUtility.setCellData(excelPath, sheetName, hrefs.indexOf(href) + 1, 0, currentUrl);

            //Assert current URL with the second column of Excel Sheet
            String expectedURL = ExcelUtility.getCellData(excelPath, sheetName, hrefs.indexOf(href) + 1, 1);
            softAssert.assertEquals(currentUrl, expectedURL, "URL mismatch for: " + currentUrl);

            ExcelUtility.setCellData(excelPath, sheetName, hrefs.indexOf(href) + 1, 2, pageTitle);
        }

        // This will collect all assertion errors and report them at once
        softAssert.assertAll();
    }
}
