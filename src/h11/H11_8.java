package h11;

import java.awt.*;
import java.applet.*;


public class H11_8 extends Applet {

    public void init() {
        setSize(500,500);
    }

    public void paint(Graphics g) {
        double teller;
        int y = 0;
        int x = 0;
        int b = 250;
        int a = 250;

        for(teller = 0; teller <100; teller++) {
            y += 10;
            x += 10;
            b -= 10;
            a -= 10;


            g.drawArc(100, 100, x, y, 0, 360);
        }
    }
}