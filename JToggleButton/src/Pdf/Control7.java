package pdf;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class Control7 implements ActionListener {

    Vista7 k;

    public Control7() {
        k = new Vista7();
        k.setVisible(true);
        k.btnCalcular.addActionListener(this);

    }

    public static void main(String[] args) {
        Control7 c = new Control7();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == k.btnCalcular) {
            double precio_base;
            double precio_instal; //precio instalacion
            double precio_for; //precio formacion
            double precio_ali; //precio alimentacion

//Recojo datos desde la ventana:
            precio_base = Double.parseDouble(k.txtPrecioBase.getText());
            precio_instal = Double.parseDouble(k.etiPrecioInstalacion.getText());
            precio_for = Double.parseDouble(k.etiPrecioFormacion.getText());
            precio_ali = Double.parseDouble(k.etiPrecioAlimentacionBD.getText());

//Ahora que tengo los datos, puedo hacer calculos.
//Al precio base se le van añadiendo precio de extras
//segun estan o no activados los JToggleButtons
            double precio_total;

            precio_total = precio_base;

            if (k.tbtnInstalacion.isSelected()) { //Si se selecciona instalacion
                precio_total = precio_total + precio_instal;
            }

            if (k.tbtnFormacion.isSelected()) { //Si se selecciona formacion
                precio_total = precio_total + precio_for;
            }

            if (k.tbtnAlimentacionBD.isSelected()) { //Si se selecciona Alimentacion BD
                precio_total = precio_total + precio_ali;
            }

//Finalmente pongo el resultado en la etiqueta
            k.etiTotal.setText(precio_total + " €");

        }

    }

}
