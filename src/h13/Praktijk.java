package h13;

import com.sun.org.apache.xpath.internal.operations.Bool;
import h08.H8_3;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijk extends Applet {
    Button steen, beton;
    Boolean yn;
    public void init() {
        setSize(700, 300);
        beton = new Button("boom");
        beton.addActionListener( new ButonListener() );
        add (beton);
        steen = new Button("bos");
        steen.addActionListener( new steenListener() );
        add (steen);
    }


    public void paint(Graphics g) {
        if (yn == true) {
            boom(g, 110, 170);
        }
        else if(yn == false) {
            bos(g, 10, 10, 5, 2);
        }
        //tekensteen(g, x1, y1, x2, y2);
    }

    class ButonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            yn=true;
            repaint();
        }
    }
    class steenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            yn=false;
            repaint();
        }
    }




    void boom(Graphics g, int x1, int y1) {
        // teken een driehoek m.b.v. de meegegeven data (parameters)
        g.setColor(Color.BLACK);
        g.fillRect(x1, y1, 50, 150);
        g.setColor(Color.green);
        g.fillArc(x1-10, y1-30, 100, 100, 0, 360);

    }

    void bos(Graphics g, int linkhoekX, int linkhoekY, int rij, int kolom) {
        for (int i = 0; i < rij; i++) {
            for (int j = 0; j < kolom; j++) {
                boom(g, linkhoekX+i*100, linkhoekY+j*150);
            }
        }
    }
}




/*/
    ____________        |        /
    |           \       |      /
    |            \      |    /
    |            /      |  /\
    |           /       |/   \
    |__________/        |     \
    |          \        |      \
    |           \       |       \
    |           /       |        \
    |          /        |         \
    |_________/   avo   |          \    nol
 */