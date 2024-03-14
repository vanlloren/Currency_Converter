package Util;

import java.util.HashMap;
import java.util.Map;

/**
 * This class represent a single currency.
 */
public class Currency {
    private String currencyName;
    private String currencyCode;
    private HashMap<String, Double> conversionRatesArray = new HashMap<>();

    public void addCurrency(String currencyName, String currencyCode) {
        this.currencyName = currencyName;
        this.currencyCode = currencyCode;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void addConversionRate(String currencyCode, double conversionRate) {
        conversionRatesArray.put(currencyCode, conversionRate);
    }

    public double getConversionRate(String currencyCode) {
        return conversionRatesArray.get(currencyCode);
    }

    public Map<String, Double> getConversionRatesArray() {
        return conversionRatesArray;
    }
}
