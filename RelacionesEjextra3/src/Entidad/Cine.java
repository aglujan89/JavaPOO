/*
 */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author fitog
 */

//De Cine nos interesa conocer la película que se está reproduciendo, la
//sala con los espectadores y el precio de la entrada.
public class Cine {
        private Pelicula pelicula;
        private ArrayList<Asiento> asientos = new ArrayList<>();
        private Float precio;        

    public Cine() {
    }

    public Cine(Pelicula pelicula, Float precio) {
        this.pelicula = pelicula;
        this.precio = precio;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public ArrayList<Asiento> getAsientos() {
        return asientos;
    }

    public void setAsientos(ArrayList<Asiento> asientos) {
        this.asientos = asientos;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Cine{" + "pelicula=" + pelicula + ", asientos=" + asientos + ", precio=" + precio + '}';
    }

   
    
        
    
}
