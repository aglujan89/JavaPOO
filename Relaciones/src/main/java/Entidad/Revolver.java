/*
 */
package Entidad;

/**
 *
 * @author fitog
 */
public class Revolver {
    private Integer posAcutal;
    private Integer posAgua;

    public Revolver() {
       
    }

    public Revolver(Integer posAcutal, Integer posAgua) {
        this.posAcutal = posAcutal;
        this.posAgua = posAgua;
    }

    public Integer getPosAcutal() {
        return posAcutal;
    }

    public void setPosAcutal(Integer posAcutal) {
        this.posAcutal = posAcutal;
    }

    public Integer getPosAgua() {
        return posAgua;
    }

    public void setPosAgua(Integer posAgua) {
        this.posAgua = posAgua;
    }

    @Override
    public String toString() {
        return "Revolver{" + "posAcutal=" + posAcutal + ", posAgua=" + posAgua + '}';
    }
    
    
}
