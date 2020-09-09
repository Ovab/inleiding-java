package h01;

import java.awt.*;
import java.applet.*;

public class Opdr4Var extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        //de Gewichten
        int GewichtValerie = 40;
        int GewichtHans = 80;
        int GewichtJeroen = 100;

        setBackground(Color.WHITE);
        //opdracht 4.4 maar dan met variabelen

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
        g.fillRect(210,110, 10, GewichtValerie);
        //Hans
        g.setColor(Color.GREEN);
        g.fillRect(245,70, 10, GewichtHans);
        //Jeroen
        g.setColor(Color.BLUE);
        g.fillRect(280,50, 10, GewichtJeroen);
        //namen
        g.setColor(Color.BLACK);
        g.drawString("Valerie", 200, 165);
        g.drawString("Hans", 237, 175);
        g.drawString("Jeroen", 270, 165);


    }
}