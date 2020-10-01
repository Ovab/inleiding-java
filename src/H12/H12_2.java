package H12;

import java.applet.Applet;
import java.awt.*;

public class H12_2 extends Applet {
Button [] knop;
int teller;


    public void init() {
    knop = new Button[25];
        for (int i = 0; i < knop.length; i++) {
            knop[i] = new Button(""+ i);
            add (knop[i]);
        }
    }



    public void paint(Graphics g) {



    }
}

