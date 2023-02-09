/*
 */
package Entities;

/**
 *
 * @author fitog
 */
public class Alumno {
    private String nombre;
    private Integer dni;
    private Integer cantVotos;

    public Alumno() {
    }

    public Alumno(String nombre, Integer dni, Integer cantVotos) {
        this.nombre = nombre;
        this.dni = dni;
        this.cantVotos = cantVotos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Integer getCantVotos() {
        return cantVotos;
    }

    public void setCantVotos(Integer cantVotos) {
        this.cantVotos = cantVotos;
    }

    @Override
    public String toString() {
        return nombre + ", dni=" + dni + ", cantVotos=" + cantVotos;
    }
    
    
    
}
