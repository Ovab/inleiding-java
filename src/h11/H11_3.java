package h11;

import java.awt.*;
import java.applet.*;


public class H11_3 extends Applet {
    int teller;
    int a;
    int b;
    int c;
    int y;

    public void init() {
        a = 0;
        b = 1;
    }

    public void paint(Graphics g) {
        for (teller = 0; teller < 11; teller++) {
            g.drawString(" " + c, 50, y);
            a = b;
            b=c;
            c = a + b;
            y += 20;
        }
    }
}