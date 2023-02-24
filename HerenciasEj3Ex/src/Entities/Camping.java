/*
 */
package Entities;

/**
 *
 * @author fitog
 */

//Para los Camping se indica la capacidad máxima de carpas, 
//la cantidad de baños disponibles y 
//si posee o no un restaurante dentro de las instalaciones.
public class Camping extends AlojamientoExtraHotelero {
    private Integer carpas;
    private Integer banos;
    private Boolean resto;

    public Camping() {
    }

    public Camping(Integer carpas, Integer banos, Boolean resto) {
        this.carpas = carpas;
        this.banos = banos;
        this.resto = resto;
    }

    public Camping(Integer carpas, Integer banos, Boolean resto, Boolean privado, Integer metrosCuadrados) {
        super(privado, metrosCuadrados);
        this.carpas = carpas;
        this.banos = banos;
        this.resto = resto;
    }

    public Camping(Integer carpas, Integer banos, Boolean resto, Boolean privado, Integer metrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metrosCuadrados, nombre, direccion, localidad, gerente);
        this.carpas = carpas;
        this.banos = banos;
        this.resto = resto;
    }

    public Integer getCarpas() {
        return carpas;
    }

    public void setCarpas(Integer carpas) {
        this.carpas = carpas;
    }

    public Integer getBanos() {
        return banos;
    }

    public void setBanos(Integer banos) {
        this.banos = banos;
    }

    public Boolean getResto() {
        return resto;
    }

    public void setResto(Boolean resto) {
        this.resto = resto;
    }

    @Override
    public String toString() {
        return "Camping{" + "carpas=" + carpas + ", banos=" + banos + ", resto=" + resto + '}';
    }
    
    
}
