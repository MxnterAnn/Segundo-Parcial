package Examen;

import java.awt.Color;
import javax.swing.*;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class Vista2 extends JFrame {

    JLabel eti2, eti1;
    JButton btnTraspasa1, btnTraspasa2;
    JTextField Txt1;

    public Vista2() {
        this.setTitle("Ejercicio 2");
        this.setSize(500, 500);
        this.getContentPane().setLayout(new AbsoluteLayout());

        eti1 = new JLabel();
        eti1.setBackground(Color.white);
        eti1.setOpaque(true);
        this.getContentPane().add(eti1, new AbsoluteConstraints(10, 20, 150, 20));
        eti2 = new JLabel();
        eti2.setBackground(Color.white);
        eti2.setOpaque(true);

        this.getContentPane().add(eti2, new AbsoluteConstraints(10, 40, 150, 20));
        btnTraspasa1 = new JButton("Traspasa 1");
        this.getContentPane().add(btnTraspasa1, new AbsoluteConstraints(10, 100, 100, 20));
        btnTraspasa2 = new JButton("Traspasa 2");
        this.getContentPane().add(btnTraspasa2, new AbsoluteConstraints(10, 140, 100, 20));
        Txt1 = new JTextField();
        this.getContentPane().add(Txt1, new AbsoluteConstraints(10, 180, 100, 20));

    }

    public static void main(String[] args) {
        Vista2 b = new Vista2();
        b.setVisible(true);

    }

}
