package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht4 extends Applet {

    public void init() {


    }
    public void paint(Graphics g) {
        setBackground(Color.white);
        g.drawLine(50, 50, 50, 250);
        g.drawLine(250, 250, 250, 50);
        g.drawLine(50, 250, 250, 250);
        g.fillRect(100, 50, 5, 200);
        g.fillRect(150, 90, 5, 160);
        g.fillRect(200, 170, 5, 80);
        g.drawString("0", 10, 250);
        g.drawString("50KG", 10, 150);
        g.drawString("100KG", 10, 50);



    }

}