package H12;

import java.applet.Applet;
import java.awt.*;

public class Praktijk extends Applet {
    TextField [] txtfieldarray;


    public void init() {
        txtfieldarray = new TextField[20];
        for (int i = 0; i < txtfieldarray.length; i++) {
            txtfieldarray[i] = new TextField("", 10);
            add(txtfieldarray[i]);
        }
    }




    public void paint (Graphics g) {



    }
}