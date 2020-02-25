package h05;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {
    Color opvulkleur;
    Color lijnkleur;
    int height;
    int breedte;

    public void init() {
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
         height = 80;
         breedte = 200;

    }

    public void paint(Graphics g) {

        setBackground(Color.white);
        g.drawLine(5, 5, 200, 5);
        g.drawString("Lijn", 100, 20);
        g.drawRect(5, 30, 200, 80);
        g.drawString("Rechthoek", 75, 130);
        g.setColor(opvulkleur);
        g.fillRect(210, 30, 200, 80);
        g.setColor(lijnkleur);
        g.drawOval(210, 30, 200, 80);
        g.drawString("Gevulde rechthoek met ovaal", 225, 130);
        g.setColor(opvulkleur);
        g.fillArc(415, 30, 200, 80, 90, 45);
        g.setColor(lijnkleur);
        g.drawOval(415, 30, 200, 80);
        g.drawString("Taartpunt met ovaal eromheen", 450, 130);
        g.drawRoundRect(5, 150, 200, 80, 20, 20);
        g.drawString("Afgeronde rechthoek", 25, 250);
        g.setColor(opvulkleur);
        g.fillOval(210, 150, 200, 80);
        g.setColor(lijnkleur);
        g.drawString("Gevulde ovaal", 260, 250);
        g.setColor(lijnkleur);
        g.drawOval(465, 150, 100, 100);
        g.drawString("Cirkel", 500, 270);


    }

}