package h11;

import java.awt.*;
import java.applet.*;


public class H11_5 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        double teller;
        int y = 10;
        int x = 0;

        for(teller = 0; teller <5; teller++) {
            y += 30;
            x += 30;
            g.drawRect(x, y, 30, 30);
        }
    }
}