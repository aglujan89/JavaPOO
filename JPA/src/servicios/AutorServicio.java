/*
 */
package servicios;

import entidades.Autor;
import java.util.List;
import java.util.Scanner;
import persistencia.AutorDAO;

/**
 *
 * @author fitog
 */


public class AutorServicio {
//Esta clase tiene la responsabilidad de llevar adelante las funcionalidades necesarias para
//administrar autores (consulta, creación, modificación y eliminación).
    private final AutorDAO DAO;
    private Scanner scan;
    
    public AutorServicio() {
        this.DAO = new AutorDAO();
        scan = new Scanner(System.in).useDelimiter("\n");

    }
    public Autor crearAutor(String nombre){
        Autor autor = new Autor();
        try{
            autor.setNombre(nombre);
            DAO.guardarAutor(autor);
            return autor;
        }catch (Exception e){
            System.out.println("Error al crear autor " + e.getMessage());
            return null;
        }
    }
    
    public Autor buscarPorId(Integer id) {
        try {
            return DAO.buscarPorId(id);
        } catch (Exception e) {
            System.out.println("Error al buscar autor por id" + e.getMessage());
            return null;
        }
    }
    public Autor buscarPorNombre(String nombre) {
        try {
            return DAO.buscarPorNombre(nombre);
        } catch (Exception e) {
            System.out.println("No se encuentra ningun autor con ese nombre " + e.getMessage());
            return null;
        }
    }
    
    public boolean eliminarPorId(Integer id) {
        try {
            DAO.eliminarAutor(id);
            return true;
        } catch (Exception e) {
            System.out.println("Error al eliminar autor " + e.getMessage());
            return false;
        }
    }
    
    public List<Autor> listarAutores() {
        try {
            return DAO.listarAutores();
        } catch (Exception e) {
            System.out.println("Error al listar autor " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
}
