/*
 */
package servicios;

import entidades.Autor;
import entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author fitog
 */
public class LibreriaServicio {
    private final Scanner scan = new Scanner(System.in).useDelimiter("\n");
    
    public LibreriaServicio(){
    
}
    public void presioneTecla(){
            System.out.println("");
            System.out.println("Presione ENTER para continuar...");
            String letra = scan.next();
    }
    
    public void menu() throws Exception {
        AutorServicio servA = new AutorServicio();
        LibroServicio servL = new LibroServicio(); 
        
        try{
            System.out.println("<*************** MENÚ JPA ***************>");
            System.out.println("");
            System.out.println("1. Búsqueda de un Autor por nombre");
            System.out.println("2. Búsqueda de un libro por ISBN.");
            System.out.println("3. Búsqueda de un libro por Título.");
            System.out.println("4. Búsqueda de un libro/s por nombre de Autor.");
            System.out.println("5. Búsqueda de un libro/s por nombre de Editorial");
     
            System.out.println("6. Salir");
            System.out.println("");
            System.out.print("Ingrese una opcion: ");
            System.out.println("");
            int op = scan.nextInt();
            switch(op){
                case 1:
                    System.out.println("Ingrese el nombre del autor a buscar: ");
                    String nombre = scan.next();
                    Autor a = servA.buscarPorNombre(nombre);
                    if(a==null){
                        System.out.println("El autor no existe");
                    }
                    else{
                        System.out.println(a);
                    }
                    presioneTecla();
                    menu();
                    break;
                case 2:
                    System.out.println("Ingrese el ISBN del libro a buscar: ");
                    Long is = scan.nextLong();
                    Libro l = servL.buscarPorId(is);
                    if(l==null){
                        System.out.println("El libro no exite");
                    }else{
                        System.out.println(l);
                    }
                    presioneTecla();
                    menu();
                    break;
                case 3:
              
                    presioneTecla();
                    menu();
                    break;
                case 4:
               
                    presioneTecla();
                    menu();
                    break;
                case 5:
                
                    presioneTecla();
                    menu();
                    break;
                case 6:         
                   break;
                
                default:
                    System.out.println("Opcion incorrecta!!");
                    presioneTecla();
                    menu();
                    break;
                    
            }
        }catch (Exception e){
            System.out.println("DEBE ingresar un numero, no simbolos ni letras");
            presioneTecla();
            menu();
        }
    }
    
    
}
