package Pdf;

import java.awt.Color;
import static javafx.scene.input.KeyCode.S;
import javax.swing.*;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.*;

public class Vista6 extends JFrame {

    JComboBox cboNumeros;
    JLabel etiResultado;
    JButton btnPares, btnImpares;

    public Vista6() {
        this.setTitle("Combo");
        this.setSize(300, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setLayout(new AbsoluteLayout());

        String[] numerosp = {"0", "2", "4", "6", "8", "10"};
        cboNumeros = new JComboBox(numerosp);
        String[] numerosi = {"1", "3", "5", "7", "9"};
        cboNumeros = new JComboBox(numerosi);
        this.getContentPane().add(cboNumeros, new AbsoluteConstraints(10, 30, 100, 20));
        etiResultado = new JLabel();
        this.getContentPane().add(etiResultado, new AbsoluteConstraints(10, 60, 100, 20));
        etiResultado.setBorder(new LineBorder(Color.pink));
        this.getContentPane().add(etiResultado, new AbsoluteConstraints(10, 90, 100, 20));
        btnPares = new JButton("Pares");
        this.getContentPane().add(btnPares, new AbsoluteConstraints(10, 120, 100, 20));
        btnImpares = new JButton("ImPares");
        this.getContentPane().add(btnImpares, new AbsoluteConstraints(10, 150, 100, 20));
    }

    public static void main(String[] args) {
        Vista6 x = new Vista6();
        x.setVisible(true);
    }

}
