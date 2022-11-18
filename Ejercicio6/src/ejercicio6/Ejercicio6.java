/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import Cafetera.Cafetera;
import ServicioCafetera.ServicioCafetera;

/**
 *
 * @author fitog
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioCafetera serv = new ServicioCafetera();
        Cafetera c1 = serv.crearCafetera();
        
        
        System.out.println("  ");
        serv.llenarCafetera(c1);
        System.out.println("  ");
        serv.servirTaza(c1);
        System.out.println("  ");
        serv.vaciarCafetera(c1);
        System.out.println("  ");
        serv.agregarCafe(c1);
        
    }
    
}
