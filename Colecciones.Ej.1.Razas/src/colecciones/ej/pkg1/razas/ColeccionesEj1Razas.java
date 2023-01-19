/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones.ej.pkg1.razas;

import Servicio.ServicioPerro;

/**
 *
 * @author fitog
 */
public class ColeccionesEj1Razas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        ServicioPerro servPerro = new ServicioPerro();
      
        servPerro.crearPerro();        
        servPerro.mostrarMascotas();
        
        //-------------------
        //EjercicioN2
        
        servPerro.eliminarPerro();
        servPerro.mostrarMascotas();
    }
    
}
