package h04;

import java.applet.Applet;
import java.awt.*;

public class H4_Praktijk_NoVar extends Applet {

    @Override
    public void init() {
        setBackground(Color.white);
        super.init();
    }

    @Override
    public void paint(Graphics g) {
        //Lijn
        g.drawLine(10, 10, 150, 10);
        g.drawString("Lijn.", 70, 25);

        //rechthoek
        g.drawRect(10, 50, 140, 65);
        g.drawString("Rechthoek.", 50, 135);

        //rechthoek 2.0
        g.drawRoundRect(10, 160, 140,65, 30, 30);
        g.drawString("Afgeronde rechthoek.", 15, 245);

        //ovaal met blok
        g.setColor(Color.magenta);
        g.fillRect(200, 50, 140, 65);
        g.setColor(Color.black);
        g.drawOval(205,55,130,55);
        g.drawString("Gevulde rechthoek met ovaal.", 200, 135);

        //Gevulde ovaal
        g.setColor(Color.magenta);
        g.fillOval(205,160, 130, 55);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal.", 205, 245);

        //taartpunt met ovaal erom
        g.drawOval(355, 55, 130, 65);
        g.drawString("Taartpunt met ovaal eromheen.", 375, 135);
        g.setColor(Color.magenta);
        g.fillArc(355, 55, 130, 65, 0, 45);

        //cirkel
        g.setColor(Color.black);
        g.drawArc(355, 140, 100, 100, 0, 360);
        g.drawString("Cirkel.", 390, 270);

    }
}