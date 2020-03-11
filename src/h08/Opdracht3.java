package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht3 extends Applet {

    double bedrag;
    TextField tekstvak;


    public void init() {

        tekstvak = new TextField(20);
        tekstvak.addActionListener(new berekenListener());
        add(tekstvak);





    }

    public void paint(Graphics g) {

        g.drawString("Het bedrag is inclusief BTW " + bedrag, 20, 100);







    }

    class berekenListener implements ActionListener {

                public void actionPerformed(ActionEvent e) {
                    String tekst = tekstvak.getText();
                    double userInput = Double.parseDouble(tekst);
                    bedrag = userInput * 1.21;
                    repaint();

        }
    }

}
