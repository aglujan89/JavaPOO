/*
 */
package Servicio;

import Entidad.Asiento;
import Entidad.Cine;
import Entidad.Espectador;
import Entidad.Pelicula;
import java.util.ArrayList;

/**
 *
 * @author fitog
 */
public class ServicioCine {

    private Cine cine;
    private ArrayList<Espectador> espectadores;

    public ServicioCine() {
        this.espectadores = new ArrayList();
        this.cine = new Cine();

        espectadores.add(new Espectador("Fede", 37, (float) 5000.5));
        espectadores.add(new Espectador("Mauri", 43, (float) 300.5));
        espectadores.add(new Espectador("Gabriel", 34, (float) 8000.5));
        espectadores.add(new Espectador("Valentino", 18, (float) 1000.5));
        espectadores.add(new Espectador("Carlos", 39, (float) 100.5));
        espectadores.add(new Espectador("Tincho", 26, (float) 2000.5));
        espectadores.add(new Espectador("Santi", 18, (float) 3000.5));

        cine.setPrecio((float) 500);
        cine.setPelicula(new Pelicula("Star Wars", 2.35F, 21, "Lucas"));

    }

    public void crearSala() {
        ArrayList<Asiento> asientos = new ArrayList();
        for (int fila = 8; fila > 0; fila--) {
            for (int columna = 0; columna < 6; columna++) {
                String letra = Character.toString((char) (65 + columna));
                String asiento = fila + letra;
                Asiento as = new Asiento();
                as.setNombre(asiento);
                //System.out.print(asiento);
                asientos.add(as);
            }

        }
        cine.setAsientos(asientos);
    }

    public void mostrarSala() {
        ArrayList<Asiento> asientos = cine.getAsientos();
        int cont = 0;
        for (Asiento asiento : asientos) {
            System.out.print(asiento);
            cont++;
            if (!asiento.getOcupado()) {
                System.out.print(" X ");
            } else {
                System.out.print("   ");
            }
            if (cont == 6) {
                System.out.println("");
                cont = 0;
            } else {
                System.out.print("|");
            }
        }
    }

    public void sentar() {
        for (Espectador espec : espectadores) {
            if (cine.getPrecio() > espec.getDinero() || cine.getPelicula().getEdadMin() > espec.getEdad()) {
                continue;
            } else {
                boolean ocupado = true;
                while (ocupado) {
                    String columna = Character.toString((char) ((Math.random() * 6) + 65));
                    int fila = (int) (Math.random() * 6) + 1;
                    String asiento = fila + columna;
                    ArrayList<Asiento> asientos = cine.getAsientos();
                    for (Asiento as : asientos) {
                        if(asiento.equals(as.getNombre())){
                            System.out.println(asiento + " " + as.getNombre() + " " + espec.getNombre());
                            if(as.getOcupado()){
                                break;
                            }else{
                                as.setOcupado(true);
                                ocupado = false;
                            }
                        }
                    }
                }
            }

        }
    }

}
