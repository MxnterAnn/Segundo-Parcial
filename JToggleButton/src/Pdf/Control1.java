package Pdf;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Control1 implements ActionListener {

    Vista1 v;

    public Control1() {
        v = new Vista1();
        v.setVisible(true);
        v.chkPerro.addActionListener(this);
        v.chkGato.addActionListener(this);
        v.chkRaton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        String mensaje = "Animales elegidos: ";
        if (v.chkPerro.isSelected()) {
            mensaje = mensaje + "Perro ";
        }

        if (v.chkGato.isSelected()) {
            mensaje = mensaje + "Gato ";
        }

        if (v.chkRaton.isSelected()) {
            mensaje = mensaje + "Raton ";
        }

        v.etiResultado.setText(mensaje);

    }

    public static void main(String[] args) {
        Control1 c = new Control1();

    }

}
