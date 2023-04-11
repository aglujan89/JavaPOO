/*
 */
package servicios;

import entidades.Editorial;
import java.util.List;
import java.util.Scanner;
import persistencia.EditorialDAO;

/**
 *
 * @author fitog
 */
public class EditorialServicio {
//Esta clase tiene la responsabilidad de llevar adelante las funcionalidades necesarias para
//administrar editoriales (consulta, creación, modificación y eliminación)
    private final EditorialDAO DAO;
    private Scanner scan;

    public EditorialServicio() {
        this.DAO = new EditorialDAO();
        scan = new Scanner(System.in).useDelimiter("\n");
    }
    
    public Editorial crearEditorial (String nombre){
        Editorial editorial = new Editorial();
        try{
            editorial.setNombre(nombre);
            DAO.guardarEditorial(editorial);
            return editorial;
        }catch (Exception e){
            System.out.println("Error al crear editorial "+e.getMessage());
            return null;
        }
    }
    
    public Editorial buscarPorId(Integer id){
        try{
            return DAO.buscarPorId(id);
        }catch (Exception e){
            System.out.println("error al buscar editorial "+ e.getMessage());
            return null;
        }        
    }
    public boolean eliminarPorId(Integer id) {
        try {
            DAO.eliminarEditorial(id);
            return true;
        } catch (Exception e) {
            System.out.println("Error al eliminar editorial " + e.getMessage());
            return false;
        }
    }

    public List<Editorial> listarEditoriales() {
        try {
            return DAO.listarEditoriales();
        } catch (Exception e) {
            System.out.println("Error al listar editorial " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
      public Editorial buscarPorNombre(String nombre) {
        try {
            return DAO.buscarPorNombre(nombre);
        } catch (Exception e) {
            System.out.println("Error al buscar editorial por nombre " + e.getMessage());
            return null;
        }
    }
    
 
}
