package Examen;

import java.awt.Color;
import javax.swing.*;
import org.netbeans.lib.awtextra.*;

public class Vista4 extends JFrame {

    JTextField txtNombre, txtCuidad;
    JLabel TxtFrase;
    JButton aceptar, desactivar, activar;

    public Vista4() {
        this.setTitle("Ejercicio 4");
        this.setSize(400, 400);
        this.getContentPane().setLayout(new AbsoluteLayout());
        txtNombre = new JTextField();
        this.getContentPane().add(txtNombre, new AbsoluteConstraints(10, 20, 100, 30));
        txtCuidad = new JTextField();
        this.getContentPane().add(txtCuidad, new AbsoluteConstraints(10, 60, 100, 30));
        TxtFrase = new JLabel();
        this.getContentPane().add(TxtFrase, new AbsoluteConstraints(10, 100, 300, 30));
        TxtFrase.setBackground(Color.white);
        TxtFrase.setOpaque(true);
        aceptar = new JButton("aceptar");
        this.getContentPane().add(aceptar, new AbsoluteConstraints(10, 140, 100, 30));
        desactivar = new JButton("desactivar");
        this.getContentPane().add(desactivar, new AbsoluteConstraints(10, 180, 100, 30));
        activar = new JButton("activar");
        this.getContentPane().add(activar, new AbsoluteConstraints(10, 220, 100, 30));
    }

    public static void main(String[] args) {
        Vista4 d = new Vista4();
        d.setVisible(true);
    }
}
