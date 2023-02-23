/*
 */
package Entities;

/**
 *
 * @author fitog
 */
public final class Polideportivo extends Edificio{
    private String nombre;
    private String tipo;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, String tipo, Integer alto, Integer ancho, Integer largo) {
        super(alto, ancho, largo);
        this.nombre = nombre;
        this.tipo = tipo;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    

    @Override
    public int calcularSuperficie() {
    return alto*ancho;
    }

    @Override
    public int calcularVolumen() {
        return alto*ancho*largo;
    }
    
    
    
}
