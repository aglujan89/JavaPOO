/*
 */
package Servicio;

import Entidad.Jugador;
import Entidad.Revolver;

/**
 *
 * @author fitog
 */
public class ServicioJugador {
//• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
//mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
//revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
//devuelve true, sino false.
    public boolean disparo (Revolver r, Jugador j){
        ServiceRevolver servRev = new ServiceRevolver();
        if (servRev.mojar(r)){
            j.setMojado(true);
            return true;
        }else{
            servRev.siguienteChorro(r);
        return false;
        }
        
    }
    
}
