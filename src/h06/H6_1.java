package h06;

import java.awt.*;
import java.applet.*;


public class H6_1 extends Applet {
    int uitkomst;


    public void init() {
        uitkomst = 113 / 4;
    }

    public void paint(Graphics g) {
        g.drawString("Jan krijgt " + uitkomst + " euro", 20, 20);
        g.drawString("Ali krijgt " + uitkomst + " euro", 20, 40);
        g.drawString("Jeannette krijgt " + uitkomst + " euro", 20, 60);
        g.drawString("Ik krijg " + uitkomst + " euro", 20, 80);


    }
}