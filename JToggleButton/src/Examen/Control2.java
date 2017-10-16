package Examen;

import java.awt.event.*;

public class Control2 implements ActionListener {

    Vista2 v;

    public Control2() {
        v = new Vista2();
        v.setVisible(true);
        v.btnTraspasa1.addActionListener(this);
        v.btnTraspasa2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String Mensaje;
        if (v.btnTraspasa1 == ae.getSource()) {
            Mensaje = v.eti1.toString();
            v.eti1.setText(v.Txt1.getText());
        }
        if (v.btnTraspasa2 == ae.getSource()) {
            Mensaje = v.eti1.toString();
            v.eti2.setText(v.Txt1.getText());
        }

    }

    public static void main(String[] args) {
        Control2 b = new Control2();
    }

}
