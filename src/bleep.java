import java.applet.Applet;
import java.awt.*;
import java.sql.SQLOutput;

public class bleep extends Applet {
    int acht = 8;
    int kwadraat;
    int som;
    int i;

    public void init() {
        for ( i = 1; i <= acht; i++) {
            if (i % 2==0) {
                if (i% 6 == 0) {
                    kwadraat=i*i;
                    som=som+i*i;
                    System.out.println(kwadraat);
                }
                else {
                    som=som+i;
                    System.out.println(i);
                }
            }

        }
        System.out.println(som);


    }




    public void paint(Graphics g) {



    }
}


