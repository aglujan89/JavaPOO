/*
 */
package Service;

import Entities.Empleado;
import Entities.Estudiante;
import Entities.Persona;
import Enum.EstadoCivil;
import static Enum.EstadoCivil.SOLTERO;
import static herenciasej4ex.HerenciasEj4Ex.scan;

/**
 *
 * @author fitog
 */
public class serviceFacu {
   Persona p = new Persona();
   Empleado e = new Empleado();
   Estudiante est = new Estudiante();

    public serviceFacu() {
    }

   
   
    public void cambioEstadoCivil() {

        boolean aux = true;

        while (aux) {
            System.out.println("Ingrese su nuevo estado civil - CASADO/SOLTERO/VIUDO/DIVORCIADO/CONCUBINATO");
            String resp = scan.next();
            for (EstadoCivil estado : EstadoCivil.values()) {
                if (estado.name().equalsIgnoreCase(resp)) {
                    p.cambioEstadoCivil(estado);
                    aux = false;
                    break;
                }
            }
        }

    }
    public void cambioDespacho(){
   
        System.out.println("Ingrese el numero de despacho:");
        
        while(!scan.hasNextInt()){
            System.out.println("el numero es incorrecto, ingreselo nuevamente");
            scan.next();
        }
                 int nroD = scan.nextInt();     
                 System.out.println("El número ingresado es: "+nroD);
              
        e.cambioNroDespacho(nroD);
    }
    
    public String cambioMatricula(){
        System.out.println("Ingrese el curso al que se va a inscribir: ");
        String curs = scan.next();
        return curs;
    }
    
}
