/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4extra;

import Entidad.NIF;
import Servicio.ServicioNIF;

/**
 *
 * @author fitog
 */
public class Ejercicio4Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NIF n = new NIF();
        ServicioNIF serv = new ServicioNIF();
        serv.crearNif(n);
        serv.mostrar(n);
    }
    
}
