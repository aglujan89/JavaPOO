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
     */
    public static Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        Simulador serv = new Simulador();

        serv.crearAlumnos();
//        serv.mostrarAlumnos();
        serv.iniciarVotacion();
        serv.mostrarAlumnos();
        System.out.println("---------------------------------votos------------------------------");
        serv.mostrarVotos();

    }

}
