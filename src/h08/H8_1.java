package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H8_1 extends Applet {
    TextField tekstvak;
    Button knop;
    Button boop;

    public void init() {
        tekstvak = new TextField("", 30);
        knop = new Button("Ok");
        boop = new Button("reset");
        knop.addActionListener( new KnopListener() );
        boop.addActionListener( new BoopListener() );
        add(tekstvak);
        add(knop);
        add(boop);
    }

    public void paint(Graphics g) {
        g.drawString("It's not like I want you to type here BAKA!", 50, 60 );
    }

    class KnopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            tekstvak.setText("HAHA GEt SCHERKT");
            repaint();
        }
    }
    class BoopListener implements ActionListener    {
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");
            repaint();
        }
    }
}