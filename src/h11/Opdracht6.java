package h11;

import java.awt.*;
import java.applet.*;

/**
 * Created by Gebruiker on 26-10-2016.
 */
public class Opdracht6 extends Applet{

    public void init() {}

    public void paint(Graphics g) {
        int teller = 0;
        int y = 20;
        int x = 60;

        while(teller < 5) {
            y += 5;
            x -= 10;
            g.drawOval(y, y, x, x);
            teller++;
        }

    }

}
