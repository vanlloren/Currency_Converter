package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static java.awt.BorderLayout.CENTER;

public class GraphicApp {
    private static void lookAndFeel(){
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void GUIInitializer(){
        lookAndFeel();
        JDialog startingDialog = new JDialog();
        startingDialog.setTitle("Welcome");
        startingDialog.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        startingDialog.setVisible(true);
        startingDialog.setLayout(new BorderLayout());
        startingDialog.setSize(500, 150);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel startingLabel = new JLabel("Welcome to vanlloren's conversion software!");
        startingLabel.setHorizontalAlignment(SwingConstants.CENTER);
        startingLabel.setFont(new Font("Arial", Font.BOLD, 12));
        startingLabel.setVisible(true);
        panel.add(startingLabel, BorderLayout.NORTH);

        JLabel startingLabel2 = new JLabel("Please click OK to continue.");
        startingLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        startingLabel2.setFont(new Font("Arial", Font.BOLD, 12));
        startingLabel2.setVisible(true);
        panel.add(startingLabel2, CENTER);

        JButton startButton = new JButton("OK");
        startButton.setHorizontalAlignment(SwingConstants.CENTER);
        startButton.setVerticalAlignment(SwingConstants.CENTER);
        startButton.setVisible(true);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setVisible(true);
        buttonPanel.setLayout(new FlowLayout());


        buttonPanel.add(new JLabel(" "));
        buttonPanel.add(startButton);
        panel.add(buttonPanel, BorderLayout.SOUTH);
        startingDialog.add(panel, CENTER);
        startButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                startingDialog.dispose();
                GUIHandler.begin();
            }
        });

    }

    public static void main(String[] args) {
        GUIInitializer();
    }
}
