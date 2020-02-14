package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht7 extends Applet {

    public void init() {


    }
    public void paint(Graphics g) {
        setBackground(Color.cyan);
        g.setColor(Color.blue);
        g.fillRect(50, 50, 80, 80);
        g.setColor(Color.black);
        g.fillOval(60, 60, 20, 20);
        g.fillOval(100, 60, 20, 20);
        g.fillOval(60, 100, 20, 20);
        g.fillOval(100, 100, 20, 20);


    }

}