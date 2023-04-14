/*
 */
package servicios;

import entidades.Cliente;
import entidades.Libro;
import entidades.Prestamo;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import persistencia.PrestamoDAO;

/**
 *
 * @author fitog
 */
public class PrestamoServicio {

    private final PrestamoDAO DAO;
    private Scanner scan;

    public PrestamoServicio() {
        this.DAO = new PrestamoDAO();
        scan = new Scanner(System.in).useDelimiter("\n");
    }

    public Prestamo crearPrestamo() {
        Prestamo prestamo = new Prestamo();
        ClienteServicio servCliente = new ClienteServicio();
        LibroServicio servLibro = new LibroServicio();
        //        AutorService servA = new AutorService();
//        EditorialService servE = new EditorialService();
try {
//            System.out.println("Ingrese el ISDN del prestamo");
//            prestamo.setIsbn(scan.nextLong());
//            System.out.println("Ingrese el titulo del prestamo");
//            prestamo.setTitulo(scan.next());
//            System.out.println("Ingrese el año");
//            prestamo.setAnio(scan.nextInt());
//            System.out.println("Ingrese la cantidad de ejemplares");
//            prestamo.setEjemplares(scan.nextInt());
//            prestamo.setEjemRestantes(prestamo.getEjemRestantes());
//            prestamo.setEjemPrestados(0);
//            System.out.println("Ingrese el nombre del autor ");
//            String nombre = scan.next();
//            Autor a = servA.buscarPorNombre(nombre);
//            if (a == null) {
//                a = servA.crearAutor(nombre);
//            }
//            prestamo.setAutor(a);
//
//            //Autor
//            System.out.println("Ingrese el nombre de la editorial");
//
//            nombre = scan.next();
//            Editorial e = servE.buscarPorNombre(nombre);
//            if (e == null) {
//                e = servE.crearEditorial(nombre);
//            }
//            prestamo.setEditorial(e);
//            // Editorial
//
//            DAO.guardarPrestamo(prestamo);
//            System.out.println("¡ Prestamo creado !");
String fecha;
    System.out.println("Indique SI/NO si la fecha de inicio del prestamo es hoy --> "+ LocalDate.now());
String res = scan.next();
if(res.equalsIgnoreCase("si")){
    prestamo.setFechaPrestamo(LocalDate.now());
}else{
    do{
        System.out.println("Debe ingresar una fecha posterior a hoy en formato AAAA-MM-DD: ");
        fecha = scan.next();
LocalDate localDate = LocalDate.parse(fecha,DateTimeFormatter.ofPattern("uuuu-MM-dd"));
if (localDate.compareTo(LocalDate.now())>= 0){
    prestamo.setFechaPrestamo(localDate);
    break;
}
    }while (true);
}
    System.out.println("Indique la fecha de devolucion: ");
    do {
                System.out.println("Debe ingresar una fecha posterior a fecha del prestamo en formato AAAA-MM-DD)");
                String f = scan.next();
                LocalDate local = LocalDate.parse(f, DateTimeFormatter.ofPattern("uuuu-MM-dd"));
                if (local.compareTo(prestamo.getFechaPrestamo()) >= 0) {
                    prestamo.setFechaDevolucion(local);
                    break;
                }
            } while (true);
    System.out.println(prestamo.getFechaDevolucion());
            System.out.println("Ingrese el DNI del cliente:");
            Long dni = scan.nextLong();
            Cliente cl = servCliente.buscarPorDNI(dni);
            if (cl == null) {
                cl = servCliente.crearCliente();
            }
            prestamo.setCliente(cl);
            Libro lib = null;
             do {
                lib = servLibro.menuBuscar();
                if (lib.getEjempRestantes()<= 0) {
                    System.out.println("NO hay ejemplar disponible. Elija otro libro");
                    lib = null;
                } else {
                    lib.setEjempPrestados(lib.getEjempPrestados() + 1);
                    lib.setEjempRestantes(lib.getEjempRestantes() - 1);

                }
            } while (lib == null);
            prestamo.setLibro(lib);
            DAO.guardarPrestamo(prestamo);
            return prestamo;
        } catch (Exception e) {
            System.out.println("Error al crear prestamo " + e.getMessage());
            return null;
        }
    }
    public Prestamo buscarPorId(Long id) {
        try {
            return DAO.buscarPorId(id);
        } catch (Exception e) {
            System.out.println("Error al buscar prestamo por id" + e.getMessage());
            return null;
        }
    }
public List<Prestamo> buscarPrestamosDNICliente(Long doc) {
        try {
            return DAO.buscarPrestamosDNICliente(doc);
        } catch (Exception e) {
            System.out.println("Error al listar prestamo " + e.getMessage());
            e.printStackTrace();
            return null;
        }
}
    
    //    public Prestamo buscarPorNombre(String nombre) {
//        try {
//            return DAO.buscarPorNombre(nombre);
//        } catch (Exception e) {
//            System.out.println("Error al buscar prestamo por titulo " + e.getMessage());
//            return null;
//        }
//    }
//        public Prestamo buscarPorAutor(String nombre) {
//        try {
//            return DAO.buscarPorAutor(nombre);
//        } catch (Exception e) {
//            System.out.println("Error al buscar prestamo por autor " + e.getMessage());
//            return null;
//        }
//    }
//        public Prestamo buscarPorEditorial(String nombre) {
//        try {
//            return DAO.buscarPorAutor(nombre);
//        } catch (Exception e) {
//            System.out.println("Error al buscar prestamo por editorial " + e.getMessage());
//            return null;
//        }
//    }
    public boolean eliminarPorId(Long isbn) {
        try {
            DAO.eliminarPrestamo(isbn);
            return true;
        } catch (Exception e) {
            System.out.println("Error al eliminar prestamo " + e.getMessage());
            return false;
        }
    }

    public List<Prestamo> listarPrestamos() {
        try {
            return DAO.listarPrestamos();
        } catch (Exception e) {
            System.out.println("Error al listar prestamo " + e.getMessage());
            e.printStackTrace();
            //muestra la ruta del error.
            return null;
        }
    }
    public void  imprimirPrestamos(List<Prestamo> pres) {
        try {
            for (Prestamo pre : pres) {
                System.out.println(pres);
                
            }

        } catch (Exception e) {
            System.out.println("Error al listar prestamo " + e.getMessage());
            e.printStackTrace();

        }
    }
    
}
