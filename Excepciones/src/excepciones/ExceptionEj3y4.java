/*
 */
package excepciones;

import Entiities.DivisionNumero;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author fitog
 */
public class ExceptionEj3y4 {

    /**
     * @param args the command line arguments
     */
    public static Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

//Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
//números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
//para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
//una división con los dos numeros y mostrar el resultado.
        DivisionNumero n = new DivisionNumero();
//        String numero = scan.next();
//        String numero1 = scan.next();

        try {
            n.setN1(scan.nextInt());
            n.setN2(Integer.parseInt("a"));
            System.out.println(n.getN1() / n.getN2());
        } catch (NumberFormatException fe) {
            System.err.println(fe);
            fe.printStackTrace();
            System.out.println("Error de formato");
        }catch(ArithmeticException ae){
            System.out.println("division por 0");
        }catch(InputMismatchException me){
            System.out.println(me);
            System.err.println("Ingrese un numero entero");
        }catch(Exception e){
            System.out.println(e);
            System.err.println("Error desconocido");
        }
    }

}
