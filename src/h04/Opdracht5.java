package h04;

import java.awt.*;
import java.applet.*;

/**
 * Created by Lisa on 9-9-2016.
 */
public class Opdracht5 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.YELLOW);
        g.fillArc(20, 20, 80, 100, 0, 360);
    }
}
