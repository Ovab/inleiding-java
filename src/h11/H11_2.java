package h11;

import java.awt.*;
import java.applet.*;


public class H11_2 extends Applet {
    double teller;
    int y = 9;
    int x = 0;

    public void init() {


    }

    public void paint(Graphics g) {
        for(teller = 0; teller <11; teller++) {
            y += 1;
            x += 20;
            g.drawString("" +y, 50, x);
        }
    }
}