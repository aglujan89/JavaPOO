/*
 */
package Service;

import Entities.Alquiler;
import Entities.Barco;
import Entities.BarcoMotor;
import Entities.Velero;
import Entities.YateLujo;
import static herenciaej1ex.HerenciaEj1Ex.scan;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

/**
 *
 * @author fitog
 */
public class ServiceAlquiler {

    public Barco crearBarco() {
        
         System.out.println("Amarre para que barco quiere alquilar?");
         System.out.println("1.Barco");
         System.out.println("2.Velero");
         System.out.println("3.Barco con motor");
         System.out.println("4.Yate de lujo");
         
        switch(scan.nextInt()) {
           case 1: Barco b1 = new Barco(234512, 20, 2010);
           return b1;
           case 2: Barco v1 = new Velero(2, 356324, 12, 2015);
           return v1;
           case 3: Barco bm1 = new BarcoMotor(120, 353642, 35, 2005);
           return bm1;
           case 4: Barco y1 = new YateLujo(10, 100, 653214, 40, 2020);
           return y1;
           default: Barco b2 = new Barco(234512, 20, 2010);
           return b2;
        }

    }

    public void crearContratoAlquiler() {

        Alquiler c1 = new Alquiler("Adolfo", 66666666, null, null, "muelle 1", null);
        System.out.println("Ingrese fecha de alquiler dd/mm/aaaa");
        int dia = scan.nextInt();
        int mes = scan.nextInt();
        int ano = scan.nextInt();
        LocalDate fecha = LocalDate.of(ano, mes, dia);
        c1.setFechaAlquiler(fecha);
        System.out.println("Ingrese fecha de devolucion dd/mm/aaaa");
        dia = scan.nextInt();
        mes = scan.nextInt();
        ano = scan.nextInt();
        LocalDate fecha2 = LocalDate.of(ano, mes, dia);
        c1.setFechaDevolucion(fecha2);
        c1.setNombreBarco(crearBarco());
        calcularAlquiler(c1);
        
        
//DateTimeFormatter fechaForm = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//String fechaFormateada = fecha.format(fechaForm);
//        System.out.println(fechaFormateada);
    }
    
    public void calcularAlquiler(Alquiler c1){
        Integer cantDias =(int) Math.abs(ChronoUnit.DAYS.between(c1.getFechaDevolucion(),c1.getFechaAlquiler()));
        System.out.println("El valor del alquiler por "+ cantDias+ " dias, es de: U$D "+(c1.getNombreBarco().modulo()*cantDias));
       
        
    }
    
    

}
