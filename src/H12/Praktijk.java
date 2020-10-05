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
        txtfieldarray = new TextField [18];
        confirm = new Button("ok");
        confirm.addActionListener(new InputListener());
        add(confirm);

    }


    public void paint(Graphics g) {


    }

    class InputListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TextField b = new TextField("1230", 10);
            add(b);
            System.out.println(b);
            repaint();
            /*
            System.out.println("button pressed");
            if (i>=9) {
                i = 20;
                System.out.println(i);
            }
            else {
                i++;
                i++;
                System.out.println(i);
            }

            for (int j = 0; j < i; j++) {
                txtfieldarray[j] = new TextField("", 10);
                System.out.println(j);
                add(txtfieldarray[j]);
                //repaint();
            }

            repaint();
            */

        }
    }
}