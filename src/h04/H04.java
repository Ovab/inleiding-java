package h04;

import java.awt.*;
import java.applet.*;

public class H04 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.BLUE);
        g.setColor(Color.yellow);
        //dak
        g.drawLine(50, 120, 100, 10);
        g.drawLine(150, 120, 100, 10);
        //vlagstok
        g.drawLine(150, 10, 150, 200);
        //vlag
        g.setColor(Color.red);
        g.fillRect(150, 10, 30, 10);
        g.setColor(Color.white);
        g.fillRect(150, 15, 30, 10);
        g.setColor(Color.BLUE);
        g.fillRect(150, 20, 30, 5);

        //Huis etc.
        g.setColor(Color.green);
        g.drawRect(75, 180, 10, 20 );
        g.drawRect(80, 150, 20, 20 );
        g.setColor(Color.white);
        g.drawRect(50, 100, 100, 100);
        //opdracht 4.4

        //lijntjes
        g.drawLine(200, 150,300,150);
        g.drawLine(200, 130,300,130);
        g.drawLine(200, 110,300,110);
        g.drawLine(200, 90,300,90);
        g.drawLine(200, 70,300,70);
        g.drawLine(200, 50,300,50);
        g.drawLine(200, 30,300,30);
        g.drawLine(200, 10,300,10);
        //Verdeling getallen
        g.drawString("0kg", 310, 155);
        g.drawString("20kg", 310, 135);
        g.drawString("40kg", 310, 115);
        g.drawString("60kg", 310, 95);
        g.drawString("80kg", 310, 75);
        g.drawString("100kg", 310, 55);
        g.drawString("120kg", 310, 35);
        g.drawString("140kg", 310, 15);
        //staven

        //valerie
        g.setColor(Color.red);
        g.fillRect(210,110, 10, 40);
        //Hans
        g.setColor(Color.GREEN);
        g.fillRect(245,70, 10, 80);
        //Jeroen
        g.setColor(Color.pink);
        g.fillRect(280,50, 10, 100);
        //namen
        g.setColor(Color.white);
        g.drawString("Valerie", 200, 165);
        g.drawString("Hans", 237, 175);
        g.drawString("Jeroen", 270, 165);

        //opdracht 4.5
        g.setColor(Color.yellow);
        g.fillArc(180, 230, 100, 50, 0, 90);

        //opdracht 4.6
        g.setColor(Color.BLACK);
        g.fillRect(130, 243, 15, 60);

        g.setColor(Color.RED);
        g.fillArc(132, 250, 10, 10, 0, 360);
        g.setColor(Color.YELLOW);
        g.fillArc(132, 270, 10, 10, 0, 360);
        g.setColor(Color.GREEN);
        g.fillArc(132, 290, 10, 10, 0, 360);

        //opdracht 4.7
        g.setColor(Color.black);
        g.fillRoundRect(130, 190, 40, 40, 10, 90);
        g.setColor(Color.white);
        g.fillArc(140, 198, 11, 11,  0, 360);
        g.fillArc(155, 198, 11, 11,  0, 360);
        g.fillArc(140, 212, 11, 11,  0, 360);
        g.fillArc(155, 212, 11, 11,  0, 360);

    }
}