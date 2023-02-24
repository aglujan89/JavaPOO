/*
 */
package Entities;

/**
 *
 * @author fitog
 */
//Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
//Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.
public class Hotel4 extends Alojamiento {

    protected Integer habitaciones;
    protected Integer camas;
    protected Integer pisos;
    protected Character gimnasio;
    protected String restoran;
    protected Integer capRestoran;
    protected Double precio;

    public Hotel4() {
    }

    public Hotel4(Integer habitaciones, Integer camas, Integer pisos, Character gimnasio, String restoran, Integer capRestoran, Double precio) {
        this.habitaciones = habitaciones;
        this.camas = camas;
        this.pisos = pisos;
        this.gimnasio = gimnasio;
        this.restoran = restoran;
        this.capRestoran = capRestoran;
        this.precio = precio;
    }

    public Hotel4(Integer habitaciones, Integer camas, Integer pisos, Character gimnasio, String restoran, Integer capRestoran, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.habitaciones = habitaciones;
        this.camas = camas;
        this.pisos = pisos;
        this.gimnasio = gimnasio;
        this.restoran = restoran;
        this.capRestoran = capRestoran;
       
    }

    public Integer getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(Integer habitaciones) {
        this.habitaciones = habitaciones;
    }

    public Integer getCamas() {
        return camas;
    }

    public void setCamas(Integer camas) {
        this.camas = camas;
    }

    public Integer getPisos() {
        return pisos;
    }

    public void setPisos(Integer pisos) {
        this.pisos = pisos;
    }

    public Character getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(Character gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getRestoran() {
        return restoran;
    }

    public void setRestoran(String restoran) {
        this.restoran = restoran;
    }

    public Integer getCapRestoran() {
        return capRestoran;
    }

    public void setCapRestoran(Integer capRestoran) {
        this.capRestoran = capRestoran;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Hotel4{" + "habitaciones=" + habitaciones + ", camas=" + camas + ", pisos=" + pisos + ", gimnasio=" + gimnasio + ", restoran=" + restoran + ", capRestoran=" + capRestoran + ", precio=" + precio + '}';
    }

    @Override
    public void precioHabitacion() {
//El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
//asio) + (valor agregado por limosinas).PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
//agregado por gimnasio) + (valor agregado por limosinas).
        Integer valAgResto;
        Integer valAgGim;

        if (capRestoran < 30) {
            valAgResto = 10;
        } else if (capRestoran < 50 && capRestoran >= 30) {
            valAgResto = 30;
        } else {
            valAgResto = 50;
        }

        if (gimnasio == 'a') {
            valAgGim = 50;
        } else {
            valAgGim = 30;
        }

        this.precio = (double) 50 + (1 * camas * habitaciones) + (valAgResto) + (valAgGim);

    }

 

}
