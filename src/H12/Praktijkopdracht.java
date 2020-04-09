package H12;

import java.applet.Applet;
import java.awt.*;

public class Praktijkopdracht extends Applet {

    TextField tekstvak1, tekstvak2;
    Button knop;
    int getal;
    String[] namen;

    public void init() {

        tekstvak1 = new TextField("Naam", 20);
        tekstvak2 = new TextField("Nummer", 20);


    }

    public void paint(Graphics g) {

    }
}
