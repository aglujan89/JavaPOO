/*
 */
package Servicio;

import Entidad.Revolver;

/**
 *
 * @author fitog
 */
public class ServiceRevolver {
    
    //• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
//deben ser aleatorios.
    public void llenarRevolver (Revolver r){
        r.setPosAcutal((int)(Math.random()*6)+1);
        r.setPosAgua((int)(Math.random()*6)+1);
                }
    
    //• mojar(): devuelve true si la posición del agua coincide con la posición actual
public boolean mojar(Revolver r){
    return (r.getPosAcutal()==r.getPosAgua());
}
    
//• siguienteChorro(): cambia a la siguiente posición del tambor

public void siguienteChorro (Revolver r){
    if (r.getPosAcutal()==6) {
        r.setPosAcutal(1);
        
    }else{
        r.setPosAcutal(r.getPosAcutal()+1);
    }
}

}
