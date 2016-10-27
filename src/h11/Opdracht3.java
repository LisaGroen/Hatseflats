package h11;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Gebruiker on 26-10-2016.
 * Af
 */
public class Opdracht3 extends Applet{

    public void init() {


    }

    public void paint(Graphics g) {
        int getal1 = 0;
        int getal2 = 1;
        int totaal;
        int x = 20;

        g.drawString("1", 20, 50 );

        for (int teller = 0; teller < 10; teller++) {
            x += 20;
            totaal = getal2 + getal1;
            g.drawString("" + totaal, x, 50 );
            getal1 = getal2;
            getal2 = totaal;


        }
    }

}
