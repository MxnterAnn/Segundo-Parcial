package Pdf;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Control4 implements ActionListener {

    Vista4 aa;

    public Control4() {
        aa = new Vista4();
        aa.setVisible(true);
        aa.cboColores.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String mensaje = "El color elegido es ";

        mensaje = mensaje + aa.cboColores.getSelectedItem().toString();
        aa.etiresultado.setText(mensaje);
    }

    public static void main(String[] args) {
        Control4 c = new Control4();
    }

}
