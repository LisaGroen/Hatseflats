package h06;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Gebruiker on 15-9-2016.
 */
public class Opdracht2 extends Applet {

    double a, b, c, uitkomst1, uitkomst2, uitkomst3;

    @Override
    public void init() {
        super.init();
        a = 60;
        b = 24;
        c = 365;
        uitkomst1 = a * a;
        uitkomst2 = uitkomst1 * b;
        uitkomst3 = uitkomst2 * c;
    }

    public void paint(Graphics g) {
        int x = 50;
        int y = 50;
        g.drawString("Seconden er in een uur: " + uitkomst1, x, y);
        y = y + 15;
        g.drawString("Seconden er in een dag: " + uitkomst2, x, y);
        y = y + 15;
        g.drawString("Seconden er in een jaar: " + uitkomst3, x, y);
    }
}
