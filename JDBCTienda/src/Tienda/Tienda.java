/*
 */
package Tienda;

import Tienda.servicio.servicioFabricante;
import Tienda.servicio.servicioProducto;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author fitog
 */
public class Tienda {

    /**
     * @param args the command line arguments
     */
    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) throws Exception {
        boolean bool = true;
        int aux;
        servicioProducto servP = new servicioProducto();
        servicioFabricante servF = new servicioFabricante();
        do {
            System.out.println(
                    "\nSistema de consultas\n"
                    + "Menu Principal\n"
                    + "1) Mostar el nombre de todos los productos.\n"
                    + "2) Mostrar precios de todos los productos.\n"
                    + "3) Mostrar los productos con precio entre 120 y 202.\n"
                    + "4) Mostrar todos los protatiles.\n"
                    + "5) Mostrar nombre y precio del producto mas barato.\n"
                    + "6) Ingresar un producto nuevo.\n"
                    + "7) Ingresar un fabricante nuevo.\n"
                    + "8) Editar la informacion de un producto\n"
                    + "9) Salir\n");

            try {

                aux = leer.nextInt();
                switch (aux) {
                    case 1:
                        servP.verListaNombre();
                        break;
                    case 2:
                        servP.verNombrePrecio();
                        break;
                    case 3:
                        servP.verNombreProducto_p120_p202();
                        break;
                    case 4:
                        servP.verPortatil();
                        break;
                    case 5:
                        servP.verProductoMasBarato();
                        break;
                    case 6:
                        servP.nuevoProducto();
                        break;
                    case 7:

                        break;
                    case 8:

                        break;
                    case 9:
                        bool = false;
                        break;
                    default:
                        System.out.println("Opcion incorrecta\n"
                                + "Digite un numero valido");
                }
            } catch (InputMismatchException e) {
                System.err.println("Debes ingresar un numero entero.");
                leer.nextLine();
            } catch (Exception e) {
                System.err.println("Fallo grave en el sistema... SkyNet activada");;
            } finally {
            }

        } while (bool == true);

        // TODO code application logic here
    }

}
