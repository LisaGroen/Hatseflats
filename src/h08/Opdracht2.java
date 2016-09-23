package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Gebruiker on 22-9-2016.
 */
public class Opdracht2 extends Applet {

    Button knopm;
    Button knopv;
    Button knoplm;
    Button knoplv;
    int a;
    int b;
    int c;
    int d;
    int z;

    public void init() {
        setLayout(new FlowLayout());

        knopm = new Button("Mannen");
        KnopListener1 kl = new KnopListener1();
        knopm.addActionListener(kl);
        add(knopm);

        knopv = new Button("Vrouwen");
        KnopListener2 ht = new KnopListener2();
        knopv.addActionListener(ht);
        add(knopv);

        knoplm = new Button("Leerling mannen");
        KnopListener3 rs = new KnopListener3();
        knoplm.addActionListener(rs);
        add(knoplm);

        knoplv = new Button("Leerling vrouwen");
        KnopListener4 az = new KnopListener4();
        knoplv.addActionListener(az);
        add(knoplv);

        a = 0;
        b = 0;
        c = 0;
        d = 0;
        z = 0;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("mannen : " + a, 100, 40);
        g.drawString("vrouwen : " + b, 100, 55);
        g.drawString("leerlingen mannen : " + c, 100, 70);
        g.drawString("leelingen vrouwen : " + d, 100, 85);
        g.drawString("totaal = " + z, 100, 100);
    }

    class KnopListener1 implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            a = a + 1;
            z = z + 1;
            repaint();
        }
    }

    class KnopListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            b = b + 1;
            z = z + 1;
            repaint();
        }
    }

    class KnopListener3 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            c = c + 1;
            z = z + 1;
            repaint();
        }
    }

    class KnopListener4 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            d = d + 1;
            z = z + 1;
            repaint();
        }
    }
}
