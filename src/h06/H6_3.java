package h06;

import java.applet.Applet;
import java.awt.*;

public class H6_3 extends Applet {
    int antw;


    public void init() {
        antw = 2147483647 + 2147483647;

    }



    public void paint(Graphics g) {
        g.drawString("" + antw, 50, 50);

    }
}
