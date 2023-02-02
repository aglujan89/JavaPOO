/*
 */
package Servicio;

import Entidad.Perro;
import Entidad.Persona;
import java.util.ArrayList;

/**
 *
 * @author fitog
 */



public class ServicioAdoptarPerros {
    
    private ArrayList<Persona> personas;
    private ArrayList<Perro> perros;

    public ServicioAdoptarPerros() {
        this.perros = new ArrayList();
        this.personas = new ArrayList();
        
    }

    public void cargarListas() {

        personas.add(new Persona("Juan", "PErez", null, null));
        personas.add(new Persona("Pedro", "Gomez", null, null));
        personas.add(new Persona("Maria", "Suarez", null, null));
        personas.add(new Persona("Susana", "Romero", null, null));

        perros.add(new Perro("chiquito", "calle", 11, "MEDIO",personas.get(1)));
        perros.add(new Perro("laica", "rottweiller", 8, "Grande",null));
        perros.add(new Perro("simon", "caniche", 2, "CHICO",null));
        perros.add(new Perro("CHICHO", "bulldog", 5, "MEDIO",null));
        perros.add(new Perro("pepa", "ovejero", 4, "GRANDE",null));
    }
    
    public void mostrarPersonas() {
        for (Persona persona : personas) {
            System.out.println(persona);

        }
        }
    public void mostrarPerros() {
        for (Perro perro : perros) {
            System.out.println(perro);

        }
        }
        
        
}
