package h04;

import java.applet.Applet;
import java.awt.*;

public class Tekening extends Applet {

    @Override
    public void init() {
        setSize(1000,1500);
        setBackground(Color.lightGray);
        super.init();
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillArc(80, 60,500, 300, 0, 180);
        //gezicht
        g.setColor(Color.pink);
        g.fillRect(130, 200, 400, 500);
        g.fillArc(30, 200, 200, 500, 180, 360);
        g.fillArc(420, 200, 200, 500, 180, 360);
        g.fillArc(60, 470, 500, 300, 180, 360);
        //ogen
        g.setColor(Color.black);
        g.drawArc(120, 225, 150, 100, 180, 180 );
        g.drawArc(400, 225, 150, 100, 180, 180 );
        g.fillArc(180,285,15, 15, 0, 360);
        g.fillArc(460,285,15, 15, 0, 360);
        g.drawLine(120,275,270,275);
        g.drawLine(400,275,550,275);
        //neus
        g.drawLine(275,375,350,300);
        //mond
        g.fillArc(275, 500, 75, 75, 0, 180);


        //body
        g.setColor(Color.pink);
        g.fillRect(200,700, 200,300);
        g.setColor(Color.blue);
        g.fillRect(250, 900, 100, 200);
        g.setColor(Color.black);
        g.fillRoundRect(10, 900, 600, 600, 30, 30);
        g.setColor(Color.pink);
        g.fillRect(250, 900, 100, 125);
        g.setColor(Color.yellow);
        g.fillArc(255, 1050, 75, 75, 0, 360);
    }
}
