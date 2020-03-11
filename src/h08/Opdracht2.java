package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht2 extends Applet {

    Button manknop, vrouwknop, jongensknop, meisjesknop;
    TextField tekst;
    int aantalMannen, aantalVrouwen, aantalJongens, aantalMeisjes, totaal;

        public void init() {

            setSize(600, 600);

            //GETALLEN
            aantalMannen = 0;
            aantalVrouwen = 0;
            aantalJongens = 0;
            aantalMeisjes = 0;
            totaal = 0;
            //KNOPPEN
            tekst = new TextField(20);
            add(tekst);
            manknop = new Button("Mannen");
            manknop.addActionListener(new manknopListener());
            add(manknop);
            vrouwknop = new Button("Vrouwen");
            vrouwknop.addActionListener(new vrouwknopListener());
            add(vrouwknop);
            jongensknop = new Button("Jongens");
            jongensknop.addActionListener(new jongensknopListener());
            add(jongensknop);
            meisjesknop = new Button("Meisjes");
            meisjesknop.addActionListener(new meisjesknopListener());
            add(meisjesknop);







    }

       public void paint(Graphics g) {

            g.drawString("Aantal mannen zijn " + aantalMannen, 20, 100);
            g.drawString("Aantal vrouwen zijn " + aantalVrouwen, 20, 120);
            g.drawString("Aantal jongens zijn " + aantalJongens, 20, 140);
            g.drawString("Aantal meisjes zijn " + aantalMeisjes, 20, 160);
           g.drawString("Het totale is " + totaal, 20, 180);




    }

    class manknopListener implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                aantalMannen++;
                totaal++;
                repaint();

        }
    }

    class vrouwknopListener implements ActionListener {

                public void actionPerformed(ActionEvent e) {
                    aantalVrouwen++;
                    totaal++;
                    repaint();

        }
    }

    class jongensknopListener implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                aantalJongens++;
                totaal++;
                repaint();
            }
    }

    class meisjesknopListener implements ActionListener {

                public void actionPerformed(ActionEvent e) {
                    aantalMeisjes++;
                    totaal++;
                    repaint();
        }
    }

}
