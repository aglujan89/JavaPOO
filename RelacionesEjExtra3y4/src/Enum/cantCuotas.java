/*
 */
package Enum;

/**
 *
 * @author fitog
 */
public enum cantCuotas {

    UNO(1), TRES(3), SEIS(6), DOCE(12);

    private Integer cantidaddecuotas;

    private cantCuotas() {

    }

    private cantCuotas(Integer canCt) {

        this.cantidaddecuotas = canCt;

    }

    public Integer getCantidaddecuotas() {
        return cantidaddecuotas;
    }

    public void setCantidaddecuotas(Integer cantidaddecuotas) {
        this.cantidaddecuotas = cantidaddecuotas;
    }

}
