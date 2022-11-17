/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectanguloServicio;

import entidad.rectangulo;
import java.util.Scanner;

/**
 *
 * @author fitog
 */
public class rectanguloServicio {
  
public rectangulo crearRectangulo(){
    Scanner scan = new Scanner (System.in);
    rectangulo rec = new rectangulo();
    System.out.println("Ingrese la base: ");
    rec.setBase(scan.nextInt());
    System.out.println("Ingrese la altura: ");
    rec.setAltura(scan.nextInt());
    return rec;
}    
   
public int superficie (rectangulo rec){
    return rec.getAltura()*rec.getBase();
    
}

public int perimetro (rectangulo rec){
    return (rec.getAltura()+rec.getBase())*2;
    
}
public void dibujarRectangulo(rectangulo rec){
    for (int i = 0; i < rec.getAltura(); i++) {
        for (int j = 0; j < rec.getBase(); j++) {
            if (i==0 || i==rec.getAltura()-1 || j==0 || j==rec.getBase()-1){
                System.out.print("*");
                
            }else{
                System.out.print(" ");
            }
            
            
        }
        System.out.println("");
    }
    
    
}

}
