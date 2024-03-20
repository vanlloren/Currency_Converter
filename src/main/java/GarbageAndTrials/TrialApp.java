package GarbageAndTrials;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static java.awt.BorderLayout.CENTER;

public class TrialApp {

    static void lookAndFeel() {
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
        // TODO startingDialog.setIconImage(new ImageIcon("src/main/resources/img.png").getImage());

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
                mainMenu();
            }
        });

    }

    private static void mainMenu(){
        JFrame mainMenuFrame = new JFrame("Main Menu");
        mainMenuFrame.setVisible(true);
        mainMenuFrame.setLayout(new BorderLayout());
        mainMenuFrame.setSize(300, 300);
    }

    public static void main(String[] args) {
        GUIInitializer();
    }
}
