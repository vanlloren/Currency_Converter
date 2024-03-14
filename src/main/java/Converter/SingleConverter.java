package Converter;

import Util.CurrenciesArray;

import java.util.Scanner;

public class SingleConverter {
    private final CurrenciesArray currenciesArray = new CurrenciesArray();
    private final Scanner scanner = new Scanner(System.in);

    public void convert(){
        System.out.println("Conversion process initialized");
        System.out.println("This is the SingleConverter class");
        System.out.println("Are you interested in checking the conversion rate of a currency? [1]");
        System.out.println("Or are you interested in converting a specific amount of a currency to another currency? [2]");

        int selection = scanner.nextInt();
        String currency;

        switch (selection){
            case 1:
                System.out.println("Select the currency you want to check the conversion rate of:");
                System.out.println("USD");
                System.out.println("EUR");
                System.out.println("JPY");
                System.out.println("GBP");
                System.out.println("CHF");
                System.out.println("CNY");
                System.out.println("ARS");
                System.out.println("RUB");
                System.out.println("BRL");
                System.out.println("INR");

                currency = scanner.nextLine();
                System.out.println("Select the currency you want to compare");
                String comparedCurrency = scanner.nextLine();
                System.out.println("The conversion rate of " + currenciesArray.getCurrency(currency) +
                        "with respect to" + currenciesArray.getCurrency(comparedCurrency) + "is : " +
                        currenciesArray.getCurrency(currency).getConversionRatesArray().get(comparedCurrency));
                break;
            case 2:
                System.out.println("Select the currency you want to convert from:");
                System.out.println("USD");
                System.out.println("EUR");
                System.out.println("JPY");
                System.out.println("GBP");
                System.out.println("CHF");
                System.out.println("CNY");
                System.out.println("ARS");
                System.out.println("RUB");
                System.out.println("BRL");
                System.out.println("INR");

                currency = scanner.nextLine();
                System.out.println("Select the currency you want to convert to:");
                String convertedCurrency = scanner.nextLine();
                System.out.println("Enter the amount of " + currenciesArray.getCurrencyName(currency) + " you want to convert to " + currenciesArray.getCurrencyName(convertedCurrency) + ":");
                double amount = scanner.nextDouble();
                System.out.println("The amount of " + currenciesArray.getCurrencyName(currency) + " you want to convert to " + currenciesArray.getCurrencyName(convertedCurrency) + " is : " +
                        currenciesArray.getCurrency(currency).getConversionRatesArray().get(convertedCurrency) * amount);
                break;
        }

    }
}
