package h11;

import java.awt.*;
import java.applet.*;

/**
 * Created by Gebruiker on 26-10-2016.
 * Af
 */
public class Opdracht1 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int y = 0;

        for(teller = 1; teller <= 10; teller++) {
            y += 20;
            g.drawLine(y , 50, y, 250 );
            g.drawString("" + teller, y, 270 );
        }
    }

}
