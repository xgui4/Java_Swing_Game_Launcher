package net.xgui4.gui;

import java.awt.*;

public class Window extends Canvas{

    public Window(String title, int heigth, int width, Color color) {
        super(title, heigth, width, color);
    }

    @Override
    public void setVisible() {
        super.setVisible(true);
    }

}
