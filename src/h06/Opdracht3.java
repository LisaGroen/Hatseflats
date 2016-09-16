package h06;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Gebruiker on 15-9-2016.
 */
public class Opdracht3 extends Applet {

    int a;
    int b;
    int c;
    int totaal;

    @Override
    public void init() {
        super.init();
        a = Integer.MAX_VALUE;
        b = 20000;
        c = 2;
        totaal = a + b + c;
    }
    public void paint(Graphics g) {
        g.drawString("uitkomst = " + totaal, 20, 20);
    }
}
