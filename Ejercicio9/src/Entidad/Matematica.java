/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author fitog
 */
public class Matematica {
    
    private float n1, n2;

    public Matematica() {
    }

    public Matematica(float n1, float n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public float getN1() {
        return n1;
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public float getN2() {
        return n2;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }

    @Override
    public String toString() {
        return "Matematica{" + "n1=" + n1 + ", n2=" + n2 + '}';
    }
    
    
    
    
}
