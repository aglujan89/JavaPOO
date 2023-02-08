/*
 */
package Entities;

import java.util.ArrayList;

/**
 *
 * @author fitog
 */


//Gestión Integral de clientes. En este módulo vamos a registrar la información personal de
//cada cliente que posea pólizas en nuestra empresa. Nombre y apellido, documento, mail,
//domicilio, teléfono.

public class Cliente {
private String nombre;
private Integer dni;
private String mail;
private String domicilio;
private Integer telefono;
private ArrayList<Vehiculo> vehiculos;
private ArrayList<Poliza> polizas;

    public Cliente() {
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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public ArrayList<Poliza> getPolizas() {
        return polizas;
    }

    public void setPolizas(ArrayList<Poliza> polizas) {
        this.polizas = polizas;
    }

    public Cliente(String nombre, Integer dni, String mail, String domicilio, Integer telefono, ArrayList<Vehiculo> vehiculos, ArrayList<Poliza> polizas) {
        this.nombre = nombre;
        this.dni = dni;
        this.mail = mail;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.vehiculos = vehiculos;
        this.polizas = polizas;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", dni=" + dni + ", mail=" + mail + ", domicilio=" + domicilio + ", telefono=" + telefono + ", vehiculos=" + vehiculos + ", polizas=" + polizas + '}';
    }

    
}
