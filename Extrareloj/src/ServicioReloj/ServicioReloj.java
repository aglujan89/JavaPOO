/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioReloj;

import Entidad.Reloj;
import java.util.Scanner;

/**
 *
 * @author fitog
 */
public class ServicioReloj {
    Scanner scan = new Scanner(System.in);
    
    public void crearReloj(Reloj rel){
       
        System.out.println("Ingrese la hora, minutos y segundos: ");
        System.out.println("Hora: ");
        rel.setHs(scan.nextInt());
        System.out.println("minutos: ");
        rel.setMin(scan.nextInt());
        System.out.println("segundos: ");
        rel.setSeg(scan.nextInt());
      
    }
     
    public void imprimirHora(Reloj rel) throws InterruptedException{
        boolean sigue = true;
        while(sigue){
            
        Thread.sleep(1000);
        
            if (rel.getSeg()==59) {
                rel.setSeg(0);
                rel.setMin(rel.getMin()+1);
                if (rel.getMin()>=60) {
                   rel.setMin(0);
                   rel.setHs(rel.getHs()+1);
                    if (rel.getHs()>=24) {
                        rel.setHs(0);
                    }
                }
         
            }else{
                rel.setSeg(rel.getSeg()+1);
            }
            
       System.out.println(+rel.getHs()+" : "+rel.getMin()+" : "+rel.getSeg());
        
    }
    }
   
}
