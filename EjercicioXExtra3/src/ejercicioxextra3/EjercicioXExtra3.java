/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioxextra3;

import Entidad.Pass;
import Servicio.ServicioPass;

/**
 *
 * @author fitog
 */
public class EjercicioXExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioPass serv = new ServicioPass();
        
        Pass u1 = new Pass("adolfo", "123456", 30000003);
            serv.menu(u1);

        
        System.out.println(u1);
    
        
    }
    
}
