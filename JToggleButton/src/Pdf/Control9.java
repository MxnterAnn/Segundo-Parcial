package Pdf;

import javafx.beans.value.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Control9 implements ChangeListener {

    Vista9 b;

    public Control9() {
        b = new Vista9();
        b.setVisible(true);
        b.spiValor.addChangeListener(this);
    }

    @Override
    public void stateChanged(ChangeEvent ce) {
        if (ce.getSource() == b.spiValor) {
            b.etiValor.setText("El valor es: " + b.spiValor.getValue().toString());
        }
    }

    public static void main(String[] args) {
        Control9 c = new Control9();
    }
}
