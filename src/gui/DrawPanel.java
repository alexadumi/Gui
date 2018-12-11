package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public class DrawPanel extends JPanel {
    public void setxy (int x, int y)
    int x;
    int y;
}

}
    @Override
    protected void paintComponent(Graphics g) {
        int red = (int) (Math.random() * 256);
        int blue = (int) (Math.random() * 256);
        int green = (int) (Math.random() * 256);

        g.setColor(new Color(red,green,blue));
        g.fillOval(x, y,30,30 );

