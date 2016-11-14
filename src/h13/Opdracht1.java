package h13;

import com.sun.org.apache.regexp.internal.RE;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Created by Gebruiker on 29-10-2016.
 */
public class Opdracht1 extends Applet{

    Button[] knop = new Button[5];
    String kleur;

    @Override
    public void init() {
        knop[0] = new Button("Red");
        add(knop[0]);
        knop[0].addActionListener(new Knoplisterner());

        knop[1] = new Button("Cyan");
        add(knop[1]);
        knop[1].addActionListener(new Knoplisterner1());

        knop[2] = new Button("Yellow");
        add(knop[2]);
        knop[2].addActionListener(new Knoplisterner2());

        knop[3] = new Button("Green");
        add(knop[3]);
        knop[3].addActionListener(new Knoplisterner3());

        knop[4] = new Button("Pink");
        add(knop[4]);
        knop[4].addActionListener(new Knoplisterner4());
    }

    class Knoplisterner implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            kleur = "Red";
            repaint();
        }
    }
    class Knoplisterner1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            kleur = "Cyan";
            repaint();
        }
    }
    class Knoplisterner2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            kleur = "Yellow";
            repaint();
        }
    }
    class Knoplisterner3 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            kleur = "Green";
            repaint();
        }
    }
    class Knoplisterner4 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            kleur = "Pink";
            repaint();
        }
    }

    public void paint(Graphics g) {
        knop[0].setBackground(Color.RED);
        knop[1].setBackground(Color.CYAN);
        knop[2].setBackground(Color.YELLOW);
        knop[3].setBackground(Color.GREEN);
        knop[4].setBackground(Color.PINK);
        int x = 50, y=50;
        g.drawString(kleur,x,y);

    }
}
