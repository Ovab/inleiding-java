package h14;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijk extends Applet {

    Button restartbutton;
    TextField txtvak;
    Label Rules;
    String txtvakgrabber, bot = "", humantext = "";
    String winorlose1 = "";
    int amount = 23;
    int userinput;
    boolean Playerturn;

    public void init() {
        resize(700, 400);
        restartbutton = new Button("Reset");
        txtvak = new TextField(10);
        Rules = new Label("Take 1, 2 or 3 Girls");
        txtvak.addActionListener(new Game());
        restartbutton.addActionListener(new Resetlistener());
        add(restartbutton);
        add(txtvak);
        add(Rules);
    }
    public void paint(Graphics g) {
        g.drawString(humantext, 69, 65);
        g.drawString(bot, 69, 85);
        g.drawString(winorlose1, 69, 300);
        g.drawString("Rule: pick 1,2 or 3 anime girls for your harem. Last one to pick loses", 20, 40);
        g.drawString("The total of remaining anime girls = " + amount, 105, 130);
    }





    public class Game implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //Player inputs
            txtvakgrabber = txtvak.getText();
            userinput = Integer.parseInt(txtvakgrabber);

            for (int Player_turn_loop = 0; Player_turn_loop == 0; Player_turn_loop++) {
                Playerturn = true;
                if (amount == 0){
                    break;
                }
                //lil cheat code :)
                if (userinput == 69420) {
                    amount = 0;
                    winorlose1 = "Congratulations you won the harem! (With cheats)";
                }


                if (userinput <= 3 && userinput >=0) {
                    if (amount == 1) {userinput = 1;}

                    amount = amount - userinput;
                    humantext = "You picked " + userinput + " anime girls for your harem";
                    txtvak.setText("");
                }

                else {
                    humantext = "Getting greedy eh? Pick 1, 2 or 3 girls. Or just find the cheatcode in the code!";
                    bot = "";
                    repaint();
                    break;
                }
                //lose condition + consequence
                if (amount == 0) {
                    winorlose1 = "Hentai protaganist won, his hair was too cool";
                    repaint();
                    break;
                }




                //bot AI AKA unbeatable
                Playerturn = false;
                int random = (int) (Math.random() * 3 + 1);
                if (amount == 1) {
                    amount = amount - 1;
                    bot = "Hentai protaganist Picked 1 girls for his harem";
                    System.out.println(amount);
                }
                else if (amount == 2 || amount == 3 || amount == 4) {
                    bot = "Hentai protaganist Picked " + (amount - 1) + " girls for his harem";
                    amount = 1;
                    System.out.println(amount);
                }
                else if (amount == 6 || amount == 7 || amount == 8) {
                    bot = "Hentai protaganist Picked " + (amount - 5) + " girls for his harem";
                    amount = 5;
                    System.out.println(amount);
                }
                else if (amount == 10 || amount == 11 || amount == 12) {
                    bot = "Hentai protaganist Picked " +(amount - 9) + " girls for his harem";
                    amount = 9;
                    System.out.println(amount);
                }
                else if (amount == 14 || amount == 15 || amount == 16) {
                    bot = "Hentai protaganist Picked " + (amount - 13) + " girls for his harem";
                    amount = 13;
                }
                else if (amount == 18 || amount == 19 || amount == 20) {
                    bot = "Hentai protaganist Picked " + (amount - 17) + " girls for his harem";
                    amount = 17;
                }
                else if (amount == 22) {
                    bot = "Hentai protaganist Picked " + (amount - 21) + " girls for his harem";
                    amount = 21;
                }
                else if (!Playerturn) {
                    amount = amount - (random + 1);
                    bot = "Hentai protaganist Picked " + (random + 1) + " girls for his harem";
                    System.out.println(amount);
                }




                Playerturn = true;
                if (amount < 0) {
                    amount = 0;
                    break;
                }
                repaint();

                //player win conition + consequence
                if (amount == 0 && Playerturn) {
                    winorlose1 = "Congratulations you won the harem!";
                    repaint();
                    break;
                }
            }
        }
    }
    public class Resetlistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            amount = 23;
            bot = "";
            humantext = "";
            winorlose1 = "";
            repaint();
        }
    }
}


/*/
    ____________        |        /
    |           \       |      /
    |            \      |    /
    |            /      |  /\
    |           /       |/   \
    |__________/        |     \
    |          \        |      \
    |           \       |       \
    |           /       |        \
    |          /        |         \
    |_________/   avo   |          \    nol
 */