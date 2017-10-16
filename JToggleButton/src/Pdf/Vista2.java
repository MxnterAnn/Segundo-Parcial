package Pdf;

import java.awt.Color;
import javax.swing.*;
import org.netbeans.lib.awtextra.*;

public class Vista2 extends JFrame {

    JLabel etiResultado;
    JRadioButton optAzul, optRojo, optVerde;
    ButtonGroup Grupo;

    public Vista2() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Colores");
        this.setSize(500, 500);
        this.getContentPane().setLayout(new AbsoluteLayout());

        optAzul = new JRadioButton("Azul");
        this.getContentPane().add(optAzul, new AbsoluteConstraints(10, 10, 100, 20));
        optRojo = new JRadioButton("Rojo");
        this.getContentPane().add(optRojo, new AbsoluteConstraints(10, 40, 100, 20));
        optVerde = new JRadioButton("Verde");
        this.getContentPane().add(optVerde, new AbsoluteConstraints(10, 60, 100, 20));
        etiResultado = new JLabel("Resultado");
        this.getContentPane().add(etiResultado, new AbsoluteConstraints(150, 10, 100, 20));
        etiResultado = new JLabel();
        this.getContentPane().add(etiResultado, new AbsoluteConstraints(150, 40, 300, 150));
        etiResultado.setBackground(Color.pink);
        etiResultado.setOpaque(true);
        Grupo = new ButtonGroup();
        Grupo.add(optAzul);
        Grupo.add(optRojo);
        Grupo.add(optVerde);
    }

    public static void main(String[] amoCECYTEM) {
        Vista2 b = new Vista2();
        b.setVisible(true);
    }
}
