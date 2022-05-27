/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.ArrayList;
import paquete1.Profesor;
import paquete1.Calificacion;
import paquete1.LibretaCalificacion;
import paquete1.Empresa;
/**
 *
 * @author reroes
 */
public class ManejoArrayList4 {
    public static void main(String[] args) {
        
        Empresa e1 = new Empresa ("Riot Games", "New York");
        Empresa e2 = new Empresa ("Tony Corp", "Guayaquil");
        Empresa e3 = new Empresa ("Cosmetic", "guayaquil");
        
        System.out.println("-----------------------------");
        
        // ArrayList
        ArrayList <Empresa> emp= new ArrayList<>();
        emp.add(e1);
        emp.add(e2);
        emp.add(e3);

        
        for (int i = 0; i <emp.size(); i++) {
            //nombre del profesor
            //nombre de la materia
            //nota
            System.out.printf("%s - %s\n %.2f",
                    emp.get(i).obtenerNombre(),
                    emp.get(i).obtenerCiudad());
                    
            // Profesor p = profesores2.get(i);
            //  System.out.printf("%s - %s\n",p.obtenerNombre(),
           //p.obtenerTipo());
            
        }  
        }
    }

