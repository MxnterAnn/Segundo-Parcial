package pdf;

import java.awt.Color;
import javax.swing.*;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.*;

public class Vista7 extends JFrame {

    JButton btnCalcular;
    JLabel etiPrecioBase, etiTotal, etiPrecioInstalacion, etiPrecioFormacion, etiPrecioAlimentacionBD;
    JTextField txtPrecioBase;
    JToggleButton tbtnInstalacion, tbtnFormacion, tbtnAlimentacionBD;

    public Vista7() {
        this.setTitle("TOGGLEBUTTONS");
        this.setSize(400, 400);
        this.getContentPane().setLayout(new AbsoluteLayout());

        etiPrecioBase = new JLabel("Precio Base");
        this.getContentPane().add(etiPrecioBase, new AbsoluteConstraints                (20, 20, 200, 20));
        txtPrecioBase = new JTextField();
        this.getContentPane().add(txtPrecioBase, new AbsoluteConstraints                (20, 40, 200, 20));
        tbtnInstalacion = new JToggleButton("Instalacion");
        this.getContentPane().add(tbtnInstalacion, new AbsoluteConstraints              (20, 80, 200, 20));
        tbtnFormacion = new JToggleButton("Formacion");
        this.getContentPane().add(tbtnFormacion, new AbsoluteConstraints                (20, 120, 200, 20));
        tbtnAlimentacionBD = new JToggleButton("AlimentacionBD");
        this.getContentPane().add(tbtnAlimentacionBD, new AbsoluteConstraints           (20, 160, 200, 20));
        
        etiPrecioInstalacion = new JLabel("40");
        this.getContentPane().add(etiPrecioInstalacion, new AbsoluteConstraints         (250, 80, 200, 20));
        etiPrecioFormacion = new JLabel("200");
        this.getContentPane().add(etiPrecioFormacion, new AbsoluteConstraints           (250, 120, 200, 20));
        etiPrecioAlimentacionBD = new JLabel("200");
        this.getContentPane().add(etiPrecioAlimentacionBD, new AbsoluteConstraints      (250, 160, 120, 20));
        
        btnCalcular = new JButton("Calcular");
        this.getContentPane().add(btnCalcular, new AbsoluteConstraints                  (20, 200, 200, 20));
        etiTotal = new JLabel();
        this.getContentPane().add(etiTotal, new AbsoluteConstraints                     (20, 240 ,200, 50));
        etiTotal.setBorder(new LineBorder(Color.black));
        etiTotal.setOpaque(true);


    }

    public static void main(String[] args) {
        Vista7 v = new Vista7();
        v.setVisible(true);

    }
}
