package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class H10_3 extends Applet {
    TextField tekstvak;
    String s, tekst;
    int maand;

    public void init() {
        tekstvak = new TextField("", 20);
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "...";
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString("Jou ingetikte maand is: "+ tekst +  " en heeft dagen", 50, 60 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            maand = Integer.parseInt(s);
            switch(maand) {
                case 1:
                    tekst = "Januari en heeft 31";
                    break;
                case 2:
                    tekst = "Februari en heeft 28";
                    break;
                case 3:
                    tekst = "Maart en heeft 31";
                    break;
                case 4:
                    tekst = "April en heeft 30";
                    break;
                case 5:
                    tekst = "Mei en heeft 31";
                    break;
                case 6:
                    tekst = "Juni en heeft 30";
                    break;
                case 7:
                    tekst = "Juli en heeft 31";
                    break;
                case 8:
                    tekst = "Augustus en heeft 31";
                    break;
                case 9:
                    tekst = "September en heeft 30";
                    break;
                case 10:
                    tekst = "October en heeft 31";
                    break;
                case 11:
                    tekst = "November en heeft 30";
                    break;
                case 12:
                    tekst = "December en heeft 31";
                    break;
                default:
                    tekst = "Typ een goed nummer aub";
                    break;
            }
            repaint();
        }
    }
}