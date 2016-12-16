package toetsen_h1_tm_h14;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.*;
import java.util.Random;

/**
 * Created by Lisa Groen on 16-12-2016. ^^ Fruit machine ^^
 */
public class FruitMachine extends Applet{

    private Image[] afbeelding = new Image[20];
    private Image plaatjes1, plaatjes2, plaatjes3;
    private AudioClip geluidjeklein, supergeluidje;
    private Button speelknop, kredietknop;
    private int punten = 10;
    private boolean winveel = false;
    private boolean winweinig = false;

    @Override
    public void init() {
        speelknop = new Button("Speel");
        speelknop.addActionListener(new Speellisterner());
        add(speelknop);

        kredietknop = new Button("Koop 10 kredietpunten");
        kredietknop.addActionListener(new Kredietlisterner());
        add(kredietknop);
        kredietknop.setEnabled(false);

        URL pad = FruitMachine.class.getResource("/plaatjes/");
        geluidjeklein = getAudioClip(pad, "fruitgeluid.wav");
        supergeluidje = getAudioClip(pad, "fruitveelgeld.wav");

        int opteller = 1;
        for (int i = 0; i < 20; i++) {
            afbeelding[i] = getImage(pad, "fruit_" + opteller + ".jpg");
            opteller++;
        }

        randomplaatjes();
    }

    class Speellisterner implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            randomplaatjes();

            kredietjestellen();

            repaint();
        }
    }

    private void randomplaatjes() {
        int random1 = new Random().nextInt(20);
        int random2 = new Random().nextInt(20);
        int random3 = new Random().nextInt(20);

        plaatjes1 = afbeelding[random1];
        plaatjes2 = afbeelding[random2];
        plaatjes3 = afbeelding[random3];
    }

    private void kredietjestellen() {
        punten--;

        if (punten == 0) {
            kredietknop.setEnabled(true);
            speelknop.setEnabled(false);
        }
        if ( plaatjes1 == plaatjes2 && plaatjes2 == plaatjes3) {
            punten += 20;
            winveel = true;
            winweinig = false;
            supergeluidje.play();
            geluidjeklein.stop();
            speelknop.setEnabled(true);
            kredietknop.setEnabled(false);

        }
        else if ( plaatjes1 == plaatjes2 || plaatjes1 == plaatjes3 || plaatjes2 == plaatjes3) {
            punten += 4;
            winweinig = true;
            winveel = false;
            geluidjeklein.play();
            supergeluidje.stop();
            speelknop.setEnabled(true);
            kredietknop.setEnabled(false);
        }
        else {
            winweinig = false;
            winveel = false;
        }
        repaint();
    }

    class Kredietlisterner implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            punten += 10;

            if (punten != 0) {
                kredietknop.setEnabled(false);
                speelknop.setEnabled(true);
            }
            repaint();
        }
    }

    @Override
    public void paint(Graphics g) {
        int x = 100;
        int y = 60;

        g.drawImage(plaatjes1, x, y, 70, 160, this);
        g.drawImage(plaatjes2, x + 70, y, 70, 160, this);
        g.drawImage(plaatjes3, x + 140, y, 70, 160, this);

        g.drawString("Krediet = "+ punten, x, y + 180);

        if (winveel) {
            g.drawString("Gewonnen 20 punten", x, y + 200);
        }
        if (winweinig) {
            g.drawString("Gewonnen 4 punten", x, y + 200);
        }
    }
}