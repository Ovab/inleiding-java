package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H12_4 extends Applet {
    int[] searching = {69, 69420, 420};
    int gezocht;
    TextField txtfield;
    Button okeknop;
    String outbackup;
    int out;
    boolean jesno = false;


    public void init() {
        searching = new int[2];
        txtfield = new TextField("", 10);
        add(txtfield);

        okeknop = new Button("BLEEEP");
        add(okeknop);
        okeknop.addActionListener(new InputListener());
    }


    public void paint(Graphics g) {
        if (jesno = true) {
            g.drawString("de waarde is gevonden " + out, 50 ,100);
        }
        if (jesno = false) {
            g.drawString("ERROR: FUNNY NUMBER NOT FOUND", 50 ,120);
        }
    }

    //classes
    class InputListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String b = txtfield.getText();
            gezocht = Integer.parseInt(b);

            for (int i = 0; i < searching.length; i++) {
                if (gezocht == searching [i]) {
                    jesno = true;
                    break;
                }
                else {
                    jesno = false;
                }
            }
        }
    }
}

