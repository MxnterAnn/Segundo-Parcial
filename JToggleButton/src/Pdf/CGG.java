
package Pdf;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class CGG implements ActionListener {

    TGG k;

    public CGG() {
        k = new TGG();
        k.tbtnAlimentacionBD.addActionListener(this);
        k.tbtnFormacion.addActionListener(this);
        k.tbtnInstalacion.addActionListener(this);

    }

    public double esNumero(String txt) {
        double x;
        try {
            x = Double.parseDouble(txt);
        } catch (Exception e) {
            x = 0;
        }
        return x;

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        double precio_base;
        double precio_instal; //precio instalacion
        double precio_for; //precio formacion
        double precio_ali; //precio alimentacion

//Recojo datos desde la ventana:
        precio_base = esNumero(k.txtPrecioBase.getText());
        precio_instal = 40;
        precio_for = 200;
        precio_ali = 200;

//Ahora que tengo los datos, puedo hacer calculos.
//Al precio base se le van añadiendo precio de extras
//segun estan o no activados los JToggleButtons
        double precio_total;

        precio_total = precio_base;

        if (k.tbtnInstalacion.isSelected()) { //Si se selecciona instalacion
            precio_total = precio_total + precio_instal;
            k.tbtnInstalacion.setText("Instalacion 40");
        }else{
            k.tbtnInstalacion.setText("Instalacion 0");
        }

        if (k.tbtnFormacion.isSelected()) { //Si se selecciona formacion
            precio_total = precio_total + precio_for;
            k.tbtnFormacion.setText("Formación 200");
        }else{
            k.tbtnFormacion.setText("Formación 0");
        }

        if (k.tbtnAlimentacionBD.isSelected()) { //Si se selecciona Alimentacion BD
            precio_total = precio_total + precio_ali;
            k.tbtnAlimentacionBD.setText("Alimentacion DB 200");
        }else{
            k.tbtnAlimentacionBD.setText("Aimentacion DB 0");
        }

//Finalmente pongo el resultado en la etiqueta
        k.etiTotal.setText(precio_total + " €");

    }

    public static void main(String[] args) {
        CGG c = new CGG();
    }
}
