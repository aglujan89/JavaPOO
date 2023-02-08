    /*
 */
package Entities;

/**
 *
 * @author fitog
 */

//Gestión de vehículos. Se registra la información de cada vehículo asegurado. Marca,
//modelo, año, número de motor, chasis, color, tipo (camioneta, sedán, etc.).
public class Vehiculo {
    
    private String marca;
    private String modelo;
    private Integer ano;
    private Integer numMotor;
    private String chasis;
    private String color;
    private String tipo;
    private Poliza poliza;
    private Cliente cliente;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, Integer ano, Integer numMotor, String chasis, String color, String tipo, Poliza poliza, Cliente cliente) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.numMotor = numMotor;
        this.chasis = chasis;
        this.color = color;
        this.tipo = tipo;
        this.poliza = poliza;
        this.cliente = cliente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Integer getNumMotor() {
        return numMotor;
    }

    public void setNumMotor(Integer numMotor) {
        this.numMotor = numMotor;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Poliza getPoliza() {
        return poliza;
    }

    public void setPoliza(Poliza poliza) {
        this.poliza = poliza;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", numMotor=" + numMotor + ", chasis=" + chasis + ", color=" + color + ", tipo=" + tipo + ", poliza=" + poliza + ", cliente=" + cliente + '}';
    }
    
    
    
    
}
