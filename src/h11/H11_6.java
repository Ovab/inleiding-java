package h11;

import java.awt.*;
import java.applet.*;


public class H11_6 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        double teller;
        int y = 0;
        int x = 0;
        int b = 100;
        int a = 100;

        for(teller = 0; teller <5; teller++) {
            y += 10;
            x += 10;
            b -= 5;
            a -= 5;


            g.drawArc(b, a, x, y, 0, 360);
        }
    }
}