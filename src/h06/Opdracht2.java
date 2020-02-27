package h06;

import java.awt.*;
import java.applet.*;


public class Opdracht2 extends Applet {
    int seconden, urenInSeconden, dagInSeconden, jaarInSeconden;
    int uitkomst1, uitkomst2, uitkomst3;

    public void init() {
        seconden = 60;
        urenInSeconden = 60;
        dagInSeconden = 1440;
        jaarInSeconden = 525600;
        uitkomst1 = seconden * urenInSeconden;
        uitkomst2 = seconden * dagInSeconden;
        uitkomst3 = seconden * jaarInSeconden;
    }

    public void paint(Graphics g) {
        g.drawString("Er zitten in een uur: " + uitkomst1, 20, 20);
        g.drawString("Er zitten in een dag: " + uitkomst2, 20, 40);
        g.drawString("Er zitten in een jaar: " + uitkomst3, 20, 60);
    }
}
