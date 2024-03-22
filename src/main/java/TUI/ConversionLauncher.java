package TUI;

import Converter.MultipleConverterTUI;
import Converter.SingleConverterTUI;

public class ConversionLauncher {
    public void conversionMethod(char choice) {
        if (choice == 'a' || choice == 'A') {
            System.out.println("Initializing 1vs1 conversion process...");
            SingleConverterTUI singleConverter = new SingleConverterTUI();
            singleConverter.convert();
        } else {
            System.out.println("Initializing 1vsAll conversion process...");
            MultipleConverterTUI multipleConverter = new MultipleConverterTUI();
            multipleConverter.convert();
        }
    }
}
