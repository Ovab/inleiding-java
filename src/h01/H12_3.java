package h01;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H12_3 extends Applet {
    TextField veld, field, veld2, field2, einveld;
    Button k;

    public void init() {
        veld = new TextField("", 10);
        veld2 = new TextField("", 10);
        einveld = new TextField("", 10);
        field = new TextField("", 10);
        field2 = new TextField("", 10);
        k = new Button("ok");


        k.addActionListener(new InputListener());

        add (veld);
        add (veld2);
        add (einveld);
        add (field);
        add (field2);
        add (k);
    }

    public void paint(Graphics g) {
    }

    class InputListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String b = veld.getText();
            Double veldin = Double.parseDouble(b);
            if (veldin > 10);
            {
            }
            repaint();
        }
    }


}