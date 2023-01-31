/*
 * 
 */
package Entidad;

/**
 *
 * @author fitog
 */
public class Persona {
    private String nombre;
    private String apellido;
    private DNI dni;
    private Perro perro;

    public Persona() {
    }

    public Persona(String nombre, String apellido, DNI dni, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.perro = perro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public DNI getDni() {
        return dni;
    }

    public void setDni(DNI dni) {
        this.dni = dni;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", perro=" + perro + '}';
    }
   

   
    
}
