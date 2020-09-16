package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class H10_3 extends Applet {
    TextField txt;
    String tekst, s;
    int maand;

    public void init() {
        txt = new TextField("", 30);
        txt.addActionListener(new TekstvakListener() );
        add(txt);
    }


    public void paint(Graphics g) {
    g.drawString("jou in getikte maand is " + tekst + " dagen", 50, 50);

    }

    //classes
    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = txt.getText();
            maand = Integer.parseInt(s);
            switch (maand) {
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
        }
    }
}
//1, 3, 5, 7, 8, 10, 12