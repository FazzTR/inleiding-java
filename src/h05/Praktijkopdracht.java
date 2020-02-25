package h05;

import java.applet.Applet;
import java.awt.*;

public class Praktijkopdracht extends Applet {

    public void init() {


    }
    public void paint(Graphics g) {
        setBackground(Color.white);
        g.drawLine(5, 5, 200, 5);
        g.drawString("Lijn", 100, 20);
        g.drawRect(5, 30, 200, 80);
        g.drawString("Rechthoek", 75, 130);
        g.setColor(Color.magenta);
        g.fillRect(210, 30, 200, 80);
        g.setColor(Color.black);
        g.drawOval(210, 30, 200, 80);
        g.drawString("Gevulde rechthoek met ovaal", 225, 130);
        g.setColor(Color.magenta);
        g.fillArc(415, 30, 200, 80, 90, 45);
        g.setColor(Color.black);
        g.drawOval(415, 30, 200, 80);
        g.drawString("Taartpunt met ovaal eromheen", 450, 130);
        g.drawRoundRect(5, 150, 200, 80, 20, 20);
        g.drawString("Afgeronde rechthoek", 25, 250);
        g.setColor(Color.magenta);
        g.fillOval(210, 150, 200, 80);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal", 260, 250);
        g.setColor(Color.black);
        g.drawOval(465, 150, 100, 100);
        g.drawString("Cirkel", 500, 270);





    }

}