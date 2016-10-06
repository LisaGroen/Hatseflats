package h10;

import java.awt.*;
import java.applet.*;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht5 extends Applet {

    TextField tekstvak;
    Button OK;

    double invoer;
    double totaal;
    double gemiddelde;
    int aantalcijfer;
    boolean geklikt;

    public void init() {
        tekstvak = new TextField("", 10);

        OK = new Button("Ok");
        KnopListener kl = new KnopListener();
        OK.addActionListener(kl);

        add(tekstvak);
        add(OK);
    }

    public void paint(Graphics g) {

        if (geklikt) {
            if ( invoer < 5.5 ) {
                g.drawString("Het cijfer is: onvoldoende", 50, 60);
            }
            else {
                g.drawString("Het cijfer is: voldoende", 50, 60);
            }

            g.drawString("Gemiddelde: " + gemiddelde, 50, 90);
        }
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            invoer = Double.parseDouble(s);

            totaal = totaal + invoer;
            aantalcijfer++;

            gemiddelde = totaal / aantalcijfer;

            geklikt = true;

            repaint();
        }
    }
}
