/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Puntos;
import java.util.Scanner;

/**
 *
 * @author fitog
 */

//Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
//atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
//usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
//los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
//que existe entre los dos puntos que existen en la clase Puntos.

public class SerivicioPuntos {
    Scanner scan = new Scanner(System.in);
    public void crearPuntos (Puntos p){
        System.out.println("Ingrese las coordenadas del primer punto");
        System.out.println("Coordenanda horizontal: ");
        p.setX1(scan.nextInt());
        System.out.println("Coordenada vertical: ");
        p.setY1(scan.nextInt());
        System.out.println("Ingrese las coordenadas del segundo punto");
        System.out.println("Coordenanda horizontal: ");
        p.setX2(scan.nextInt());
        System.out.println("Coordenada vertical: ");
        p.setY2(scan.nextInt());
                
    }
    
    public float distanciaPuntos (Puntos p){
        return (float) (Math.sqrt( Math.pow(p.getX2()-p.getX1(),2)+Math.pow(p.getY2()-p.getY1(),2) ));
    }
    
}
