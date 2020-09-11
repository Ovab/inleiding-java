package h06;

import java.applet.Applet;
import java.awt.*;

public class H6_3 extends Applet {
    int antw;


    public void init() {
        antw = 1 + 1;

    }



    public void paint(Graphics g) {
        antw--;
        antw--;
        antw--;
        g.drawString("dit is niet maths maar als het " + antw + " zegt is het goed", 50, 50);

    }
}
