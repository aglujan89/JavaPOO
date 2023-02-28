/*
 */
package Entities;

import Enum.EstadoCivil;

/**
 *
 * @author fitog
 */
//Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
//incorporación a la facultad y qué número de despacho tienen asignado.
public class Empleado extends Persona{
    
    protected Integer anioIncorp;
    protected Integer nroDespacho;

    public Empleado() {
    }

    public Empleado(Integer anioIncorp, Integer nroDespacho) {
        this.anioIncorp = anioIncorp;
        this.nroDespacho = nroDespacho;
    }

    public Empleado(Integer anioIncorp, Integer nroDespacho, String nombre, String apellido, Integer ID, EstadoCivil estadoCivil) {
        super(nombre, apellido, ID, estadoCivil);
        this.anioIncorp = anioIncorp;
        this.nroDespacho = nroDespacho;
    }

    public Integer getAnioIncorp() {
        return anioIncorp;
    }

    public void setAnioIncorp(Integer anioIncorp) {
        this.anioIncorp = anioIncorp;
    }

    public Integer getNroDespacho() {
        return nroDespacho;
    }

    public void setNroDespacho(Integer nroDespacho) {
        this.nroDespacho = nroDespacho;
    }

    public void cambioNroDespacho(Integer nroDespacho){
        this.nroDespacho = nroDespacho;
        System.out.println("Su numero de despacho es: "+nroDespacho);        
    }
    
    @Override
    public String toString() {
        return "Empleado{" + "anioIncorp=" + anioIncorp + ", nroDespacho=" + nroDespacho + '}';
    }
    
    
    
}
