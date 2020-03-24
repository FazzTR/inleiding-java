package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht2 extends Applet {

    TextField tekstvak;
    double maximaal;
    double minimaal;
    double userInput;
    boolean geklikt;

    public void init() {

        tekstvak = new TextField(20);
        tekstvak.addActionListener(new MaxListener());
        add(tekstvak);




    }

    public void paint(Graphics g) {

        g.drawString("Hoogste cijfer is: " + maximaal, 50, 60);
        g.drawString("Laagste cijfer is: " + minimaal, 50, 80);



    }

    class MaxListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            s = s.replace(',', '.');
            double getal = Double.parseDouble(s);
            if (geklikt == false) {
                maximaal = getal;
                minimaal = getal;
                geklikt = true;
            }
            else {
                if (getal > maximaal) {
                    maximaal = getal;

                }
                if (getal < minimaal) {
                    minimaal = getal;
                }



            }
            repaint();

        }
    }

}
