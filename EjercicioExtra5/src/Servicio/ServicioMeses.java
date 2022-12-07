/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Meses;
import java.util.Scanner;

/**
 *
 * @author fitog
 */
//El programa debe pedir al usuario que adivine el mes secreto. Si el
//usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar
//el mes secreto. Un ejemplo de ejecución del programa podría ser este:
//Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
//No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
//¡Ha acertado!
public class ServicioMeses {
    Scanner scan = new Scanner(System.in);
    String[] aux = new String[]{"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    public void crearMeses(Meses m) {   
        m.setMeses(aux);
    }
public String mesSecreto(){
    
    return aux[(int) (Math.random()*12)];
}
    
    
}
