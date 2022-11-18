/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioCafetera;

import Cafetera.Cafetera;
import java.util.Scanner;

/**
 *
 * @author fitog
 */
public class ServicioCafetera {
public Scanner scan = new Scanner (System.in);    
    public Cafetera crearCafetera(){
    Cafetera c = new Cafetera();
        System.out.println("Ingrese la capacidad maxima en cm3: ");
        c.setCapacidadMaxima(scan.nextInt());
        System.out.println("Ingrese la capacidad actual en cm3: ");
        c.setCapacidadActual(scan.nextInt());
    return c;
}
    
    public void llenarCafetera (Cafetera c){
   c.setCapacidadActual(c.getCapacidadMaxima());
    System.out.println("Su cafetera se lleno y su capacidad actual es de "+c.getCapacidadActual());
    }
    
    public void servirTaza(Cafetera c){
        System.out.println("Ingresar el tamaño de taza: ");
        int taza = scan.nextInt();
        
        
        if (c.getCapacidadActual()>=taza) {
            c.setCapacidadActual(c.getCapacidadActual()-taza);
            System.out.println("Se lleno la taza y lo que queda es "+c.getCapacidadActual());           
        }else{
            int resto = taza - c.getCapacidadActual();
            System.out.println("No se pudo llenar toda la taza, quedo por llenar "+  resto);
        }       
    }
    
    public void vaciarCafetera(Cafetera c){
        System.out.println("Se procede con el vaciado de la cafetera");
        c.setCapacidadActual(0);
        System.out.println("La cantidad actual es de: "+c.getCapacidadActual());    
    }
    
    public void agregarCafe (Cafetera c){
        System.out.println("Ingrese la cantidad de cafe que desea agregar ");
        int cafe = scan.nextInt();
        if (cafe>=c.getCapacidadMaxima()) {
            c.setCapacidadActual(c.getCapacidadMaxima());
        }else{
            c.setCapacidadActual(cafe);
        }
        System.out.println("La cantidad de cafe disponible es "+c.getCapacidadActual();
    }
       
    
}
