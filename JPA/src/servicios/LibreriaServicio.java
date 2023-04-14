/*
 */
package servicios;

import entidades.Autor;
import entidades.Cliente;
import entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author fitog
 */
public class LibreriaServicio {

    public Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public LibreriaServicio() {

    }

    public void presioneTecla() {
        System.out.println("");
        System.out.println("Presione ENTER para continuar...");
        String letra = scan.next();
    }

    public void menu123() throws Exception {
        AutorServicio servA = new AutorServicio();
        LibroServicio servL = new LibroServicio();
        
        try {
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
            switch (op) {
                case 1:
                    System.out.println("Ingrese el nombre del autor a buscar: ");
                    String nombre = scan.next();
                    Autor a = servA.buscarPorNombre(nombre);
                    if (a == null) {
                        System.out.println("El autor no existe");
                    } else {
                        System.out.println(a);
                    }
                    presioneTecla();
                    menu();
                    break;
                case 2:
                    System.out.println("Ingrese el ISBN del libro a buscar: ");
                    Long is = scan.nextLong();
                    Libro l = servL.buscarPorId(is);
                    if (l == null) {
                        System.out.println("El libro no exite");
                    } else {
                        System.out.println(l);
                    }
                    presioneTecla();
                    menu();
                    break;
                case 3:
                    System.out.println("Ingrese el titulo del libro a buscar: ");
                    String tit = scan.next();
                    Libro l1 = servL.buscarPorNombre(tit);
                    if (l1 == null) {
                        System.out.println("El libro no existe");
                    } else {
                        System.out.println(l1);
                    }
                    presioneTecla();
                    menu();
                    break;
                case 4:
                    System.out.println("Ingrese el autor para buscar sus libro: ");
                    String aut = scan.next();
                    Libro l2 = servL.buscarPorAutor(aut);
                    if (l2 == null) {
                        System.out.println("El libro no existe");
                    } else {
                        System.out.println(l2);
                    }
                    presioneTecla();
                    menu();
                    break;
                case 5:
                    System.out.println("Ingrese la editorial para buscar sus libros: ");
                    String ed = scan.next();
                    Libro l3 = servL.buscarPorEditorial(ed);
                    if (l3 == null) {
                        System.out.println("El libro no existe");
                    } else {
                        System.out.println(l3);
                    }
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
        } catch (Exception e) {
            System.out.println("DEBE ingresar un numero, no simbolos ni letras");
            presioneTecla();
            menu();
        }
    }

    public void menu() throws Exception {
        AutorServicio servA = new AutorServicio();
        LibroServicio servL = new LibroServicio();
        ClienteServicio servC = new ClienteServicio();
        PrestamoServicio servP = new PrestamoServicio();
        try {

            System.out.println("<*************** MENÚ JPA ***************>");
            System.out.println("");
            System.out.println("1. Creación de un Cliente nuevo");
            System.out.println("2. Registrar el préstamo de un libro");
            System.out.println("3. Devolución de un libro");
            System.out.println("4. Búsqueda de todos los préstamos de un Cliente.");

            System.out.println("5. Salir");
            System.out.println("");
            System.out.print("Ingrese una opcion: ");
            System.out.println("");
            int op = scan.nextInt();
            switch (op) {
                case 1:
                    System.out.println("CREAR CLIENTE");
                    servC.crearCliente();
                    presioneTecla();
                    menu();
                    break;
                case 2:
                    System.out.println("REGISTRO DE UN PRESTAMO");
                    servP.crearPrestamo();
                    presioneTecla();
                    menu();
                    break;
                case 3:
                    System.out.println("DEVOLUCION DE UN LIBRO");
                    System.out.println("Indique el numero de prestamo: ");
                    servP.eliminarPorId(scan.nextLong());
                    presioneTecla();
                    menu();
                    break;
                case 4:
                    System.out.println("PRESTAMOS DE UN CLIENTE ");
                    System.out.println("");
                    System.out.println("Indique el documento del cliente: ");
                    Long dni = scan.nextLong();
                    Cliente cl = servC.buscarPorDNI(dni);
                    if (cl == null){
                        System.out.println("EL cliente no existe");
                    }
                    else{
                        servP.imprimirPrestamos(servP.buscarPrestamosDNICliente(cl.getDoc()));
                        
                    }
                    presioneTecla();
                    menu();
                    break;
                case 5:
                    break;

                default:
                    System.out.println("Opcion incorrecta!!");
                    presioneTecla();
                    menu();
                    break;
            }

        } catch (Exception e) {
//            throw e;
            System.out.println("DEBE ingresar un numero, no simbolos ni letras");
            presioneTecla();
            menu();
        }
    }
    
    
}
