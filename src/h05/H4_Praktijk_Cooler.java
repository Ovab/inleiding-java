package h05;

import java.applet.Applet;
import java.awt.*;

public class H4_Praktijk_Cooler extends Applet {
    //De variabelen
    Color Opvul;
    Color Lijn;
    int breed;
    int hoog;

    @Override
    public void init() {
        setBackground(Color.white);
        Opvul = Color.MAGENTA;
        Lijn = Color.BLACK;
        breed = 140;
        hoog = 65;
        super.init();
    }

    @Override
    public void paint(Graphics g) {
        //Lijn
        g.drawLine(10, 10, 150, 10);
        g.drawString("Lijn.", 70, 25);

        //rechthoek
        g.drawRect(10, 50, breed, hoog);
        g.drawString("Rechthoek.", 50, 135);

        //rechthoek 2.0
        g.drawRoundRect(10, 160, breed, hoog, 30, 30);
        g.drawString("Afgeronde rechthoek.", 15, 245);

        //ovaal met blok
        g.setColor(Opvul);
        g.fillRect(205, 55, breed, hoog);
        g.setColor(Lijn);
        g.drawOval(205,55, breed, hoog);
        g.drawString("Gevulde rechthoek met ovaal.", 200, 135);

        //Gevulde ovaal
        g.setColor(Opvul);
        g.fillOval(205,160, breed, hoog);
        g.setColor(Lijn);
        g.drawString("Gevulde ovaal.", 205, 245);

        //taartpunt met ovaal erom
        g.drawOval(355, 55, breed, hoog);
        g.drawString("Taartpunt met ovaal eromheen.", 375, 135);
        g.setColor(Opvul);
        g.fillArc(355, 55, breed,hoog, 0, 45);

        //cirkel
        g.setColor(Lijn);
        g.drawArc(355, 140, breed, hoog, 0, 360);
        g.drawString("Cirkel.", 390, 270);

    }
}
