package test;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.*;
import java.util.Random;


/**
 * Created by Gebruiker on 15-12-2016. ^^
 */
public class OefenTestje extends Applet {

    Image[] afbeelding;
    Button knop;
    URL pad;
    int x;

    public void init() {
        knop = new Button("Deel de kaarten");
        knop.addActionListener(new Knoplisterner());
        add(knop);

        afbeelding = new Image[3];

        pad = OefenTestje.class.getResource("/plaatjes/");
        afbeelding[0] = getImage(pad, "saddie.jpg");
        afbeelding[1] = getImage(pad, "gewonnen.jpg");
        afbeelding[2] = getImage(pad, "winky.jpg");



    }

    class Knoplisterner implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            int random = new Random().nextInt(afbeelding.length);
            Image plaatje = afbeelding[random];


        }
    }

    @Override
    public void paint(Graphics g) {


    }
}
