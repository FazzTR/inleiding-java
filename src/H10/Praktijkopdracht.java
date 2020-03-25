package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht extends Applet {

    TextField tekstvak;
    String gemiddelde;
    int cijfer;


    public void init() {

        tekstvak = new TextField("", 20);
        add(tekstvak);
        tekstvak.addActionListener(new globalListener());
        gemiddelde = "Voer uw cijfers in astublieft";

    }

    public void paint(Graphics g) {

        g.drawString(gemiddelde, 50, 50);

    }

    class globalListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String userInput = tekstvak.getText();
            cijfer = Integer.parseInt(userInput);


            switch (cijfer) {

                case 1:
                case 2:
                case 3:
                    gemiddelde = "slecht"; repaint(); break;
                case 4:
                    gemiddelde = "onvoldoende"; repaint(); break;
                case 5:
                    gemiddelde = "matig"; repaint(); break;
                case 6:
                case 7:
                    gemiddelde = "voldoende"; repaint(); break;
                case 8:
                case 9:
                case 10:
                    gemiddelde = "goed"; repaint(); break;
            }
        }
    }






}