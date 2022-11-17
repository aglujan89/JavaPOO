/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2jp;

import Circunferencia.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author fitog
 */
public class Ej2JP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
//tipo real. A continuación, se deben crear los siguientes métodos:
//a) Método constructor que inicialice el radio pasado como parámetro.
//b) Métodos get y set para el atributo radio de la clase Circunferencia.
//c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
//objeto.
//d) Método area(): para calcular el área de la circunferencia (Area = π * radio2).
//e) Método perimetro(): para calcular el perímetro (Perimetro = 2 * π * radio).
        
        
        Scanner leer = new Scanner (System.in);
        
        Circunferencia r1 = new Circunferencia();
        
        r1.crearCircunferencia();
       
        System.out.println(r1.perimetro());
        System.out.println(r1.area());
    
        
    }
    
}
