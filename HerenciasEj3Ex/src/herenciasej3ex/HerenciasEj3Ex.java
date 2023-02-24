/*
 */
package herenciasej3ex;

import Service.AlojamientoService;

/**
 *
 * @author fitog
 */
public class HerenciasEj3Ex {

    /**
     * @param args the command line arguments
     */


//Una compañía de promociones turísticas desea mantener información sobre la infraestructura
//de alojamiento para turistas, de forma tal que los clientes puedan planear sus vacaciones de
//acuerdo con sus posibilidades.    
//Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
//• todos los alojamientos.
//• todos los hoteles de más caro a más barato.
//• todos los campings con restaurante
//• todos las residencias que tienen descuento.
    public static void main(String[] args) {
        AlojamientoService serv = new AlojamientoService();
        serv.menus();
    }
    
}
