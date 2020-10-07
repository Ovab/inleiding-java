package h13;

import java.applet.Applet;
import java.awt.*;

public class H13_1 extends Applet {
    int x1 = 10;
    int x2 = 20;
    int x3 = 30;
    int y1 = 15;
    int y2 = 25;
    int y3 = 35;



    public void init() {
    }




    public void paint(Graphics g) {
        g.drawPolygon(tekenDriehoek(50,10););
    }



    void tekenDriehoek( Graphics g,int x ) {
        // teken een driehoek m.b.v. de meegegeven data (parameters)
        int x[] = {100, 70, 130};
        int y[] = {50, 100, 100};
        g.drawPolygon(x,y , 3);
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