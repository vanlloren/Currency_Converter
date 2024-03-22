package Converter;

import Util.CurrenciesArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MultipleConverterExecutor {
    public static Map<String, Double> startConversionRateGUI(String currency, Boolean GUIRequest) {
        if (GUIRequest) {
            CurrenciesArray currenciesArray = new CurrenciesArray();
            return currenciesArray.getCurrency(currency).getConversionRatesArray();
        }

        return null;
    }

    public static Map<String, Double> startConversionRateTUI(String currency) {
        return CurrenciesArray.getCurrency(currency).getConversionRatesArray();
    }

    public static Map<String, Double> startConversionGUI(String currency, Boolean GUIRequest) {
        if (GUIRequest) {
            CurrenciesArray currenciesArray = new CurrenciesArray();
            return currenciesArray.getCurrency(currency).getConversionRatesArray();
        }

        return null;
    }

}
