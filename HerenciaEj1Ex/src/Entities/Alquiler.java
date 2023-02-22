/*
 */
package Entities;

import java.time.LocalDate;

/**
 *
 * @author fitog
 */
public class Alquiler {
//En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
//nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
//amarre y el barco que lo ocupará.

    private String nombreCliente;
    private int documento;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private String posicionAmarre;
    private Barco nombreBarco;

    public Alquiler() {
    }

    public Alquiler(String nombreCliente, int documento, LocalDate fechaAlquiler, LocalDate fechaDevolucion, String posicionAmarre, Barco nombreBarco) {
        this.nombreCliente = nombreCliente;
        this.documento = documento;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.nombreBarco = nombreBarco;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(String posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getNombreBarco() {
        return nombreBarco;
    }

    public void setNombreBarco(Barco nombreBarco) {
        this.nombreBarco = nombreBarco;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombreCliente=" + nombreCliente + ", documento=\n" 
                + documento + ", fechaAlquiler=" + fechaAlquiler + ", fechaDevolucion=\n" 
                + fechaDevolucion + ", posicionAmarre=" + posicionAmarre + ", nombreBarco=" + nombreBarco + '}';
    }
    
    

}
