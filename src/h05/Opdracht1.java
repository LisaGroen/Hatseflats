package h05;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Lisa on 9-9-2016.
 */
public class Opdracht1 extends Applet {

    Color achtergrond;
    Color binnenkant;
    Color omheen;
    int breedte;
    int hoogte;

    @Override
    public void init() {
        super.init();
        achtergrond = new Color(255, 255, 255);
        binnenkant = new Color (255, 60, 180);
        omheen = new Color (0, 0, 0);
        setBackground(achtergrond);
        breedte = 110;
        hoogte = 60;
    }
    public void paint(Graphics g) {
        g.setColor(omheen);
        g.drawLine(20, 20, 130, 20);
        g.drawString("Lijn", 45, 35);
        g.drawRect(20, 50, breedte, hoogte);
        g.drawString("Rechthoek", 30, 130);
        g.drawRoundRect(20, 145, breedte, hoogte, 20, 20);
        g.drawString("Afgeronde rechthoek", 20, 220);
        g.setColor(binnenkant);
        g.fillRect(160, 50, breedte, hoogte);
        g.setColor(omheen);
        g.drawOval(160, 50, breedte, hoogte);
        g.drawString("Gevulde rechthoek met ovaal", 135, 130);
        g.setColor(binnenkant);
        g.fillOval(160, 145, breedte, hoogte);
        g.setColor(omheen);
        g.drawString("Gevulde ovaal", 170, 220);
        g.drawOval(310, 50, breedte, hoogte);
        g.setColor(binnenkant);
        g.fillArc(310, 50, breedte, hoogte, 0, 45);
        g.setColor(omheen);
        g.drawString("Taartpunt met ovaal eromheen", 310, 130);
        g.drawArc(310, 145, hoogte, hoogte, 0, 360);
        g.drawString("Cirkel", 325, 220);
    }
}

