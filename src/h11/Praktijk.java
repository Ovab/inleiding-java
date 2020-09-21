package h11;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Praktijk extends Applet {
    TextField inputvak;
    Button ok;
    int getal1;
    int getal2;
    int uit, uit1, uit2, uit3, uit4, uit5, uit6, uit7, uit8, uit9;
    int y = 0;
    double teller;

    public void init() {
        inputvak = new TextField("", 20);
        ok = new Button("ok");
        ok.addActionListener(new TekstvakListener());
        inputvak.addActionListener(new TekstvakListener());
        add(inputvak);
        add(ok);

    }

    public void paint(Graphics g) {
        for (teller = 0; teller < 10; teller++) {
            getal2 += 1;
            y += 20;
            g.drawString(getal1 + "x1=" + uit, 50, 10);
            g.drawString(getal1 + "x2=" + uit, 50, 30);
            g.drawString(getal1 + "x3=" + uit, 50, 50);
            g.drawString(getal1 + "x4=" + uit, 50, 70);
            g.drawString(getal1 + "x5=" + uit, 50, 90);
            g.drawString(getal1 + "x6=" + uit, 50, 110);
            g.drawString(getal1 + "x7=" + uit, 50, 130);
            g.drawString(getal1 + "x8=" + uit, 50, 150);
            g.drawString(getal1 + "x9=" + uit, 50, 170);
            g.drawString(getal1 + "x10=" + uit, 50, 190);
        }
    }

    //classes
    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = inputvak.getText();
            getal1 = Integer.parseInt(s);
            y = 0;

            for (teller = 0; teller < 10; teller++) {
                uit = getal1 * 1;
                uit1 = getal1 * 2;
                uit2 = getal1 * 3;
                uit3 = getal1 * 4;
                uit4 = getal1 * 5;
                uit5 = getal1 * 6;
                uit6 = getal1 * 7;
                uit7 = getal1 * 8;
                uit8 = getal1 * 9;
                uit9 = getal1 * 10;
                repaint();
            }
        }
    }
}