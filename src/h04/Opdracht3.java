package h04;

import java.awt.*;
import java.applet.*;

/**
 * Created by Lisa on 9-9-2016.
 */
public class Opdracht3 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.red);
        g.fillRect(30, 25, 80, 20);
        g.setColor(Color.white);
        g.fillRect(30, 45, 80, 20);
        g.setColor(Color.blue);
        g.fillRect(30, 65, 80, 20);
        g.setColor(Color.lightGray);
        g.fillRect(20, 15, 10, 140);
    }
}