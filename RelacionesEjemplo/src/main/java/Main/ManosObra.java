/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Entidad.DNI;
import Entidad.Persona;

/**
 *
 * @author fitog
 */
public class ManosObra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona pers = new Persona("Juan","Perez",new DNI("A",3377733));
        System.out.println(pers);
        
    }
    
}
