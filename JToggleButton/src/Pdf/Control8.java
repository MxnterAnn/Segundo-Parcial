
package Pdf;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.DefaultListModel;
import javax.swing.event.*;

public class Control8 implements ChangeListener {

    Vista8 n;

    public Control8() {
        n = new Vista8();
        n.setVisible(true);
        n.slDeslizador.addChangeListener(this);

    }

    public static void main(String[] args) {
        Control8 h = new Control8();
    }

    @Override
    public void stateChanged(ChangeEvent ce) {
        n.etiValor.setText("El valor es: " + n.slDeslizador.getValue());

    }
}
