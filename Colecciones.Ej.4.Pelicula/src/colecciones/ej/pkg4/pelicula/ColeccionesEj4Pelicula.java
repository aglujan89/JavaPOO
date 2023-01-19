/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones.ej.pkg4.pelicula;

import Servicio.servicioPelicula;

/**
 *
 * @author fitog
 */
public class ColeccionesEj4Pelicula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        servicioPelicula serv = new servicioPelicula();
        
        serv.cargarPeliculas();
        serv.mostrarPeliculas();
        System.out.println("");
        serv.mostrarPeliculasMashora();
        
        serv.ordenarDuracionDesc();
        System.out.println("");
        serv.mostrarPeliculas();
        serv.ordenarDuracionAsc();
        serv.mostrarPeliculas();
        System.out.println("");
        serv.ordenarTituloAlfa();
        serv.mostrarPeliculas();
        System.out.println("");
        serv.ordenarDirectorAlfa();
        serv.mostrarPeliculas();
    }
    
}
