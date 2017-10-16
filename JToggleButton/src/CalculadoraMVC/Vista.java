
package CalculadoraMVC;
import java.awt.Color;
import javax.swing.*;
import org.netbeans.lib.awtextra.*;
public class Vista extends JFrame {
    
    JLabel lbln1, lbln2, lblres, lblresultado;
    JTextField txtNumero1, txtNumero2;
    JButton btnCalculador, btnBorrar;

    public Vista() {
        this.setTitle("Calculadora MVC");
        this.setSize(450, 250);
        this.getContentPane().setLayout(new AbsoluteLayout());
        lbln1=new JLabel("Número 1:");
        this.getContentPane().add(lbln1,new AbsoluteConstraints(10,10,100,20));
          lbln2=new JLabel("Número 2:");
        this.getContentPane().add(lbln2,new AbsoluteConstraints(10,40,100,20));
        txtNumero1=new JTextField();
        this.getContentPane().add(txtNumero1,new AbsoluteConstraints(80,10,100,20));
        txtNumero2=new JTextField();
        this.getContentPane().add(txtNumero2,new AbsoluteConstraints(80,40,100,20));
        btnCalculador=new JButton("Calcular");
        this.getContentPane().add(btnCalculador,new AbsoluteConstraints(10,100,100,20));
        btnBorrar=new JButton("Borrar");
        this.getContentPane().add(btnBorrar,new AbsoluteConstraints(10,130,100,20));
        lblres=new JLabel("Resultado");
        this.getContentPane().add(lblres,new AbsoluteConstraints(200,10,10,20));
        lblresultado=new JLabel();
        this.getContentPane().add(lblresultado,new AbsoluteConstraints(200,10,150,100));
        lblresultado.setBackground(Color.pink);
        lblresultado.setOpaque(true);
    }

    public static void main(String[] amoCECYTEM) {
        Vista v = new Vista();
        v.setVisible(true);
    }
}
