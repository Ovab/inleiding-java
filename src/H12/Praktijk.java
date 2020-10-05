package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijk extends Applet {
    TextField[] txtfieldarray;
    Button confirm;
    int i;


    public void init() {
        setSize(250, 300);
        txtfieldarray = new TextField[18];
        confirm = new Button("ok");
        confirm.addActionListener(new InputListener());
        add(confirm);
            txtfieldarray[i] = new TextField("", 10);
            add(txtfieldarray[i]);
            repaint();
    }


    public void paint(Graphics g) {


    }

    class InputListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            i++;
            System.out.println("button pressed");
            if (i>=9) {
                i = 20;
                repaint();
            }
        }
    }
}