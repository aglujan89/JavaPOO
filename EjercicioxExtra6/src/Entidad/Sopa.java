/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Arrays;

/**
 *
 * @author fitog
 */
public class Sopa {
    private String[][] matriz;
    private String palabraEncontrar;

    public Sopa() {
    }

    public Sopa(String[][] matriz, String palabraEncontrar) {
        this.matriz = matriz;
        this.palabraEncontrar = palabraEncontrar;
    }

    public String[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(String[][] matriz) {
        this.matriz = matriz;
    }

    public String getPalabraEncontrar() {
        return palabraEncontrar;
    }

    public void setPalabraEncontrar(String palabraEncontrar) {
        this.palabraEncontrar = palabraEncontrar;
    }

    @Override
    public String toString() {
        return "Sopa{" + "matriz=" + Arrays.toString(matriz) + ", palabraEncontrar=" + palabraEncontrar + '}';
    }
    
    
    
    
}
