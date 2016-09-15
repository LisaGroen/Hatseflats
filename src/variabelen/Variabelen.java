package variabelen;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Gebruiker on 14-9-2016.
 */
public class Variabelen extends Applet {

    Color achtergrond;
    Color tekst;
    int getal1;
    int getal2;
    Font mijnfont;

    @Override
    public void init() {
        super.init();
        achtergrond = new Color(255, 204, 204);
        tekst = new Color(0, 32, 128);
        getal1 = 20;
        getal2 = 30;
        setBackground(achtergrond);
        mijnfont = new Font("TimesRoman", Font.BOLD, 50);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(tekst);
        int x = 50;
        int y = 50;
        g.setFont(mijnfont);
        g.drawString("Som is: " + (getal1 + getal2), x, y );
        y = y + 50;
        g.drawString("Som is: " + (getal1 * getal2), x, y );

    }


}

