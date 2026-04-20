package Swings;



import java.awt.Font;

import java.awt.event.MouseAdapter;

import java.awt.event.MouseEvent;



import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JLabel;



public class MouseDemo {



    public static void main(String[] args) {



        JFrame frame = new JFrame("Mouse Event Demo");

        JButton button = new JButton("Click Me");



        button.setBounds(120, 120, 150, 50);



        // Label to show output in GUI

        JLabel label = new JLabel("Perform Mouse Action", JLabel.CENTER);

        label.setBounds(50, 50, 300, 30);

        label.setFont(new Font("Arial", Font.BOLD, 16));



        // Mouse events

        button.addMouseListener(new MouseAdapter() {



            public void mousePressed(MouseEvent e) {

                label.setText("Mouse Down (Pressed)");

            }



            public void mouseReleased(MouseEvent e) {

                label.setText("Mouse Up (Released)");

            }



            public void mouseClicked(MouseEvent e) {

                if (e.getClickCount() == 2) {

                    label.setText("Double Click");

                } else {

                    label.setText("Single Click");

                }

            }

        });



        frame.add(label);

        frame.add(button);



        frame.setSize(400, 300);

        frame.setLayout(null);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);

    }

}

