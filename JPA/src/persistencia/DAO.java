/*
 */
package persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author fitog
 */
public class DAO<T> {

    protected final EntityManagerFactory emf = Persistence.createEntityManagerFactory("libreriaJPA");
    protected EntityManager em = emf.createEntityManager();

    protected void conectar() {
        try {
            if (!em.isOpen()) {
                em = emf.createEntityManager();
            }
        } catch (Exception e) {
            System.out.println("Error al conectar ---> " + e.getMessage());
        }
    }

    protected void desconectar() {
        try {
            if (em.isOpen()) {
                em.close();
            }
        } catch (Exception e) {
            System.out.println("Error al desconectar ---> " + e.getMessage());
        }
    }

    protected void guardar(T objeto) {
        try {
        conectar();
            em.getTransaction().begin();
            em.persist(objeto);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Error al guardar ---> " + e.getMessage());
        }finally{
        desconectar();
        }
    }

    protected void editar(T objeto) {
        try {
        conectar();
            em.getTransaction().begin();
            em.merge(objeto);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Error al editar ---> " + e.getMessage());
        } finally {
            desconectar();
        }
    }

    protected void eliminar(T objeto) {
        try{
        conectar();
        em.getTransaction().begin();
        em.remove(objeto);
        em.getTransaction().commit();    
        }catch(Exception e){
            System.out.println("Error al eliminar ---> "+e.getMessage());
        }finally{
        desconectar();
        }
    }

}
