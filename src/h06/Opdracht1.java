package h06;

import java.awt.*;
import java.applet.*;


public class Opdracht1 extends Applet {
    int a, b, uitkomst;

    public void init() {
        a = 113;
        b = 4;
        uitkomst = a / b;
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
    }
}
