package net.xgui4;

import net.xgui4.gui.Window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        Window window = new Window("Game Launcher", 500, 600, Color.BLUE);

        window.setVisible();

        JLabel title = new JLabel("Game Launcher");
        title.setBounds(15, 0, 500, 200);
        title.setFont(new Font("Arial", Font.BOLD, 60));

        JButton button = new JButton("Play");

        JButton button2 = new JButton("Other Game");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Not implemented Yet!");
                throw new RuntimeException("Not implemented Yet!");
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Not implemented Yet!");
                throw new RuntimeException("Not implemented Yet!");
            }
        });

        // x axis, y axis, width, height
        button.setBounds(135, 150, 220, 50);

        // x axis, y axis, width, height
        button2.setBounds(135, 220, 220, 50);

        // adding button in JFrame
        window.add(button);

        window.add(button2);

        window.add(title);

        window.setLayout(null);
    }
}
