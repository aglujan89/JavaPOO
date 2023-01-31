/*
 */
package Main;

import Entidad.Juego;
import Servicio.ServicioJuego;

/**
 *
 * @author fitog
 */
public class Ejercicio2Ruleta {

    /**
     * @param args the command line arguments
     */
    
    
    
//Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
//del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
//tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.

//• toString(): muestra información del revolver (posición actual y donde está el agua)
    
    public static void main(String[] args) {
//       Revolver rev = new Revolver();
//       ServiceRevolver servRev = new ServiceRevolver();
//       servRev.llenarRevolver(rev);
//       System.out.println(rev);
ServicioJuego serv = new ServicioJuego();
Juego juego = serv.llenarJuego();
serv.ronda(juego);

    }
    
}
