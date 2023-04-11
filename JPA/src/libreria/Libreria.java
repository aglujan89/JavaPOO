/*
 */
package libreria;

import servicios.AutorServicio;
import servicios.LibreriaServicio;



/**
 *
 * @author fitog
 */
public class Libreria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            LibreriaServicio serv = new LibreriaServicio();
//            AutorServicio servA = new AutorServicio();
            serv.menu();
             
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
       
    }
    
}
