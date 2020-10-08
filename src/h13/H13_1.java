package h13;

import java.applet.Applet;
import java.awt.*;

public class H13_1 extends Applet {
    int x1 = 100;
    int x2 = 100;
    int x3 = 200;
    int y1 = 100;
    int y2 = 200;
    int y3 = 100;


    public void init() {
    }


    public void paint(Graphics g) {
        tekenDriehoek(g, x1, y1, x2, y2, x3, y3);
        tekenDriehoek(g, 50, 50, 150, 250, 350, 250);
        tekenDriehoek(g,100, 100, 150, 200, 50, 200);
    }



    void tekenDriehoek( Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {
        // teken een driehoek m.b.v. de meegegeven data (parameters)
        g.drawLine(x1, y1,x2,y2);
        g.drawLine(x1, y1, x3, y3);
        g.drawLine(x2, y2, x3, y3);
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