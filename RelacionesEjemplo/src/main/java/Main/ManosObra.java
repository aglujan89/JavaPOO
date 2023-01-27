/*
 *
 */
package Main;

import Entidad.DNI;
import Entidad.Persona;

/**
 *
 * @author fitog
 */
public class ManosObra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona pers = new Persona("Juan","Perez",new DNI("A",3377733));
        System.out.println(pers);
    }
    
}
