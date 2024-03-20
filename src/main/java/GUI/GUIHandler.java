package GUI;

import javax.swing.*;
import java.awt.*;

public class GUIHandler {
    public static void mainMenu(){
        JFrame mainMenuFrame = new JFrame("Main Menu");
        mainMenuFrame.setVisible(true);
        mainMenuFrame.setLayout(new BorderLayout());
        mainMenuFrame.setSize(800, 650);

        JScrollBar scrollBar = new JScrollBar();
        scrollBar.setVisible(true);
        mainMenuFrame.add(scrollBar, BorderLayout.EAST);
        mainMenuFrame.addMouseWheelListener(e -> {
            int notches = e.getWheelRotation();
            //muove la scrollbar in base al movimento della rotellina del mouse
            scrollBar.setValue(scrollBar.getValue() + scrollBar.getBlockIncrement() * notches);
        });

    }
}
