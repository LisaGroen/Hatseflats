package toetsen_h1_tm_h14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Lisa Groen on 12-10-2016.
 * Toets h.1 tot h.10
 * Tijdzones
 */

public class H1totH10 extends Applet{

    private TextField tekstvlak;
    private int invoer, verschile, verschilf, verschilc, verschilj, tijdengeland, tijdfinland, tijdchina, tijdjapan;
    private boolean geklikt;

    public void init() {
        Label label = new Label("Voer een uur in");
        add(label);

        tekstvlak = new TextField("", 5);
        add(tekstvlak);

        Button knop = new Button("Toon Tijden");
        KnopListener kl = new KnopListener();
        knop.addActionListener( kl );
        add(knop);

        verschile = 1;
        verschilf = 1;
        verschilc = 6;
        verschilj = 7;
    }

    public void paint(Graphics g) {
        if (geklikt) {
            if (invoer >= 0 && invoer < 24) {
                g.drawString("Tijd in Engeland: " + tijdengeland + ":00 uur", 50,60 );
                g.drawString("Tijd in Finland: " + tijdfinland + ":00 uur", 50, 75 );
                g.drawString("Tijd in China: " + tijdchina + ":00 uur", 50, 90 );
                g.drawString("Tijd in Japan: " + tijdjapan + ":00 uur", 50, 105 );
            }
            else {
                g.drawString("Ongeldige invoer", 50, 60);
            }
        }
    }

    private class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvlak.getText();
            invoer = Integer.parseInt(s);
            tijdengeland = invoer - verschile;
            if (tijdengeland <0) {
                tijdengeland+=24;
            }
            tijdfinland = invoer + verschilf;
            if (tijdfinland >=24) {
                tijdfinland-=24;
            }
            tijdchina = invoer + verschilc;
            if (tijdchina >=24) {
                tijdchina-=24;
            }
            tijdjapan = invoer + verschilj;
            if (tijdjapan >=24) {
                tijdjapan-=24;
            }
            geklikt = true;
            repaint();
        }
    }
}

