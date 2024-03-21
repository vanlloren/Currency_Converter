package GUI;

import Converter.SingleConverterExecutor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GUIHandler {

    public static void lookAndFeel() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void begin(){
        lookAndFeel();
        JFrame mainMenuFrame = new JFrame();
        mainMenu(mainMenuFrame);






    }

    public static void mainMenu(JFrame mainMenuFrame){
        mainMenuFrame.setTitle("Conversion software");
        mainMenuFrame.setVisible(true);
        mainMenuFrame.setLayout(new GridLayout(0,2));
        mainMenuFrame.setSize(500, 250);
        mainMenuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //termina il programma se viene chiusa JFrame
        mainMenuFrame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });


        JButton button1 = new JButton("A currency vs another currency");
        JButton button2 = new JButton("A currency vs all other currencies");
        JButton button3 = new JButton("See available currencies");
        JButton button4 = new JButton("Exit");


        button1.setVisible(true);
        button1.setOpaque(true);
        button1.setContentAreaFilled(true);
        button1.setBorderPainted(false);
        button1.setFocusPainted(false);
        button1.setBackground(Color.GREEN); // for the background
        button1.setForeground(Color.BLACK); // for the text
        button1.setFont(new Font("Arial", Font.BOLD, 12));
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                singleConversionMenu1(mainMenuFrame);
            }
        });


        button2.setVisible(true);
        button2.setOpaque(true);
        button2.setContentAreaFilled(true);
        button2.setBorderPainted(false);
        button2.setFocusPainted(false);
        button2.setBackground(Color.BLUE);
        button2.setForeground(Color.BLACK);
        button2.setFont(new Font("Arial", Font.BOLD, 12));
        // TODO button2.addMouseListener(new MouseAdapter() {

        button3.setVisible(true);
        button3.setOpaque(true);
        button3.setContentAreaFilled(true);
        button3.setBorderPainted(false);
        button3.setFocusPainted(false);
        button3.setBackground(Color.YELLOW);
        button3.setForeground(Color.BLACK);
        button3.setFont(new Font("Arial", Font.BOLD, 12));
        // TODO button3.addMouseListener(new MouseAdapter() {

        button4.setVisible(true);
        button4.setOpaque(true);
        button4.setContentAreaFilled(true);
        button4.setBorderPainted(false);
        button4.setFocusPainted(false);
        button4.setBackground(Color.RED);
        button4.setForeground(Color.BLACK);
        button4.setFont(new Font("Arial", Font.BOLD, 12));
        button4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });

        mainMenuFrame.add(button1);
        mainMenuFrame.add(button2);
        mainMenuFrame.add(button3);
        mainMenuFrame.add(button4);
    }

    public static void singleConversionMenu1(JFrame mainMenuFrame) {
        mainMenuFrame.setVisible(false);
        JFrame singleConversionFrame = new JFrame("Conversion software - Single conversion");
        singleConversionFrame.setVisible(true);
        singleConversionFrame.setLayout(new BorderLayout());
        singleConversionFrame.setSize(600, 250);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 0));

        JButton button1 = new JButton("Get conversion rate of a currency");
        JButton button2 = new JButton("Convert a specific amount of a currency to another");
        JButton button3 = new JButton("Back to main menu");

        button1.setVisible(true);
        button1.setOpaque(true);
        button1.setContentAreaFilled(true);
        button1.setBorderPainted(false);
        button1.setFocusPainted(false);
        button1.setBackground(Color.GREEN); // for the background
        button1.setForeground(Color.BLACK); // for the text
        button1.setFont(new Font("Arial", Font.BOLD, 10));
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                singleConversionFrame.setVisible(false);
                singleConversionMenuConvRates(singleConversionFrame);
            }
        });

        button2.setVisible(true);
        button2.setOpaque(true);
        button2.setContentAreaFilled(true);
        button2.setBorderPainted(false);
        button2.setFocusPainted(false);
        button2.setBackground(Color.BLUE);
        button2.setForeground(Color.BLACK);
        button2.setFont(new Font("Arial", Font.BOLD, 10));
        // TODO button2.addMouseListener(new MouseAdapter() {

        button3.setVisible(true);
        button3.setOpaque(true);
        button3.setContentAreaFilled(true);
        button3.setBorderPainted(false);
        button3.setFocusPainted(false);
        button3.setBackground(Color.YELLOW);
        button3.setForeground(Color.BLACK);
        button3.setFont(new Font("Arial", Font.BOLD, 10));
        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                singleConversionFrame.setVisible(false);
                begin();
            }
        });

        panel.add(button1);
        panel.add(button2);

        singleConversionFrame.add(panel, BorderLayout.CENTER);
        singleConversionFrame.add(button3, BorderLayout.SOUTH);

        singleConversionFrame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }

    public static void singleConversionMenuConvRates(JFrame singleConversionFrame){
        singleConversionFrame.setVisible(false);
        JFrame singleConversionConvRatesFrame = new JFrame("Conversion software - Single conversion - Conversion rates");
        singleConversionConvRatesFrame.setVisible(true);
        singleConversionConvRatesFrame.setLayout(new GridLayout(0, 2));
        singleConversionConvRatesFrame.setSize(600, 250);
        singleConversionConvRatesFrame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        JComboBox<String> currencies = new JComboBox<>();
        currencies.addItem("USD");
        currencies.addItem("EUR");
        currencies.addItem("JPY");
        currencies.addItem("GBP");
        currencies.addItem("CHF");
        currencies.addItem("CNY");
        currencies.addItem("ARS");
        currencies.addItem("RUB");
        currencies.addItem("BRL");
        currencies.addItem("INR");

        JComboBox<String> comparedCurrencies = new JComboBox<>();
        comparedCurrencies.addItem("USD");
        comparedCurrencies.addItem("EUR");
        comparedCurrencies.addItem("JPY");
        comparedCurrencies.addItem("GBP");
        comparedCurrencies.addItem("CHF");
        comparedCurrencies.addItem("CNY");
        comparedCurrencies.addItem("ARS");
        comparedCurrencies.addItem("RUB");
        comparedCurrencies.addItem("BRL");
        comparedCurrencies.addItem("INR");

        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(0, 1));

        JPanel panel2 = new JPanel();
        panel2.setVisible(true);
        panel2.setLayout(new BorderLayout());

        JButton button1 = new JButton("Get conversion rate");
        button1.setVisible(true);
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double conversionRate;
                conversionRate = SingleConverterExecutor.startConversionRate(currencies.getSelectedItem().toString(), comparedCurrencies.getSelectedItem().toString(), true);

                JLabel label = new JLabel("The conversion rate is: "+ conversionRate);
                label.setVisible(true);
                label.setHorizontalAlignment(SwingConstants.CENTER);
                if(panel2.getComponentCount() > 0){
                    panel2.remove(0);
                }
                panel2.add(label, BorderLayout.CENTER);
                //refresh the frame
                singleConversionConvRatesFrame.revalidate();

            }
        });


        JButton button2 = new JButton("Back to main menu");
        button2.setVisible(true);
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                singleConversionConvRatesFrame.setVisible(false);
                begin();
            }
        });

        JButton button3 = new JButton("Back to single conversion menu");
        button3.setVisible(true);
        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                singleConversionConvRatesFrame.setVisible(false);
                singleConversionMenu1(singleConversionConvRatesFrame);
            }
        });



        singleConversionConvRatesFrame.add(currencies);
        singleConversionConvRatesFrame.add(comparedCurrencies);
        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);
        singleConversionConvRatesFrame.add(panel1);
        singleConversionConvRatesFrame.add(panel2);

    }
}
