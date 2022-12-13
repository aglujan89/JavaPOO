/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author fitog
 */

//Crear una clase Pass, donde declaremos los siguientes atributos:
//● pass : Del tipo String
//● nombre: Del tipo String
//● dni: Del tipo int.


public class Pass {
    private String nombre;
    private String pass;
    private int dni;

    public Pass() {
    }

    public Pass(String nombre, String pass, int dni) {
        this.nombre = nombre;
        this.pass = pass;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Pass{" + "nombre=" + nombre + ", pass=" + pass + ", dni=" + dni + '}';
    }
    
    
    
    
}
