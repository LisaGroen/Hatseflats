package h06;

import java.awt.*;
import java.applet.Applet;

/**
 * Created by Gebruiker on 16-9-2016.
 */
public class Opdracht4 extends Applet {

    int uitkomst1;
    double a, b, c, d;
    double uitkomts;

    public void init() {
        a = 5.9;
        b = 6.3;
        c = 6.9;
        d = 3;
        uitkomts = (a + b + c) / d * 10;
        uitkomst1 = (int) uitkomts;
    }

    public void paint(Graphics g) {
        g.drawString("gemiddelde cijfer curist : " + uitkomst1, 20, 20);
    }
}
