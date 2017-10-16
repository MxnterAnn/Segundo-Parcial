package Examen;

import java.awt.event.*;

public class Control5 implements ActionListener, MouseListener {

    Vista5 e;

    public Control5() {
        e = new Vista5();
        e.setVisible(true);
        e.ocultar.addMouseListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

    }

    @Override
    public void mouseClicked(MouseEvent me) {

    }

    @Override
    public void mousePressed(MouseEvent me) {

    }

    @Override
    public void mouseReleased(MouseEvent me) {

    }

    @Override
    public void mouseEntered(MouseEvent me) {
        e.etipal1.setText("");
        e.etipal2.setText("");
        e.etipal3.setText("");
        e.etipal4.setText("");

    }

    @Override
    public void mouseExited(MouseEvent me) {
        e.etipal1.setText("HOLA");
        e.etipal2.setText("AMIX");
        e.etipal3.setText("TE GUSTA");
        e.etipal4.setText("EL KPOP :3");

    }

    public static void main(String[] args) {
        Control5 e = new Control5();
    }
}
