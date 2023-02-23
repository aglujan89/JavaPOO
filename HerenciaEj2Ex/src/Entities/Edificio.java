/*
 */
package Entities;

/**
 *
 * @author fitog
 */
public abstract class Edificio {
//    Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo.
    protected Integer alto;
    protected Integer ancho;
    protected Integer largo;

    public Edificio() {
    }

    public Edificio(Integer alto, Integer ancho, Integer largo) {
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
    }

    public Integer getAlto() {
        return alto;
    }

    public void setAlto(Integer alto) {
        this.alto = alto;
    }

    public Integer getAncho() {
        return ancho;
    }

    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }

    public Integer getLargo() {
        return largo;
    }

    public void setLargo(Integer largo) {
        this.largo = largo;
    }
    
    protected abstract int calcularSuperficie();
    protected abstract int calcularVolumen();

    @Override
    public String toString() {
        return "Edificio{" + "alto=" + alto + ", ancho=" + ancho + ", largo=" + largo + '}';
    }
    
    
    
}
