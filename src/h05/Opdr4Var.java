package h05;

import java.awt.*;
import java.applet.*;

public class Opdr4Var extends Applet {

    //de Gewichten
    int gewichtValerie = 40;
    int gewichtHans = 80;
    int gewichtJeroen = 100;
    int yasX = 150;

    public void init() {
    }

    public void paint(Graphics g) {

        setBackground(Color.WHITE);
        //opdracht 4.4 maar dan met variabelen

        //lijntjes
        g.drawLine(200, yasX,300,yasX);
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
        g.fillRect(210,yasX-gewichtValerie, 10, gewichtValerie);
        //Hans
        g.setColor(Color.GREEN);
        g.fillRect(245,yasX-gewichtHans, 10, gewichtHans);
        //Jeroen
        g.setColor(Color.BLUE);
        g.fillRect(280,yasX-gewichtJeroen, 10, gewichtJeroen);
        //namen
        g.setColor(Color.BLACK);
        g.drawString("Valerie", 200, 165);
        g.drawString("Hans", 237, 175);
        g.drawString("Jeroen", 270, 165);


    }
}