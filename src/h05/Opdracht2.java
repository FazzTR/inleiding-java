package h05;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {
    int hoogteXas;
    int jeroen;
    int valerie;
    int hans;

    public void init() {
        setSize(400, 400);
        hoogteXas = 300;
        jeroen = 100;
        valerie = 40;
        hans = 80;

    }

    public void paint(Graphics g) {
        g.drawLine(50, hoogteXas, 250, hoogteXas);
        g.drawLine(250, 200, 250, hoogteXas);
        g.drawLine(50, 200, 50, hoogteXas);
        g.drawRect(60, hoogteXas - jeroen, 10, jeroen);
        g.drawRect(140, hoogteXas - valerie, 10, valerie);
        g.drawRect(230, hoogteXas - hans, 10, hans);
        g.drawString("0KG", 5, hoogteXas);
        g.drawString("50KG", 5, 250);
        g.drawString("100KG", 5, 200);


    }


}
