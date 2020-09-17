package h11;

import java.awt.*;
import java.applet.*;


public class oprd11_1 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        double teller;
        int y = 0;
        int x = 0;

        for(teller = 0; teller <10; teller++) {
            y += 20;
            x += 20;
            g.drawLine(y , 10, x, 300 );
        }
    }
}