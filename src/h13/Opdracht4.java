package h13;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Gebruiker on 29-10-2016.^^
 */
public class Opdracht4 extends Applet{

    Button baksteen, beton;
    boolean geklikt1, geklikt2;

    @Override
    public void init() {

        baksteen = new Button("Bakstenen muur");
        add(baksteen);
        baksteen.addActionListener(new Knoplisterner1());

        beton = new Button("Betonnen muur");
        add(beton);
        beton.addActionListener(new Knoplisterner2());

        geklikt1 = false;
        geklikt2 = false;
    }

    class Knoplisterner1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            geklikt1 = true;
            geklikt2 = false;
            repaint();
        }

    }

    class Knoplisterner2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            geklikt2 = true;
            geklikt1 = false;
            repaint();
        }
    }

    public void paint(Graphics g) {

        setSize(650, 400);
        int x, y, breedte, hoogte;

        if (geklikt1 == true) {

            x = 50;
            y = 50;
            breedte = 50;
            hoogte = 25;
            g.setColor(Color.RED);
            g.fillRect(x, 75, 500, 250);

            for (int i = 0; i < 5; i++) {
                x = 50;
                y += 25;
                for (int kolom = 0; kolom < 10; kolom++) {
                    g.setColor(Color.white);
                    g.drawRect(x, y, breedte, hoogte);
                    x += 50;
                }
                x = 25;
                y += 25;
                for (int kolom = 0; kolom < 11; kolom++) {
                    g.setColor(Color.white);
                    g.drawRect(x, y, breedte, hoogte);
                    x += 50;
                }
            }
        }

        if (geklikt2 == true) {

            x = 50;
            y = 25;
            breedte = 75;
            hoogte = 50;

            g.setColor(Color.GRAY);
            g.fillRect(x, 75, 525, 250);

            for (int i = 0; i < 10; i++) {
                x = 50;
                y += 50;
                for (int kolom = 0; kolom < 7; kolom++) {
                    g.setColor(Color.white);
                    g.drawRect(x, y, breedte, hoogte);
                    x += 75;
                }

            }
        }
    }

}
