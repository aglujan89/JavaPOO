/*
 */
package Entities;

import Enum.EstadoCivil;

/**
 *
 * @author fitog
 */
//Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de
//identificación y su estado civil.
public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected Integer ID;
    protected EstadoCivil estadoCivil;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer ID, EstadoCivil estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ID = ID;
        this.estadoCivil = estadoCivil;
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

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
    public void cambioEstadoCivil(EstadoCivil estadoCivil){
        this.estadoCivil = estadoCivil;
        System.out.println("Ha cambiado su estado civil a: "+estadoCivil);
    }
    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", ID=" + ID + ", estadoCivil=" + estadoCivil + '}';
    }

    
            
}
