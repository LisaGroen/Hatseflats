package h05;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Gebruiker on 15-9-2016.
 */
public class Opdracht2 extends Applet {

    Color achtergrond;
    Color tabellen;
    Color omheen;
    int breedte;
    int gewichtValerie;
    int gewichtJeroen;
    int gewichtHans;
    int baseline;

    @Override
    public void init() {
        super.init();
        achtergrond = new Color (255, 255, 255);
        tabellen = new Color(255, 80, 85);
        omheen = new Color(0, 0, 0);
        breedte = 20;
        baseline = 260;
        gewichtValerie = 40;
        gewichtJeroen = 100;
        gewichtHans = 80;


    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(30, 20, 30, baseline);
        g.drawLine(30, baseline, 230, baseline);
        g.drawLine(25, 220, 35, 220);
        g.drawLine(25, 180, 35, 180);
        g.drawLine(25, 140, 35, 140);
        g.drawLine(25, 100, 35, 100);
        g.drawLine(25, 60, 35, 60);
        g.drawLine(25, 20, 35, 20);
        g.drawString("20", 3, 225);
        g.drawString("40", 3, 185);
        g.drawString("60", 3, 145);
        g.drawString("80", 3, 105);
        g.drawString("100", 3, 65);
        g.drawString("120", 3, 25);
        g.drawLine(80, 265, 80, 255);
        g.drawLine(130, 265, 130, 255);
        g.drawLine(180, 265, 180, 255);
        g.drawString("Valerie", 60, 280);
        g.drawString("Jeroen", 110, 280);
        g.drawString("Hans", 165, 280);
        g.setColor(tabellen);
        g.fillRect(70, baseline - 2 * gewichtValerie, breedte, 2 * gewichtValerie);
        g.setColor(tabellen);
        g.fillRect(120, baseline - 2 * gewichtJeroen, breedte, 2 * gewichtJeroen);
        g.setColor(tabellen);
        g.fillRect(170, baseline - 2 * gewichtHans, breedte, 2 * gewichtHans);
    }
}
