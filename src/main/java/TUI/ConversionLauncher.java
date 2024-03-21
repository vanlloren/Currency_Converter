package TUI;

import Converter.MultipleConverter;
import Converter.SingleConverterTUI;

public class ConversionLauncher {
    public void conversionMethod(char choice) {
        if (choice == 'a' || choice == 'A') {
            System.out.println("Initializing 1vs1 conversion process...");
            SingleConverterTUI singleConverter = new SingleConverterTUI();
            singleConverter.convert();
        } else {
            System.out.println("Initializing 1vsAll conversion process...");
            MultipleConverter multipleConverter = new MultipleConverter();
            multipleConverter.convert();
        }
    }
}
