/*
 */
package Entiities;

/**
 *
 * @author fitog
 */
public class ArrayEj2 {
    private int[] numeros;

    public ArrayEj2() {
        numeros = new int[3];
    }

    public ArrayEj2(int[] numeros) {
        this.numeros = numeros;
    }

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }

    @Override
    public String toString() {
        return "ArrayEj2{" + "numeros=" + numeros + '}';
    }

    
    
}
