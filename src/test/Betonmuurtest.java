package test;

import java.awt.*;
import java.applet.*;

/**
 * Created by Gebruiker on 16-11-2016.
 */
public class Betonmuurtest extends Applet{

    public void paint(Graphics g) {

        setSize(650, 400);

        int x, y, breedte, hoogte;

        x = 50;
        y = 25;
        breedte = 75;
        hoogte = 50;

        g.setColor(Color.GRAY);
        g.fillRect(x, 75, 525, 250);

        for (int i = 0; i < 10; i++) {
            x = 50;
            y += 50;
            for (int kolom = 0; kolom < 7; kolom++) {
                g.setColor(Color.white);
                g.drawRect(x, y, breedte, hoogte);
                x += 75;
            }

        }
    }

}
