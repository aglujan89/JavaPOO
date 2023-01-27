/*

 */
package Entidad;

/**
 *
 * @author fitog
 */
public class DNI {
    private String serie;
    private Integer num;

    public DNI() {
    }

    public DNI(String serie, Integer num) {
        this.serie = serie;
        this.num = num;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "DNI{" + "serie=" + serie + ", num=" + num + '}';
    }
    
    
}
