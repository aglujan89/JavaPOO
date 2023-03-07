/*
 */
package excepciones;

import java.util.Scanner;

/**
 *
 * @author fitog
 */
public class ExceptionEj5 {

    /**
     * @param args the command line arguments
     */
    public static Scanner scan = new Scanner(System.in).useDelimiter("\n");
    public static void main(String[] args) {
//Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
//debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
//ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
//número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
//consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
//ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
//controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
//carácter fallido como un intento.

int numAl = (int) (Math.random()*500+1);
        System.out.println(numAl);
int cont=0;
while(true){
    try {
        System.out.println("Ingrese un numero");
        int num = scan.nextInt();
        if (num==numAl) {
            System.out.println("Has adivinado!!!");
            break;
        }
        if (num>numAl) {
            System.out.println("El numero ingresado es mayor");
        }
        if (num<numAl) {
            System.out.println("El numero ingresado es menor");            
        }
    } catch (Exception e) {
        System.out.println(e);
        System.out.println("Error");
       
    } finally {
        cont+=1;
        System.out.println("Intentos: "+cont);
        scan.next();
    }
}

    }
    
}
