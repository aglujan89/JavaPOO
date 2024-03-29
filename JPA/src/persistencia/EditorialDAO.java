/*
 */
package persistencia;

import entidades.Editorial;
import java.util.List;

/**
 *
 * @author fitog
 */
public class EditorialDAO extends DAO<Editorial>{
    
    public void guardarEditorial(Editorial editorial){
       guardar(editorial);
    }
     
     public void eliminarEditorial(Integer id) throws Exception {
        Editorial editorial = buscarPorId(id);
//        eliminar(editorial);
        editorial.setAlta(Boolean.FALSE);
        editar(editorial);  
    }
     
     public List<Editorial> listarEditoriales() throws Exception {
        conectar();
        List<Editorial> editorials = em.createQuery("SELECT e FROM Editorial e ").getResultList();
        desconectar();
        return editorials;
    }
     
     public Editorial buscarPorId(Integer id) throws Exception {
        conectar();
        Editorial editorial = null;
        editorial = (Editorial) em.createQuery("SELECT e FROM Editorial e WHERE e.id LIKE :id").setParameter("id", id.toString()).getSingleResult();
        desconectar();
        return editorial;
    }
    public Editorial buscarPorNombre(String nombre) throws Exception {
        conectar();
        Editorial editorial = null;
        editorial = (Editorial) em.createQuery("SELECT e FROM  e WHERE e.nombre LIKE :nombre").setParameter("nombre", nombre).getSingleResult();
        desconectar();
        return editorial;
    }
}
