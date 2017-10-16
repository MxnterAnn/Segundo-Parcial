package Examen;

import java.awt.event.*;

public class Control3 implements ActionListener, KeyListener {

    Vista3 c;

    public Control3() {
        c = new Vista3();
        c.setVisible(true);
        c.btnVaciar.addActionListener(this);
        c.txtTexto.addKeyListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (c.btnVaciar == ae.getSource()) {
            c.etiTexto.setText("");
            c.txtTexto.setText("");
        }

    }

    @Override
    public void keyTyped(KeyEvent ke) {

    }

    @Override
    public void keyPressed(KeyEvent ke) {
        c.etiTexto.setText(c.txtTexto.getText());
    }

    @Override
    public void keyReleased(KeyEvent ke) {

    }

    public static void main(String[] args) {
        Control3 c = new Control3();

    }
}
