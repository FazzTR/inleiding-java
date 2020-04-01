package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht3 extends Applet {

    int a, b, uitkomst, y;

    public void init() {






    }

    public void paint(Graphics g) {

        a = 0;
        b = 1;
        uitkomst = a + b;
        y = 50;


        for (int i = 0; i < 10; i++) {
            g.drawString (uitkomst + "", 50, y);
            y += 20;
            a = b;
            b = uitkomst;
            uitkomst = a + b;


        }







    }
}
