/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extrareloj;

import Entidad.Reloj;
import ServicioReloj.ServicioReloj;

/**
 *
 * @author fitog
 */
public class Extrareloj {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        Reloj rel = new Reloj();
        ServicioReloj sr = new ServicioReloj();

        sr.crearReloj(rel);
        sr.imprimirHora(rel);
        
        
    }
    
}
