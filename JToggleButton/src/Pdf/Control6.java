package Pdf;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.event.*;

public class Control6 implements ActionListener {

    Vista6 x;

    public Control6() {
        x = new Vista6();
        x.setVisible(true);
        x.btnPares.addActionListener(this);
        x.btnImpares.addActionListener(this);
        x.cboNumeros.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        if (ae.getSource() == x.btnPares) {
            int i;
            for (i = 0; i < 10; i += 2) {
                modelo.addElement("Nº " + i);
            }
            x.cboNumeros.setModel(modelo);
        }
        if (ae.getSource() == x.btnImpares) {
            int i;
            for (i = 1; i < 10; i += 2) {
                modelo.addElement("Nº " + i);
            }
            x.cboNumeros.setModel(modelo);
        }
        if (ae.getSource() == x.cboNumeros) {
            x.etiResultado.setText(x.cboNumeros.getSelectedItem().toString());
        }

    }

    public static void main(String[] args) {
        Control6 c = new Control6();
    }
}
