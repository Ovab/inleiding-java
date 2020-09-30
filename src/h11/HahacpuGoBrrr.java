package h11;

import java.awt.*;
import java.applet.*;


public class HahacpuGoBrrr extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        double teller;
        int x = 0;

        for(teller = 0; teller < 1000000000 ; teller++) {
            x += 20;
            g.drawLine(x , 10, x, 300 );
            g.drawLine(x+1 , 10, x, 300 );
            g.drawLine(x+2 , 10, x, 300 );
            g.drawLine(x+3 , 10, x, 300 );
            g.drawLine(x+4 , 10, x, 300 );
            g.drawLine(x+5 , 10, x, 300 );
            g.drawLine(x+6 , 10, x, 300 );
            repaint();
        }
    }
}