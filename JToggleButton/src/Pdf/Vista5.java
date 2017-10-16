package Pdf;

import java.awt.Color;
import javax.swing.*;
import org.netbeans.lib.awtextra.*;

public class Vista5 extends JFrame {

    JButton btnCurso1, btnCurso2;
    JLabel etiResultado;
    JComboBox cboColores;
    JList lstNombres;

    public Vista5() {
        this.setTitle("");
        this.setSize(500, 500);
        this.getContentPane().setLayout(new AbsoluteLayout());

        lstNombres = new JList();

        this.getContentPane().add(lstNombres, new AbsoluteConstraints(10, 10, 100, 100));

        btnCurso1 = new JButton("Curso 1");
        this.getContentPane().add(btnCurso1, new AbsoluteConstraints(10, 200, 90, 20));

        btnCurso2 = new JButton("Curso 2");
        this.getContentPane().add(btnCurso2, new AbsoluteConstraints(10, 230, 90, 20));

        etiResultado = new JLabel();
        this.getContentPane().add(etiResultado, new AbsoluteConstraints(150, 20, 300, 40));

        etiResultado.setBackground(Color.red);
        etiResultado.setOpaque(true);

    }

    public static void main(String[] args) {
        Vista5 bb = new Vista5();
        bb.setVisible(true);

    }
}
