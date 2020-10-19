package h14;

import java.applet.Applet;
import java.awt.*;

public class H14_2 extends Applet {
    int randomcolorint, randomtypeint, randomint;
    String [] color;
    String [] type;
    String [] deck;
    String randomcard;
    public void init() {
        deck = new String [52];
        for (int i = 0; i < deck.length; i++) {
            drawcard();
        }
    }



    public void paint(Graphics g) {
        for (int i = 0; i < deck.length; i++) {
            drawGraphicCard(g, 50, 50, 20, 20);
        }
    }


    private String deelKaart() {
        int random = (int) (Math.random() * deck.length);
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


    void drawcard() {
        //declaring values of the array
        color = new String[3];
        type = new String[4];
        color[0] = "Black";
        color[1] = "Red";
        type[0] = "Spade";
        type[1] = "Diamond";
        type[2] = "Hearts";
        type[3] = "Clubs";
        //making random value for the colors
        randomcolorint = (int) (Math.random() * 2 + 0);
        //making random types
        randomtypeint = (int) (Math.random() * 4 + 0);
        //making random types
        randomint = (int) (Math.random() * 6 + 1);
        randomcard = color[randomcolorint]+" " +type[randomtypeint]+" "+ randomint;
        System.out.println(randomcard);
    }
    void drawGraphicCard(Graphics g,int x, int y, int xOffset, int yOffset) {
        drawcard();
        x += xOffset;
        y += yOffset;
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