/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import Entidad.Cadena;
import Servicio.ServicioCadena;
import java.util.Scanner;

/**
 *
 * @author fitog
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioCadena serv = new ServicioCadena();
        Cadena f1 = new Cadena();

        serv.crearFrase(f1);       
        serv.mostrarVocales(f1);
        serv.invertirFrase(f1);
        

        System.out.println("Ingrese un caracter");

        System.out.println("La frase tiene " + serv.vecesRepetido(f1, leer.next()) + " veces el caracter ingresado");

        System.out.println("Ingrese otra frase");
        
        if(serv.compararLongitud(f1, leer.next())){
            System.out.println("La longitud de las frases es la misma.");
        }else{
            System.out.println("La longitud de la frase no es la misma.");
        }
        
 
        serv.invertirFrase(f1);
        System.out.println("Ingrese otra frase:");
        serv.unirFrase(f1, leer.next());
        
        serv.reemplazar(f1);
        
        if (serv.contieneLetra(f1)) {
            System.out.println("La frase contiene la letra");
            }else{
            System.out.println("La frase no contiene la letra");
        }
        
        
    }

}
