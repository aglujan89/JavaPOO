/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionservice;

import java.util.Scanner;
import operacion.operacion;



/**
 *
 * @author fitog
 */
public class operacionservice {
    
    public operacion crearOperacion(){
        Scanner scan = new Scanner (System.in);
        operacion op = new operacion ();
        System.out.println("Ingrese un numero: ");
        op.setNum1(scan.nextDouble());
        System.out.println("Ingrese un numero: ");
        op.setNum2(scan.nextDouble());
        return op;
    }
    
}
