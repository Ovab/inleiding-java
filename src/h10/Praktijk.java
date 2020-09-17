package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijk extends Applet {
    TextField txt;
    Button knop;
    String result;
    int avr;

    public void init() {
        txt = new TextField("", 30);
        knop = new Button("ok");
        txt.addActionListener(new TekstvakListener());
        knop.addActionListener(new TekstvakListener());
        add (knop);
        add(txt);
    }


    public void paint(Graphics g) {
        g.drawString(result, 50 ,90);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = txt.getText();
            avr = Integer.parseInt(s);
            if (avr == 1) {
                result = "slecht"; }
            else if (avr == 2) {
                result = "slecht"; }
            else if (avr == 3)  {
                result = "slecht";  }
            else if (avr == 4)  {
                result = "onvoldoende";}
            else if (avr == 5){
                result = "matig";   }
            else if (avr == 6)  {
                result = "voldoende"; }
            else if (avr == 7)  {
                result = "voldoende";   }
            else if (avr == 8)  {
                result = "goed";    }
            else if (avr == 9)  {
                result = "goed";    }
            else if (avr == 10) {
                result = "goed";    }
            else result = "voer een heel getal in van 1 tot 10";
            repaint();
        }
    }
}
