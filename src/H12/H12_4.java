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
    int out;
    boolean jesno;



    public void init() {

        searching = new int[3];
        txtfield = new TextField("", 10);
        add(txtfield);

        okeknop = new Button("Confrim");
        add(okeknop);
        okeknop.addActionListener(new InputListener());
    }


    public void paint(Graphics g) {
        if (jesno == true) {
            g.drawString("Number found: index "+ out, 50 ,120);
        }
        if (jesno == false) {
            g.drawString("ERROR: FUNNY NUMBER NOT FOUND", 50 ,120);
        }
    }

    //classes
    class InputListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            repaint();
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
                out = i;
                System.out.println("i is at "+out);

                System.out.println(searching[i]);
                if (gezocht == searching [i]) {
                    jesno = true;
                    repaint();
                    break;
                }

                else {
                    jesno = false;
                    repaint();
                }
            }
        }
    }
}

