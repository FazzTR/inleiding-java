package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht6 extends Applet {

    public void init() {


    }
    public void paint(Graphics g) {
        setBackground(Color.cyan);
        g.fillRect(50, 50, 50, 100);
        g.setColor(Color.green);
        g.fillOval(63, 70, 25, 25);
        g.setColor(Color.red);
        g.fillOval(63, 110, 25, 25);


    }

}