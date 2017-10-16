package Examen;

import java.awt.Color;
import javax.swing.*;
import org.netbeans.lib.awtextra.*;

public class Vista3 extends JFrame {

    JTextField txtTexto;
    JLabel etiTexto;
    JButton btnVaciar;

    public Vista3() {
        this.setTitle("Ejercicio 3");
        this.setSize(300, 300);
        this.getContentPane().setLayout(new AbsoluteLayout());
        txtTexto = new JTextField("");
        this.getContentPane().add(txtTexto, new AbsoluteConstraints(10, 20, 100, 30));
        etiTexto = new JLabel("");
        this.getContentPane().add(etiTexto, new AbsoluteConstraints(10, 60, 100, 30));

        etiTexto.setBackground(Color.white);
        etiTexto.setOpaque(true);
        btnVaciar = new JButton("Vaciar");
        this.getContentPane().add(btnVaciar, new AbsoluteConstraints(10, 100, 100, 30));

    }

    public static void main(String[] args) {
        Vista3 c = new Vista3();
        c.setVisible(true);

    }

}
