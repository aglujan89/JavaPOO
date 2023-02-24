/*
 */
package Service;

import Entities.Alojamiento;
import Entities.Camping;
import Entities.Hotel5;
import Entities.Residencia;
import Entities.Hotel4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author fitog
 */
public class AlojamientoService {
    ArrayList<Alojamiento> alojamientos = new ArrayList<>();
    ArrayList<Hotel4> hoteles = new ArrayList<>();
    public static Scanner scan = new Scanner(System.in).useDelimiter("\n");
    
    public void crearAlojamientos(){
        Alojamiento a = new Hotel4(20, 32, 5, 'a', "Tia rada", 50, "Crystal", "Cangallo 52", "Cordoba", "Adolfo");
        a.precioHabitacion();alojamientos.add(a);
        Alojamiento b = new Hotel5(3, 10, 3, 28, 50, 7, 'a', "Montecatini", 75, "Holidays", "Cabildo 2505", "Santa Fe", "Natalia");
        b.precioHabitacion();alojamientos.add(b);
        Alojamiento c = new Hotel4(18, 30, 6, 'b', "Tia pochi", 45, "Aconcagua", "Juramento 20", "Buenos Aires", "Valentino");
        c.precioHabitacion();alojamientos.add(c);
        Alojamiento d = new Camping(100, 4, true, false, 2000, "Municipal", "Ruta 40 s/n", "Tunuyan", "Lucas");
        alojamientos.add(d);
        Alojamiento e = new Camping(75, 4, false, true, 2500, "Petrolero", "Profesor Mathus s/n", "Bellavista", "Primo Aurelio");
        alojamientos.add(e);
        Alojamiento f = new Residencia(40, true, true, true, 850, "Hostel park", "Acceso norte s/n", "Mendoza", "Fabian");
        alojamientos.add(f);
        
    }
    
    public void menus(){
        crearAlojamientos();
        boolean salir=false;
        while(!salir){
            
        System.out.println(" ");
        System.out.println("Elija que criterio utiliza para ver los alojamientos");
        System.out.println("-");
        System.out.println("1. Ver todos.");
        System.out.println("2. Ver hoteles desde más caro a más barato.");
        System.out.println("3. Ver campings con restaurante.");
        System.out.println("4. Ver residencias con descuentos sindicales.");
        System.out.println("5. Salir.");
        System.out.println("-");
        int resp = scan.nextInt();
            
        switch(resp){
            case 1:
                for (Alojamiento alojamiento : alojamientos) {
                    System.out.println(alojamiento);
                }
                break;
            case 2:
                for (Alojamiento alojamiento : alojamientos) {
                    if (alojamiento instanceof Hotel4){
                        hoteles.add((Hotel4) alojamiento);
                    }else if(alojamiento instanceof Hotel5){
                        hoteles.add((Hotel4) alojamiento);
                    }
                }
                Collections.sort(hoteles, (Hotel4 t, Hotel4 t1) -> t1.getPrecio().compareTo(t.getPrecio()));
                for (Hotel4 alojamiento : hoteles) {
                    System.out.println(alojamiento);
                }
                break;  
            case 3:
                for (Alojamiento alojamiento : alojamientos) {
                    if(alojamiento instanceof Camping){
                        if(((Camping) alojamiento).getResto()){
                            System.out.println(alojamiento);
                        }
                    }
                }
                break;
            case 4:
                for (Alojamiento alojamiento : alojamientos) {
                    if(alojamiento instanceof Residencia){
                        if(((Residencia) alojamiento).getDescuento()){
                            System.out.println(alojamiento);
                        }
                    }
                }
                break;
            case 5: salir=true;
            break;
        }
            
            
        }
        
    }
    
    
}
