/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones.ej.pkg3.alumno;

import Servicio.ServicioAlumno;

/**
 *
 * @author fitog
 */
public class ColeccionesEj3Alumno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioAlumno serv = new ServicioAlumno();
        
        serv.ingresoAlumnos();
        serv.mostrarAlumnos();
        serv.notafinal();
    }
    
}
