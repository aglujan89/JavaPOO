/*
 */
package Entities;

import java.util.ArrayList;
import java.util.Date;
import Enum.cantCuotas;

/**
 *
 * @author fitog
 */


//Se registrará una póliza, donde se guardará los datos tanto de un
//vehículo, como los datos de un solo cliente. Los datos incluidos en ella son: número de
//póliza, fecha de inicio y fin de la póliza, cantidad de cuotas, forma de pago, monto total
//asegurado, incluye granizo, monto máximo granizo, tipo de cobertura (total, contra
//terceros, etc.). Nota: prestar atención al principio de este enunciado y pensar en las
//relaciones entre clases. Recuerden que pueden ser de uno a uno, de uno a muchos, de
//muchos a uno o de muchos a muchos.


public class Poliza {
    
    private Vehiculo vehiculo;
    private Cliente cliente;
    private ArrayList<Cuota> cuotas;
    private Integer numPoliza;
    private cantCuotas cantCuota;
    private Date fechaInicio;
    private Date fechaFin;
    private Integer cantCuotas;
    private String formaPagoPoliza;
    private Float sumaAsegurada;
    private Boolean granizo;
    private Float sumaGranizo;
    private String cobertura;

    public Poliza() {
    }

    public Poliza(Vehiculo vehiculo, Cliente cliente, ArrayList<Cuota> cuotas, Integer numPoliza, cantCuotas cantCuota, Date fechaInicio, Date fechaFin, Integer cantCuotas, String formaPagoPoliza, Float sumaAsegurada, Boolean granizo, Float sumaGranizo, String cobertura) {
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.cuotas = cuotas;
        this.numPoliza = numPoliza;
        this.cantCuota = cantCuota;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cantCuotas = cantCuotas;
        this.formaPagoPoliza = formaPagoPoliza;
        this.sumaAsegurada = sumaAsegurada;
        this.granizo = granizo;
        this.sumaGranizo = sumaGranizo;
        this.cobertura = cobertura;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Cuota> getCuotas() {
        return cuotas;
    }

    public void setCuotas(ArrayList<Cuota> cuotas) {
        this.cuotas = cuotas;
    }

    public Integer getNumPoliza() {
        return numPoliza;
    }

    public void setNumPoliza(Integer numPoliza) {
        this.numPoliza = numPoliza;
    }

    public cantCuotas getCantCuota() {
        return cantCuota;
    }

    public void setCantCuota(cantCuotas cantCuota) {
        this.cantCuota = cantCuota;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Integer getCantCuotas() {
        return cantCuotas;
    }

    public void setCantCuotas(Integer cantCuotas) {
        this.cantCuotas = cantCuotas;
    }

    public String getFormaPagoPoliza() {
        return formaPagoPoliza;
    }

    public void setFormaPagoPoliza(String formaPagoPoliza) {
        this.formaPagoPoliza = formaPagoPoliza;
    }

    public Float getSumaAsegurada() {
        return sumaAsegurada;
    }

    public void setSumaAsegurada(Float sumaAsegurada) {
        this.sumaAsegurada = sumaAsegurada;
    }

    public Boolean getGranizo() {
        return granizo;
    }

    public void setGranizo(Boolean granizo) {
        this.granizo = granizo;
    }

    public Float getSumaGranizo() {
        return sumaGranizo;
    }

    public void setSumaGranizo(Float sumaGranizo) {
        this.sumaGranizo = sumaGranizo;
    }

    public String getCobertura() {
        return cobertura;
    }

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }

    @Override
    public String toString() {
        return "Poliza{" + "vehiculo=" + vehiculo + ", cliente=" + cliente + ", cuotas=" + cuotas + ", numPoliza=" + numPoliza + ", cantCuota=" + cantCuota + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", cantCuotas=" + cantCuotas + ", formaPagoPoliza=" + formaPagoPoliza + ", sumaAsegurada=" + sumaAsegurada + ", granizo=" + granizo + ", sumaGranizo=" + sumaGranizo + ", cobertura=" + cobertura + '}';
    }
    
    
    
}
