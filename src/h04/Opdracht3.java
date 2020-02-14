package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht3 extends Applet {

    public void init() {


    }
    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.red);
        g.fillRect(100, 100, 100, 20);
        g.setColor(Color.white);
        g.fillRect(100, 120, 100, 20);
        g.setColor(Color.blue);
        g.fillRect(100, 140, 100, 20);
        g.setColor(Color.black);
        g.fillRect(200, 100, 5, 300);


    }

}