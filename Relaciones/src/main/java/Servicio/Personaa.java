/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 * Persona con atributos: nombre, apellido, edad, documento y Perro.
 *
 * @author Kidver
 */
public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private int DNI;
    private  Perro perro;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, int DNI) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.DNI = DNI;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "nombre: " + nombre + " " + apellido + ", edad=" + edad + ", DNI=" + DNI + "\n"
                + "Datos del perro: " + perro + "\n";
    }

}//end
