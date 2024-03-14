package Converter;

import Util.CurrenciesArray;
import java.util.Scanner;

public class MultipleConverter {

    CurrenciesArray currenciesArray = new CurrenciesArray();

    private final Scanner scanner = new Scanner(System.in);
        public void convert(){
            System.out.println("Conversion process initialized");
            System.out.println("This is the MultipleConverter class");
            System.out.println("Are you interested in checking the conversion rates of all currencies? [1]");
            System.out.println("Or are you interested in converting a specific amount of a currency to all other currencies? [2]");

            int selection = scanner.nextInt();
            String currency;

            switch (selection){
                case 1:
                    System.out.println("Select the currency you want to check the conversion rates of:");
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

                    do {
                        currency = scanner.nextLine();
                    } while (currency.equals(""));
                    System.out.println("These are all the conversion rates of the other currencies for " + currenciesArray.getCurrencyName(currency));

                    currenciesArray.getCurrency(currency).getConversionRatesArray().forEach((k, v) -> System.out.println(k + " : " + v));

                    break;
                case 2:
                    System.out.println("Select the currency you want to convert to all other currencies:");
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

                    do {
                        currency = scanner.nextLine();
                    } while (currency.equals(""));
                    System.out.println("Enter the amount of " + currenciesArray.getCurrencyName(currency) + " you want to convert to all other currencies:");
                    double amount = scanner.nextDouble();

                    currenciesArray.getCurrency(currency).getConversionRatesArray().forEach((k, v) -> System.out.println(k + " : " + v * amount));
                    break;
            }
        }
}
