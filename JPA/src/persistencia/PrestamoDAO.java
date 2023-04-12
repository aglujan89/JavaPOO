/*
 */
package persistencia;

import entidades.Prestamo;
import java.util.List;

/**
 *
 * @author fitog
 */
public class PrestamoDAO extends DAO{
    
    public void guardarPrestamo(Prestamo prestamo) {
        guardar(prestamo);
    }

    public void eliminarPrestamo(Long isbn) throws Exception {
        Prestamo prestamo = buscarPorId(isbn);    
     eliminar(prestamo);     
    }

    public List<Prestamo> listarPrestamos() throws Exception {
        conectar();
        List<Prestamo> prestamos = em.createQuery("SELECT p FROM Prestamo p ").getResultList();
        desconectar();
        return prestamos;
    }

    public Prestamo buscarPorId(Long id) throws Exception {
        conectar();
        Prestamo prestamo = null;
        prestamo = (Prestamo) em.createQuery("SELECT p FROM Prestamo p WHERE p.isbn LIKE :id").setParameter("id", id).getSingleResult();
        desconectar();
        return prestamo;
    }
    
    
}
