package h06;

import java.applet.Applet;
import java.awt.*;

public class Praktijk extends Applet {
    double cijfers;
    double answ;


    public void init() {
        cijfers = 5.9+6.3+6.9;
        cijfers = cijfers/3;
        cijfers = cijfers*10;
        cijfers = (int) cijfers;
        answ = cijfers/10;
    }

    public void paint(Graphics g) {
        g.drawString(String.valueOf(answ), 50, 50);
    }
}
