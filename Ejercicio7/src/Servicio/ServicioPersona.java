/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;


/**
 *
 * @author fitog
 */
public class ServicioPersona {
    public Scanner scan = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
    Persona p = new Persona("Juan", "Perez", new DNI("A", 3377733));
        System.out.println("Ingrese nombre: ");
        p.setNombre(scan.next());
        System.out.println("Ingrese su edad: ");
        p.setEdad(scan.nextInt());
        do {
            System.out.println("Ingrese el sexo: [H-hombre | M- mujer | O-Otros]: ");
            p.setSexo(scan.next());
        } while (!p.getSexo().equalsIgnoreCase("h") && !p.getSexo().equalsIgnoreCase("m") && !p.getSexo().equalsIgnoreCase("o"));

        System.out.println("Ingrese peso: ");
        p.setPeso(scan.nextDouble());
        System.out.println("Ingrese altura: ");
        p.setAltura(scan.nextDouble());
           
    
    return p;
}
    public int calcularIMC(Persona p){
        double imc = (p.getPeso() / Math.pow(p.getAltura(),2));
        
        if (imc<20) {
            System.out.println("Esta por debajo de su peso ideal");
            System.out.println(imc);
            return -1;
        }else if (imc>=20 && imc<=25) {
        System.out.println("Esta en su peso ideal");
        System.out.println(imc);
        return 0;
        }else{
            System.out.println("Tiene sobre peso");
            System.out.println(imc);
            return 1;
        }
    }
     public boolean esMayorDeEdad(Persona p){
//        boolean esmayor = false;
         if (p.getEdad() >= 18) {
             System.out.println("Es mayor de edad.");
            return true;            
       }else{
             System.out.println("Es menor de edad");
             return false;
         }
     }
    
     
    
    
}



//Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
//distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
//cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
//también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.