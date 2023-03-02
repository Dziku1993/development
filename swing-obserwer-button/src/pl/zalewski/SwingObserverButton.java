package pl.zalewski;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserverButton {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserverButton example = new SwingObserverButton();
        example.start();
    }

    public void start() {
        frame = new JFrame();
        JButton button = new JButton("Should i do this?");
        button.addActionListener(new AngelListener());
        button.addActionListener(new DevilListener());
        frame.getContentPane().add(BorderLayout.CENTER, button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }



    static class AngelListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Don't do this. You may regret it!");
        }
    }

    static class DevilListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Yeeees!!!! Do this!");
        }
    }
}
