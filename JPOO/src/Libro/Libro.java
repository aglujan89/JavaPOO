/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro;

//Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,

import java.util.Scanner;

//Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
//constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
//luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
//numero de páginas.

/**
 *
 * @author fitog
 */
public class Libro {
    
    private int isbn;
    private String titulo;
    private String autor;
    private int paginas;

    public Libro() {
    }

    public Libro(int isbn, String titulo, String autor, int paginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
    
        public void cargarlibro (Scanner leer) {

            System.out.println("Ingrese el ISBN");
            this.isbn = leer.nextInt();
            System.out.println("Ingrese el titulo");
            leer.nextLine();
            this.titulo = leer.nextLine();
            System.out.println("Ingrese el autor");
            this.autor = leer.nextLine();
            System.out.println("Ingrese la cantidad de paginas");
            this.paginas = leer.nextInt();

        
}

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + '}';
    }
   
    
}
