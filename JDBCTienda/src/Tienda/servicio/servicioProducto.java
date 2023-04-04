/*
 */
package Tienda.servicio;

import static Tienda.Tienda.leer;
import Tienda.entidad.Producto;
import Tienda.persistencia.ProductoDAO;
import java.util.Collection;
import java.util.Scanner;

/**
 *
 * @author fitog
 */
public class servicioProducto {

    private ProductoDAO dao;

    public servicioProducto() {
        this.dao = new ProductoDAO();
        leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void crearProducto(String nombre, double precio, int codigo_fabricante) throws Exception {

        if (nombre == null || nombre.isEmpty()) {
            throw new Exception("Debe ingresar el nombre del producto");
        }
        if (Double.isNaN(precio)) {
            throw new Exception("Debe ingresar un precio valido");
        }
        if (dao.buscarProductoPorNombre(nombre) != null) {
            throw new Exception("El producto ingresado ya existe");
        }

        Producto prod = new Producto();
        prod.setNombre(nombre);
        prod.setPrecio(precio);
        prod.setCodigo_fabricante(codigo_fabricante);
    }

    public Producto buscarProductoPorNombre() throws Exception {
        try {
            System.out.println("Ingrese el nombre del producto");
            String nombre = leer.next();
            if (nombre == null || nombre.isEmpty()) {
                throw new Exception("Debe ingresar el nombre del producto");
            }
            Producto prod = dao.buscarProductoPorNombre(nombre);
            return prod;
        } catch (Exception e) {
            throw e;
        }

    }

    public Collection<Producto> buscarProductosPorNombre() throws Exception {
        try {
            System.out.println("Ingrese el nombre del producto");
            String nombre = leer.next();
            if (nombre == null || nombre.isEmpty()) {
                throw new Exception("Debe ingresar el nombre del producto");
            }
            Collection<Producto> listaProd;
            listaProd = dao.buscarProductosPorNombre(nombre);
            return listaProd;
        } catch (Exception e) {
            throw e;
        }

    }

    public void verListaNombre() throws Exception {
        try {
            Collection<Producto> listaProd;
            listaProd = dao.listarNombreProducto();
            for (Producto producto : listaProd) {
                System.out.println(producto.getNombre());
            }
        } catch (Exception e) {
            throw e;
        }

    }

    public void verNombrePrecio() throws Exception {
        try {
            Collection<Producto> listaProd;
            listaProd = dao.listarNombrePrecioProducto();
            for (Producto producto : listaProd) {
                System.out.println(producto.getNombre() + " con Precio $" + producto.getPrecio());
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void verNombreProducto_p120_p202() throws Exception {
        try {
            Collection<Producto> listaProd;
            listaProd = dao.listarNombreProducto_p120_p202();
            for (Producto producto : listaProd) {
                System.out.println(producto.getNombre() + " con Precio $" + producto.getPrecio());
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void verPortatil() throws Exception {
        try {
            Collection<Producto> listaProd;
            listaProd = dao.listarProductoPortatil();
            for (Producto producto : listaProd) {
                System.out.println(producto.getNombre() + " con Precio $" + producto.getPrecio());
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void verProductoMasBarato() throws Exception {
        try {
            Producto prod = new Producto();
            prod = dao.buscarProductoMasBarato();
            System.out.println(prod.getNombre() + " con Precio $" + prod.getPrecio());
        } catch (Exception e) {
            throw e;
        }
    }

    public void nuevoProducto() throws Exception {
        try {
            Producto prod = new Producto();
            System.out.println("Ingrese el nombre del nuevo producto: ");
            leer.nextLine();
            prod.setNombre(leer.nextLine());
            System.out.println("Ingrese el precio del producto: ");
            prod.setPrecio(leer.nextDouble());
            System.out.println("Ingrese el codigo del fabricante: ");
            prod.setCodigo_fabricante(leer.nextInt());
            dao.guardarProducto(prod);
        } catch (Exception e) {
            throw e;
        }
    }

}
