/*
 */
package Entities;

import Enum.EstadoCivil;

/**
 *
 * @author fitog
 */
//Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
//pertenecen (lenguajes, matemáticas, arquitectura, ...).
public final class Profesor extends Empleado {

    protected String materia;

    public Profesor() {
    }

    public Profesor(String materia) {
        this.materia = materia;
    }

    public Profesor(String materia, Integer anioIncorp, Integer nroDespacho) {
        super(anioIncorp, nroDespacho);
        this.materia = materia;
    }

    public Profesor(String materia, Integer anioIncorp, Integer nroDespacho, String nombre, String apellido, Integer ID, EstadoCivil estadoCivil) {
        super(anioIncorp, nroDespacho, nombre, apellido, ID, estadoCivil);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void cambiarDepto (String materia) {
        this.materia = materia;
    }
    
    @Override
    public String toString() {
        return "Profesor--> " + nombre + " " + apellido + " // DNI= " + ID + " " + estadoCivil + " // Año de ingreso= " + anioIncorp + 
                " // Despacho: " + nroDespacho+ " // materia= " + materia;
    }

    
}
