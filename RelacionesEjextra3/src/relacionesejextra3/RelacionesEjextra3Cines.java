/*
 */
package relacionesejextra3;

import Servicio.ServicioCine;
import java.util.Scanner;

/**
 *
 * @author fitog
 */
public class RelacionesEjextra3Cines {

    /**
     */
    
    public static Scanner scan = new Scanner(System.in).useDelimiter("\n");
    
    public static void main(String[] args) {
        ServicioCine serv = new ServicioCine();
        serv.crearSala();
        // serv.mostrarSala();
        serv.sentar();
        System.out.println("");
        serv.mostrarSala();
        
    }
   

}
