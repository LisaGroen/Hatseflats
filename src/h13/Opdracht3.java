package h13;

import java.awt.*;
import java.applet.*;

/**
 * Created by Gebruiker on 29-10-2016. ^^
 */
public class Opdracht3 extends Applet{

    public void paint(Graphics g) {

        setSize(650, 400);

        int x, y, breedte, hoogte;

        x = 50;
        y = 50;
        breedte = 50;
        hoogte = 25;

        g.setColor(Color.RED);
        g.fillRect(x, 75, 500, 250);

        for (int i = 0; i < 5; i++) {
            x = 50;
            y += 25;
            for (int kolom = 0; kolom < 10; kolom++) {
                g.setColor(Color.white);
                g.drawRect(x, y, breedte, hoogte);
                x += 50;
            }
            x = 25;
            y += 25;
            for (int kolom = 0; kolom < 11; kolom++) {
                g.setColor(Color.white);
                g.drawRect(x, y, breedte, hoogte);
                x += 50;
            }
        }
    }
}
