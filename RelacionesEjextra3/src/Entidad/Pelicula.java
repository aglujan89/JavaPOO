/*
 */
package Entidad;

/**
 *
 * @author fitog
 */
//Luego, de las películas nos interesa saber
//el título, duración, edad mínima y director.
public class Pelicula {
    private String titulo;
    private Float duracion;
    private Integer edadMin;
    private String director;

    public Pelicula() {
    }

    public Pelicula(String titulo, Float duracion, Integer edadMin, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadMin = edadMin;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Float getDuracion() {
        return duracion;
    }

    public void setDuracion(Float duracion) {
        this.duracion = duracion;
    }

    public Integer getEdadMin() {
        return edadMin;
    }

    public void setEdadMin(Integer edadMin) {
        this.edadMin = edadMin;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", duracion=" + duracion + ", edadMin=" + edadMin + ", director=" + director + '}';
    }
    
    
    
}
