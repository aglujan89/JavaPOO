/*
 */
package Entities;

/**
 *
 * @author fitog
 */
public class YateLujo extends Barco{
//    Potencia en CV y número de camarotes para yates de lujo.
    private Integer numeroCamarotes;
    private Integer potenciaMotor;

    public YateLujo() {
    }

    public YateLujo(Integer numeroCamarotes, Integer potenciaMotor) {
        this.numeroCamarotes = numeroCamarotes;
        this.potenciaMotor = potenciaMotor;
    }

    public YateLujo(Integer numeroCamarotes, Integer potenciaMotor, Integer matricula, Integer metrosEslora, Integer aniosFabricacion) {
        super(matricula, metrosEslora, aniosFabricacion);
        this.numeroCamarotes = numeroCamarotes;
        this.potenciaMotor = potenciaMotor;
    }

    @Override
    public Integer modulo() {
        return (super.modulo()+potenciaMotor+numeroCamarotes);
    }
    
    
}
