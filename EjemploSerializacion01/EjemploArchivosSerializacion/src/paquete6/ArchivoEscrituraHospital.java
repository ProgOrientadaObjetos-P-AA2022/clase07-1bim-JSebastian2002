/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete6;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import paquete1.Profesor;
import paquete2.LecturaArchivoSecuencial;


/**
 *
 * @author SALA I
 */
public class ArchivoEscrituraHospital {
   
    private String nombreArchivo;
    private ObjectOutputStream salida; 
    private Profesor registroProfesor;
    private ArrayList<Profesor> listaProfesores;

    public ArchivoEscrituraHospital(String nombreArc) {
        nombreArchivo = nombreArc;
        establecerListaProfesores(); // obtener los valores (objetos)
                                    // que tiene el archivo.
        try // abre el archivo
        {
            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));
            // proceso para ingresar nuevamente los valores del archivo
            if (obtenerListaProfesores().size() > 0) {
                for (int i = 0; i < obtenerListaProfesores().size(); i++) {
                    establecerRegistroProfesor(obtenerListaProfesores().get(i));
                    establecerSalida();
                }
            }
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al abrir el archivo.");
        } // fin de catch
    }
    
    public void establecerNombreArchivo(String n){
        nombreArchivo = n;
    }

    public void establecerRegistroProfesor(Profesor p) {
        registroProfesor = p;
    }

    public void establecerSalida() {
        try {
            salida.writeObject(registroProfesor); // envía el registro como 
                                                  // objeto al archivo
        } catch (IOException ex) {
            System.err.println("Error al escribir en el archivo.");
        }
    }

    // en el atributo listaProfesores obtenemos los registros 
    // del archivo
    public void establecerListaProfesores() {
        LecturaArchivoSecuencial l = 
                new LecturaArchivoSecuencial(obtenerNombreArchivo());
        l.establecerProfesores();
        listaProfesores = l.obtenerProfesores();
    }

    public String obtenerNombreArchivo(){
        return nombreArchivo;
    }
    
    public ArrayList<Profesor> obtenerListaProfesores() {
        return listaProfesores;
    }

    public ObjectOutputStream obtenerSalida(){
        return salida;
    }
    public void cerrarArchivo() {
        try // cierra el archivo
        {
            if (salida != null) {
                salida.close();
            }
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo.");
            
        } // fin de catch
    } 

}

