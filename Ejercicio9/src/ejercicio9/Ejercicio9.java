/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import Entidad.Matematica;
import Servicio.ServicioMatematica;

/**
 *
 * @author fitog
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matematica m1 = new Matematica();
        ServicioMatematica matServ = new ServicioMatematica();
        matServ.crearMatematica (m1);
        System.out.println(m1);
        System.out.println("El mayor es: "+matServ.devolverMayor(m1));
        System.out.println("La potencia del mayor elevado al menor es: "+matServ.calcularPotencia(m1));
        System.out.println("La raiz cuadrada del menor es: "+matServ.calcularRaiz(m1));
               
    }
    
}
