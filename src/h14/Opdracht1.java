package h14;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * Created by Gebruiker on 18-11-2016. ^^
 */
public class Opdracht1 extends Applet {

    String[] soort = {"harten", "klaver", "ruiten", "schoppen"};
    String[] nummer = {"aas", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien", "boer", "vrouw", "heer"};
    String[] deck = new String[52];
    Button knop;
    int x;
    boolean geklikt;


    @Override
    public void init() {

        knop = new Button("Deel een kaart");
        knop.addActionListener(new Knoplisterner());
        add(knop);

        int index = 0;

        for (int i = 0; i < soort.length; i++) {
            String kleur = soort[i];
            for (int j = 0; j < nummer.length; j++) {
                String kaart = nummer[j];
                deck[index] = kleur + " " + kaart;
                index++;
            }
        }
    }

    class Knoplisterner implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            Random random = new Random();
            int r = random.nextInt(52);
            x = r;

            geklikt = true;

            repaint();
        }
    }

    @Override
    public void paint(Graphics g) {
        if (geklikt == true) {
            g.drawString("Je kaart is: " + deck[x], 50, 50);
        }
    }
}
