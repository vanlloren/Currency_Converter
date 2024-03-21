package TUI;

import java.util.Scanner;

/**
 * The main class of the application
 */
public class TextApp {
    private static final Scanner scanner = new Scanner(System.in);
    private final static ConversionLauncher conversionLauncher = new ConversionLauncher();

    public static void main(String[] args) {
        System.out.println("Welcome to vanlloren's conversion software!");
        System.out.println("This software is capable of converting the following currencies:");

        System.out.println("01. USD");
        System.out.println("02. EUR");
        System.out.println("03. JPY");
        System.out.println("04. GBP");
        System.out.println("05. CHF");
        System.out.println("06. CNY");
        System.out.println("07. ARS");
        System.out.println("08. RUB");
        System.out.println("09. BRL");
        System.out.println("10. INR");
        System.out.println("More to come soon!");


        char anotherConversion;
        char choice;

        do {
            System.out.println("Please select the type of currency conversion you want:");
            System.out.println("[A] A currency vs another currency");
            System.out.println("[B] A currency vs all other currencies");
            choice = scanner.next().charAt(0);
            scanner.nextLine();
            while (choice != 'a' && choice != 'A' && choice != 'b' && choice != 'B') {
                System.out.println("Invalid input. Please try again.");
                choice = scanner.next().charAt(0);
                scanner.nextLine();
            }
            conversionLauncher.conversionMethod(choice);
            System.out.println("Do you want to convert another currency? [Y/N]");
            anotherConversion = scanner.next().charAt(0);
            scanner.nextLine();
        } while(anotherConversion == 'y' || anotherConversion == 'Y');

    }



}

