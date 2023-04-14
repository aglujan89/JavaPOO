/*
 */
package libreria;

import servicios.AutorServicio;
import servicios.LibreriaServicio;
import servicios.LibroServicio;



/**
 *
 * @author fitog
 */
public class Libreria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        alter table nombretabla AUTO_INCREMENT=1
        try {
//            LibroServicio servLib = new LibroServicio();
//            servLib.crearLibro();
           
            LibreriaServicio serv = new LibreriaServicio();
            AutorServicio servA = new AutorServicio();
            System.out.println("Indique los datos del libro a ingresar: ");
            serv.menu();
             
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
       
    }
    
}
