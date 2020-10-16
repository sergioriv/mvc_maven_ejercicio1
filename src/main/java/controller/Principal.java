package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Operacion;
import view.Ventana;

/**
 * 
 * @author Sergio Rivera
 * @version 1.0
 */
public class Principal {
    public static void main(String[] args) {
        Ventana v1 = new Ventana();
        Operacion o = new Operacion(); 
        v1.setVisible(true);
        
        ActionListener e = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                o.setNumero1(v1.txt.getText());
                o.setNumero2(v1.txt2.getText());
                v1.tt.setText(o.suma());
            }
        };
        v1.boton1.addActionListener(e);
    }
}
