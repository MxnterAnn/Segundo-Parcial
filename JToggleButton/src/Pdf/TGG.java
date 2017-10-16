
package Pdf;

import java.awt.Color;
import javax.swing.*;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.*;

public class TGG extends JFrame {

    JLabel etiPrecioBase, etiTotal;
    JTextField txtPrecioBase;
    JToggleButton tbtnInstalacion, tbtnFormacion, tbtnAlimentacionBD;

    public TGG() {
        this.setTitle("TOGGLEBUTTONS");
        this.setSize(300, 400);
        this.getContentPane().setLayout(new AbsoluteLayout());
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        

        etiPrecioBase = new JLabel("Precio Base");
        this.getContentPane().add(etiPrecioBase, new AbsoluteConstraints                (20, 20, 200, 30));
        txtPrecioBase = new JTextField();
        this.getContentPane().add(txtPrecioBase, new AbsoluteConstraints                (20, 60, 200, 30));
        tbtnInstalacion = new JToggleButton("Instalacion 0");
        this.getContentPane().add(tbtnInstalacion, new AbsoluteConstraints              (20, 100, 200, 30));
        tbtnFormacion = new JToggleButton("Formacion 0");
        this.getContentPane().add(tbtnFormacion, new AbsoluteConstraints                (20, 140, 200, 30));
        tbtnAlimentacionBD = new JToggleButton("AlimentacionBD 0");
        this.getContentPane().add(tbtnAlimentacionBD, new AbsoluteConstraints           (20, 180, 200, 30));
        
        etiTotal = new JLabel();
        this.getContentPane().add(etiTotal, new AbsoluteConstraints                     (20, 220 ,200, 60));
        etiTotal.setBorder(new LineBorder(Color.black));
        etiTotal.setOpaque(true);
        this.setVisible(true);


    }

    public static void main(String[] args) {
        TGG k = new TGG();
        k.setVisible(true);

    }
}
