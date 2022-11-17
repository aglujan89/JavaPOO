/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import operacion.operacion;
import operacionservice.operacionservice;

/**
 *
 * @author fitog
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        operacionservice oper = new operacionservice();
        operacion op = oper.crearOperacion();
        System.out.println("la suma es " + oper.sumar(op));        
        System.out.println("la resta es " + oper.restar(op));
        System.out.println("la multiplicacion es " + oper.multiplicar(op));        
        System.out.println("la division es " + oper.dividir(op));
        
    }
    
}
