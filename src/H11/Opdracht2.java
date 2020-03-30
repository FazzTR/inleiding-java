package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {

        int teller = 10;
        int x = 50;
        int y = 70;

        while (teller < 20) {
            g.drawString("" + teller, x, y);
            teller++;
            y += 20;
        }


    }
}
