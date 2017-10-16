package Pdf;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.event.*;
public class Control5 implements ActionListener, ListSelectionListener {

    Vista5 v;

    public Control5() {
        v = new Vista5();
        v.setVisible(true);
        v.btnCurso1.addActionListener(this);
        v.btnCurso1.setActionCommand("c1");
        v.btnCurso2.addActionListener(this);
        v.btnCurso2.setActionCommand("c2");
        v.lstNombres.addListSelectionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == "c1") {
            DefaultListModel modelo = new DefaultListModel();
            modelo.addElement("Juan");
            modelo.addElement("Marta");
            modelo.addElement("Luis");
            v.lstNombres.setModel(modelo);
        }
        if (e.getActionCommand() == "c2") {
            DefaultListModel modelo = new DefaultListModel();
            modelo.addElement("Ana");
            modelo.addElement("Marta");
            modelo.addElement("Jose");
            v.lstNombres.setModel(modelo);

        }

    }

    @Override
    public void valueChanged(ListSelectionEvent lse) {
        try {
            v.etiResultado.setText(v.lstNombres.getSelectedValue().toString());
        } catch (Exception x) {
            System.out.println("Algo salio mal");
        }
    }

    public static void main(String[] args) {
        Control5 c = new Control5();
    }

}
