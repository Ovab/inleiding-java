package h11;

import java.awt.*;
import java.applet.*;


public class H11_4 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        double teller;
        int keer = 0;
        int uit;
        int y = 0;

        for (teller = 0; teller < 11; teller++) {
            uit = keer*3;
            keer += 1;
            y +=20;
            g.drawString(String.valueOf(uit), 50, y);
        }
    }
}