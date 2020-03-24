package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht extends Applet {

    Button plus, min, keer, deel;
    TextField tekstvak1, tekstvak2;
    Double eersteGetal, tweedeGetal;


    public void init() {

        setSize(500, 500);

        tekstvak1 = new TextField(20);
        add(tekstvak1);
        tekstvak2 = new TextField(20);
        add(tekstvak2);

        plus = new Button("+");
        plus.addActionListener(new plusListener());
        add(plus);
        min = new Button("-");
        min.addActionListener(new minListener());
        add(min);
        keer = new Button("*");
        keer.addActionListener(new keerListener());
        add(keer);
        deel = new Button("/");
        deel.addActionListener(new deelListener());
        add(deel);





    }

    public void paint(Graphics g) {



    }

    class plusListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String A = tekstvak1.getText();
            double getalA = Double.parseDouble(A);
            String B = tekstvak2.getText();
            double getalB = Double.parseDouble(B);
            double uitkomst = getalA + getalB;
            tekstvak1.setText(String.valueOf(uitkomst));
            tekstvak2.getText();


        }
    }

    class minListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String A = tekstvak1.getText();
            double getalA = Double.parseDouble(A);
            String B = tekstvak2.getText();
            double getalB = Double.parseDouble(B);
            double uitkomst = getalA - getalB;
            tekstvak1.setText(String.valueOf(uitkomst));
            tekstvak2.getText();


        }
    }

    class keerListener implements  ActionListener {

        public void actionPerformed(ActionEvent e) {
            String A = tekstvak1.getText();
            double getalA = Double.parseDouble(A);
            String B = tekstvak2.getText();
            double getalB = Double.parseDouble(B);
            double uitkomst = getalA * getalB;
            tekstvak1.setText(String.valueOf(uitkomst));
            tekstvak2.getText();


        }
    }

    class deelListener implements  ActionListener {

        public void actionPerformed(ActionEvent e) {
            String A = tekstvak1.getText();
            double getalA = Double.parseDouble(A);
            String B = tekstvak2.getText();
            double getalB = Double.parseDouble(B);
            double uitkomst = getalA / getalB;
            tekstvak1.setText(String.valueOf(uitkomst));
            tekstvak2.getText();


        }
    }

}
