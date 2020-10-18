package h14;

import java.applet.Applet;
import java.awt.*;

public class H14_2 extends Applet {
    int x[]={100,70,130};
    int y[]={50,100,100};

    public void init() {


    }




    public void paint(Graphics g) {
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