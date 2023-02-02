/*
 */
package Entidad;

/**
 *
 * @author fitog
 */
public class Perro {
    private String nombre;
    private String raza;
    private Integer edad;
    private String tam;
    private Persona persona;

    public Perro() {
    }

    public Perro(String nombre, String raza, Integer edad, String tam, Persona persona) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tam = tam;
        this.persona = persona;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getTam() {
        return tam;
    }

    public void setTam(String tam) {
        this.tam = tam;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    
    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", tam=" + tam + ", persona=" + persona + '}';
    }

    
    
    
   
    
    
    
    
}
