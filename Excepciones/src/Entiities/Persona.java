/*
 */
package Entiities;

/**
 *
 * @author fitog
 */
public class Persona {
   private int edad;

    public Persona() {
    }

    public Persona(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void mostrarEdad(){
        System.out.println("La edad es: "+this.edad);
    }
    
    
    
    
    @Override
    public String toString() {
        return "Persona{" + "edad=" + edad + '}';
    }

    
    
    
    
    
}
