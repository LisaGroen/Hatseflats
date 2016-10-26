package h11;

import java.awt.*;
import java.applet.*;

/**
 * Created by Gebruiker on 26-10-2016.
 * Af
 */
public class Opdracht2 extends Applet{

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int y = 0;

        for(teller = 20; teller > 10; teller -= 1) {
            y += 20;
            g.drawString("" + teller, y, 50 );
        }
    }

}
