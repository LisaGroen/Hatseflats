package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Gebruiker on 29-10-2016.
 */
public class Opdracht5 extends Applet{

    boolean geklikt, gevonden;
    int[] salaris = { 2, 4, 6, 8, 10 };
    int getal;
    int indexpositie;
    TextField tekstvak;
    Button knop;

    public void init() {

        tekstvak = new TextField("",5);
        add(tekstvak);
        knop = new Button("OK");
        add(knop);
        knop.addActionListener(new Knoplisterner());


    }

    class Knoplisterner implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String invoer = tekstvak.getText();
            getal = Integer.parseInt(invoer);
            gevonden = false;
            geklikt = true;
            for (int i = 0; i < salaris.length; i++) {
                if (salaris[i] == getal) {
                    gevonden = true;
                    indexpositie = i;
                }
            }
            repaint();

        }
    }

    public void paint(Graphics g) {

        if (geklikt) {
            if (gevonden == true) {
                g.drawString("De waarde " + getal + " is gevonden.", 20, 50);
                g.drawString("indexpositie = " + indexpositie, 20, 70);
            } else {
                g.drawString("De waarde is niet gevonden.", 20, 50);
            }
        }
    }

}
