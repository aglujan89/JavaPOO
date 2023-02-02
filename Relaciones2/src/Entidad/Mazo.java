/*
 */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author fitog
 */
public class Mazo {
    
    private ArrayList<Carta> mazoCartas;

    public Mazo() {
    }

    public ArrayList<Carta> getMazoCartas() {
        return mazoCartas;
    }

    public void setMazoCartas(ArrayList<Carta> mazoCartas) {
        this.mazoCartas = mazoCartas;
    }

    @Override
    public String toString() {
        return "Mazo{" + "mazoCartas=" + mazoCartas + '}';
    }
    
    
    
}
