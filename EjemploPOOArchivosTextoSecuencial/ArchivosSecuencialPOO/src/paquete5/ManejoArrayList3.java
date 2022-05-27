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


/**
 *
 * @author reroes
 */
public class ManejoArrayList3 {
    public static void main(String[] args) {
        
                
        Profesor prof1 = new Profesor("Joseph Jimenez", "facturado");
        Profesor prof2 = new Profesor("David Jones", "nombramiento");
        
        
        Calificacion nt = new Calificacion(7.2, "Ciencias Sociales");
        Calificacion nt2 = new Calificacion(8.5, "Literatura");
        
        nt.establecerProfesor(prof1);
        nt.establecerProfesor(prof2);   

        

        
        
        System.out.println("-----------------------------");
        
        // ArrayList
        ArrayList <Calificacion> notas = new ArrayList<>();
        notas.add(nt);
        notas.add(nt2);
        
        for (int i = 0; i < notas.size(); i++) {
            //nombre del profesor
            //nombre de la materia
            //nota
            System.out.printf("%s - %s\n %.2f",
                    notas.get(i).obtenerProfesor().obtenerNombre(),
                    notas.get(i).obtenerNombreMateria(),
                    notas.get(i).obtenerNota());

            // Profesor p = profesores2.get(i);
            //  System.out.printf("%s - %s\n",p.obtenerNombre(),
           //p.obtenerTipo());
            
        }
        
    
        }
    }

