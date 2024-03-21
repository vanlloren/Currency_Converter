package GUI;

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

        //ottiene il riferimento al componente JScrollBar nel mainMenuFrame e lo nasconde
        //mainMenuFrame.getContentPane().getComponent(0).setVisible(false);





    }
    public static void mainMenu(JFrame mainMenuFrame){
        mainMenuFrame.setTitle("Main Menu");
        mainMenuFrame.setVisible(true);
        mainMenuFrame.setLayout(new GridLayout(0,2));
        mainMenuFrame.setSize(500, 250);

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
        // TODO button1.addMouseListener(new MouseAdapter() {

        button2.setVisible(true);
        button2.setOpaque(true);
        button2.setContentAreaFilled(true);
        button2.setBorderPainted(false);
        button2.setFocusPainted(false);
        button2.setBackground(Color.BLUE);
        button2.setForeground(Color.BLACK);
        button2.setFont(new Font("Arial", Font.BOLD, 12));
        //TODO button2.addMouseListener(new MouseAdapter() {

        button3.setVisible(true);
        button3.setOpaque(true);
        button3.setContentAreaFilled(true);
        button3.setBorderPainted(false);
        button3.setFocusPainted(false);
        button3.setBackground(Color.YELLOW);
        button3.setForeground(Color.BLACK);
        button3.setFont(new Font("Arial", Font.BOLD, 12));
        //TODO button3.addMouseListener(new MouseAdapter() {

        button4.setVisible(true);
        button4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });
        button4.setOpaque(true);
        button4.setContentAreaFilled(true);
        button4.setBorderPainted(false);
        button4.setFocusPainted(false);
        button4.setBackground(Color.RED);
        button4.setForeground(Color.BLACK);
        button4.setFont(new Font("Arial", Font.BOLD, 12));

        mainMenuFrame.add(button1);
        mainMenuFrame.add(button2);
        mainMenuFrame.add(button3);
        mainMenuFrame.add(button4);




    }
}
