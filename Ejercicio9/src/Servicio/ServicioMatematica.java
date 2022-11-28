/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Matematica;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.round;


/**
 *
 * @author fitog
 */


//a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
//b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado 
//al menor número. Previamente se deben redondear ambos valores.
//c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores. 
//Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.

public class ServicioMatematica {
    
    public void crearMatematica (Matematica m1){
        m1.setN1((float) (Math.random()*-10));
        m1.setN2((float) (Math.random()*10));
    } 
    
    public float devolverMayor (Matematica m1){
        return max(m1.getN1(), m1.getN2());        
    }
    
    public float devolverMenor (Matematica m1){
        return min(m1.getN1(), m1.getN2());        
    }
    
    public float calcularPotencia (Matematica m1){
        float n1, n2;
        n1=round(devolverMayor(m1));
        n2=round(devolverMenor(m1));
        return (int) Math.pow(n1, n2);
    }
    
    public float calcularRaiz(Matematica m1){
        float n;
        n=Math.abs(round(devolverMenor(m1)));
        return (float) Math.sqrt(n);
    }
    
}
