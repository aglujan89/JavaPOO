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

   
    
     public void crearLavadora(Lavadora lava){
      super.crearElectrodomestico(lava);
      System.out.println("Indique la carga del lavarropas: ");
      lava.setCarga(scan.nextInt());
     precioFinal(lava);
  }
   
     public void precioFinal(Lavadora lava){
    lava.getPrecio();
    System.out.println(lava.getPrecio());
    if (carga > 30) {
        lava.setPrecio(lava.getPrecio()+ 500);
    }
    System.out.println("El precio final de su lavadora es: " + lava.getPrecio());
}

    @Override
    public String toString() {
        return "Lavadora{" + "carga=" + carga + '}';
    }
     
    
}
