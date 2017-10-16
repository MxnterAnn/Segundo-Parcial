package Pdf;

import java.awt.Color;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import org.netbeans.lib.awtextra.*;

public class Vista4 extends JFrame {

    JLabel etiresultado;
    JComboBox cboColores;

    public Vista4() {
        this.setTitle("");
        this.setSize(500, 500);
        this.getContentPane().setLayout(new AbsoluteLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        String[] colores = {"Verde", "Azul", "Rojo"};
        cboColores = new JComboBox(colores);
        this.getContentPane().add(cboColores, new AbsoluteConstraints(70, 40, 100, 50));

        etiresultado = new JLabel();
        this.getContentPane().add(etiresultado, new AbsoluteConstraints(200, 30, 170, 60));
        etiresultado.setBackground(Color.pink);
        etiresultado.setOpaque(true);
    }

    public static void main(String[] args) {
        Vista4 aa = new Vista4();
        aa.setVisible(true);
    }
}
