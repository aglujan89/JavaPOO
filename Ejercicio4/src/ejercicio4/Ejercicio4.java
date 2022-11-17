/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import entidad.rectangulo;
import rectanguloServicio.rectanguloServicio;

/**
 *
 * @author fitog
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        rectanguloServicio recserv = new rectanguloServicio();
//        rectangulo rec = new rectangulo();
        rectangulo rec = recserv.crearRectangulo();
        System.out.println("La superficie es: "+ recserv.superficie(rec));
        System.out.println("");
        System.out.println("el perimetro es: "+recserv.perimetro(rec));
        System.out.println("");
        
        recserv.dibujarRectangulo(rec);
    }
    
}
