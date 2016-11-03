package h12;

import java.awt.*;
import java.applet.*;
import java.util.Arrays;

/**
 * Created by Gebruiker on 29-10-2016.
 */
public class Opdracht2 extends Applet{

    Button[] knop;

    @Override
    public void init() {
        
        knop = new Button[25];
        for (int i = 0; i < knop.length; i++) {
            knop[i] = new Button("" + i);
            add(knop[i]);
        }
    }

}
