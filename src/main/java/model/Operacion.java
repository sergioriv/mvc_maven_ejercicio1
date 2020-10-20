/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 * 
 * @author Sergio Rivera
 * @version 1.0
 */
public class Operacion {
    private String numero1;
    private String numero2;

    public String getNumero1() {
        return numero1;
    }

    public void setNumero1(String numero1) {
        this.numero1 = numero1;
    }

    public String getNumero2() {
        return numero2;
    }

    public void setNumero2(String numero2) {
        this.numero2 = numero2;
    }
    
    public String suma(){
        int n = Integer.parseInt(this.numero1);
        int o = Integer.parseInt(this.numero2);
        int s = n+o;
        return " " + s +" ";
    }

    public void co() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
