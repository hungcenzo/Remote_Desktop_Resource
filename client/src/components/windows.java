package components;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/* FrameDemo.java requires no other files. */
public class windows {
    public static void createAndShowGUI() {
        // Create and set up the window.
        JFrame frame = new JFrame("windows");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel emptyLabel = new JLabel("");
        emptyLabel.setPreferredSize(new Dimension(175, 100));
        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);

        // Display the window.
        frame.pack();
        frame.setVisible(true);
    }
}
