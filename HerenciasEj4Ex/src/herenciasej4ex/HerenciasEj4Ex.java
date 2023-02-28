/*
 */
package herenciasej4ex;

import Entities.Persona;
import Service.serviceFacu;
import java.util.Scanner;

/**
 *
 * @author fitog
 */
public class HerenciasEj4Ex {

    /**
     * @param args the command line arguments
     */
    
//Sistema Gestión Facultad. Se pretende realizar una aplicación para una facultad que gestione
//la información sobre las personas vinculadas con la misma y que se pueden clasificar en tres
//tipos: estudiantes, profesores y personal de servicio.
    public static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
    serviceFacu serv = new serviceFacu();
    serv.cambioEstadoCivil();
    serv.cambioDespacho();
    
    }
    
}
