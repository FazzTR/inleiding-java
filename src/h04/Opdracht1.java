package h04;

    import java.awt.*;
    import java.applet.*;

    public class Opdracht1 extends Applet {

        public void init() {
        }

        public void paint(Graphics g) {
            setBackground(Color.blue);
            g.setColor(Color.yellow);
            g.drawLine(200, 120, 250, 200);
            g.drawLine(200, 120, 300, 120);
            g.drawLine(300, 120, 250, 200);


        }
    }



