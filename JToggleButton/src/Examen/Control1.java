package Examen;

import java.awt.event.*;

public class Control1 implements ActionListener {

    Vista1 a;

    public Control1() {
        a = new Vista1();
        a.setVisible(true);
        a.btnVisuNombre.addActionListener(this);
        a.btnOcultarNombre.addActionListener(this);
        a.btnVisuCuidad.addActionListener(this);
        a.btnOcultarCuidad.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (a.btnVisuNombre == ae.getSource()) {

            a.etiNombre.setVisible(true);

        }
        if (a.btnOcultarNombre == ae.getSource()) {

            a.etiNombre.setVisible(false);
        }
        if (a.btnVisuCuidad == ae.getSource()) {
            a.etiCuidad.setVisible(true);
        }
        if (a.btnOcultarCuidad == ae.getSource()) {

            a.etiCuidad.setVisible(false);
        }

    }

    public static void main(String[] args) {
        Control1 a = new Control1();
    }

}
