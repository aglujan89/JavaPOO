/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpoo;

import Libro.Libro;
import java.util.Scanner;

/**
 *
 * @author fitog
 */
public class JPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        Libro l1 = new Libro();
        
        l1.cargarlibro(leer);
        System.out.println(l1);
        
    }
    
}
