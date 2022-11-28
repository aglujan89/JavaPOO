/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.util.Arrays;

/**
 *
 * @author fitog
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float[] A = new float[50];
        float[] B = new float[20];

        for (int i = 0; i < 50; i++) {
            A[i] = (float) Math.random() * 10;
        }

        for (int i = 0; i < 50; i++) {
            System.out.print(A[i] + " ");
        }

        System.out.println("");
        Arrays.sort(A);

        B = Arrays.copyOf(A, 20);

        Arrays.fill(B, 10, 20, (float) 0.5);

        System.out.println("");

        for (int i = 0; i < 50; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < 20; i++) {
            System.out.print(B[i] + " ");
        }

    }

}
