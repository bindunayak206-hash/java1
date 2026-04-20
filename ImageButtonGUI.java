package Swings;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageButtonGUI implements ActionListener {

    JFrame frame;
    JButton btnClock, btnGlass;
    JLabel messageLabel;

    ImageButtonGUI() {
        frame = new JFrame("Button Image Demo");

        // Load images (place in project folder)
        ImageIcon clockIcon = new ImageIcon("clock.png");
        ImageIcon glassIcon = new ImageIcon("hourglass.png");

        // Buttons with images
        btnClock = new JButton(clockIcon);
        btnGlass = new JButton(glassIcon);

        btnClock.setBounds(150, 150, 120, 120);
        btnGlass.setBounds(400, 150, 120, 120);

        // Message label (top)
        messageLabel = new JLabel("Click any button", JLabel.CENTER);
        messageLabel.setFont(new Font("Arial", Font.BOLD, 20));
        messageLabel.setBounds(100, 50, 500, 40);

        // Add listeners
        btnClock.addActionListener(this);
        btnGlass.addActionListener(this);

        // Add components
        frame.add(messageLabel);
        frame.add(btnClock);
        frame.add(btnGlass);

        frame.setSize(700, 400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnClock) {
            messageLabel.setText("You have pressed digital clock!");
        } else if (e.getSource() == btnGlass) {
            messageLabel.setText("You have pressed hour glass!");
        }
    }

    public static void main(String[] args) {
        new ImageButtonGUI();
    }
}