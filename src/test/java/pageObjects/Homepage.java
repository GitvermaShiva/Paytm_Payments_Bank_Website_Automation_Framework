package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends BasePage{

    public Homepage(WebDriver driver) {
        super(driver);
    }

    //Locators
    @FindBy(id="home")
    public WebElement homePageLink;

    @FindBy(xpath = "//button[normalize-space()='Personal Banking']")
    public WebElement personalBankingButton;

    @FindBy(partialLinkText = "Savings Account")
    private WebElement savingsAccountPageLink;

    @FindBy(partialLinkText = "Wallet")
    public WebElement walletPageLink;

    @FindBy(partialLinkText = "Debit Cards")
    public WebElement debitCardsPageLink;

    @FindBy(partialLinkText = "Paytm Payments Bank Agent")
    public WebElement paytmPaymentsBankAgentPageLink;

    @FindBy(partialLinkText = "FASTag")
    public WebElement fastagPageLink;

    @FindBy(xpath = "//button[normalize-space()='Business Banking']")
    public WebElement businessBankingButton;

    @FindBy(partialLinkText = "Business Account")
    public WebElement businessAccountPageLink;

    @FindBy(partialLinkText = "Salary Account")
    public WebElement salaryAccountPageLink;

    @FindBy(xpath = "//button[normalize-space()='Loan Referral']")
    public WebElement loanReferralButton;

    @FindBy(partialLinkText = "Personal Loan Referral")
    public WebElement loanReferralPageLink;

    @FindBy(xpath = "//button[normalize-space()='Company']")
    public WebElement companyButton;

    @FindBy(linkText = "About Us")
    public WebElement aboutUsPageLink;

    @FindBy(linkText = "Board Of Directors")
    public WebElement boardOfDirectorsPageLink;

    @FindBy(linkText = "Contact Us")
    public WebElement contactUsPageLink;

    @FindBy(linkText = "Careers")
    public WebElement careersPageLink;

    @FindBy(xpath = "//button[normalize-space()='Support']")
    public WebElement supportButton;

    @FindBy(linkText = "Contact Us")
    public WebElement supportContactUsPageLink;

    @FindBy(linkText = "Lodge a Complaint")
    public WebElement lodgeAComplaintPageLink;

    @FindBy(linkText = "Rates & Charges")
    public WebElement ratesAndChargesPageLink;

    @FindBy(linkText = "FAQs")
    public WebElement faqsPageLink;

    @FindBy(xpath = "//div[@class='style_menu_buttons__TYdTc']//button")
    public WebElement loginButton;

    @FindBy(linkText = "Corporate Banking")
    public WebElement corporateBankingPageLink;

    @FindBy(linkText = "Personal Banking")
    public WebElement personalBankingPageLink;

    //Action Methods
    public WebElement getHomePageLink() {
        return homePageLink;
    }

    public WebElement getPersonalBankingButton() {
        return personalBankingButton;
    }

    public WebElement getSavingsAccountPageLink() {
        return savingsAccountPageLink;
    }

    public WebElement getWalletPageLink() {
        return walletPageLink;
    }

    public WebElement getDebitCardsPageLink() {
        return debitCardsPageLink;
    }

    public WebElement getPaytmPaymentsBankAgentPageLink() {
        return paytmPaymentsBankAgentPageLink;
    }

    public WebElement getFastagPageLink() {
        return fastagPageLink;
    }

    public WebElement getBusinessBankingButton() {
        return businessBankingButton;
    }

    public WebElement getBusinessAccountPageLink() {
        return businessAccountPageLink;
    }

    public WebElement getSalaryAccountPageLink() {
        return salaryAccountPageLink;
    }

    public WebElement getLoanReferralButton() {
        return loanReferralButton;
    }

    public WebElement getLoanReferralPageLink() {
        return loanReferralPageLink;
    }

    public WebElement getCompanyButton() {
        return companyButton;
    }

    public WebElement getAboutUsPageLink() {
        return aboutUsPageLink;
    }

    public WebElement getBoardOfDirectorsPageLink() {
        return boardOfDirectorsPageLink;
    }

    public WebElement getContactUsPageLink() {
        return contactUsPageLink;
    }

    public WebElement getCareersPageLink() {
        return careersPageLink;
    }

    public WebElement getSupportButton() {
        return supportButton;
    }

    public WebElement getSupportContactUsPageLink() {
        return supportContactUsPageLink;
    }

    public WebElement getLodgeAComplaintPageLink() {
        return lodgeAComplaintPageLink;
    }

    public WebElement getRatesAndChargesPageLink() {
        return ratesAndChargesPageLink;
    }

    public WebElement getFaqsPageLink() {
        return faqsPageLink;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getCorporateBankingPageLink() {
        return corporateBankingPageLink;
    }

    public WebElement getPersonalBankingPageLink() {
        return personalBankingPageLink;
    }
}
