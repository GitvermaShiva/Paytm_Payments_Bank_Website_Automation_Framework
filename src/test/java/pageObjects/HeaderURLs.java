package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HeaderURLs extends BasePage{

    public HeaderURLs(WebDriver driver) {
        super(driver);
    }

    //Locators for header URLs
    @FindBy(xpath = "//header//a")
    public List<WebElement> headerURLs;

    //Action Methods
    public List<WebElement> getHeaderURLs() {
        return headerURLs;
    }
}
