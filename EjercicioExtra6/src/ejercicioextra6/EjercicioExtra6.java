/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra6;

import Entidad.Ahorcado;
import Servicio.ServicioAhorcado;


/**
 *
 * @author fitog
 */
public class EjercicioExtra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ahorcado ah = new Ahorcado();
       ServicioAhorcado serv = new ServicioAhorcado();
       serv.juego(ah);
    } 
    
}
