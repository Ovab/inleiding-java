package H12;

import java.util.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TEst extends Applet {
    int [] getallen;
    TextField [] fieldarray;
    Button okknop;
    int flreal;

    public void init() {
        fieldarray = new TextField[5];
        for (int i = 0; i < fieldarray.length; i++) {
            fieldarray[i] = new TextField("");
            add (fieldarray[i]);
        }
        flreal = fieldarray.length - 1;
        okknop = new Button("ok");
        veldin = 5;
        okknop.addActionListener(new InputListener());
        add (okknop);
    }

    public void paint(Graphics g) {

    }

    //classes
    class InputListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //bloep
            for (int  i = 0; i < fieldarray.length; i++) {
                String b = fieldarray[i].getText();
                int veldin = Integer.parseInt(b);
                System.out.println(getallen[i]);
                getallen[i]=veldin;
                fieldarray[flreal].setText(String.valueOf(getallen));
            }
            Arrays.sort(getallen);

            repaint();
        }
    }
}
