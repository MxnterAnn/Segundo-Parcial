package Pdf;

import java.awt.Color;
import javax.swing.*;
import org.netbeans.lib.awtextra.*;

public class Vista1 extends JFrame {

    JLabel etiResultado;
    JCheckBox chkPerro, chkGato, chkRaton;

    public Vista1() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Colores");
        this.setSize(500, 500);
        this.getContentPane().setLayout(new AbsoluteLayout());

        chkPerro = new JCheckBox("Perro");
        this.getContentPane().add(chkPerro, new AbsoluteConstraints(10, 20, 100, 20));
        chkGato = new JCheckBox("Gato");
        this.getContentPane().add(chkGato, new AbsoluteConstraints(10, 40, 100, 20));
        chkRaton = new JCheckBox("Raton");
        this.getContentPane().add(chkRaton, new AbsoluteConstraints(10, 60, 100, 20));
        etiResultado = new JLabel("Resultado");
        this.getContentPane().add(etiResultado, new AbsoluteConstraints(150, 10, 100, 20));
        etiResultado = new JLabel();
        this.getContentPane().add(etiResultado, new AbsoluteConstraints(150, 40, 300, 150));
        etiResultado.setBackground(Color.pink);
        etiResultado.setOpaque(true);
    }

    public static void main(String[] args) {
        Vista1 r = new Vista1();
        r.setVisible(true);
    }

}
