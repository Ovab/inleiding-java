package h02;

import java.applet.Applet;
import java.awt.*;

public class Reee extends Applet {

    @Override
    public void init() {
        setBackground(Color.BLUE);
        super.init();
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Bavo", 50, 50);
        g.setColor(Color.red);
        g.drawString("Knol", 80, 50);
    }
}
