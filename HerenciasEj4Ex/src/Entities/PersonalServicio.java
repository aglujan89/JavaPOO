/*
 */
package Entities;

import Enum.EstadoCivil;

/**
 *
 * @author fitog
 */
//Sobre el personal de servicio, hay que conocer a qué sección están asignados
//(biblioteca, decanato, secretaría, ...).
public final class PersonalServicio extends Empleado {
    protected String seccion;

    public PersonalServicio() {
    }

    public PersonalServicio(String seccion) {
        this.seccion = seccion;
    }

    public PersonalServicio(String seccion, Integer anioIncorp, Integer nroDespacho) {
        super(anioIncorp, nroDespacho);
        this.seccion = seccion;
    }

    public PersonalServicio(String seccion, Integer anioIncorp, Integer nroDespacho, String nombre, String apellido, Integer ID, EstadoCivil estadoCivil) {
        super(anioIncorp, nroDespacho, nombre, apellido, ID, estadoCivil);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return "Personal Servicio--> " + nombre + " " + apellido + " "+ "// DNI= " + ID + " // " + estadoCivil + "// Año de ingreso= " + anioIncorp + 
                " // Despacho: " + nroDespacho + " // seccion=" + seccion;
    }
    
    
}
