/*
 */
package Entities;

import Enum.EstadoCivil;
import java.util.ArrayList;

/**
 *
 * @author fitog
 */
//En cuanto a los estudiantes, se requiere almacenar el curso en el que están
//matriculados.
public class Estudiante extends Persona{
    protected ArrayList<String> curso;

    public Estudiante() {
    }

    public Estudiante(ArrayList<String> curso) {
        this.curso = new ArrayList();
    }

    public Estudiante(ArrayList<String> curso, String nombre, String apellido, Integer ID, EstadoCivil estadoCivil) {
        super(nombre, apellido, ID, estadoCivil);
        this.curso = curso;
    }

    public ArrayList<String> getCurso() {
        return curso;
    }

    public void setCurso(ArrayList<String> curso) {
        this.curso = curso;
    }

   

    @Override
    public String toString() {
        return "Estudiante--> " + nombre + " " + apellido + " // DNI= " + ID + " // " + estadoCivil + " // curso= " + curso;
    }
    
}
