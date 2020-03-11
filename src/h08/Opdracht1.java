package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht1 extends Applet {

    TextField tekst;
    Button okknop;
    Button resetknop;
    String bericht;

    public void init() {

        setSize(400, 400);

        tekst = new TextField(20);
        add(tekst);
        okknop = new Button("OK");
        okknop.addActionListener(new okknopListener());
        add(okknop);
        resetknop = new Button("RESET");
        resetknop.addActionListener(new resetknopListener());
        add(resetknop);

        bericht = "Jij hebt nog niks getypt.";


    }

    public void paint(Graphics g) {

        g.drawString(bericht, 50, 50);


    }

    class okknopListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            bericht = tekst.getText();
            repaint();
        }
    }

    class resetknopListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            tekst.setText(" ");


        }
    }

}
