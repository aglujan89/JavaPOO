/*
 */
package Entiities;

/**
 *
 * @author fitog
 */
public class DivisionNumero {
    private Integer n1;
    private Integer n2;

    public DivisionNumero() {
    }

    public DivisionNumero(Integer n1, Integer n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public Integer getN1() {
        return n1;
    }

    public void setN1(Integer n1) {
        this.n1 = n1;
    }

    public Integer getN2() {
        return n2;
    }

    public void setN2(Integer n2) {
        this.n2 = n2;
    }

    @Override
    public String toString() {
        return "DivisionNumero{" + "n1=" + n1 + ", n2=" + n2 + '}';
    }


    
    
}
