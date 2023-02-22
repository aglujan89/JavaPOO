/*
 */
package Entities;

/**
 *
 * @author fitog
 */
public class BarcoMotor extends Barco{
//    Potencia en CV para barcos a motor.
    private Integer potenciaMotor;

    public BarcoMotor() {
    }

    public BarcoMotor(Integer potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    public BarcoMotor(Integer potenciaMotor, Integer matricula, Integer metrosEslora, Integer aniosFabricacion) {
        super(matricula, metrosEslora, aniosFabricacion);
        this.potenciaMotor = potenciaMotor;
    }

    @Override
    public Integer modulo() {
//En los veleros se suma el número de mástiles,
//en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
//el número de camarotes.
        return (super.modulo()+potenciaMotor);
    }
    
    
}
