package h01;

import java.applet.Applet;
import java.awt.*;

public class Joey extends Applet {

    @Override
    public void init() {
        setBackground(Color.pink);
        super.init();
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("Hallo Wereld!", 50, 50);
    }
}
