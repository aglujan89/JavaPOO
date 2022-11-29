/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author fitog
 */

//Agregar un método de creación del objeto que respete la siguiente firma: 
//crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al 
//usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la 
//fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
//• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener 
//en cuenta que para conocer la edad de la persona también se debe conocer la fecha 
//actual.
//• Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
//edad y retorna true en caso de que el receptor tenga menor edad que la persona que 
//se recibe como parámetro, o false en caso contrario.
//• Metodo mostrarPersona(): este método muestra la persona creada en el método 
//anterior.
public class ServicioPersona {
    Scanner scan = new Scanner(System.in);
    Date fechaAc = new Date();
    
    public void crearPersona (Persona per){
        int anio, mes, dia;
        System.out.println("Ingrese el nombre de la persona: ");
        per.setNombre(scan.next());
        System.out.println("***fecha de nacimiento***");
        System.out.println("Ingrese el año: ");
        anio = scan.nextInt();
        System.out.println("Ingrese el mes: ");
        mes = scan.nextInt();
        System.out.println("Ingrese el día: ");
        dia = scan.nextInt();
        Date fecha = new Date(anio-1900, mes-1, dia);
        per.setFecha(fecha);
    }
    public int calcularEdad (Persona per){
        if (per.getFecha().getMonth()>fechaAc.getMonth()) {
            return (fechaAc.getYear()-per.getFecha().getYear()-1);
        }else{
            return (fechaAc.getYear()-per.getFecha().getYear());           
        }
    }
    public boolean menorQue (Persona per, int edad){
       return calcularEdad(per)<edad;
    }
    public void mostrarPersona (Persona per){
        System.out.println(per);
    }
    
}
