package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht5 extends Applet {

    TextField tekstvak;
    String gemiddelde;
    Double cijfer;


    public void init() {

        tekstvak = new TextField("", 20);
        add(tekstvak);
        tekstvak.addActionListener(new globalListener());
        gemiddelde = "Voer je cijfers in: ";

    }

    public void paint(Graphics g) {

        g.drawString(gemiddelde, 50, 50);

    }

    class globalListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String userInput = tekstvak.getText();
            cijfer = Double.parseDouble(userInput);


            if (cijfer < 5.5) {
                gemiddelde = "onvoldoende";
                repaint(); }

            else if (cijfer > 5.5) {
                gemiddelde = "voldoende";
                repaint();
            }

        }

    }
}