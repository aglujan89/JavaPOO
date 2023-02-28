/*
 */
package Enum;

/**
 *
 * @author fitog
 */
public enum EstadoCivil {
    
    CASADO("Casado/a"), SOLTERO("Soltero/a"), DIVORCIADO("Divorciado/a"), VIUDO("Viudo/a"), CONCUBINATO("En pecado");
    
    private String estado;

    private EstadoCivil() {
    }

    private EstadoCivil(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
