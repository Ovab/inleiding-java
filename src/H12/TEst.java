package H12;

import java.util.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TEst extends Applet {
    TextField [] field;
    String uit;
    TextField veld;
    Button k;

    public void init() {
        field = new TextField[5];
        for (int i = 0; i < field.length; i++) {
            field[i] = new TextField("");
            add (field[i]);
        }
        k = new Button("ok");

        k.addActionListener(new InputListener());
        add (k);
    }

    public void paint(Graphics g) {
    }
    //classes
    class InputListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String b = veld[5].getText();
            int veldin = Integer.parseInt(b);
            //bloep
            for (int  i = 0; i < 5; i++) {
                int[] namen = {veldin};
                Arrays.sort(namen);
            }

            repaint();
        }
    }
}
