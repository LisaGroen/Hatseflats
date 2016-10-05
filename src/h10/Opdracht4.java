package h10;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Gebruiker on 5-10-2016.
 * AF
 */
public class Opdracht4 extends Applet {

    TextField tekstvak;
    TextField tekstvak2;
    Label label;
    String s, a, tekst, tekst2;
    int maand;
    int jaar;

    public void init() {
        tekstvak = new TextField("", 5);
        tekstvak2 = new TextField("", 5);
        label = new Label("Type het maand nummer en jaarnummer druk daarna op enter");
        tekstvak.addActionListener( new TekstvakListener() );
        tekstvak2.addActionListener( new TekstvakListener() );
        tekst = "";
        tekst2 = "";
        add(label);
        add(tekstvak);
        add(tekstvak2);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 80 );
        g.drawString(tekst2, 50, 100 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            a = tekstvak2.getText();
            jaar = Integer.parseInt(a);
            if ((jaar % 4 == 0 && !(jaar % 100 == 0)) ||
                    jaar % 400 == 0) {
                tekst2 = "" + jaar + " is een schrikkeljaar, dus februarie heeft 29 dagen";
            } else {
                tekst2 = "" + jaar + " is geen schrikkeljaar";

            }

            s = tekstvak.getText();
            maand = Integer.parseInt(s);
            switch (maand) {
                case 1:
                    tekst = "Januarie: 31 dagen";
                    break;
                case 2:
                    tekst = "Februari: 28 dagen";
                    break;
                case 3:
                    tekst = "Maart: 31 dagen";
                    break;
                case 4:
                    tekst = "April: 30 dagen";
                    break;
                case 5:
                    tekst = "Mei: 31 dagen";
                    break;
                case 6:
                    tekst = "Juni: 30 dagen";
                    break;
                case 7:
                    tekst = "Juli: 31 dagen";
                    break;
                case 8:
                    tekst = "Augustus: 31 dagen";
                    break;
                case 9:
                    tekst = "September: 30 dagen";
                    break;
                case 10:
                    tekst = "Oktober: 31 dagen";
                    break;
                case 11:
                    tekst = "November: 30 dagen";
                    break;
                case 12:
                    tekst = "December: 31 dagen";
                    break;
                default:
                    tekst = "Deze maand bestaat niet.";
                    break;
            }
            repaint();
        }
    }
}

