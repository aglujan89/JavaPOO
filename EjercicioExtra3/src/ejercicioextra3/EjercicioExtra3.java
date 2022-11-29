/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra3;

import Entidad.Raices;
import Servicio.ServicioRaices;

/**
 *
 * @author fitog
 */
public class EjercicioExtra3 {

    /**
     * @param args the command line arguments
     */
    
//Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
//ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
//Hay que insertar estos 3 valores para construir el objeto a través de un método
//constructor. Luego, las operaciones que se podrán realizar son las siguientes:
    
    public static void main(String[] args) {
        Raices r = new Raices();
        ServicioRaices serv = new ServicioRaices();
        serv.crearRaices(r);
        serv.calcular(r);
        
    }
    
}
