package net.xgui4.gui;

import javax.swing.*;
import java.awt.*;

public abstract class Canvas extends JFrame {
    public Canvas(String title, int width, int height, Color bgColor) {
        super(title);
        setSize(width, height);
        getContentPane().setBackground(bgColor);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public abstract void  setVisible();
}
