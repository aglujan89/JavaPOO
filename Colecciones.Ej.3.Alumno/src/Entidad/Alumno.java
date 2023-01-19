/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Arrays;

/**
 *
 * @author fitog
 */
public class Alumno {
    private String nombre;
    private Integer[] notas;

    public Alumno() {
        this.notas = new Integer[3];
    }

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer[] getNotas() {
        return notas;
    }

    public void setNotas(Integer[] notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", notas=" + Arrays.toString(notas) + '}';
    }
    
    
}
