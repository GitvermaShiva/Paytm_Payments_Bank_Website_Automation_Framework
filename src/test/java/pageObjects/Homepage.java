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

    @FindBy(linkText = "Savings Bank Account")
    public WebElement savingsBankAccountPageLink;

    @FindBy(linkText = "Business Account")
    public WebElement businessBankAccountPageLink;

    @FindBy(linkText = "Debit & ATM Card")
    public WebElement debitAndAtmCardPageLink;

    @FindBy(linkText = "Paytm Payments Bank Wallet")
    public WebElement paytmPaymentsBankWalletPageLink;

    @FindBy(linkText = "Payments")
    public WebElement paymentsPageLink;

    @FindBy(linkText = "Food Wallet")
    public WebElement foodWalletPageLink;

    @FindBy(linkText = "NACH/Recurring")
    public WebElement nachRecurringPageLink;

    @FindBy(linkText = "Fastag")
    public WebElement fastagPageLink2;

    @FindBy(linkText = "Fixed Deposit")
    public WebElement fixedDepositPageLink;

    @FindBy(linkText = "Basic Savings Bank Deposit Account (BSBD)")
    public WebElement bsbdAccountPageLink;

    @FindBy(linkText = "AePS")
    public WebElement aepsPageLink;

    @FindBy(linkText = "About Us")
    public WebElement aboutUsPageLink2;

    @FindBy(linkText = "FAQs")
    public WebElement faqsPageLink2;

    @FindBy(linkText = "Contact Us")
    public WebElement contactUsPageLink2;

    @FindBy(linkText = "Active KYC Points")
    public WebElement activeKYCPointsPageLink;

    @FindBy(linkText = "Register as a KYC Point")
    public WebElement registerKYCPointPageLink;

    @FindBy(linkText = "Terminated KYC Points")
    public WebElement terminateKYCPointsPageLink;

    @FindBy(linkText = "Careers")
    public WebElement careersPageLink2;

    @FindBy(linkText = "Terms & Conditions")
    public WebElement termsAndConditionsPageLink;

    @FindBy(linkText = "Disclaimers")
    public WebElement disclaimersPageLink;

    @FindBy(linkText = "Privacy Policy")
    public WebElement privacyPolicyPageLink;

    @FindBy(linkText = "Important Notices")
    public WebElement importantNoticesPageLink;

    @FindBy(linkText = "Regulatory Disclosure")
    public WebElement regulatoryDisclosurePageLink;

    @FindBy(linkText = "Safety & Security")
    public WebElement safetyAndSecurityPageLink;

    @FindBy(linkText = "DICGC Insurance Cover")
    public WebElement dicgcInsuranceCoverPageLink;

    @FindBy(linkText = "Rates & Charges")
    public WebElement ratesAndChargesPageLink2;

    @FindBy(partialLinkText = "Selection Process for Independent Directors")
    public WebElement selectionProcessForIndependentDirectorsPageLink;

    @FindBy(partialLinkText = "Code of Conduct for Independent Directors")
    public WebElement codeOfConductForIndependentDirectorsPageLink;

    @FindBy(partialLinkText = "Code of Conduct for Employees")
    public WebElement codeOfConductForEmployeesPageLink;

    @FindBy(linkText = "Citizen Charter")
    public WebElement citizenCharterPageLink;

    @FindBy(partialLinkText = "Deposit and Interest Rate Policy")
    public WebElement depositAndInterestRatePolicyPageLink;

    @FindBy(linkText = "Customer Compensation Policy")
    public WebElement customerCompensationPolicyPageLink;

    @FindBy(linkText = "Customer Grievance Redressal Policy")
    public WebElement customerGrievanceRedressalPolicyPageLink;

    @FindBy(linkText = "Charter of Customer Rights")
    public WebElement charterOfCustomerRightsPageLink;

    @FindBy(partialLinkText = "Whistle Blower Policy")
    public WebElement whistleBlowerPolicyPageLink;

    @FindBy(linkText = "Code of Commitment")
    public WebElement codeOfCommitmentPageLink;

    @FindBy(linkText = "Aadhaar Data Privacy Policy")
    public WebElement aadhaarDataPrivacyPolicyPageLink;

    @FindBy(partialLinkText = "Doorstep Banking Policy")
    public WebElement doorstepBankingPolicyPageLink;

    @FindBy(linkText = "Fraud Prevention")
    public WebElement fraudPreventionPageLink;

    @FindBy(partialLinkText = "Policy on Appointment of Statutory Auditor")
    public WebElement policyOnAppointmentOfStatutoryAuditorPageLink;

    @FindBy(partialLinkText = "Contact Details of PNO")
    public WebElement contactDetailsOfPNOPageLink;

    @FindBy(partialLinkText = "Contact Details of Lender's GRO")
    public WebElement contactDetailsOfLendersGROPageLink;

    @FindBy(partialLinkText = "Corporate Social Responsibility Policy")
    public WebElement corporateSocialResponsibilityPolicyPageLink;

    @FindBy(partialLinkText = "Nomination and Renumeration Policy")
    public WebElement nominationAndRenumerationPolicyPageLink;

    @FindBy(partialLinkText = "NACH And Cheque Dishonour Policy")
    public WebElement nachAndChequeDishonourPolicyPageLink;

    @FindBy(partialLinkText = "Anti Bribery policy")
    public WebElement antiBriberyPolicyPageLink;

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

    public WebElement getSavingsBankAccountPageLink() {
        return savingsBankAccountPageLink;
    }

    public WebElement getBusinessBankAccountPageLink() {
        return businessBankAccountPageLink;
    }

    public WebElement getDebitAndAtmCardPageLink() {
        return debitAndAtmCardPageLink;
    }

    public WebElement getPaytmPaymentsBankWalletPageLink() {
        return paytmPaymentsBankWalletPageLink;
    }

    public WebElement getPaymentsPageLink() {
        return paymentsPageLink;
    }

    public WebElement getFoodWalletPageLink() {
        return foodWalletPageLink;
    }

    public WebElement getNachRecurringPageLink() {
        return nachRecurringPageLink;
    }

    public WebElement getFastagPageLink2() {
        return fastagPageLink2;
    }

    public WebElement getFixedDepositPageLink() {
        return fixedDepositPageLink;
    }

    public WebElement getBsbdAccountPageLink() {
        return bsbdAccountPageLink;
    }

    public WebElement getAepsPageLink() {
        return aepsPageLink;
    }

    public WebElement getAboutUsPageLink2() {
        return aboutUsPageLink2;
    }

    public WebElement getFaqsPageLink2() {
        return faqsPageLink2;
    }

    public WebElement getContactUsPageLink2() {
        return contactUsPageLink2;
    }

    public WebElement getActiveKYCPointsPageLink() {
        return activeKYCPointsPageLink;
    }

    public WebElement getRegisterKYCPointPageLink() {
        return registerKYCPointPageLink;
    }

    public WebElement getTerminateKYCPointsPageLink() {
        return terminateKYCPointsPageLink;
    }

    public WebElement getCareersPageLink2() {
        return careersPageLink2;
    }

    public WebElement getTermsAndConditionsPageLink() {
        return termsAndConditionsPageLink;
    }

    public WebElement getDisclaimersPageLink() {
        return disclaimersPageLink;
    }

    public WebElement getPrivacyPolicyPageLink() {
        return privacyPolicyPageLink;
    }

    public WebElement getImportantNoticesPageLink() {
        return importantNoticesPageLink;
    }

    public WebElement getRegulatoryDisclosurePageLink() {
        return regulatoryDisclosurePageLink;
    }

    public WebElement getSafetyAndSecurityPageLink() {
        return safetyAndSecurityPageLink;
    }

    public WebElement getDicgcInsuranceCoverPageLink() {
        return dicgcInsuranceCoverPageLink;
    }

    public WebElement getRatesAndChargesPageLink2() {
        return ratesAndChargesPageLink2;
    }

    public WebElement getSelectionProcessForIndependentDirectorsPageLink() {
        return selectionProcessForIndependentDirectorsPageLink;
    }

    public WebElement getCodeOfConductForIndependentDirectorsPageLink() {
        return codeOfConductForIndependentDirectorsPageLink;
    }

    public WebElement getCodeOfConductForEmployeesPageLink() {
        return codeOfConductForEmployeesPageLink;
    }

    public WebElement getCitizenCharterPageLink() {
        return citizenCharterPageLink;
    }

    public WebElement getDepositAndInterestRatePolicyPageLink() {
        return depositAndInterestRatePolicyPageLink;
    }

    public WebElement getCustomerCompensationPolicyPageLink() {
        return customerCompensationPolicyPageLink;
    }

    public WebElement getCustomerGrievanceRedressalPolicyPageLink() {
        return customerGrievanceRedressalPolicyPageLink;
    }

    public WebElement getCharterOfCustomerRightsPageLink() {
        return charterOfCustomerRightsPageLink;
    }

    public WebElement getWhistleBlowerPolicyPageLink() {
        return whistleBlowerPolicyPageLink;
    }

    public WebElement getCodeOfCommitmentPageLink() {
        return codeOfCommitmentPageLink;
    }

    public WebElement getAadhaarDataPrivacyPolicyPageLink() {
        return aadhaarDataPrivacyPolicyPageLink;
    }

    public WebElement getDoorstepBankingPolicyPageLink() {
        return doorstepBankingPolicyPageLink;
    }

    public WebElement getFraudPreventionPageLink() {
        return fraudPreventionPageLink;
    }

    public WebElement getPolicyOnAppointmentOfStatutoryAuditorPageLink() {
        return policyOnAppointmentOfStatutoryAuditorPageLink;
    }

    public WebElement getContactDetailsOfPNOPageLink() {
        return contactDetailsOfPNOPageLink;
    }

    public WebElement getContactDetailsOfLendersGROPageLink() {
        return contactDetailsOfLendersGROPageLink;
    }

    public WebElement getCorporateSocialResponsibilityPolicyPageLink() {
        return corporateSocialResponsibilityPolicyPageLink;
    }

    public WebElement getNominationAndRenumerationPolicyPageLink() {
        return nominationAndRenumerationPolicyPageLink;
    }

    public WebElement getNachAndChequeDishonourPolicyPageLink() {
        return nachAndChequeDishonourPolicyPageLink;
    }

    public WebElement getAntiBriberyPolicyPageLink() {
        return antiBriberyPolicyPageLink;
    }

}
