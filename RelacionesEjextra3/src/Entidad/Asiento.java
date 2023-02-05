/*
 */
package Entidad;

/**
 *
 * @author fitog
 */
public class Asiento {
    private String nombre;
    private Boolean ocupado;

    public Asiento() {
        ocupado = false;
    }

    public Asiento(String nombre) {
        this.nombre = nombre;
       
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getOcupado() {
        return ocupado;
    }

    public void setOcupado(Boolean ocupado) {
        this.ocupado = ocupado;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
