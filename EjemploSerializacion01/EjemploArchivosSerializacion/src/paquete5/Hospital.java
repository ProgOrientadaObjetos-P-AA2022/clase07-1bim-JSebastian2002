/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Hospital implements Serializable{
    String nombre;
    int numeroCamas;
    double presupuesto;
    
public Hospital (String nb, int nmc, double pre) {
        nb = nombre;
        nmc = numeroCamas;
        pre = presupuesto;
        
    }
    public void establecerNombre(String n) {
         nombre = n;
    }

    public void establecerNumerocamas(int n) {
        numeroCamas = n;
    }
    
    public void establecerPresupuesto(double n) {
        presupuesto = n;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerNumerocamas() {
        return numeroCamas;
    }
    
    public double obtenerPresupuesto() {
        return presupuesto;
    }

}
