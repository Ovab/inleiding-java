package h01;

import java.util.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H12_3 extends Applet {
    String uit;
    TextField veld, field, veld2, field2, einveld;
    Button k;
    int[] namen;

    public void init() {

        veld = new TextField(""+namen, 10);
        veld2 = new TextField(""+namen, 10);
        einveld = new TextField(""+namen, 10);
        field = new TextField(""+namen, 10);
        field2 = new TextField(""+namen, 10);
        k = new Button("ok");


        k.addActionListener(new InputListener());

        add (veld);
        add (veld2);
        add (einveld);
        add (field);
        add (field2);
        add (k);
        //////
    }

    public void paint(Graphics g) {
    }
//classes
    class InputListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String b = veld.getText();
            int veldin = Integer.parseInt(b);

            String a = veld2.getText();
            int veld2in = Integer.parseInt(a);

            String c = einveld.getText();
            int einveldin = Integer.parseInt(c);

            String d = field.getText();
            int fieldin = Integer.parseInt(d);

            String f = field2.getText();
            int field2in = Integer.parseInt(f);
            //bloep
            for (int  i = 0; i < 5; i++) {
                int[] namen = { veldin, veld2in, einveldin, fieldin, field2in};
                Arrays.sort(namen);
            }

            repaint();
        }
    }
}
