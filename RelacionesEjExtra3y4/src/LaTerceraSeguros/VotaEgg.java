/*
 */
package LaTerceraSeguros;

import Service.Simulador;
import java.util.Scanner;

/**
 *
 * @author fitog
 */
public class VotaEgg {

    /**
     * @param args the command line arguments
     */
    public static Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        Simulador serv = new Simulador();

//        serv.listaAlumnos();
//        serv.generarDni();
        serv.crearAlumnos();
        serv.mostrarAlumnos();

    }

}
