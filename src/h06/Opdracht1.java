package h06;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Gebruiker on 15-9-2016.
 */
public class Opdracht1 extends Applet {

        double a, b, uitkomst;

    @Override
    public void init() {
        super.init();
        a = 113;
        b = 4;
        uitkomst = a / b;
    }

    public void paint(Graphics g) {
        int x = 50;
        int y = 50;
        g.drawString("Totaal = €" + a, x, y);
        y = y + 20;
        g.drawString("Jan = €" + uitkomst, x, y);
        y = y + 15;
        g.drawString("Ali = €" + uitkomst, x, y);
        y = y + 15;
        g.drawString("Jeannette  = €" + uitkomst, x, y);
        y = y + 15;
        g.drawString("Ik = €" + uitkomst, x, y);
    }
}
