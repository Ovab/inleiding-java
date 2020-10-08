package h13;

import java.applet.Applet;
import java.awt.*;

public class H13_2 extends Applet {
    int x1 = 100;
    int y1 = 100;
    int x2 = 100;
    int y2 = 50;

    public void init() {


    }


    public void paint(Graphics g) {
        muur(g, 50, 10,69, 69, 20, 10);
        //tekensteen(g, x1, y1, x2, y2);
    }

    void tekensteen(Graphics g, int x1, int y1, int with, int height) {
        // teken een driehoek m.b.v. de meegegeven data (parameters)
        g.setColor(Color.red);
        g.fillRect(x1, y1, with, height);
        g.setColor(Color.GRAY);
        g.drawRect(x1, y1, with, height);
    }

    void muur(Graphics g, int linkhoekX, int linkhoekY, int rij, int kolom, int breedsteen, int hoogsteen) {
        for (int i = 0; i < rij; i++) {
            for (int j = 0; j < kolom; j++) {
                tekensteen(g, linkhoekX+i*breedsteen, linkhoekY+j*hoogsteen, breedsteen, hoogsteen);
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