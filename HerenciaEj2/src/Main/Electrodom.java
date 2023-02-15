/*
 */
package Main;

import Entities.Electrodomestico;
import Entities.Lavadora;
import Entities.Televisor;
import java.util.Scanner;

/**
 *
 * @author fitog
 */
//Los métodos que se implementara serán:
//• Método get y set del atributo carga.
//• Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
//padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
//el atributo propio de la lavadora.
//• Método precioFinal(): este método será heredado y se le sumará la siguiente
//funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
//carga es menor o igual, no se incrementará el precio. Este método debe llamar al
//método padre y añadir el código necesario. Recuerda que las condiciones que hemos
//visto en la clase Electrodoméstico también deben afectar al precio.
//Se debe crear también una subclase llamada Televisor con los siguientes atributos:
//resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
//heredados.
//Los constructores que se implementarán serán:
//• Un constructor vacío.
//• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
//heredados. Recuerda que debes llamar al constructor de la clase padre.
//LETRA PRECIO
//A $1000
//B $800
//C $600
//D $500
//E $300
//F $100
//
//PESO PRECIO
//Entre 1 y 19 kg $100
//Entre 20 y 49 kg $500
//Entre 50 y 79 kg $800
//Mayor que 80 kg $1000
//
//14
//
//Los métodos que se implementara serán:
//• Método get y set de los atributos resolución y sintonizador TDT.
//• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
//padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
//los atributos del televisor.
//• Método precioFinal(): este método será heredado y se le sumará la siguiente
//funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
//incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
//$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
//también deben afectar al precio.
//Finalmente, en el main debemos realizar lo siguiente:
//Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
//el precio final de los dos electrodomésticos.

public class Electrodom {

    /**
     */
    
    public static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        Electrodomestico e1 = new Electrodomestico();
        e1.menuElectrodomestico();
        
//        System.out.println("-------------lavadora---------------");
//        
//         Lavadora lavadora = new Lavadora();
//        lavadora.crearLavadora();
//        
//        System.out.println("-----------------televisor--------------");
//                Televisor tele = new Televisor();
//                tele.crearTele();
//       
    }
    
}
