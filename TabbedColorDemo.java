package Swings;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class TabbedColorDemo {
    public static void main(String[] args) {

        // Frame setup
        JFrame frame = new JFrame("Tabbed Color Pane");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create Tabbed Pane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Panels with colors
        JPanel cyanPanel = new JPanel();
        cyanPanel.setBackground(Color.CYAN);

        JPanel magentaPanel = new JPanel();
        magentaPanel.setBackground(Color.MAGENTA);

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.YELLOW);

        // Add tabs
        tabbedPane.addTab("Cyan", cyanPanel);
        tabbedPane.addTab("Magenta", magentaPanel);
        tabbedPane.addTab("Yellow", yellowPanel);

        // Change Listener
        tabbedPane.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                int index = tabbedPane.getSelectedIndex();
                String title = tabbedPane.getTitleAt(index);

                System.out.println("Selected Color: " + title);
            }
        });

        // Add to frame
        frame.add(tabbedPane);
        frame.setVisible(true);
    }
}