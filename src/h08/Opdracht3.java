package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Gebruiker on 23-9-2016.
 */
public class Opdracht3 extends Applet{

    TextField tekstvak;
    Label label;
    Button knop;
    double getal;
    String s;

    @Override
    public void init() {
        setLayout(new FlowLayout());

        tekstvak = new TextField("", 30);
        tekstvak.addActionListener(new TekstvakListener());

        knop = new Button("Ok");
        KnopListener kl = new KnopListener();
        knop.addActionListener(kl);

        label = new Label("Type een getal " +
                "en klik op Ok");

        add(label);
        add(tekstvak);
        add(knop);
        s ="";
    }

    public void paint(Graphics g) {
        g.drawString("de uikomst is inclusief btw = €" + getal, 40, 100);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            getal = Double.parseDouble( s ) * 121 / 100;
            repaint();
        }
    }
    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            getal = Double.parseDouble( s ) * 121 / 100;
            repaint();
        }
    }
}
