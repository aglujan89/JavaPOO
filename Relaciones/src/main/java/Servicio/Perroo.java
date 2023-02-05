/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 * Perro, que tendrá como atributos: nombre, raza, edad y tamaño;
 *
 * @author Kidver
 */
public class Perro {
    private String nombre;
    private String raza;
    private String tamaño;
    private Persona persona;

    public Perro() {
    }

    public Perro(String nombre, String raza, String tamaño) {
        this.nombre = nombre;
        this.raza = raza;
        this.tamaño = tamaño;
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

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return " nombre: " + nombre + ", raza: " + raza + " " + tamaño + "\n";
    }
    
    

}//end
