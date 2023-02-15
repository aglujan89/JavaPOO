/*
 */
package Entities;

import Enum.Color;
import static Main.Electrodom.scan;

/**
 *
 * @author fitog
 */
public final class Televisor extends Electrodomestico{
    private int pulgadas;
    private boolean sintonizador;

    public Televisor() {
    }

    public Televisor(int pulgadas, boolean sintonizador) {
        this.pulgadas = pulgadas;
        this.sintonizador = sintonizador;
    }

    public Televisor(int pulgadas, boolean sintonizador, double precio, Color color, char consumo, int peso) {
        super(precio, color, consumo, peso);
        this.pulgadas = pulgadas;
        this.sintonizador = sintonizador;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }
    
    public void crearTele(Televisor tele){
        super.crearElectrodomestico(tele);
      System.out.println("Indique las pulgadas del TV: ");
      this.pulgadas = scan.nextInt();
        System.out.println("Indique si posee sintonizador: S/N");
        String respuesta = scan.next();
        this.sintonizador = respuesta.equalsIgnoreCase("s");
        precioFinal();
    }
    
    public void precioFinal(){
        super.getPrecio();
        if (pulgadas>40) {
            this.precio = (precio*1.3);
        }
        if (sintonizador) {
            this.precio = precio+500;
        }
        System.out.println("El precio final del TV es: "+ precio);
    }

    @Override
    public String toString() {
        return "Televisor{" + "pulgadas=" + pulgadas + ", sintonizador=" + sintonizador + '}';
    }
    
}
