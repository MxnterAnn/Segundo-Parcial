package Pdf;

import java.awt.Color;
import javax.swing.*;
import org.netbeans.lib.awtextra.*;

public class Vista3 extends JFrame {

    JLabel resultado, lblResultado, mensaje;
    JList JLcolores;

    public Vista3() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("itsColores");
        this.setSize(500, 500);
        this.getContentPane().setLayout(new AbsoluteLayout());

        Object x[] = new Object[3];
        x[0] = "Rojo";
        x[1] = "Azul";
        x[2] = "Verde";
        JLcolores = new JList(x);
        this.getContentPane().add(JLcolores, new AbsoluteConstraints(70, 10, 100, 100));

        lblResultado = new JLabel();
        this.getContentPane().add(lblResultado, new AbsoluteConstraints(200, 30, 200, 60));
        lblResultado.setBackground(Color.pink);
        lblResultado.setOpaque(true);
    }

    public static void main(String[] args) {
        Vista3 f = new Vista3();
        f.setVisible(true);
    }
}
