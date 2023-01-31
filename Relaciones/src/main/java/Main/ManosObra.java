/*
 */

package Main;

import Entidad.DNI;
import Entidad.Perro;
import Entidad.Persona;

/**
 *
 * @author fitog
 */
public class ManosObra {

    public static void main(String[] args) {
        
//Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
//pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
//la clase Persona, la información del Perro y de la Persona.

Persona p1 = new Persona("Juan", "Perez", null, new Perro ("chiquito", "beagle", 5, "chiquito"));
Persona p2 = new Persona("Marcos", "Lopez", null, new Perro ("grandote", "grandanes", 5, "grande"));
        
        System.out.println(p1);
        System.out.println("");
        System.out.println(p2);
        
    }
}
