package h11;

import java.awt.*;
import java.applet.*;

/**
 * Created by Gebruiker on 26-10-2016.
 */
public class Opdracht8 extends Applet{

    public void init() {}

    public void paint(Graphics g) {
        int teller = 0;
        int y = 20;

        while(teller < 100) {
            y += 5;
            g.drawOval(20, 20, y, y);
            teller++;
        }

    }

}
