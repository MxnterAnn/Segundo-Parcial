package Pdf;

import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class Control10 implements AdjustmentListener {

    Vista10 ab;

    public Control10() {
        ab = new Vista10();
        ab.setVisible(true);
        ab.desValor.addAdjustmentListener(this);
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent ae) {
        if (ae.getSource() == ab.desValor) {
            ab.etiValor.setText("El valor es: " + ab.desValor.getValue());
        }

    }

    public static void main(String[] args) {
        Control10 c = new Control10();
    }
}
