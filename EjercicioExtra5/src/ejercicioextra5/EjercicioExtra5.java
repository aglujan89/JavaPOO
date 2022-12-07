/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra5;

import Entidad.Meses;
import Servicio.ServicioMeses;
import java.util.Scanner;

/**
 *
 * @author fitog
 */

//A continuación, declara una variable
//mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo,
//mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto. Si el
//usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar
//el mes secreto. Un ejemplo de ejecución del programa podría ser este:
//Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
//No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
//¡Ha acertado!
public class EjercicioExtra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Meses m = new Meses();
       ServicioMeses serv = new ServicioMeses();
       Scanner scan = new Scanner(System.in);
       serv.crearMeses(m);
       String secreto = serv.mesSecreto();
while(true){
    System.out.println("Ingrese un mes para adivinar");
    String aux = scan.next();
    if (secreto.equalsIgnoreCase(aux)) {
        System.out.println("HA ACERTADO!!!");
        break;        
    }else{
        System.out.println("No acertado. Intente nuevamente");
    }
}
       
    }
    
}
