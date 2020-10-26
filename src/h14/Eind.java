package h14;

import java.applet.Applet;
import java.awt.*;

public class Eind extends Applet {
    int limit= 50;
    int y = 50;

    public void init() {


    }




    public void paint(Graphics g) {
        for (int i = 0; i < limit; i+=5) {
            y += 20;
            if (i == limit/2) {
                g.drawString("halverwege", 50 , y);
                y= y + 20;
            }
            g.drawString("bavo", 50, y);
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