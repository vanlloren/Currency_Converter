package Uploader;

import Util.CurrenciesArray;
import Util.Currency;

public class ConversionRatesUploader {

    public void manualUploadConversionRates(CurrenciesArray currenciesArray) {
        for (Currency currency : currenciesArray.getCurrenciesArray()) {
            switch (currency.getCurrencyCode()) {
                case "USD":
                    currency.addConversionRate("USD", 1.0);
                    currency.addConversionRate("EUR", 0.85);
                    currency.addConversionRate("JPY", 110.0);
                    currency.addConversionRate("GBP", 0.75);
                    currency.addConversionRate("CHF", 0.91);
                    currency.addConversionRate("CNY", 6.45);
                    currency.addConversionRate("ARS", 95.0);
                    currency.addConversionRate("RUB", 75.0);
                    currency.addConversionRate("BRL", 5.25);
                    currency.addConversionRate("INR", 75.0);
                    break;
                case "EUR":
                    currency.addConversionRate("USD", 1.18);
                    currency.addConversionRate("EUR", 1.0);
                    currency.addConversionRate("JPY", 130.0);
                    currency.addConversionRate("GBP", 1.10);
                    currency.addConversionRate("CHF", 1.07);
                    currency.addConversionRate("CNY", 7.55);
                    currency.addConversionRate("ARS", 115.0);
                    currency.addConversionRate("RUB", 90.0);
                    currency.addConversionRate("BRL", 6.30);
                    currency.addConversionRate("INR", 90.0);
                    break;
                case "JPY":
                    currency.addConversionRate("USD", 0.0091);
                    currency.addConversionRate("EUR", 0.0077);
                    currency.addConversionRate("JPY", 1.0);
                    currency.addConversionRate("GBP", 0.0070);
                    currency.addConversionRate("CHF", 0.0085);
                    currency.addConversionRate("CNY", 0.060);
                    currency.addConversionRate("ARS", 8.80);
                    currency.addConversionRate("RUB", 6.90);
                    currency.addConversionRate("BRL", 0.48);
                    currency.addConversionRate("INR", 6.90);
                    break;
                case "GBP":
                    currency.addConversionRate("USD", 1.33);
                    currency.addConversionRate("EUR", 0.91);
                    currency.addConversionRate("JPY", 142.0);
                    currency.addConversionRate("GBP", 1.0);
                    currency.addConversionRate("CHF", 1.22);
                    currency.addConversionRate("CNY", 8.60);
                    currency.addConversionRate("ARS", 130.0);
                    currency.addConversionRate("RUB", 100.0);
                    currency.addConversionRate("BRL", 7.00);
                    currency.addConversionRate("INR", 100.0);
                    break;
                case "CHF":
                    currency.addConversionRate("USD", 1.10);
                    currency.addConversionRate("EUR", 0.93);
                    currency.addConversionRate("JPY", 118.0);
                    currency.addConversionRate("GBP", 0.82);
                    currency.addConversionRate("CHF", 1.0);
                    currency.addConversionRate("CNY", 7.00);
                    currency.addConversionRate("ARS", 110.0);
                    currency.addConversionRate("RUB", 85.0);
                    currency.addConversionRate("BRL", 6.00);
                    currency.addConversionRate("INR", 85.0);
                    break;
                case "CNY":
                    currency.addConversionRate("USD", 0.16);
                    currency.addConversionRate("EUR", 0.13);
                    currency.addConversionRate("JPY", 16.0);
                    currency.addConversionRate("GBP", 0.12);
                    currency.addConversionRate("CHF", 0.14);
                    currency.addConversionRate("CNY", 1.0);
                    currency.addConversionRate("ARS", 15.0);
                    currency.addConversionRate("RUB", 12.0);
                    currency.addConversionRate("BRL", 0.84);
                    currency.addConversionRate("INR", 12.0);
                    break;
                case "ARS":
                    currency.addConversionRate("USD", 0.011);
                    currency.addConversionRate("EUR", 0.0087);
                    currency.addConversionRate("JPY", 0.11);
                    currency.addConversionRate("GBP", 0.0077);
                    currency.addConversionRate("CHF", 0.0091);
                    currency.addConversionRate("CNY", 0.067);
                    currency.addConversionRate("ARS", 1.0);
                    currency.addConversionRate("RUB", 0.77);
                    currency.addConversionRate("BRL", 0.054);
                    currency.addConversionRate("INR", 0.77);
                    break;
                case "RUB":
                    currency.addConversionRate("USD", 0.013);
                    currency.addConversionRate("EUR", 0.011);
                    currency.addConversionRate("JPY", 0.14);
                    currency.addConversionRate("GBP", 0.010);
                    currency.addConversionRate("CHF", 0.012);
                    currency.addConversionRate("CNY", 0.083);
                    currency.addConversionRate("ARS", 1.30);
                    currency.addConversionRate("RUB", 1.0);
                    currency.addConversionRate("BRL", 0.070);
                    currency.addConversionRate("INR", 1.30);
                    break;
                case "BRL":
                    currency.addConversionRate("USD", 0.19);
                    currency.addConversionRate("EUR", 0.16);
                    currency.addConversionRate("JPY", 2.10);
                    currency.addConversionRate("GBP", 0.14);
                    currency.addConversionRate("CHF", 0.17);
                    currency.addConversionRate("CNY", 1.20);
                    currency.addConversionRate("ARS", 18.0);
                    currency.addConversionRate("RUB", 14.0);
                    currency.addConversionRate("BRL", 1.0);
                    currency.addConversionRate("INR", 14.0);
                    break;
                case "INR":
                    currency.addConversionRate("USD", 0.013);
                    currency.addConversionRate("EUR", 0.011);
                    currency.addConversionRate("JPY", 0.14);
                    currency.addConversionRate("GBP", 0.010);
                    currency.addConversionRate("CHF", 0.012);
                    currency.addConversionRate("CNY", 0.083);
                    currency.addConversionRate("ARS", 1.30);
                    currency.addConversionRate("RUB", 0.070);
                    currency.addConversionRate("BRL", 0.070);
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
