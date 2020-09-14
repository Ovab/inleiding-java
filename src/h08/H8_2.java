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

    TextField manT;
    TextField vrouwT;
    TextField manllnT;
    TextField vrouwllnT;


    public void init() {
        manT = new TextField("", 30);
        vrouwT = new TextField("", 30);
        manllnT = new TextField("", 30);
        vrouwllnT = new TextField("", 30);
        man = new Button("man");
        vrouw = new Button("vrouw");
        manlln = new Button("Joch");
        vrouwlln = new Button("Vrouwlijke leerling");

        man.addActionListener( new H8_2.KnopMListener() );
        vrouw.addActionListener( new H8_2.KnopVListener() );
        manlln.addActionListener( new H8_2.KnopMLListener() );
        vrouwlln.addActionListener( new H8_2.KnopVLListener() );

        add (man);
        add (vrouw);
        add (manlln);
        add (vrouwlln);

        add (manT);
        add (vrouwT);
        add (manllnT);
        add (vrouwllnT);
    }




    public void paint(Graphics g) {


    }
    class KnopMListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            manT.setText("HAHA GEt SCHERKT");
            repaint();
        }
    }
    class KnopVListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            vrouwT.setText("HAHA GEt SCHERKT");
            repaint();
        }
    }
    class KnopMLListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            manllnT.setText("HAHA GEt SCHERKT");
            repaint();
        }
    }
    class KnopVLListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            vrouwllnT.setText("HAHA GEt SCHERKT");
            repaint();
        }
    }

}
