/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioxextra4;

import Entidad.Fecha;
import Servicio.ServicioFecha;

/**
 *
 * @author fitog
 */
public class EjercicioxExtra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioFecha serv = new ServicioFecha();
        Fecha f = new Fecha();
        
        serv.crearFecha(f);
        serv.conocerDias(f);
        serv.diaAnterior(f);
        serv.diaPosterior(f);
        serv.añoBisiesto(f);
        System.out.println(f);
    }
    
}
