package h14;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * Created by Gebruiker on 18-11-2016. ^^
 */
public class Opdracht2 extends Applet {

    String[] soort = {"harten", "klaver", "ruiten", "schoppen"};
    String[] nummer = {"aas", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien", "boer", "vrouw", "heer"};
    String[] deck = new String[52];
    String[] speler1 = new String[13];
    String[] speler2 = new String[13];
    String[] speler3 = new String[13];
    String[] speler4 = new String[13];
    Button knop;
    boolean geklikt;
    Font fontje = new Font("default", Font.BOLD, 20);

    @Override
    public void init() {

        setSize(10,30);

        knop = new Button("Deel de kaarten");
        knop.addActionListener(new Knoplisterner());
        add(knop);
    }

    public String deeldeck () {
        int random = new Random().nextInt(deck.length);
        String kaart = deck[random];

        String[] deck2 = new String[deck.length - 1];
        int index = 0;

        for (int i = 0; i < deck.length; i++) {
            if (i != random) {
                deck2[index] = deck[i];
                index++;
            }
        }
        deck = deck2;
        return kaart;

    }

    class Knoplisterner implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            setSize(900, 550);
            geklikt = true;

            deck = new String[52];
            int index = 0;

            for (int i = 0; i < soort.length; i++) {
                String kleur = soort[i];
                for (int j = 0; j < nummer.length; j++) {
                    String kaart = nummer[j];
                    deck[index] = kleur + " " + kaart;
                    index++;
                }
            }

            for (int i = 0; i < 13; i++ ) {
                speler1[i] = deeldeck();
                speler2[i] = deeldeck();
                speler3[i] = deeldeck();
                speler4[i] = deeldeck();
            }

            repaint();
        }
    }

    @Override
    public void paint(Graphics g) {

        int x1 = 50;
        int x2 = 250;
        int x3 = 450;
        int x4 = 650;
        int y1 = 70;
        int y2 = 110;
        g.setFont(fontje);

        if (geklikt == true) {
            g.drawString("Speler 1", x1, y1);
            g.drawString("Speler 2", x2, y1);
            g.drawString("Speler 3", x3, y1);
            g.drawString("Speler 4", x4, y1);
            for (int i = 0; i < 13; i++) {
                g.drawString(speler1[i], x1, y2);
                g.drawString(speler2[i], x2, y2);
                g.drawString(speler3[i], x3, y2);
                g.drawString(speler4[i], x4, y2);
                y2 += 25;
            }
        }
    }
}
