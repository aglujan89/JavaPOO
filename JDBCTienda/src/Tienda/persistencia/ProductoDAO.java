package Tienda.persistencia;

import Tienda.entidad.Producto;




/*
 */

/**
 *
 * @author fitog
 */
public final class ProductoDAO extends DAO {
    
    public void guardarProducto(Producto prod) throws Exception {

        try {
            if (prod == null) {
                throw new Exception("Debe ingresar un producto");
            }
            String sql = "INSERT INTO Producto (nombre, precio)"
                    + "VALUES ( '" + prod.getNombre() + "' , '" + prod.getPrecio() + "' , '" + prod.getCodigo_fabricante()+ "');";

            insertarModificarEliminar(sql);

        } catch (Exception e) {
            throw e;
        }

    }
    
    public void modificarNombreProducto(Producto prod) throws Exception {

        try {
            if (prod == null) {
                throw new Exception("Debe ingresar un producto a modificar");
            }

            String sql = "UPDATE Producto SET "
                    + "Nombre: '" + prod.getNombre() + "';";

            insertarModificarEliminar(sql);

        } catch (Exception e) {
            throw e;
        }

    }
    
    
    
    
}
