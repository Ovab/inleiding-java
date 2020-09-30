package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H12_4 extends Applet {
    int[] searching;
    int gezocht;
    TextField txtfield;
    Button okeknop;
    String outbackup;
    int out;
    boolean jesno = false;



    public void init() {

        searching = new int[3];
        txtfield = new TextField("", 10);
        add(txtfield);

        okeknop = new Button("BLEEEP");
        add(okeknop);
        okeknop.addActionListener(new InputListener());
    }


    public void paint(Graphics g) {
        if (jesno == true) {
            g.drawString("de waarde is gevonden " + out, 50 ,100);
        }
        if (jesno == false) {
            g.drawString("ERROR: FUNNY NUMBER NOT FOUND", 50 ,120);
        }
    }

    //classes
    class InputListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            searching [0] = 69;
            searching [1] = 69420;
            searching [2] = 420;

            //getting txt
            String b = txtfield.getText();
            gezocht = Integer.parseInt(b);
            //debug stuff
            System.out.println("input is "+ gezocht);
            //is the number funny
            for (int i = 0; i < searching.length; i++) {
                System.out.println("i is bij "+out);

                System.out.println(searching[i]);
                if (gezocht == searching [i]) {
                    out = i;
                    jesno = true;
                }
                else {
                    jesno = false;
                }
                repaint();
            }
        }
    }
}

