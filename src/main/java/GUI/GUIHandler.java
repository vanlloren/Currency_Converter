package GUI;

import Converter.SingleConverterExecutor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

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
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                multipleConversionMenu1(mainMenuFrame);
            }
        });

        button3.setVisible(true);
        button3.setOpaque(true);
        button3.setContentAreaFilled(true);
        button3.setBorderPainted(false);
        button3.setFocusPainted(false);
        button3.setBackground(Color.YELLOW);
        button3.setForeground(Color.BLACK);
        button3.setFont(new Font("Arial", Font.BOLD, 12));
        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                currenciesListMenu(mainMenuFrame);
            }
        });

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
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                singleConversionFrame.setVisible(false);
                singleConversionMenuConv(singleConversionFrame);
            }
        });

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

    public static void singleConversionMenuConv(JFrame singleConversionFrame) {
        singleConversionFrame.setVisible(false);
        JFrame singleConversionConvFrame = new JFrame("Conversion software - Single conversion - Conversion");
        singleConversionConvFrame.setVisible(true);
        singleConversionConvFrame.setLayout(new GridLayout(0, 2));
        singleConversionConvFrame.setSize(600, 250);
        singleConversionConvFrame.addWindowListener(new java.awt.event.WindowAdapter() {
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

        JTextField amount = new JTextField();
        amount.setVisible(true);

        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(0, 1));

        JPanel panel2 = new JPanel();
        panel2.setVisible(true);
        panel2.setLayout(new BorderLayout());

        JPanel panel3 = new JPanel();
        panel3.setVisible(true);
        panel3.setLayout(new GridLayout(0,2));

        JPanel panel4 = new JPanel();
        panel4.setVisible(true);
        panel4.setLayout(new GridLayout(3, 0));

        JButton button1 = new JButton("Convert");
        button1.setVisible(true);
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double conversion;
                double effectiveAmount;
                try {
                    effectiveAmount = Double.parseDouble(amount.getText());
                } catch (NumberFormatException ex) {
                    JLabel label = new JLabel("The amount must be a number in the format 0.00");
                    label.setVisible(true);
                    label.setHorizontalAlignment(SwingConstants.CENTER);
                    if (panel2.getComponentCount() > 0) {
                        panel2.remove(0);
                    }
                    panel2.add(label, BorderLayout.CENTER);
                    //refresh the frame
                    singleConversionConvFrame.revalidate();
                    return;
                }
                conversion = SingleConverterExecutor.startConversion(currencies.getSelectedItem().toString(), comparedCurrencies.getSelectedItem().toString(), effectiveAmount, true);

                JLabel label = new JLabel("The converted amount is: " + conversion);
                label.setVisible(true);
                label.setHorizontalAlignment(SwingConstants.CENTER);
                if (panel2.getComponentCount() > 0) {
                    panel2.remove(0);
                }
                panel2.add(label, BorderLayout.CENTER);
                //refresh the frame
                singleConversionConvFrame.revalidate();

            }
        });

        JButton button2 = new JButton("Back to main menu");
        button2.setVisible(true);
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                singleConversionConvFrame.setVisible(false);
                begin();
            }
        });

        JButton button3 = new JButton("Back to single conversion menu");
        button3.setVisible(true);
        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                singleConversionConvFrame.setVisible(false);
                singleConversionMenu1(singleConversionConvFrame);
            }
        });

        panel4.add(button1);
        panel4.add(button2);
        panel4.add(button3);

        panel3.add(currencies);
        panel3.add(amount);
        panel1.add(comparedCurrencies);

        singleConversionConvFrame.add(panel3);
        singleConversionConvFrame.add(panel1);
        singleConversionConvFrame.add(panel4);
        singleConversionConvFrame.add(panel2);
    }

    public static void currenciesListMenu(JFrame mainMenuFrame){
        mainMenuFrame.setVisible(false);
        JFrame currenciesListFrame = new JFrame("Conversion software - Currencies list");
        currenciesListFrame.setVisible(true);
        currenciesListFrame.setLayout(new BorderLayout());
        currenciesListFrame.setSize(600, 250);
        currenciesListFrame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        JScrollBar scrollBar = new JScrollBar();
        scrollBar.setVisible(true);
        scrollBar.setOrientation(JScrollBar.VERTICAL);

        currenciesListFrame.add(scrollBar, BorderLayout.EAST);
        currenciesListFrame.addMouseWheelListener(e -> {
            int notches = e.getWheelRotation();
            //muove la scrollbar in base al movimento della rotellina del mouse
            scrollBar.setValue(scrollBar.getValue() + scrollBar.getBlockIncrement() * notches);
        });


        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 3));
        currenciesListFrame.add(panel);

        JButton button1 = new JButton("Back to main menu");
        button1.setVisible(true);
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                currenciesListFrame.setVisible(false);
                begin();
            }
        });

        JLabel label1 = new JLabel("");
        label1.setVisible(true);

        JPanel panel1 = new JPanel(new BorderLayout());
        panel1.setVisible(true);
        panel1.add(new JLabel("(USD)"), BorderLayout.CENTER);
        panel1.add(new JLabel("United States Dollar "), BorderLayout.WEST);
        ImageIcon icon1 = new ImageIcon("src/main/resources/USD.png");
        icon1.setImage(icon1.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        JLabel label2 = new JLabel(icon1);
        label2.setVisible(true);
        panel1.add(label2, BorderLayout.EAST);

        JPanel panel2 = new JPanel(new BorderLayout());
        panel2.setVisible(true);
        panel2.add(new JLabel("(EUR)"), BorderLayout.CENTER);
        panel2.add(new JLabel("Euro "), BorderLayout.WEST);
        ImageIcon icon2 = new ImageIcon("src/main/resources/EUR.png");
        icon2.setImage(icon2.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        JLabel label3 = new JLabel(icon2);
        label3.setVisible(true);
        panel2.add(label3, BorderLayout.EAST);

        JPanel panel3 = new JPanel(new BorderLayout());
        panel3.setVisible(true);
        panel3.add(new JLabel("(JPY)"), BorderLayout.CENTER);
        panel3.add(new JLabel("Japanese Yen "), BorderLayout.WEST);
        ImageIcon icon3 = new ImageIcon("src/main/resources/JPY.png");
        icon3.setImage(icon3.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        JLabel label4 = new JLabel(icon3);
        label4.setVisible(true);
        panel3.add(label4, BorderLayout.EAST);

        JPanel panel4 = new JPanel(new BorderLayout());
        panel4.setVisible(true);
        panel4.add(new JLabel("(GBP)"), BorderLayout.CENTER);
        panel4.add(new JLabel("British Pound "), BorderLayout.WEST);
        ImageIcon icon4 = new ImageIcon("src/main/resources/GBP.png");
        icon4.setImage(icon4.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        JLabel label5 = new JLabel(icon4);
        label5.setVisible(true);
        panel4.add(label5, BorderLayout.EAST);

        JPanel panel5 = new JPanel(new BorderLayout());
        panel5.setVisible(true);
        panel5.add(new JLabel("(CHF)"), BorderLayout.CENTER);
        panel5.add(new JLabel("Swiss Franc "), BorderLayout.WEST);
        ImageIcon icon5 = new ImageIcon("src/main/resources/CHF.png");
        icon5.setImage(icon5.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        JLabel label6 = new JLabel(icon5);
        label6.setVisible(true);
        panel5.add(label6, BorderLayout.EAST);

        JPanel panel6 = new JPanel(new BorderLayout());
        panel6.setVisible(true);
        panel6.add(new JLabel("(CNY)"), BorderLayout.CENTER);
        panel6.add(new JLabel("Chinese Yuan "), BorderLayout.WEST);
        ImageIcon icon6 = new ImageIcon("src/main/resources/CNY.png");
        icon6.setImage(icon6.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        JLabel label7 = new JLabel(icon6);
        label7.setVisible(true);
        panel6.add(label7, BorderLayout.EAST);

        JPanel panel7 = new JPanel(new BorderLayout());
        panel7.setVisible(true);
        panel7.add(new JLabel("(ARS)"), BorderLayout.CENTER);
        panel7.add(new JLabel("Argentine Peso "), BorderLayout.WEST);
        ImageIcon icon7 = new ImageIcon("src/main/resources/ARS.png");
        icon7.setImage(icon7.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        JLabel label8 = new JLabel(icon7);
        label8.setVisible(true);
        panel7.add(label8, BorderLayout.EAST);

        JPanel panel8 = new JPanel(new BorderLayout());
        panel8.setVisible(true);
        panel8.add(new JLabel("(RUB)"), BorderLayout.CENTER);
        panel8.add(new JLabel("Russian Ruble "), BorderLayout.WEST);
        ImageIcon icon8 = new ImageIcon("src/main/resources/RUB.png");
        icon8.setImage(icon8.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        JLabel label9 = new JLabel(icon8);
        label9.setVisible(true);
        panel8.add(label9, BorderLayout.EAST);

        JPanel panel9 = new JPanel(new BorderLayout());
        panel9.setVisible(true);
        panel9.add(new JLabel("(BRL)"), BorderLayout.CENTER);
        panel9.add(new JLabel("Brazilian Real "), BorderLayout.WEST);
        ImageIcon icon9 = new ImageIcon("src/main/resources/BRL.png");
        icon9.setImage(icon9.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        JLabel label10 = new JLabel(icon9);
        label10.setVisible(true);
        panel9.add(label10, BorderLayout.EAST);

        JPanel panel10 = new JPanel(new BorderLayout());
        panel10.setVisible(true);
        panel10.add(new JLabel("(INR)"), BorderLayout.CENTER);
        panel10.add(new JLabel("Indian Rupee "), BorderLayout.WEST);
        ImageIcon icon10 = new ImageIcon("src/main/resources/INR.png");
        icon10.setImage(icon10.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        JLabel label11 = new JLabel(icon10);
        label11.setVisible(true);
        panel10.add(label11, BorderLayout.EAST);

        panel.add(panel1);
        panel.add(panel2);
        panel.add(panel3);
        panel.add(panel4);
        panel.add(panel5);
        panel.add(panel6);
        panel.add(panel7);
        panel.add(panel8);
        panel.add(panel9);
        panel.add(panel10);
        panel.add(label1);
        panel.add(button1);
    }

    public static void multipleConversionMenu1(JFrame mainMenuFrame){
        mainMenuFrame.setVisible(false);
        JFrame multipleConversionFrame = new JFrame("Conversion software - Multiple conversion");
        multipleConversionFrame.setVisible(true);
        multipleConversionFrame.setLayout(new BorderLayout());
        multipleConversionFrame.setSize(600, 250);

        JPanel panel = new JPanel();
        panel.setVisible(true);
        panel.setLayout(new GridLayout(1,0));

        JButton button1 = new JButton("Get conversion rates of a currency");
        JButton button2 = new JButton("Convert a specific amount of a currency");
        JButton button3 = new JButton("Back to main menu");

        button1.setVisible(true);
        button1.setOpaque(true);
        button1.setContentAreaFilled(true);
        button1.setBorderPainted(false);
        button1.setFocusPainted(false);
        button1.setBackground(Color.GREEN);
        button1.setForeground(Color.BLACK);
        button1.setFont(new Font("Arial", Font.BOLD, 10));
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                multipleConversionFrame.setVisible(false);
                multipleConversionMenuConvRates(multipleConversionFrame);
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
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                multipleConversionFrame.setVisible(false);
                multipleConversionMenuConv(multipleConversionFrame);
            }
        });

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
                multipleConversionFrame.setVisible(false);
                begin();
            }
        });

        panel.add(button1);
        panel.add(button2);

        multipleConversionFrame.add(panel, BorderLayout.CENTER);
        multipleConversionFrame.add(button3, BorderLayout.SOUTH);

        multipleConversionFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }

    public static void multipleConversionMenuConv(JFrame multipleConversionFrame){
        multipleConversionFrame.setVisible(false);
        JFrame multipleConversionConvFrame = new JFrame("Conversion software - Multiple conversion - Conversion");
        multipleConversionConvFrame.setVisible(true);
        multipleConversionConvFrame.setLayout(new GridLayout(0,2));
        multipleConversionConvFrame.setSize(600,250);
        multipleConversionConvFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
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

        JTextField amount = new JTextField();
        amount.setVisible(true);

        JPanel panel1 = new JPanel();
        panel1.setVisible(true);
        panel1.setLayout(new GridLayout(0,2));

        panel1.add(currencies);
        panel1.add(amount);

        JPanel panel2 = new JPanel();
        panel2.setVisible(true);
        panel2.setLayout(new BorderLayout());

        JPanel panel3 = new JPanel();
        panel3.setVisible(true);
        panel3.setLayout(new GridLayout(0,1));

        JPanel panel4 = new JPanel();
        panel4.setVisible(true);
        panel4.setLayout(new GridLayout(3,0));

        JButton button1 = new JButton("Convert");
        button1.setVisible(true);
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ArrayList<Double> conversionList;
                double effectiveAmount;
                try {
                    effectiveAmount = Double.parseDouble(amount.getText());
                } catch (NumberFormatException ex) {
                    JLabel label = new JLabel("The amount must be a number in the format 0.00");
                    label.setVisible(true);
                    label.setHorizontalAlignment(SwingConstants.CENTER);
                    if (panel2.getComponentCount() > 0) {
                        panel2.remove(0);
                    }
                    panel2.add(label, BorderLayout.CENTER);
                    //refresh the frame
                    multipleConversionConvFrame.revalidate();
                    return;
                }

                //TODO lista di multiple conversioni
                /*
                JLabel label = new JLabel("The converted amount is: " + conversion);
                label.setVisible(true);
                label.setHorizontalAlignment(SwingConstants.CENTER);
                if (panel2.getComponentCount() > 0) {
                    panel2.remove(0);
                }
                panel2.add(label, BorderLayout.CENTER);
                //refresh the frame
                multipleConversionConvFrame.revalidate();
                */
            }
        });

        JButton button2 = new JButton("Back to main menu");
        button2.setVisible(true);
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                multipleConversionConvFrame.setVisible(false);
                begin();
            }
        });

        JButton button3 = new JButton("Back to single conversion menu");
        button3.setVisible(true);
        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                multipleConversionConvFrame.setVisible(false);
                multipleConversionMenu1(multipleConversionConvFrame);
            }
        });

        panel3.add(panel1);
        panel3.add(panel4);
        panel4.add(button1);
        panel4.add(button2);
        panel4.add(button3);

        multipleConversionConvFrame.add(panel3);
        multipleConversionConvFrame.add(panel2);
    }

    public static void multipleConversionMenuConvRates(JFrame multipleConversionFrame){
        multipleConversionFrame.setVisible(false);
        JFrame multipleConversionConvRatesFrame = new JFrame("Conversion software - Single conversion - Conversion rates");
        multipleConversionConvRatesFrame.setVisible(true);
        multipleConversionConvRatesFrame.setLayout(new GridLayout(0,2));
        multipleConversionConvRatesFrame.setSize(600, 250);
        multipleConversionConvRatesFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent){
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

        JPanel panel1 = new JPanel();
        panel1.setVisible(true);
        panel1.setLayout(new GridLayout(0,1));

        JPanel panel2 = new JPanel();
        panel2.setVisible(true);
        panel2.setLayout(new GridLayout(0,1));

        JButton button1 = new JButton("Get conversion rate");
        button1.setVisible(true);
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ArrayList<Double> conversionRateList;
                //TODO riempire conversionRateList
            }
        });

        JButton button2 = new JButton("Back to main menu");
        button2.setVisible(true);
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                multipleConversionConvRatesFrame.setVisible(false);
                begin();
            }
        });

        JButton button3 = new JButton("Back to multiple conversion menu");
        button3.setVisible(true);
        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                multipleConversionConvRatesFrame.setVisible(false);
                multipleConversionMenu1(multipleConversionConvRatesFrame);
            }
        });

        panel1.add(currencies);
        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);
        multipleConversionConvRatesFrame.add(panel1);
        multipleConversionConvRatesFrame.add(panel2);

    }

}
