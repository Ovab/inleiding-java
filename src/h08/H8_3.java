package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H8_3 extends Applet {
    TextField tekstvak;
    Button ok;
    Label label;
    double getal;

    public void init() {
        tekstvak = new TextField("", 20);
        ok = new Button ("ok");
        ok.addActionListener( new TekstvakListener() );
        label = new Label("Type een getal");
        tekstvak.addActionListener( new TekstvakListener() );
        add (ok);
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString("De prijs incl. btw is " + getal + " Euro",50, 60 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble( s );
            getal = getal*1.21;
            repaint();
        }
    }
}