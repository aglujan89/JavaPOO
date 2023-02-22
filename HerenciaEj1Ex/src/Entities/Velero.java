/*
 */
package Entities;

/**
 *
 * @author fitog
 */
public class Velero extends Barco{
//    Número de mástiles para veleros.
    private Integer mastiles;

    public Velero() {
    }

    public Velero(Integer mastiles) {
        this.mastiles = mastiles;
    }

    public Velero(Integer mastiles, Integer matricula, Integer metrosEslora, Integer aniosFabricacion) {
        super(matricula, metrosEslora, aniosFabricacion);
        this.mastiles = mastiles;
    }

    @Override
    public Integer modulo() {
//En los veleros se suma el número de mástiles,
//en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
//el número de camarotes.
        return (super.modulo()+mastiles);
    }
    
    
    
}
