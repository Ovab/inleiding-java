package h14;

import java.applet.Applet;
import java.awt.*;
import java.sql.SQLOutput;
import java.util.Random;

public class H14_2 extends Applet {
    int randomcolorint, randomtypeint, randomint;
    String [] color;
    String [] type;
    String [] deck;
    String randomcard;
    public void init() {
        fillDeck();
        for (int i = 0; i < deck.length; i++){
            System.out.println(distributeCards());
        }
        //System.out.println(add1(0, 0, 5000));

    }



    public void paint(Graphics g) {
        for (int i = 0; i < deck.length; i++) {
            drawGraphicCard(g, 50, 50, 20, 20);
        }
    }

    private void fillDeck (){
        String[] colors = {"Red", "Black"};
        String[] type = {"♣", "♠", "♥", "♦"};
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String [] specials = {"Jack", "Queen", "King", "Ace"};
        int lengthDeck = colors.length * type.length * numbers.length;
        deck = new String[lengthDeck];
        int i = 0;
        //TO DO: recursief maken
        for (int colorCount = 0; colorCount < colors.length; colorCount++){
            for (int typeCount = 0; typeCount < type.length; typeCount++){
                for (int numberCount = 0; numberCount < numbers.length; numberCount++){
                    deck[i] = colors[colorCount] + " " + type[typeCount] + " " + numbers[numberCount];
                    //System.out.println(deck[i]);
                    i++;
                }
            }
        }
        System.out.println(i);
    }

    private String distributeCards (){
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

    void drawGraphicCard(Graphics g,int x, int y, int xOffset, int yOffset) {
        x += xOffset;
        y += yOffset;
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