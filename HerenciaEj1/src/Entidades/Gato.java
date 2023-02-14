/*
 */
package Entidades;

/**
 *
 * @author fitog
 */
public class Gato extends Animal{
protected int vidas;

    public Gato() {
    }

    public Gato(int vidas) {
        this.vidas = vidas;
    }

    public Gato(int vidas, String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
        this.vidas = vidas;
    }

 
    

    
}
