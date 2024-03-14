package Converter;

public class ConversionLauncher {
    public void conversionMethod(char choice) {
        if (choice == 'a' || choice == 'A') {
            System.out.println("Initializing 1vs1 conversion process...");
            SingleConverter singleConverter = new SingleConverter();
            singleConverter.convert();
        } else {
            System.out.println("Initializing 1vsAll conversion process...");
            MultipleConverter multipleConverter = new MultipleConverter();
            multipleConverter.convert();
        }
    }
}
