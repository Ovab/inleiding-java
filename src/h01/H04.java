package h01;

import java.awt.*;
import java.applet.*;

public class H04 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.pink);
        g.setColor(Color.yellow);
        //dak
        g.drawLine(50, 120, 100, 10);
        g.drawLine(150, 120, 100, 10);
        //vlagstok
        g.drawLine(150, 10, 150, 200);
        //vlag
        g.setColor(Color.red);
        g.fillRect(150, 10, 30, 10);
        g.setColor(Color.white);
        g.fillRect(150, 15, 30, 10);
        g.setColor(Color.BLUE);
        g.fillRect(150, 20, 30, 5);

        //Huis etc.
        g.setColor(Color.green);
        g.drawRect(75, 180, 10, 20 );
        g.drawRect(80, 150, 20, 20 );
        g.setColor(Color.darkGray);
        g.drawRect(50, 100, 100, 100);
    }
}