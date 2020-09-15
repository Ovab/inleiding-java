package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H10_1 extends Applet {
    TextField txt;
    String tekst;
    String tekst2;
    double uit;
    double in;

    public void init() {
        txt = new TextField("", 30);
        txt.addActionListener(new TekstvakListener());
        add(txt);
    }


    public void paint(Graphics g) {
        g.drawString(tekst + " is het hoogste getal", 50, 50);
        g.drawString(tekst2 +" is het laagste getal in getypt", 50, 70);

    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = txt.getText();
            in = Double.parseDouble(s);
            if (in>uit) {
                uit = in;
                tekst = String.valueOf(in);
            }
            else {
                tekst2 = String.valueOf(in);
            }
            repaint();

        }
    }
}
