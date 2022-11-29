/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra2;

import Entidad.Puntos;
import Servicio.SerivicioPuntos;

/**
 *
 * @author fitog
 */
public class EjercicioExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Puntos p = new Puntos();
        SerivicioPuntos serv = new SerivicioPuntos();
        serv.crearPuntos(p);
        System.out.println(p);
        System.out.println("La distancia entre los puntos es: " + serv.distanciaPuntos(p));
    }
    
}
