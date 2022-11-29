/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

import Entidad.Persona;
import Servicio.ServicioPersona;

/**
 *
 * @author fitog
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Persona per = new Persona ();
      ServicioPersona serv = new ServicioPersona();
      serv.crearPersona(per);
        System.out.println("");
        System.out.println("La edad es: "+serv.calcularEdad(per));
        System.out.println("");
        serv.mostrarPersona(per);
    }
    
}
