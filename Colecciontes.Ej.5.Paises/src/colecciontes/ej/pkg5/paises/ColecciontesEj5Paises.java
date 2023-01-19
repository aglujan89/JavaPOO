/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciontes.ej.pkg5.paises;

import Servicio.ServicioPaises;

/**
 *
 * @author fitog
 */
public class ColecciontesEj5Paises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioPaises serv = new ServicioPaises();
        serv.cargarPaises();
        serv.mostrarPaises();
        serv.buscarPais();
        
    }
    
}
