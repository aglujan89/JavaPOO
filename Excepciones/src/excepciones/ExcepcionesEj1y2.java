/*
 */
package excepciones;

import Entiities.ArrayEj2;
import Entiities.Persona;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author fitog
 */
public class ExcepcionesEj1y2 {

    /**
     * @param args the command line arguments
     */
    public static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        
//        ----------------------------Ejercicio 1-------------------------------
//Inicializar un objeto de la clase Persona ejercicio 7 de la guía POO, a null y tratar de invocar el
//método esMayorDeEdad() a través de ese objeto. Luego, englobe el código con una cláusula
//try-catch para probar la nueva excepción que debe ser controlada.
        Persona p = null;
        try{
p.mostrarEdad();
            
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.err.println("Error");
        }
        
       //        ----------------------------Ejercicio 2------------------------------- 
//Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
//generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
//de rango).
       
        ArrayEj2 a = new ArrayEj2();
        try{
            a.getNumeros()[1]=scan.nextInt();
        System.out.println(a.getNumeros()[4]);  
        }catch(ArrayIndexOutOfBoundsException ae){
            System.out.println(ae);
            System.out.println("Indice fuera de rango");            
        }catch(InputMismatchException ie){
            System.err.println(ie);
            System.out.println("Ingresaste una letra");
        }catch(Exception e){
            System.out.println("Error desconocido");
        }
        
        
    }
    
}
