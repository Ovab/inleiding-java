package h14;

import java.applet.Applet;
import java.awt.*;
import java.util.Random;

public class H14_2 extends Applet {
    String [] deck;
    public void init() {
        setSize(1000,1000);
        fillDeck();
        //System.out.println(add1(0, 0, 5000));
    }



    public void paint(Graphics g) {
        for (int i = 0; i < deck.length; i++){
            System.out.println(distributeCards());
        }
        g.drawString("player 1", 10, 30);
            drawcards(g, 10, 50);
        g.drawString("player 2", 100, 30);
            drawcards(g, 100, 50);
        g.drawString("player 3", 160, 30);
             drawcards(g, 160, 50);
        g.drawString("player 4", 210, 30);
            drawcards(g, 210, 50);
    }

    private void fillDeck (){
        String[] type = {"♣", "♠", "♥", "♦", "♣", "♠", "♥", "♦"};
        String[] numbers = {"Ace","2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        int lengthDeck =type.length * numbers.length;
        //lengthDeck = lengthDeck*2;
        deck = new String[lengthDeck];
        //deck = new String[lengthDeck];
        int i = 0;
        //TO DO: recursief maken
            for (int typeCount = 0; typeCount < type.length; typeCount++){
                for (int numberCount = 0; numberCount < numbers.length; numberCount++){
                    deck[i] = type[typeCount] + " " + numbers[numberCount];
                    //System.out.println(deck[i]);
                    i++;
                }
            }        System.out.println(i);
        }


    private String distributeCards(){
        return deelKaart();
    }

    private String deelKaart() {
        int random = new Random().nextInt(deck.length);
        String kaart = deck[random];

        //vervang de inhoud van deck met een nieuwe lijst
        //het nieuwe deck is 1 kaart kleiner dan het oude deck
        String[] hulpLijst = new String[deck.length - 1];
        //om het nieuwe deck te vullen hebben we een index nodig
        int hulpindex = 0;
        //kopieer alle kaarten naar hulplijst behalve de kaart die net gedeeld is
        for (int i = 0; i < deck.length; i++) {
            if (i != random) {
                hulpLijst[hulpindex] = deck[i];
                hulpindex++;
            }
        }
        //vervang nu deck met de nieuwe lijst
        deck = hulpLijst;
        //de methode geeft de random kaart terug
        return kaart;
    }

    void drawcards(Graphics g, int x1, int y1) {
        for (int i = 0; i < deck.length*4; i++) {
            g.drawString(distributeCards(),x1, y1);
            y1 += 20;
        }

    }
    /*
    int add1 (int sum, int current, int end) {
        if (current == end) return sum;
        sum++; current++;
        sum = add1(sum, current, end);
        return sum;
    }

     */
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