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
    int uit;
    int y = 0;
    double teller;

    public void init() {
        inputvak = new TextField("", 20);
        ok = new Button("ok");
        ok.addActionListener(new TekstvakListener());
        inputvak.addActionListener(new TekstvakListener());
        add (inputvak);
        add (ok);

    }

    public void paint(Graphics g) {
        for (teller = 0; teller < 10; teller++) {
            getal2 += 1;
            y += 20;
            g.drawString(getal1 + "x" + getal2 + "=" + uit, 50, y);
        }
    }

    //classes
    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = inputvak.getText();
            getal1 = Integer.parseInt(s);

            for (teller = 0; teller < 11; teller++) {
                uit = getal1 * getal2;
                repaint();
            }
        }
    }
}