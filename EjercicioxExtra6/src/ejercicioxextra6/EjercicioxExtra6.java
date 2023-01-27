/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioxextra6;

import Entidad.Sopa;
import Servicio.ServicioSopa;

/**
 *
 * @author fitog
 */
public class EjercicioxExtra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Sopa sopa1 = new Sopa();
        ServicioSopa serv = new ServicioSopa();
        
        serv.crearMatriz(sopa1);
        serv.mostrarMatriz(sopa1);
        serv.inicilizarMatriz(sopa1);
        System.out.println("------------------------------------------------");
        serv.mostrarMatriz(sopa1);
        serv.buscarPalabra(sopa1);
        System.out.println("------------------------------------------------");
        serv.mostrarMatriz(sopa1);
   
    }
    
}
