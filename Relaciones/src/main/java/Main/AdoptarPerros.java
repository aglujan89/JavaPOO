/*
 */
package Main;

import Servicio.ServicioAdoptarPerros;
import java.util.Scanner;

/**
 *
 * @author fitog
 */
public class AdoptarPerros {

    /**
     */
   public Scanner scan = new Scanner (System.in).useDelimiter("\n");
            
    public static void main(String[] args) {
        
        ServicioAdoptarPerros serv = new ServicioAdoptarPerros();
        serv.cargarListas();
        System.out.println("--------------Personas-------------");
        serv.mostrarPersonas();
        System.out.println("--------------Perros--------------");
        serv.mostrarPerros();
        
        
    }
    
}
