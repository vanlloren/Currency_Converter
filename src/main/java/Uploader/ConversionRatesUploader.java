package Uploader;

import Util.CurrenciesArray;
import Util.Currency;

public class ConversionRatesUploader {

    public void manualUploadConversionRates(CurrenciesArray currenciesArray) {
        for (Currency currency : currenciesArray.getCurrenciesArray()) {
            switch (currency.getCurrencyCode()) {
                case "USD":
                    currency.addConversionRate("USD", 1.0);
                    currency.addConversionRate("EUR", 0.92);
                    currency.addConversionRate("JPY", 151.32);
                    currency.addConversionRate("GBP", 0.79);
                    currency.addConversionRate("CHF", 0.90);
                    currency.addConversionRate("CNY", 7.23);
                    currency.addConversionRate("ARS", 854.60);
                    currency.addConversionRate("RUB", 92.40);
                    currency.addConversionRate("BRL", 5.00);
                    currency.addConversionRate("INR", 83.53);
                    break;
                case "EUR":
                    currency.addConversionRate("USD", 1.08);
                    currency.addConversionRate("EUR", 1.0);
                    currency.addConversionRate("JPY", 163.75);
                    currency.addConversionRate("GBP", 0.86);
                    currency.addConversionRate("CHF", 0.97);
                    currency.addConversionRate("CNY", 7.83);
                    currency.addConversionRate("ARS", 925.04);
                    currency.addConversionRate("RUB", 100.02);
                    currency.addConversionRate("BRL", 5.41);
                    currency.addConversionRate("INR", 90.41);
                    break;
                case "JPY":
                    currency.addConversionRate("USD", 0.0066);
                    currency.addConversionRate("EUR", 0.0061);
                    currency.addConversionRate("JPY", 1.0);
                    currency.addConversionRate("GBP", 0.0052);
                    currency.addConversionRate("CHF", 0.0059);
                    currency.addConversionRate("CNY", 0.048);
                    currency.addConversionRate("ARS", 5.65);
                    currency.addConversionRate("RUB", 0.61);
                    currency.addConversionRate("BRL", 0.033);
                    currency.addConversionRate("INR", 0.55);
                    break;
                case "GBP":
                    currency.addConversionRate("USD", 1.26);
                    currency.addConversionRate("EUR", 1.17);
                    currency.addConversionRate("JPY", 190.85);
                    currency.addConversionRate("GBP", 1.0);
                    currency.addConversionRate("CHF", 1.13);
                    currency.addConversionRate("CNY", 9.0);
                    currency.addConversionRate("ARS", 1078.31);
                    currency.addConversionRate("RUB", 116.56);
                    currency.addConversionRate("BRL", 6.31);
                    currency.addConversionRate("INR", 105.39);
                    break;
                case "CHF":
                    currency.addConversionRate("USD", 1.11);
                    currency.addConversionRate("EUR", 1.03);
                    currency.addConversionRate("JPY", 168.31);
                    currency.addConversionRate("GBP", 0.88);
                    currency.addConversionRate("CHF", 1.0);
                    currency.addConversionRate("CNY", 8.04);
                    currency.addConversionRate("ARS", 950.96);
                    currency.addConversionRate("RUB", 102.83);
                    currency.addConversionRate("BRL", 5.57);
                    currency.addConversionRate("INR", 92.96);
                    break;
                case "CNY":
                    currency.addConversionRate("USD", 0.14);
                    currency.addConversionRate("EUR", 0.13);
                    currency.addConversionRate("JPY", 20.92);
                    currency.addConversionRate("GBP", 0.11);
                    currency.addConversionRate("CHF", 0.13);
                    currency.addConversionRate("CNY", 1.0);
                    currency.addConversionRate("ARS", 118.23);
                    currency.addConversionRate("RUB", 13.02);
                    currency.addConversionRate("BRL", 0.69);
                    currency.addConversionRate("INR", 11.71);
                    break;
                case "ARS":
                    currency.addConversionRate("USD", 0.0012);
                    currency.addConversionRate("EUR", 0.0011);
                    currency.addConversionRate("JPY", 0.18);
                    currency.addConversionRate("GBP", 0.00093);
                    currency.addConversionRate("CHF", 0.0011);
                    currency.addConversionRate("CNY", 0.0085);
                    currency.addConversionRate("ARS", 1.0);
                    currency.addConversionRate("RUB", 0.11);
                    currency.addConversionRate("BRL", 0.0058);
                    currency.addConversionRate("INR", 0.098);
                    break;
                case "RUB":
                    currency.addConversionRate("USD", 0.011);
                    currency.addConversionRate("EUR", 0.0099);
                    currency.addConversionRate("JPY", 1.63);
                    currency.addConversionRate("GBP", 0.0085);
                    currency.addConversionRate("CHF", 0.0097);
                    currency.addConversionRate("CNY", 0.078);
                    currency.addConversionRate("ARS", 9.19);
                    currency.addConversionRate("RUB", 1.0);
                    currency.addConversionRate("BRL", 0.054);
                    currency.addConversionRate("INR", 0.9);
                    break;
                case "BRL":
                    currency.addConversionRate("USD", 0.20);
                    currency.addConversionRate("EUR", 0.18);
                    currency.addConversionRate("JPY", 30.25);
                    currency.addConversionRate("GBP", 0.16);
                    currency.addConversionRate("CHF", 0.18);
                    currency.addConversionRate("CNY", 1.43);
                    currency.addConversionRate("ARS", 171.13);
                    currency.addConversionRate("RUB", 18.50);
                    currency.addConversionRate("BRL", 1.0);
                    currency.addConversionRate("INR", 16.73);
                    break;
                case "INR":
                    currency.addConversionRate("USD", 0.012);
                    currency.addConversionRate("EUR", 0.011);
                    currency.addConversionRate("JPY", 1.81);
                    currency.addConversionRate("GBP", 0.0095);
                    currency.addConversionRate("CHF", 0.011);
                    currency.addConversionRate("CNY", 0.087);
                    currency.addConversionRate("ARS", 10.23);
                    currency.addConversionRate("RUB", 1.11);
                    currency.addConversionRate("BRL", 0.060);
                    currency.addConversionRate("INR", 1.0);
                    break;
            }
        }
    }

    /* TODO: Implement this method
    public void automaticUploadConversionRates(CurrenciesArray currenciesArray) {
    }
    */

}
