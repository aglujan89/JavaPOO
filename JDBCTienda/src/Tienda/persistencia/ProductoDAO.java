package Tienda.persistencia;

import Tienda.entidad.Producto;
import java.util.ArrayList;
import java.util.Collection;




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
            String sql = "INSERT INTO Producto "
                    + "VALUES (null,'" + prod.getNombre() + "' , '" + prod.getPrecio() + "' , '" + prod.getCodigo_fabricante()+ "');";

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
    
    public void modificarPrecioProducto(Producto prod) throws Exception {

        try {
            if (prod == null) {
                throw new Exception("Debe ingresar un producto a modificar");
            }

            String sql = "UPDATE Producto SET "
                    + "Precio: '" + prod.getPrecio() + "';";

            insertarModificarEliminar(sql);

        } catch (Exception e) {
            throw e;
        }

    }
    
    public void eliminarProducto(Producto prod) throws Exception {

        try {
            if (prod == null) {
                throw new Exception("Debe ingresar un producto a eliminar");
            }

            String sql = "DELETE FROM Producto WHERE Nombre: '" + prod.getNombre() + "';";

            insertarModificarEliminar(sql);

        } catch (Exception e) {
            throw e;
        }

    }
   
    public Producto buscarProductoPorNombre(String nombre) throws Exception {

        try {
            
            String sql = "SELECT * FROM Producto " + " WHERE nombre LIKE  '%" + nombre + "%'; "; 
            
            consultarBase(sql);

            Producto prod = null;
            while (resultado.next()) {
                prod = new Producto();
                prod.setCodigo(resultado.getInt(1));
                prod.setNombre(resultado.getString(2));
                prod.setPrecio(resultado.getDouble(3));
                prod.setCodigo_fabricante(resultado.getInt(4));

            }
            desconectarBase();
            return prod;

        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
    
    public Collection<Producto> buscarProductosPorNombre(String nombre) throws Exception {

        try {
            
            String sql = "SELECT * FROM Producto " + " WHERE nombre LIKE '%" + nombre + "%'; "; 
            
            consultarBase(sql);

            Producto prod = null;
            Collection<Producto> listaProd = new ArrayList();
            while (resultado.next()) {
                prod = new Producto();
                prod.setCodigo(resultado.getInt(1));
                prod.setNombre(resultado.getString(2));
                prod.setPrecio(resultado.getDouble(3));
                listaProd.add(prod);
            }
            desconectarBase();
            return listaProd;

        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
    
    public Collection<Producto> listarNombreProducto() throws Exception {
  
        try {

            String sql = "SELECT nombre FROM Producto ;";
            consultarBase(sql);
            Producto prod = null;
            Collection<Producto> listaProd = new ArrayList();
            while (resultado.next()) {
                prod = new Producto();
                prod.setNombre(resultado.getString(1));
                listaProd.add(prod);
            }
            desconectarBase();
            return listaProd;
        } catch (Exception e) {
            e.printStackTrace(); // Imprime la ruta del error
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
   
    public Collection<Producto> listarNombrePrecioProducto() throws Exception {

        try {

            String sql = "SELECT nombre, precio FROM Producto ;";
            consultarBase(sql);

            Producto prod = null;
            Collection<Producto> listaProd = new ArrayList();
            while (resultado.next()) {
                prod = new Producto();
                prod.setNombre(resultado.getString(1));
                prod.setPrecio(resultado.getDouble(2));
                listaProd.add(prod);
            }
            desconectarBase();
            return listaProd;
        } catch (Exception e) {
            e.printStackTrace(); // Imprime la ruta del error
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
    
    public Collection<Producto> listarNombreProducto_p120_p202() throws Exception {

        try {

            String sql = "SELECT nombre, precio FROM Producto;";
            consultarBase(sql);

            Producto prod = null;
            Collection<Producto> listaProd = new ArrayList();
            while (resultado.next()) {
                prod = new Producto();
                if (resultado.getDouble(2) > 120 && resultado.getDouble(2) < 202) {
                    prod.setNombre(resultado.getString(1));
                    prod.setPrecio(resultado.getDouble(2));
                    listaProd.add(prod);
                }

            }
            desconectarBase();
            return listaProd;
        } catch (Exception e) {
            e.printStackTrace(); // Imprime la ruta del error
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }

    public Collection<Producto> listarProductoPortatil() throws Exception {

        try {

            String sql = "SELECT * FROM Producto WHERE nombre LIKE '%Portatil%';";
            consultarBase(sql);

            Producto prod = null;
            Collection<Producto> listaProd = new ArrayList();
            while (resultado.next()) {
                prod = new Producto();
                prod.setCodigo(resultado.getInt(1));
                prod.setNombre(resultado.getString(2));
                prod.setPrecio(resultado.getDouble(3));
                prod.setCodigo_fabricante(resultado.getInt(4));
                listaProd.add(prod);

            }
            desconectarBase();
            return listaProd;
        } catch (Exception e) {
            e.printStackTrace(); // Imprime la ruta del error
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
    
    public Producto buscarProductoMasBarato() throws Exception {

        try {

            String sql = "SELECT nombre, precio FROM producto WHERE precio = (SELECT min(precio) FROM producto);";

            consultarBase(sql);

            Producto prod = null;
            while (resultado.next()) {
                prod = new Producto();
                prod.setNombre(resultado.getString(1));
                prod.setPrecio(resultado.getDouble(2));

            }
            desconectarBase();
            return prod;

        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
  
    
}
