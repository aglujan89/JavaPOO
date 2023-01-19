/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Perro.Perro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author fitog
 */
public class ServicioPerro {

    private Scanner scan;
    private ArrayList<Perro> mascotas;

    public ServicioPerro() {
        this.scan = new Scanner(System.in).useDelimiter("\n");
        this.mascotas = new ArrayList();
    }

    public void crearPerro() {
        String exit;

        do {
            System.out.println("ingrese la raza del perro");
            Perro p1 = new Perro();
            p1.setRaza(scan.next());
            mascotas.add(p1);

            System.out.println("Desea ingresar otra raza de perro");
            System.out.println("Ingresar 'Y' para continuar o presione cualquier otra letra para continuar.");
            exit = scan.next();

        } while (exit.equalsIgnoreCase("Y"));

    }

    public void mostrarMascotas() {
        System.out.println("Las mascotas actuales de la lista mascotas son: ");

        for (Perro aux : mascotas) {
            System.out.println(aux.toString());
        }
        System.out.println("Cantidad = " + mascotas.size());
    }

    
    public void eliminarPerro(){
        System.out.println("Ingrese la raza que desea eliminar:");
        String nombreRaza = scan.next();
        
        Iterator<Perro> it = mascotas.iterator();
        int contador=0;
        while (it.hasNext()){
            if(it.next().getRaza().equals(nombreRaza)){
                it.remove();
                contador++;
            }
        }
        if (contador==0) {
            System.out.println("La raza ingresada no esta en la lista.");
        }
    }
    
    
}
