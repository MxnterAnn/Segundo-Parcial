package Pdf;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Control3 implements ListSelectionListener {

    Vista3 f;

    public Control3() {
        f = new Vista3();
        f.setVisible(true);
        f.JLcolores.addListSelectionListener(this);
    }

    @Override
    public void valueChanged(ListSelectionEvent lse) {
        String mensaje;

        if (f.JLcolores.getSelectedIndex() == -1) {
            mensaje = "No hay un color seleccionado.";
        } else {
            mensaje = "El color seleccionado es: " + f.JLcolores.getSelectedValue().toString();
        }
        f.lblResultado.setText(mensaje);

    }

    public static void main(String[] args) {
        Control3 c = new Control3();
    }
}
