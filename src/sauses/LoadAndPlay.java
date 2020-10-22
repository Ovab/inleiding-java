package sauses;//Voorbeeld 14.4

import java.awt.*;
import java.applet.*;
import java.net.URL;

public class LoadAndPlay extends Applet {

    private Image afbeelding;
    private URL pad;
    private AudioClip sound;

    public void init() {
        pad = LoadAndPlay.class.getResource("/sauses/");
        afbeelding = getImage(pad, "Afbeelding.gif");
        /* uitgangspunt is dat de package "resources"
                in dezelfde package zit als de java klasse*/
        pad = LoadAndPlay.class.getResource("/sauses/");
        sound = getAudioClip(pad, "scream.wav");

    }

    public void paint(Graphics g) {
        sound.play();
        g.drawImage(afbeelding, 70, 70, this);
    }
}