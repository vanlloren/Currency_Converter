package Util;

import Uploader.ConversionRatesUploader;

public class CurrenciesArray {
    Currency[] currenciesArray = new Currency[10];

    public CurrenciesArray() {
        addCurrency();
        conversionRatesUpdate();
    }

    public Currency[] getCurrenciesArray() {
        return currenciesArray;
    }

    public void addCurrency() {
        for (int i = 0; i < currenciesArray.length; i++) {
            switch (i){
                case 0:
                    currenciesArray[i].addCurrency("US Dollar", "USD");
                    break;
                case 1:
                    currenciesArray[i].addCurrency("Euro", "EUR");
                    break;
                case 2:
                    currenciesArray[i].addCurrency("Japanese Yen", "JPY");
                    break;
                case 3:
                    currenciesArray[i].addCurrency("British Pound", "GBP");
                    break;
                case 4:
                    currenciesArray[i].addCurrency("Swiss Franc", "CHF");
                    break;
                case 5:
                    currenciesArray[i].addCurrency("Chinese Yuan", "CNY");
                    break;
                case 6:
                    currenciesArray[i].addCurrency("Argentine Peso", "ARS");
                    break;
                case 7:
                    currenciesArray[i].addCurrency("Russian Ruble", "RUB");
                    break;
                case 8:
                    currenciesArray[i].addCurrency("Brazilian Real", "BRL");
                    break;
                case 9:
                    currenciesArray[i].addCurrency("Indian Rupee", "INR");
                    break;
            }
        }
    }

    public String getCurrencyName(String currencyCode) {
        for (Currency currency : currenciesArray) {
            if (currency.getCurrencyCode().equals(currencyCode)) {
                return currency.getCurrencyName();
            }
        }
        return "Currency not found";
    }

    public Currency getCurrency(String currencyCode) {
        for (Currency currency : currenciesArray) {
            if (currency.getCurrencyCode().equals(currencyCode)) {
                return currency;
            }
        }
        return null;
    }

    public void conversionRatesUpdate(CurrenciesArray this){
        ConversionRatesUploader conversionRatesUploader = new ConversionRatesUploader();
        conversionRatesUploader.manualUploadConversionRates(this);
    }
}
