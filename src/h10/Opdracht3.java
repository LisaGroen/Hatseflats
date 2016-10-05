package h10;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Gebruiker on 5-10-2016.
 * Af
 */
public class Opdracht3 extends Applet {

    TextField tekstvak;
    Label label;
    String s, tekst;
    int maand;

    public void init() {
        tekstvak = new TextField("", 5);
        label = new Label("Type het maand nummer en druk op enter");
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "";
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            maand = Integer.parseInt( s);
            switch(maand) {
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
