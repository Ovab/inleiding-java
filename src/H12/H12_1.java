package H12;

import java.awt.*;
import java.applet.*;

public class H12_1 extends Applet {
    double[] salaris;
    double[] kopie;
    double totaal;
    int teller;

    public void init() {
        salaris = new double[10];
        kopie = new double[10]; 

        for (teller = 0; teller < salaris.length; teller++) {
            salaris[teller] = 100 * teller + 100;
            kopie = salaris;
            totaal = kopie[teller] / salaris.length;
        }

    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < salaris.length; teller++) {
            g.drawString("" + salaris[teller], 50, 20 * teller + 20);
        }
        g.drawString("" + totaal, 100, 20 * teller + 20);
    }
}