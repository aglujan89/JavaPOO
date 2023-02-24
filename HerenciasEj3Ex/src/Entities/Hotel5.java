/*
 */
package Entities;

/**
 *
 * @author fitog
 */
public class Hotel5 extends Hotel4{
//Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
//Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
//Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.
    private Integer salones;
    private Integer suites;
    private Integer limosinas;

    public Hotel5() {
    }
    
    
    public Hotel5(Integer salones, Integer suites, Integer limosinas) {
        this.salones = salones;
        this.suites = suites;
        this.limosinas = limosinas;
    }

    public Hotel5(Integer salones, Integer suites, Integer limosinas, Integer habitaciones, Integer camas, Integer pisos, Character gimnasio, String restoran, Integer capRestoran, Double precio) {
        super(habitaciones, camas, pisos, gimnasio, restoran, capRestoran, precio);
        this.salones = salones;
        this.suites = suites;
        this.limosinas = limosinas;
    }

    public Hotel5(Integer salones, Integer suites, Integer limosinas, Integer habitaciones, Integer camas, Integer pisos, Character gimnasio, String restoran, Integer capRestoran, String nombre, String direccion, String localidad, String gerente) {
        super(habitaciones, camas, pisos, gimnasio, restoran, capRestoran, nombre, direccion, localidad, gerente);
        this.salones = salones;
        this.suites = suites;
        this.limosinas = limosinas;
    }

    public Integer getSalones() {
        return salones;
    }

    public void setSalones(Integer salones) {
        this.salones = salones;
    }

    public Integer getSuites() {
        return suites;
    }

    public void setSuites(Integer suites) {
        this.suites = suites;
    }

    public Integer getLimosinas() {
        return limosinas;
    }

    public void setLimosinas(Integer limosinas) {
        this.limosinas = limosinas;
    }




    @Override
    public String toString() {
        return "Hotel5{" + "salones=" + salones + ", suites=" + suites + ", limosinas=" + limosinas + "´precioHab=" + super.getPrecio() + '}';
    }

    @Override
    public void precioHabitacion() {
        
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

        this.precio = (double) 50 + (1 * camas * habitaciones) + (valAgResto) + (valAgGim)+limosinas*15;

    }
   
    
    
    
}
