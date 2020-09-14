package h08;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;


public class H8_2 extends Applet {
    //belangrijke shit I guess, het is maar initializen
    Button man;
    Button vrouw;
    Button manlln;
    Button vrouwlln;
    Button totaal;

    TextField manT;
    TextField vrouwT;
    TextField manllnT;
    TextField vrouwllnT;
    TextField totaalT;

    int methM;
    int methV;
    int methML;
    int methVL;
    int totaalM;


    public void init() {
        manT = new TextField("", 30);
        vrouwT = new TextField("", 30);
        manllnT = new TextField("", 30);
        vrouwllnT = new TextField("", 30);
        totaalT = new TextField("", 20);

        man = new Button("man");
        vrouw = new Button("vrouw");
        manlln = new Button("Joch");
        vrouwlln = new Button("Vrouwlijke leerling");
        totaal = new Button("totaal");

        man.addActionListener( new H8_2.KnopMListener() );
        vrouw.addActionListener( new H8_2.KnopVListener() );
        manlln.addActionListener( new H8_2.KnopMLListener() );
        vrouwlln.addActionListener( new H8_2.KnopVLListener() );
        totaal.addActionListener( new H8_2.KnoptotListener() );

        add (man);
        add (vrouw);
        add (manlln);
        add (vrouwlln);
        add (totaal);

        add (manT);
        add (vrouwT);
        add (manllnT);
        add (vrouwllnT);

        add (totaalT);

        methM = 0;
        methV = 0;
        methML = 0;
        methVL = 0;
        totaalM = methM + methV + methML + methVL;
    }




    public void paint(Graphics g) {
    }

    class KnopMListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            methM++;
            totaalM++;
            manT.setText(String.valueOf(methM));
            repaint();
        }
    }

    class KnopVListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            methV++;
            totaalM++;
            vrouwT.setText(String.valueOf(methV));
            repaint();
        }
    }

    class KnopMLListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            methML++;
            totaalM++;
            manllnT.setText(String.valueOf(methML));
            repaint();
        }
    }

    class KnopVLListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            methVL++;
            totaalM++;
            vrouwllnT.setText(String.valueOf(methVL));
            repaint();
        }
    }

    class KnoptotListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            totaalT.setText(String.valueOf(totaalM));
            repaint();
        }
    }


}
