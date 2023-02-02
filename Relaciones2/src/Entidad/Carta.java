/*
 */
package Entidad;

import java.util.Objects;

/**
 *
 * @author fitog
 */
public class Carta {
    private Integer num;
    private String palo;

    public Carta() {
    }

    public Carta(Integer num, String palo) {
        this.num = num;
        this.palo = palo;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.num);
        hash = 17 * hash + Objects.hashCode(this.palo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carta other = (Carta) obj;
        if (!Objects.equals(this.palo, other.palo)) {
            return false;
        }
        return Objects.equals(this.num, other.num);
    }

    @Override
    public String toString() {
        return "Carta{" + " " + num + " de " + palo + '}';
    }

    
}
