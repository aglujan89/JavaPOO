/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Pass;
import java.util.Scanner;

/**
 *
 * @author fitog
 */
public class ServicioPass {

    Scanner scan = new Scanner(System.in);

//Métodos para desarrollar:
//● Ingresar datos de usuarios (usando el constructor. HACER INGRESO DE DATOS FIJOS (no por
//teclado)
//● Crear un método para ingresar una contraseña (crearPass). En este método, debemos
//validar que la longitud sea correcta. (10). En caso de ser correcto, almaceno la contraseña.
//Si ingreso a esta opción del menú, indefectiblemente deberá dejar su contraseña asignada.
    public void crearPass(Pass usu) {
        String contra;
        contra = usu.getPass();
        do {

            if (!(contra.length() == 10)) {
                System.out.println("contraseña incorrecta, prueba con otra y recuerde que debe tener 10 digitos para el usuario: " + usu.getNombre());
                contra = scan.next();
            }
        } while (!(contra.length() == 10));
        usu.setPass(contra);
    }

//Crear un método para analizar la contraseña(analizarPass). Donde:
//o SI Existe al menos una letra z : Es nivel MEDIO
//o Si Existe al menos una letra z y al menos 2 letras a: Es nivel ALTO
//o Si ninguna condición se cumple es nivel BAJO
    public void analizarPass(Pass usu) {
        int conta = 0;
        boolean letraz = false;
        for (int i = 0; i < 10; i++) {
            if (usu.getPass().substring(i, i + 1).equalsIgnoreCase("z")) {
                letraz = true;

            }
            if (usu.getPass().substring(i, i + 1).equalsIgnoreCase("a")) {
                conta++;
            }
        }
        if (letraz && conta >= 2) {
            System.out.println("Nivel de contraseña del usuario "+usu.getNombre()+" es ALTO.");
        } else if(letraz) {
            System.out.println("Nivel de contraseña del usuario "+usu.getNombre()+" es MEDIO.");
        }else{
            System.out.println("Nivel de contraseña del usuario "+usu.getNombre()+" es BAJO.");

        }

    }
    
//Crear los métodos correspondientes para modificar el nombre o DNI. Atención! Primero
//debe ingresar el pass para poder realizar dicha gestión. Caso contrario se impedirá el
//acceso a modificar los datos.
    
    public boolean validarPass (Pass usu){
     String contra1;
        for (int i = 2; i >= 0; i--) {
            System.out.println("Ingrese su contraseña " + usu.getNombre());
            contra1 = scan.next();
            if (contra1.equalsIgnoreCase(usu.getPass())) {    
                return true;
            }else{
                System.out.println("contraseña incorrecta, te qeudan " + i + " intentos");
            }
    }
        return false;
        }
     
     public void modificarNombre (Pass usu){
         System.out.println("Ingrese un nuevo nombre: ");
         usu.setNombre(scan.next());
         System.out.println("Su nombre se cambio correctamente.");
         System.out.println("");
     }
    
     public void modificarDNI (Pass usu){
         System.out.println("Ingrese un nuevo DNI: ");
         usu.setDni(scan.nextInt());
         System.out.println("Su DNI se cambio correctamente.");
         System.out.println("");
     }
     
     public void modificarPass (Pass usu){
         System.out.println("Ingrese una nueva contraseña: ");
         usu.setPass(scan.next());
         crearPass(usu);
         System.out.println("Su contraseña se cambio correctamente.");
         System.out.println("");
     }
     
     
    public void menu(Pass usu) throws InterruptedException{
        crearPass(usu);
        if (validarPass(usu)){
            System.out.println("Su contraseña se valido corretamente");
        int opc;
        do {
            System.out.println("Ingrese la opcion que desea: ");
            System.out.println("Opción 1 para modificar su nombre, opción 2 para modificar su dni, ");
            System.out.println("Opción 3 para modificar su contraseña, opción 4 para verificar el nivel de seguridad de su contraseña, ");
            System.out.println("Opción 5 para salir.");
            opc = scan.nextInt();
            switch (opc){
                case 1:
                    modificarNombre(usu);
                    break;
                case 2:
                    modificarDNI(usu);
                    break;
                case 3:
                    modificarPass(usu);
                    break;
                case 4:
                    analizarPass(usu);
                    break;
                case 5:
                    System.out.println("anda palla bobo!");
                
            }
            Thread.sleep(2500);
        } while (!(opc==5));
        }else{
            System.out.println("Te quedaste sin intentos, anda pa' alla bobo!");
            } 
        
                
        
    }
    

}
