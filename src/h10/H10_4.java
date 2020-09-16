package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class H10_4 extends Applet {
    TextField tekstvak;
    TextField tekstvak2;
    String s, tekst , a;
    int maand, jaartal;
    public void init() {
        tekstvak = new TextField("", 20);
        tekstvak2 = new TextField("Jaartal hier", 20);
        tekstvak.addActionListener( new TekstvakListener() );
        tekstvak2.addActionListener( new TekstvakListener() );
        tekst = "...";
        add(tekstvak);
        add(tekstvak2);
    }

    public void paint(Graphics g) {
        g.drawString("Jou ingetikte maand is: "+ tekst +  " en heeft dagen", 50, 60 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            maand = Integer.parseInt(s);

            a = tekstvak2.getText();
            jaartal = Integer.parseInt(a);

            if (maand == 1)
                tekst = "Januari en heeft 31";
            else if (maand == 2)
            {
              if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0 )
                tekst = "Februari en heeft 29";
              else
                  tekst = "Februari en heeft 28";


            }
            else if (maand == 3 )
                tekst = "Maart en heeft 31";
            else if (maand == 4)
                tekst = "April en heeft 30";
            else if (maand == 5)
                tekst = "Mei en heeft 31";
            else if (maand == 6)
                tekst = "Juni en heeft 30";
            else if (maand == 7)
                tekst = "Juli en heeft 31";
            else if (maand == 8)
                tekst = "Augustus en heeft 31";
            else if (maand == 9)
                tekst = "September en heeft 30";
            else if (maand == 10)
                tekst = "October en heeft 31";
            else if (maand == 11)
                tekst = "November en heeft 30";
            else if (maand == 12)
                tekst = "December en heeft 31";
            else
                tekst = "typ een valide maand in";
            repaint();
        }
    }
}