/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Circunferencia;

import java.util.Scanner;

/**
 *
 * @author fitog
 */
public class Circunferencia {
    
    private double radio;
    

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
        
    }

    public double getRadio() {
        System.out.println("");
        return radio;
    }

    public void setRadio(double radio) {
        
        this.radio = radio;
    }



    
    
    public double crearCircunferencia (){
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el radio para calcular el area");
        this.radio=leer.nextDouble();
       
        return this.radio=radio;
    }
    
   public double area(){
        return this.radio *this.radio * 3.14;
               
    }

    public double perimetro(){
        return this.radio * 2 * 3.14;
               
    }


 

    
}
