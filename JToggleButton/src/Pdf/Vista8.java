
package Pdf;

import java.awt.Color;
import javax.swing.*;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.*;

public class Vista8 extends JFrame {

    JLabel etiValor;
    JSlider slDeslizador;

    public Vista8() {
        this.setTitle("SLIDERS");
        this.setSize(600, 400);
        this.getContentPane().setLayout(new AbsoluteLayout());

        etiValor = new JLabel();
        this.getContentPane().add(etiValor, new AbsoluteConstraints(30, 150, 400, 40));
        etiValor.setBorder(new LineBorder(Color.black));
        etiValor.setOpaque(true);
        slDeslizador = new JSlider(100, 500);
        this.getContentPane().add(slDeslizador, new AbsoluteConstraints(30, 50, 400, 75));
        slDeslizador.setMajorTickSpacing(50);
        slDeslizador.setPaintTicks(true);
        slDeslizador.setPaintLabels(true);

    }

    public static void main(String[] args) {
        Vista8 n = new Vista8();
        n.setVisible(true);

    }
}
