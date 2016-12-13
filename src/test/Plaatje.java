package test;

import java.awt.*;
import java.applet.*;
import java.net.URL;

/**
 * Created by Gebruiker on 12-12-2016.
 */
public class Plaatje extends Applet{

    private Image afbeelding;
    private URL pad;

    public void init() {
        pad = Plaatje.class.getResource("/plaatjes/");
        afbeelding = getImage(pad, "saddie.jpg");
    }

    public void paint(Graphics g) {
        g.drawString(pad.toString(), 20, 10 );
        g.drawImage(afbeelding, 20, 20, 200, 200, this);
    }
}



