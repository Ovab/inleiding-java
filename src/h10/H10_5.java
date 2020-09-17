package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H10_5 extends Applet {
    TextField nlVak;
    TextField engVAK;
    TextField wisVAK;
    TextField softwareVAK;

    Double nlin;
    Double engin;
    Double wisin;
    Double softwarein;
    Double gem;
    Double avr;

    String nltxt, engtxt, wistxt, softtxt, geslaagd;

    Button knop;

    public void init() {
        nlVak = new TextField("Nederlands", 10);
        engVAK = new TextField("Engels", 10);
        wisVAK = new TextField("Wiskunde", 10);
        softwareVAK = new TextField("Software dev", 10);
        knop = new Button("ok");

        nlVak.addActionListener(new NlListener());
        engVAK.addActionListener(new EngListener());
        wisVAK.addActionListener(new WisListener());
        softwareVAK.addActionListener(new SoftwareListener());

        knop.addActionListener(new NlListener());
        knop.addActionListener(new EngListener());
        knop.addActionListener(new WisListener());
        knop.addActionListener(new SoftwareListener());
        knop.addActionListener(new TotalListener());

        add(nlVak);
        add(engVAK);
        add(wisVAK);
        add(softwareVAK);
        add(knop);

    }

    public void paint(Graphics g) {
        g.drawString(nltxt + " voor nederlands", 50, 50);
        g.drawString(engtxt + " voor engels", 50, 70);
        g.drawString(wistxt + " voor wiskunde", 50, 90);
        g.drawString(softtxt + " voor software", 50, 110);
        g.drawString("Het gemmidelde is " + avr, 50, 130);
        g.drawString(geslaagd, 50, 150);
    }

    class NlListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String a = nlVak.getText();
            nlin = Double.parseDouble(a);
            avr = nlin / 1;
            if (nlin > 5.999) {
                nltxt = "U heeft een voldoende";
            } else {
                nltxt = "U heeft een onvoldoende";
            }
        }
    }


    class EngListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String b = engVAK.getText();
            engin = Double.parseDouble(b);
            avr = nlin + engin / 2;
            if (engin > 5.999) {
                engtxt = "U heeft een voldoende";
            } else {
                engtxt = "U heeft een onvoldoende";
            }
            repaint();
        }
    }


    class WisListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String c = wisVAK.getText();
            wisin = Double.parseDouble(c);
            avr = nlin + engin + wisin / 3;
            if (wisin > 5.999) {
                wistxt = "U heeft een voldoende";
            } else {
                wistxt = "U heeft een onvoldoende";
            }
            repaint();
        }
    }


    class SoftwareListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String d = softwareVAK.getText();
            softwarein = Double.parseDouble(d);
            if (softwarein > 5.999) {
                softtxt = "U heeft een voldoende";
            } else {
                softtxt = "U heeft een onvoldoende";
            }

            repaint();
        }
    }

    class TotalListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            gem = nlin + engin + wisin + softwarein;
            avr = gem/4;
            if (avr > 6) {
                geslaagd = "U bent geslaagd!";
            } else {
                geslaagd = "U bent gezakt :(";
            }

        }
    }
}
