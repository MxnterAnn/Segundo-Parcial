package Examen;

import java.awt.Color;
import javax.swing.*;
import org.netbeans.lib.awtextra.*;

public class Vista1 extends JFrame {

    JLabel etiNombre, etiCuidad;
    JButton btnOcultarNombre, btnVisuNombre, btnOcultarCuidad, btnVisuCuidad;

    public Vista1() {
        this.setTitle("Ejercicio 1");
        this.setSize(500, 500);
        this.getContentPane().setLayout(new AbsoluteLayout());
        etiNombre = new JLabel("Oh Sehun");
        this.getContentPane().add(etiNombre, new AbsoluteConstraints(10, 30, 120, 30));
        etiNombre.setBackground(Color.white);
        etiNombre.setOpaque(true);
        etiCuidad = new JLabel("Seúl");
        this.getContentPane().add(etiCuidad, new AbsoluteConstraints(10, 60, 120, 30));
        etiCuidad.setBackground(Color.white);
        etiCuidad.setOpaque(true);
        btnOcultarNombre = new JButton("Ocultar Nombre");
        this.getContentPane().add(btnOcultarNombre, new AbsoluteConstraints(10, 100, 150, 30));
        btnVisuNombre = new JButton("Ver Nombre");
        this.getContentPane().add(btnVisuNombre, new AbsoluteConstraints(10, 140, 150, 30));
        btnOcultarCuidad = new JButton("Ocultar Cuidad");
        this.getContentPane().add(btnOcultarCuidad, new AbsoluteConstraints(10, 180, 150, 30));
        btnVisuCuidad = new JButton("Ver Cuidad");
        this.getContentPane().add(btnVisuCuidad, new AbsoluteConstraints(10, 220, 150, 30));
    }

    public static void main(String[] args) {
        Vista1 a = new Vista1();
        a.setVisible(true);
    }

}
