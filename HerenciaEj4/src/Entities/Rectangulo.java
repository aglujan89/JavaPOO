/*
 */
package Entities;

import Interfaces.calculosFormas;

/**
 *
 * @author fitog
 */
public class Rectangulo implements calculosFormas {

    private Integer base;
    private Integer altura;

    public Rectangulo() {
    }

    public Rectangulo(Integer base, Integer altura) {
        this.base = base;
        this.altura = altura;
    }

    public Integer getBase() {
        return base;
    }

    public void setBase(Integer base) {
        this.base = base;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    @Override
    public Double area() {
        return (double) base * altura;
    }

    @Override
    public Double perimetro() {
return (double)(base+altura)*2;
        }

}
