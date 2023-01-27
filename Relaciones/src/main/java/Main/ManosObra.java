/*
 */

package Main;

import Entidad.DNI;
import Entidad.Persona;

/**
 *
 * @author fitog
 */
public class ManosObra {

    public static void main(String[] args) {
        Persona pers = new Persona("Juan","Perez",new DNI("A",3377733));
        System.out.println(pers);
    }
}
