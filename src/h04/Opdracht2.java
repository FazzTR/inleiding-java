package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {

    public void init() {


    }
    public void paint(Graphics g) {
        setBackground(Color.white);
        g.drawRect(100, 100, 100, 50);
        g.drawLine(100, 100, 150, 50);
        g.drawLine(200, 100, 150, 50);
        g.drawRect(125, 125, 25, 25);
        g.drawRect(175, 125, 10, 10);
    }

}
