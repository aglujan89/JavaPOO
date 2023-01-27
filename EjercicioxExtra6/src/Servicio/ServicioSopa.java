/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Sopa;
import java.util.Scanner;

/**
 *
 * @author fitog
 */
public class ServicioSopa {

    public void crearMatriz(Sopa sopa1) {

        String[][] aux = new String[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                aux[i][j] = "*";
            }
        }
        sopa1.setMatriz(aux);

    }

    public void mostrarMatriz(Sopa sopa1) {

        String[][] aux = sopa1.getMatriz();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(" " + aux[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public void inicilizarMatriz(Sopa sopa1) {
        int fila, columna;
        boolean ocupado = false;
        String[][] aux = sopa1.getMatriz();

        String[] palabras = new String[]{"MATRIZ", "PALTA", "PLATA", "MARCA", "CARNE", "SALSA", "PALTA"};

        for (int i = 0; i < 7; i++) {
            do {
                fila = (int) (Math.random() * 9);
                columna = (int) (Math.random() * 5);
                for (int j = 0; j < 5; j++) {
                    if (aux[fila][j].equals("*")) {
                        ocupado = false;
                        continue;
                    } else {
                        ocupado = true;
                        break;
                    }
                }
                if (ocupado == false) {
                    int pos = 0;
                    String pal = palabras[i];
                    for (int j = columna; j < columna + 5; j++) {
                        aux[fila][j] = pal.substring(pos, pos + 1);
                        pos++;

                    }
                }
            } while (ocupado == true);

        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (aux[i][j].equals("*")) {
                    char letra = (char) ((Math.random() * 26) + 97);
                    aux[i][j] = Character.toString(letra);
                }
            }
        }
        sopa1.setMatriz(aux);
    }

    public void buscarPalabra(Sopa sopa1) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la palabra a buscar de 5 caracteres");
        sopa1.setPalabraEncontrar(scan.next());
        String [][]aux=sopa1.getMatriz();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (sopa1.getMatriz()[i][j].equals(sopa1.getPalabraEncontrar().substring(0, 1))) {
                    boolean encontre = true;
                    int pos = 0;
                    for (int k = j; k < j +sopa1.getPalabraEncontrar().length(); k++) {
                        if (sopa1.getMatriz()[i][k].equals(sopa1.getPalabraEncontrar().substring(pos, pos + 1))) {
                            pos++;
                        } else {
                            encontre = false;
                            break;
                        }
                    }
                    if (encontre) {
                        System.out.println("La palabra se encuentra en la fila " + i + " columna " + j);
                        System.out.println("Ingrese la palabra de reemplazo: ");
                        String reemplazo = scan.next();
                        pos=0;
                        for (int k = j; k < j+reemplazo.length(); k++) {
                            aux[i][k]=reemplazo.substring(pos, pos+1);
                            pos++;
                        }
                        sopa1.setMatriz(aux);
                    }
                }

            }

        }

    }
    
    
}