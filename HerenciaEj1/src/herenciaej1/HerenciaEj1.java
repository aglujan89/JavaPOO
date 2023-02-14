/*
 */
package herenciaej1;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

/**
 *
 * @author fitog
 */
public class HerenciaEj1 {

    /**
     * @param args the command line arguments
     */
    
//Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
//La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
//Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
//mensaje por pantalla informando de que se alimenta.
    
    public static void main(String[] args) {
        
        Animal p1 = new Perro("Cacho", "Doghi", 3, "Doberman");
        p1.alimentarAnimal();
        System.out.println("-------------------------------------------");
       Animal p2 = new Perro("Bobi", "DogChaw", 1, "Pitbull");
       p2.alimentarAnimal();
        System.out.println("-------------------------------------------");
       Animal g1 = new Gato(5,"Loli", "Pajaritos", 2, "Callejera");
       g1.alimentarAnimal();
        System.out.println("-------------------------------------------");
       Animal c1 = new Caballo("Tornado", "Maiz", 6, "Criollo");
       c1.alimentarAnimal();
    }
    
}
