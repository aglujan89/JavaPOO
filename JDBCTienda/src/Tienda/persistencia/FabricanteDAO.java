/*
 */
package Tienda.persistencia;

import Tienda.entidad.Fabricante;

/**
 *
 * @author fitog
 */
public final class FabricanteDAO extends DAO {
    
    public void guardarFabricante(Fabricante fab) throws Exception {
        
        try {
            if (fab == null) {
                throw new Exception("Debe ingresar un fabricante");
            }
            
            String sql = "INSERT INTO Fabricante (nombre)" + 
                    "VALUES ( '" + fab.getNombre() + "' )";
            
            insertarModificarEliminar(sql);
                    
        } catch (Exception e) {
            throw e;
        }
        
    }
   
    public void modificarNombreFabricante(Fabricante fab) throws Exception {
        
        try {
            if (fab == null) {
                throw new Exception("Debe ingresar el fabricante a modificar");
            }
            
            String sql = "UPDATE Fabricante SET " + 
                    "Nombre: '" + fab.getNombre()+ "' ";
            
            insertarModificarEliminar(sql);
                    
        } catch (Exception e) {
            throw e;
        }
        
    }
    
    public void eliminarFabricante(Fabricante fab) throws Exception {

        try {
            if (fab == null) {
                throw new Exception("Debe ingresar un fabricante a eliminar");
            }

            String sql = "DELETE FROM Fabricante WHERE Nombre: '" + fab.getNombre() + "';";

            insertarModificarEliminar(sql);

        } catch (Exception e) {
            throw e;
        }

    }
    
    
}
