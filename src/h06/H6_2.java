package h06;

import java.awt.*;
import java.applet.*;

    public class H6_2 extends Applet {
        int uuruit;
        int daguit;
        int jaaruit;
        int schrikkeljaaruit;


        public void init() {
            uuruit = 60*60*60;
            daguit = uuruit*24;
            jaaruit = daguit*365;
            schrikkeljaaruit = daguit*366;



        }

        public void paint(Graphics g) {
        g.drawString("in een uur zitten " +uuruit + " seconden", 50, 50);
        g.drawString("in een dag zitten " + daguit + " seconden", 50, 70);
        g.drawString("in een normaal jaar zitten " +jaaruit + " seconden", 50, 90);
        g.drawString("in een schrikkeljaar zitten " + schrikkeljaaruit + " seconden", 50, 110);
        }
    }
