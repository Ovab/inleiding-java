package h14;

import java.applet.Applet;
import java.awt.*;

public class H14_1 extends Applet {
    int randomcolorint, randomtypeint, randomint;
    String [] color;
    String [] type;
    public void init() {
        //declaring values of the array
        color = new String[3];
        type = new String[4];
        color[0] = "Black";
        color[1] = "Red";
        String[] type = {"♣", "♠", "♥", "♦"};
        String [] specials = {"Jack", "Queen", "King", "Ace"};
        //making random value for the colors
            randomcolorint = (int) (Math.random() * 2 + 0);
            System.out.println(color[randomcolorint]);
        //making random types
        randomtypeint = (int) (Math.random() * 4 + 0);
        System.out.println(type[randomtypeint]);
        //making random types
        randomint = (int) (Math.random() * 6 + 1);
        System.out.println(randomint);

    }



    public void paint(Graphics g) {
        g.drawString(color[randomcolorint]+" "+type[randomtypeint]+ " "+randomint, 50, 50);


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