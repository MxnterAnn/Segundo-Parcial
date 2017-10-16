package Pdf;

import java.awt.Color;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class Vista10 extends JFrame {

    JScrollBar desValor;
    JLabel etiValor;

    public Vista10() {
        this.setTitle("SCROLLBARS");
        this.setSize(300, 300);
        this.getContentPane().setLayout(new AbsoluteLayout());
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        desValor = new JScrollBar(JScrollBar.HORIZONTAL);
        this.getContentPane().add(desValor, new AbsoluteConstraints(30, 50, 200, 20));
        desValor.setMinimum(50);
        desValor.setMaximum(150);
        desValor.setUnitIncrement(2);
        desValor.setBlockIncrement(20);
        desValor.setVisibleAmount(5);

        etiValor = new JLabel();
        this.getContentPane().add(etiValor, new AbsoluteConstraints(30, 150, 200, 20));
        etiValor.setBorder(new LineBorder(Color.black));
        etiValor.setOpaque(true);
    }

    public static void main(String[] args) {
        Vista10 ab = new Vista10();
        ab.setVisible(true);

    }

}
