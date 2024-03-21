package Converter;

import Util.CurrenciesArray;

public class SingleConverterExecutor {
    public static double startConversionRate(String currency, String comparedCurrency, Boolean GUIRequest) {
        if(GUIRequest){
            CurrenciesArray currenciesArray = new CurrenciesArray();
        }
        return currency.equals(comparedCurrency) ? 1 : CurrenciesArray.getCurrency(currency).getConversionRatesArray().get(comparedCurrency);
    }

    public static double startConversion(String currency, String comparedCurrency, double amount, Boolean GUIRequest) {
        if(GUIRequest){
            CurrenciesArray currenciesArray = new CurrenciesArray();
        }
        return currency.equals(comparedCurrency) ? amount : CurrenciesArray.getCurrency(currency).getConversionRatesArray().get(comparedCurrency) * amount;
    }
}
