/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * 
 * @author Sergio Varon
 * @version 1.0
 */
public class Ventana extends JFrame{
    
    public JPanel panel;
    public JButton boton1;
    public JTextField txt;
    public JTextField txt2;
    public JLabel tt;
    
    public Ventana(){
        setSize(200,200);
        setTitle("Suma");
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(200,200));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        iniciarComponente();
        txtBox();
        boton();
    }
    
    private void iniciarComponente(){
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        
        tt = new JLabel("SUMA");
        tt.setBounds(75,10,50,40);
        panel.add(tt);
    }
    
    private void txtBox(){
        txt = new JTextField();
        txt.setBounds(40,50,50,30);
        
        txt2 = new JTextField();
        txt2.setBounds(100,50,50,30);
        
        panel.add(txt);
        panel.add(txt2);
    }
    
    private void boton(){
        boton1 = new JButton("Sumar");
        boton1.setBounds(53,100,80,30);
        panel.add(boton1);
    }
}
