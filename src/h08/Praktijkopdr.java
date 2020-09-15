package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdr extends Applet {
    TextField input1text;
    TextField input2text;

    Button keer;
    Button deel;
    Button plus;
    Button min;


    double vak1;
    double vak2;
    double output;

    public void init() {
        input1text = new TextField("", 10);
        input2text = new TextField("", 10);

        keer = new Button("x");
        keer.addActionListener( new KeerListener() );

        deel = new Button(":");
        deel.addActionListener( new DeelListener() );

        plus = new Button("+");
        plus.addActionListener( new PlusListener() );

        min = new Button("-");
        min.addActionListener( new MinListener() );

        add (input1text);
        add (input2text);
        add (keer);
        add (deel);
        add (plus);
        add (min);
    }


    public void paint(Graphics g) {
    }

    class KeerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = input1text.getText();
            String a = input2text.getText();
            vak1 = Double.parseDouble(s);
            vak2 = Double.parseDouble(a);
            output = vak1*vak2;
            input1text.setText(String.valueOf(output));
            input2text.setText("");
            repaint();
        }}
    class DeelListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = input1text.getText();
            String a = input2text.getText();
            vak1 = Double.parseDouble(s);
            vak2 = Double.parseDouble(a);
            output = vak1/vak2;
            input1text.setText(String.valueOf(output));
            input2text.setText("");
            repaint();
        }}
    class PlusListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = input1text.getText();
            String a = input2text.getText();
            vak1 = Double.parseDouble(s);
            vak2 = Double.parseDouble(a);
            output = vak1+vak2;
            input1text.setText(String.valueOf(output));
            input2text.setText("");
            repaint();
        }}
    class MinListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = input1text.getText();
            String a = input2text.getText();
            vak1 = Double.parseDouble(s);
            vak2 = Double.parseDouble(a);
            output = vak1-vak2;
            input1text.setText(String.valueOf(output));
            input2text.setText("");
            repaint();
        }}

}
