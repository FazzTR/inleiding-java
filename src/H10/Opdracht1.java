package H10;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdracht1 extends Applet {

    TextField tekstvak;
    int maxInput;


    public void init() {

        tekstvak = new TextField(20);
        MaxinputListener mi = new MaxinputListener();
        tekstvak.addActionListener(mi);
        add(tekstvak);






    }


    public void paint(Graphics g) {

        g.drawString("Hoogste getal: " + maxInput, 50, 60);



    }

    class MaxinputListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            int getal = Integer.parseInt(s);
            if (getal > maxInput) {
                maxInput = getal;
                repaint();
            }
        }
    }

}