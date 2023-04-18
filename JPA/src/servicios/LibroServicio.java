/*
 */
package servicios;

import entidades.Autor;
import entidades.Editorial;
import entidades.Libro;
import java.util.List;
import java.util.Scanner;
import persistencia.LibroDAO;

/**
 *
 * @author fitog
 */
public class LibroServicio {
//Esta clase tiene la responsabilidad de llevar adelante las funcionalidades necesarias para
//administrar libros (consulta, creación, modificación y eliminación).
    private final LibroDAO DAO;
    private Scanner scan;
    
    public LibroServicio(){
        this.DAO = new LibroDAO();
        scan = new Scanner(System.in).useDelimiter("\n");
    }
    
    public void guardarLibro(Libro l){
        try {
            DAO.guardarLibro(l);
        } catch (Exception e) {
            System.out.println("ERROR AL guardar libro");
        }
        
    }
    
    public Libro crearLibro(){
        Libro libro = new Libro();
        AutorServicio servA = new AutorServicio();
        EditorialServicio servE = new EditorialServicio();
        try{
            System.out.println("Ingrese el ISDN del libro:");
            libro.setIsbn(scan.nextLong());
            System.out.println("Ingrese el titulo del libro:");
            libro.setTitulo(scan.next());
            System.out.println("Ingrese el año:");
            
//            int anio = Integer.parseInt(scan.next());---->evita el error de guardado de memoria del nextInt.
//            Integer anio = Integer.valueOf(scan.next());---->evita el error de guardado de memoria del nextInt.

            scan.nextLine();
            libro.setAnio(scan.nextInt());
            System.out.println("Ingrese la cantidad de ejemplares:");
            libro.setEjemplares(scan.nextInt());
            libro.setEjempRestantes(libro.getEjempRestantes());
            libro.setEjempPrestados(0);
            System.out.println("Ingrese el nombre del autor: ");
            String nombre = scan.next();
            Autor a = servA.buscarPorNombre(nombre);
            if (a == null){
                a = servA.crearAutor(nombre);
            }
            libro.setAutor(a);
            System.out.println("ingrese el nombre de la editorial:");
            nombre = scan.next();
            Editorial e = servE.buscarPorNombre(nombre);
            if(e==null){
                e = servE.crearEditorial(nombre);
            }
            libro.setEditorial(e);
            DAO.guardarLibro(libro);
            System.out.println("Libro creado! ");
            return libro;
        }catch (Exception e){
            System.out.println("error al crear libro "+e.getMessage());
            return null;
        }
    }
    
    public Libro buscarPorId(Long isbn){
        try{
            return DAO.buscarPorId(isbn);
        }catch (Exception e){
            System.out.println("Error al buscar libro por isbn " + e.getMessage());
            return null;
        }
    }
    
    public Libro buscarPorNombre(String nombre){
        try{
            return DAO.buscarPorNombre(nombre);
        }catch (Exception e){
            System.out.println("Error al buscar libro por titulo: "+e.getMessage());
            return null;
        }
    }
    public Libro buscarPorAutor(String nombre){
        try{
            return DAO.buscarPorAutor(nombre);
        }catch (Exception e){
            System.out.println("error al buscar libro por autor "+e.getMessage());
            return null;
        }
    }
    public Libro buscarPorEditorial(String nombre){
        try{
            return DAO.buscarPorEditorial(nombre);
        }catch (Exception e){
            System.out.println("Error al buscar libro por editorial "+e.getMessage());
            return null;
        }
    }
    
    public boolean eliminarPorId(Long isbn){
        try{
            DAO.eliminarLibro(isbn);
            return true;
        }catch (Exception e){
            System.out.println("Error al eliminar libro "+e.getMessage());
            return false;
        }
    }
    public List<Libro> listarLibros(){
        try{
            return DAO.listarLibros();
        }catch (Exception e){
            System.out.println("Error al listar libro "+e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
    public Libro menuBuscar() {
        Libro l = null;
        try {
            System.out.println("Elija una forma de buscar el libro: ");
            System.out.println("");
            System.out.println("1. Buscar libro por su ISBN ");
            System.out.println("2. Buscar libro por titulo ");
            int op = scan.nextInt();
            switch (op) {
                case 1:
                    System.out.println("INGRESE el ISBN");
                    Long is = scan.nextLong();
                    l = buscarPorId(is);
                    break;
                case 2:
                    System.out.println("INGRESE el titulo");
                    String tit = scan.next();
                    l= buscarPorNombre(tit);
                    break;
                default:
                    break;
            }
        } catch (Exception e) {
            System.out.println("Opcion incorrecta!!!");
            menuBuscar();
        }
        return l;
    }
}
