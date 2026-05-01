package utilities;

import org.testng.annotations.DataProvider;

import java.io.IOException;

public class DataProviders {
    
    @DataProvider(name = "personalBankingLinks")
    public Object[][] headerURLsDataProvider(){

        return new Object[][] {
            {"https://www.paytm.bank.in/personal-banking/savings-account", "Paytm Payments Bank || Savings Account"},
            {"https://www.paytm.bank.in/personal-banking/wallet", "Paytm Payments Bank || Wallet"},
            {"https://www.paytm.bank.in/personal-banking/debit-cards", "Paytm Payments Bank || Debit Cards"},
            {"https://www.paytm.bank.in/personal-banking/paytm-payments-bank-agent", "Paytm Payments Bank || Paytm Payments Bank Agent"},
            {"https://www.paytm.bank.in/personal-banking/fastag", "Paytm Payments Bank || FASTag"},
        };
    }
}
