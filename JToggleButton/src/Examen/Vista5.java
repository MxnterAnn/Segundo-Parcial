package Examen;

import java.awt.Color;
import javax.swing.*;
import org.netbeans.lib.awtextra.*;

public class Vista5 extends JFrame {

    JLabel etipal1, etipal2, etipal3, etipal4, ocultar;

    public Vista5() {
        this.setTitle("Ejercicio 5");
        this.setSize(300, 300);
        this.getContentPane().setLayout(new AbsoluteLayout());
        etipal1 = new JLabel();

        this.getContentPane().add(etipal1, new AbsoluteConstraints(10, 10, 100, 30));
        etipal1.setBackground(Color.white);
        etipal1.setOpaque(true);
        etipal2 = new JLabel();
        this.getContentPane().add(etipal2, new AbsoluteConstraints(10, 40, 100, 30));
        etipal2.setBackground(Color.white);
        etipal2.setOpaque(true);
        etipal3 = new JLabel();
        this.getContentPane().add(etipal3, new AbsoluteConstraints(10, 80, 100, 30));
        etipal3.setBackground(Color.white);
        etipal3.setOpaque(true);
        etipal4 = new JLabel();

        this.getContentPane().add(etipal4, new AbsoluteConstraints(10, 120, 100, 30));
        etipal4.setBackground(Color.white);
        etipal4.setOpaque(true);

        ocultar = new JLabel();
        this.getContentPane().add(ocultar, new AbsoluteConstraints(10, 160, 100, 30));
        ocultar.setBackground(Color.white);
        ocultar.setOpaque(true);
    }

    public static void main(String[] args) {
        Vista5 e = new Vista5();
        e.setVisible(true);
    }

}
