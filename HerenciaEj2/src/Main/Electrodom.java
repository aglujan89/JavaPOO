/*
 */
package Main;

import Entities.Electrodomestico;
import Entities.Lavadora;
import Entities.Televisor;
import Enum.Color;
import java.util.ArrayList;
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
        
        ArrayList<Electrodomestico> listaElectro = new ArrayList();
        
        Lavadora lav = new Lavadora();
        lav.crearLavadora(lav);
//        lav.precioFinal(lav);
        listaElectro.add(lav);
        
        System.out.println("---------------Listo electro 1-----------------");
        
        Televisor tele = new Televisor();
        tele.crearTele(tele);
//        tele.precioFinal(tele);
        listaElectro.add(tele);

        System.out.println("---------------Listo electro 2-----------------");
        

        listaElectro.add(new Televisor(50, true, 1000, Color.BLANCO , 'a', 50));
        listaElectro.add(new Televisor(35, true, 1000, Color.GRIS , 'f', 60));
        
        double precioTV = 0;
        double precioLV = 0;
        for (Electrodomestico elect : listaElectro) {    
            if (elect instanceof Lavadora) {
                Lavadora E = (Lavadora) elect;
                E.precioFinal(E);
                precioLV+= E.getPrecio();
                continue;
            }
            if (elect instanceof Televisor) {
                Televisor T = (Televisor) elect;   
                T.precioFinal(T);
                precioTV+= T.getPrecio();
            }
        }
        System.out.println("Precio de lavadoras " + precioLV);
        System.out.println("Precio de TVs" + precioTV);
        System.out.println("El precio total es de: " + (precioTV+precioLV));
    
    }
//    System.out.println("Que electrodomestico cotizar?");
//        System.out.println("1.Lavadora"+"\n");
//        System.out.println("2.Televisor"+"\n");
//        System.out.println("3.Salir");
//        int electro = scan.nextInt();
//        switch(electro){
//            case 1: 
//                Lavadora lava = new Lavadora();
//                lava.crearLavadora((Lavadora)elecX);
//                break;
//            case 2:
//                Televisor tele = new Televisor();
//                tele.crearTele((Televisor)elecX);
//                break;
//            case 3:
//                break;
//        }
}
