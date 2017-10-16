package Examen;

import java.awt.event.*;

public class Control4 implements ActionListener {

    Vista4 d;

    public Control4() {
        d = new Vista4();
        d.setVisible(true);
        d.activar.addActionListener(this);
        d.desactivar.addActionListener(this);
        d.aceptar.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (d.aceptar == ae.getSource()) {
            d.TxtFrase.setText("Usted se llama: " + d.txtNombre.getText() + "y vive en: " + d.txtCuidad.getText());
        }
        if (d.desactivar == ae.getSource()) {
            d.txtNombre.setEnabled(false);
            d.txtCuidad.setEnabled(false);
        }
        if (d.activar == ae.getSource()) {
            d.txtNombre.setEnabled(true);
            d.txtCuidad.setEnabled(true);
        }

    }

    public static void main(String[] args) {
        Control4 d = new Control4();
    }
}
