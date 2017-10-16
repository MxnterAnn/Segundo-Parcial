package Pdf;

import java.awt.Color;
import javax.swing.*;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.*;

public class Vista9 extends JFrame {

    JSpinner spiValor;
    JLabel etiValor;

    public Vista9() {
        this.setTitle("SPINNER");
        this.setSize(200, 200);
        this.getContentPane().setLayout(new AbsoluteLayout());
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        spiValor = new JSpinner();
        this.getContentPane().add(spiValor, new AbsoluteConstraints(30, 50, 100, 40));
        etiValor = new JLabel();
        this.getContentPane().add(etiValor, new AbsoluteConstraints(30, 100, 100, 40));
        etiValor.setBorder(new LineBorder(Color.black));
        etiValor.setOpaque(true);

    }
    public static void main(String[] args) {
        Vista9 b=new Vista9();
        b.setVisible(true);
    }

}
