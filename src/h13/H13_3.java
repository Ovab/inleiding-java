package h13;

import com.sun.org.apache.xpath.internal.operations.Bool;
import h08.H8_3;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H13_3 extends Applet {
    Button steen, beton;
    Boolean yn;
    public void init() {
        setSize(700, 300);
        beton = new Button("beton");
        beton.addActionListener( new ButonListener() );
        add (beton);
        steen = new Button("steen");
        steen.addActionListener( new steenListener() );
        add (steen);
    }


    public void paint(Graphics g) {
        if (yn == true) {
            betonmuur(g, 10, 10, 13, 13, 40, 20);
        }
         else if(yn == false) {
            steenmuur(g, 10, 10, 200, 20, 20, 10);
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




    void tekensteen(Graphics g, int x1, int y1, int with, int height) {
        // teken een driehoek m.b.v. de meegegeven data (parameters)
        g.setColor(Color.red);
        g.fillRect(x1, y1, with, height);
        g.setColor(Color.GRAY);
        g.drawRect(x1, y1, with, height);
    }

    void steenmuur(Graphics g, int linkhoekX, int linkhoekY, int rij, int kolom, int breedsteen, int hoogsteen) {
        for (int i = 0; i < rij; i++) {
            for (int j = 0; j < kolom; j++) {
                tekensteen(g, linkhoekX+i*breedsteen, linkhoekY+j*hoogsteen, breedsteen, hoogsteen);
            }
        }
    }

    void beton(Graphics g, int x1, int y1, int breedte, int hoogte) {
        g.setColor(Color.GRAY);
        g.fillRect(x1, y1, breedte, hoogte);
        g.setColor(Color.darkGray);
        g.drawRect(x1, y1, breedte, hoogte);
    }
    void betonmuur(Graphics g, int linkhoekX, int linkhoekY, int rij, int kolom, int breedsteen, int hoogsteen) {
        for (int i = 0; i < rij; i++) {
            for (int j = 0; j < kolom; j++) {
                beton(g, linkhoekX+i*breedsteen, linkhoekY+j*hoogsteen, breedsteen, hoogsteen);
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