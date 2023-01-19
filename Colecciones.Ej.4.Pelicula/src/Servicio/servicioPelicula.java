/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Comparador.Compa;
import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author fitog
 */
public class servicioPelicula {
    
    private Scanner scan = new Scanner(System.in);
    private ArrayList<Pelicula> listaPeli;

    public servicioPelicula() {
        this.listaPeli = new ArrayList();
    
    }
    
    public void cargarPeliculas(){
            System.out.println("--------Se solicitan datos de las peliculas--------");
            System.out.println("");
        
        do {
        Pelicula peli = new Pelicula();
            System.out.println("ingrese el titulo de la pelicula: ");
            peli.setTitulo(scan.next());
            System.out.println("Ingrese el nombre del director de la pelicula:");
            peli.setDirector(scan.next());
            System.out.println("Ingrese la duración de la pelicula:");
            peli.setDuracion(scan.nextFloat());
            
            listaPeli.add(peli);
            System.out.println("Desea ingresar otra pelicula? (S/N)");
            String res = scan.next();
            if (res.equals("N")) {
                break;                
            }
        } while (true);
        
    }
    
    public void mostrarPeliculas(){
        System.out.println("Se muestran todas las peliculas.");
        for (Pelicula peli : listaPeli) {
            System.out.println(peli);                
        }
    }
    
    public void mostrarPeliculasMashora(){
        System.out.println("Se muestran todas las peliculas mayor a una hora de duración.");
        for (Pelicula peli : listaPeli) {
            if (peli.getDuracion()>1) {
            System.out.println(peli);                
            }
        }
    }
    
    /**
     * Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla.
     */
    
 
    
    public void ordenarDuracionAsc(){
        System.out.println("Muesntra por duracion menor a mayor");
        Collections.sort(listaPeli, Compa.compararDuracionAsc);
     
    }
    
  public void ordenarDuracionDesc(){
      System.out.println("Muestra por duracion mayor a menor");
        Collections.sort(listaPeli, Compa.compararDuracionDesc);
        
    }
  
  public void ordenarTituloAlfa(){
      System.out.println("Ordena por titulo alfabeticamente");
      Collections.sort(listaPeli, Compa.compararTituloAlfa);
      
  }
  
  public void ordenarDirectorAlfa(){
      System.out.println("Ordenar por director alfabeticamente");
      Collections.sort(listaPeli, Compa.compararDirectorAlfa);
  }
  
  
}
