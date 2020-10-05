package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pratijk_2_0 extends Applet {
    TextField txtfield, txtfield2;
    Button confirm;
    String nummer, naam;


    public void init() {
        setSize(250, 300);
        txtfield = new TextField("Naam");
        txtfield2 = new TextField("nummer");
        confirm = new Button("ok");
        confirm.addActionListener(new InputListener());
        add (txtfield);
        add (txtfield2);
        add(confirm);

    }


    public void paint(Graphics g) {
        g.drawString(naam, 100, 100);
        g.drawString(nummer, 100, 120);

    }

    class InputListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("button pressed");
            nummer = txtfield2.getText();
            naam = txtfield.getText();
            txtfield2.setText("");
            txtfield.setText("");
            repaint();

        }
    }
}