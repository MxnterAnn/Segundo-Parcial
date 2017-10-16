package Pdf;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Control2 implements ActionListener {

    Vista2 b;

    public Control2() {
        b = new Vista2();
        b.setVisible(true);
        b.optAzul.addActionListener(this);
        b.optVerde.addActionListener(this);
        b.optRojo.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String mensaje = "Color elegido: ";

        if (b.optRojo.isSelected()) {
            mensaje = mensaje + "Rojo";
        } else if (b.optVerde.isSelected()) {
            mensaje = mensaje + "Verde";
        } else if (b.optAzul.isSelected()) {
            mensaje = mensaje + "Azul";
        }

        b.etiResultado.setText(mensaje);
    }

    public static void main(String[] args) {
        Control2 c = new Control2();
    }
}
