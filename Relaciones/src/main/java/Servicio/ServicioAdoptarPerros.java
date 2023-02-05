/*
 */
package Servicio;

import Entidad.Perro;
import Entidad.Persona;
import static Main.AdoptarPerros.scan;
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

        personas.add(new Persona("Juan", "Perez", 33, null));
        personas.add(new Persona("Pedro", "Gomez", 34, null));
        personas.add(new Persona("Maria", "Suarez", 35, null));
        personas.add(new Persona("Susana", "Romero", 36, null));

        perros.add(new Perro("Chiquito", "calle", 11, "MEDIO",null));
        perros.add(new Perro("Laica", "rottweiller", 8, "Grande",null));
        perros.add(new Perro("Adan", "pastor aleman", 2, "CHICO",null));
        perros.add(new Perro("Eva", "pastor aleman", 5, "MEDIO",null));
        perros.add(new Perro("Pepa", "ovejero", 4, "GRANDE",null));
    }
    
    
    public void adoptar() {
        //recorrer las lista personas para que adopte perro
        for (Persona persona : personas) {
            System.out.println(persona.getApellido() + " Elige el nombre del perro que deseas adoptar.\n");
            System.out.println(perros);
            String nombre = scan.next();
            //verificar que el nombre esta en la lista
            boolean flag = false;
            for (Perro perro : perros) {
                if (perro.getNombre().equalsIgnoreCase(nombre)) {
                    flag = true;
                    break;
                }
            }
            //si el nombre está    
            if (flag) {

                for (Perro perro : perros) {
                    if (perro.getNombre().equalsIgnoreCase(nombre)) {
                        if (perro.getPersona() == null) {
                            perro.setPersona(persona);
                            persona.setPerro(perro);
                        } else {
                            System.out.println(perro.getNombre() + " Ya ha sido adoptado");
                        }
                    }
                }
            // si el nombre del perro no esta en la lista    
            } else {
                System.out.println(nombre + " No esta en la lista de adopcion");
            }
        }
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
