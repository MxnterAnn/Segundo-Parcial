package Pdf;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Control11 implements ActionListener {

    Vista11 n;

    public Control11() {
        n = new Vista11();
        n.setVisible(true);
        n.ClrAzul.addActionListener(this);
        n.ClrRojo.addActionListener(this);
        n.ClrVerde.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == n.ClrRojo) {
            n.getContentPane().setBackground(Color.RED);

        }
        if (ae.getSource() == n.ClrAzul) {
            n.getContentPane().setBackground(Color.BLUE);

        }
        if (ae.getSource() == n.ClrVerde) {
            n.getContentPane().setBackground(Color.GREEN);

        }

    }

    public static void main(String[] args) {
        Control11 c = new Control11();
    }

}
