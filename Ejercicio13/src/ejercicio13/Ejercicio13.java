/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;

import Entidad.Curso;
import Servicio.ServicioCurso;

/**
 *
 * @author fitog
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Curso cur= new Curso();
        ServicioCurso serv = new ServicioCurso();
        serv.crearCurso(cur);
        System.out.println(cur);
        System.out.println("Ganancias: "+serv.calcularGananciaSemanal(cur));
    }
    
}
