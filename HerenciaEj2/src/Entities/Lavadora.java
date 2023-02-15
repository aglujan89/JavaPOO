/*
 */
package Entities;

import static Main.Electrodom.scan;

/**
 *
 * @author fitog
 */
public final class Lavadora extends Electrodomestico{
    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga) {
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

   
    
     public void crearLavadora(){
      super.crearElectrodomestico();
      System.out.println("Indique la carga del lavarropas: ");
      this.carga = scan.nextInt();
     precioFinal();
  }
   
     public void precioFinal(){
    super.getPrecio();
    System.out.println(precio);
    if (carga > 30) {
        super.setPrecio( precio + 500);
    }
    System.out.println("El precio final de su lavadora es: " + precio);
}
     
    
}
