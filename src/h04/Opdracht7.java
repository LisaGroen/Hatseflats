package h04;

import java.awt.*;
import java.applet.*;

/**
 * Created by Lisa on 9-9-2016.
 */
public class Opdracht7 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.white);
        g.fillRoundRect(20, 20, 100, 100, 20, 20);
        g.setColor(Color.black);
        g.fillArc(40, 40, 20, 20, 0, 360);
        g.fillArc(80, 80, 20, 20, 0, 360);
        g.fillArc(40, 80, 20, 20, 0, 360);
        g.fillArc(80, 40, 20, 20, 0, 360);
    }
}
