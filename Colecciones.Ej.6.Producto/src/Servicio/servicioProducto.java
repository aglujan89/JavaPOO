/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/**
 *
 * @author fitog
 *
 */
//Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
//productos que venderemos y el precio que tendrán. Además, se necesita que la
//aplicación cuente con las funciones básicas.
//Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
//eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
//Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
//Realizar un menú para lograr todas las acciones previamente mencionadas.
public class servicioProducto {

    HashMap<String, Integer> productos;
    Scanner scan;

    public servicioProducto() {
        this.productos = new HashMap();
        this.scan = new Scanner(System.in).useDelimiter("\n");
    }

    public void ingresarProductos() {

        productos.put("Chupetin", 80);
        productos.put("Alfajor", 140);
        productos.put("Galletas", 100);
        productos.put("Caramelo", 10);
        productos.put("Gaseosa", 150);
        productos.put("Chicle", 5);
        
        do {
            Producto p = new Producto();
            System.out.println("Ingrese el nombre del producto:");
            p.setNombre(scan.next());
            System.out.println("Ingrese el precio del producto:");
            p.setPrecio(scan.nextInt());
            productos.put(p.getNombre(), p.getPrecio());
            System.out.println("Desea ingresar otro producto? S/N");
            String res = scan.next();
            if (res.equalsIgnoreCase("N")) {
                break;
            }
        } while (true);
    }

    public void modificarProducto() {
        System.out.println("Ingrese el nombre del producto para modificar su precio");
        String nombre = scan.next();
        if (productos.containsKey(nombre)) {
            System.out.println("Ingrese el precio actualizado");
            Integer valor = scan.nextInt();
            
            for (Map.Entry<String, Integer> prod : productos.entrySet()) {
                String key = prod.getKey();

                if (key.equals(nombre)) {
                    prod.setValue(valor);
                }
            }
        } else {
            System.out.println("El producto no existe");
        }

    }

    public void eliminarProducto(){
        System.out.println("Ingrese el nombre del producto a eliminar");
        String nombre = scan.next();
        if (productos.containsKey(nombre)) {
            productos.remove(nombre);
        }
        
    }
    
    public void mostrarProductos(){
        for (Map.Entry<String, Integer> prod : productos.entrySet()) {
            String key = prod.getKey();
            Integer value = prod.getValue();
            System.out.println("Producto: "+key + ", precio: " + value);
        }
    }
    
    public void menu(){
        boolean salir = false;
        do {
        
        System.out.println("------------Menu Productos---------------");
        System.out.println("1. Ingresar productos");
        System.out.println("2. Modificar precio de un producto");
        System.out.println("3. Eliminar producto");
        System.out.println("4. Mostrar todos los productos");
        System.out.println("5. Salir");
        System.out.println("");
        System.out.println("Ingrese una opción:");
        int op = scan.nextInt();
       
        switch (op){
            case 1:ingresarProductos();
            break;
            case 2:modificarProducto();
            break;                
            case 3:eliminarProducto();
            break;
            case 4:mostrarProductos();
            break;
            case 5: salir = true;
            break;
            default:System.out.println("Opcion incorrecta");            
            
        }
        } while (!salir);
       
        
    }
}
