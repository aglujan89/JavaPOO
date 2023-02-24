/*
 */
package Entities;

/**
 *
 * @author fitog
 */
//Para las residencias se
//indica la cantidad de habitaciones, 
//si se hacen o no descuentos a los gremios y 
//si posee o no campo deportivo.
public class Residencia extends AlojamientoExtraHotelero {
    private Integer habitaciones;
    private Boolean descuento;
    private Boolean deportivo;

    public Residencia() {
    }

    public Residencia(Integer habitaciones, Boolean descuento, Boolean deportivo) {
        this.habitaciones = habitaciones;
        this.descuento = descuento;
        this.deportivo = deportivo;
    }

    public Residencia(Integer habitaciones, Boolean descuento, Boolean deportivo, Boolean privado, Integer metrosCuadrados) {
        super(privado, metrosCuadrados);
        this.habitaciones = habitaciones;
        this.descuento = descuento;
        this.deportivo = deportivo;
    }

    public Residencia(Integer habitaciones, Boolean descuento, Boolean deportivo, Boolean privado, Integer metrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metrosCuadrados, nombre, direccion, localidad, gerente);
        this.habitaciones = habitaciones;
        this.descuento = descuento;
        this.deportivo = deportivo;
    }

    public Integer getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(Integer habitaciones) {
        this.habitaciones = habitaciones;
    }

    public Boolean getDescuento() {
        return descuento;
    }

    public void setDescuento(Boolean descuento) {
        this.descuento = descuento;
    }

    public Boolean getDeportivo() {
        return deportivo;
    }

    public void setDeportivo(Boolean deportivo) {
        this.deportivo = deportivo;
    }

    @Override
    public String toString() {
        return "Residencia{" + "habitaciones=" + habitaciones + ", descuento=" + descuento + ", deportivo=" + deportivo + '}';
    }
    
    
}
