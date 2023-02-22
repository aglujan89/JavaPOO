/*
 */
package herenciaej1ex;

import Service.ServiceAlquiler;
import java.util.Scanner;

/**
 *
 * @author fitog
 */
public class HerenciaEj1Ex {

    /**
     */
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
     
        ServiceAlquiler serv = new ServiceAlquiler();
        serv.crearContratoAlquiler();
    }
    
}
