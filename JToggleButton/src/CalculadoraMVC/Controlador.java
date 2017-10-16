package CalculadoraMVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {

    public static void main(String[] args) {
        Controlador c = new Controlador();

    }
    
    
    
    Vista v;
    int n1 = 0, n2 = 0;

    public Controlador() {
        v = new Vista();
        v.setVisible(true);
        v.btnCalculador.setActionCommand("Calcular");
        v.btnBorrar.setActionCommand("Borrar");
        v.btnCalculador.addActionListener(this);
        v.btnBorrar.addActionListener(this);

    }

    public int esNumero(String x) {
        int n = 0;
        try {
            n = Integer.parseInt(x);
            return n;
        } catch (Exception s) {
            return 0;
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == "Calcular") {
            n1 = esNumero(v.txtNumero1.getText().toString());
            n2 = esNumero(v.txtNumero2.getText().toString());
            v.lblresultado.setText("La suma es: " + (n1 + n2));
        }
        if (e.getActionCommand() == "Borrar") {
            v.txtNumero1.setText("");
            v.txtNumero2.setText("");
            v.lblresultado.setText("");

        }
    }
}
