/*
 */
package Entities;


import Enum.formPago;
import java.util.Date;

/**
 *
 * @author fitog
 */


//Gestión de cuotas:Se registrarán y podrán consultar las cuotas generadas en cada póliza.
//Esas cuotas van a contener la siguiente información: número de cuota, monto total de la
//cuota, si está o no pagada, fecha de vencimiento, forma de pago (efectivo, transferencia,
//etc.).

public class Cuota {
    
 
    private Float totalCuota;
    private Boolean pagada;
    private Date fechaVencimiento;
    private formPago formPagoCuota;

    public Cuota() {
    }

    public Cuota(Float totalCuota, Boolean pagada, Date fechaVencimiento, formPago formPagoCuota) {
        this.totalCuota = totalCuota;
        this.pagada = pagada;
        this.fechaVencimiento = fechaVencimiento;
        this.formPagoCuota = formPagoCuota;
    }

    public Float getTotalCuota() {
        return totalCuota;
    }

    public void setTotalCuota(Float totalCuota) {
        this.totalCuota = totalCuota;
    }

    public Boolean getPagada() {
        return pagada;
    }

    public void setPagada(Boolean pagada) {
        this.pagada = pagada;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public formPago getFormPagoCuota() {
        return formPagoCuota;
    }

    public void setFormPagoCuota(formPago formPagoCuota) {
        this.formPagoCuota = formPagoCuota;
    }

    @Override
    public String toString() {
        return "Cuota{" + "totalCuota=" + totalCuota + ", pagada=" + pagada + ", fechaVencimiento=" + fechaVencimiento + ", formPagoCuota=" + formPagoCuota + '}';
    }
    
    
    
}
