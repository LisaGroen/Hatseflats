package h04;

import java.awt.*;
import java.applet.*;

/**
 * Created by Lisa on 9-9-2016.
 */
public class Opdracht1 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(20, 20, 80, 120);
        g.drawLine(140, 20, 80, 120);
        g.drawLine(140, 20, 20, 20);
    }
}
