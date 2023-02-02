/*
 */
package Servicio;

import Entidad.Carta;
import Entidad.Mazo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author fitog
 */
public class ServicioCarta {

    private ArrayList<Carta> mazo;
    private ArrayList<Carta> listaMonton;
    private Mazo baraja;
    private Scanner scan;

    public ServicioCarta() {

        this.mazo = new ArrayList();
        this.listaMonton = new ArrayList();
        this.baraja = new Mazo();
        this.scan = new Scanner(System.in);
    }

    public void crearCartas() {

        for (int i = 1; i <= 12; i++) {
            if (i == 8 || i == 9) {

            } else {
                mazo.add(new Carta(i, "bastos"));
                mazo.add(new Carta(i, "espadas"));
                mazo.add(new Carta(i, "oros"));
                mazo.add(new Carta(i, "copas"));
            }
            baraja.setMazoCartas(mazo);

        }

    }

    public void mostrarMazo() {
        for (Carta maz : baraja.getMazoCartas()) {
            System.out.println(maz);
        }

    }

//    barajar(): cambia de posición todas las cartas aleatoriamente.
    public void barajar() {

        Collections.shuffle(baraja.getMazoCartas());

    }

//siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
//se haya llegado al final, se indica al usuario que no hay más cartas.
    public void siguienteCarta() {
        if (baraja.getMazoCartas().isEmpty()) {
            System.out.println("No hay más cartas en el mazo");
        } else {
            System.out.println(baraja.getMazoCartas().get(baraja.getMazoCartas().size() - 1));
            listaMonton.add(baraja.getMazoCartas().get(baraja.getMazoCartas().size() - 1));
            baraja.getMazoCartas().remove(baraja.getMazoCartas().size() - 1);
        }

    }

//cartasDisponibles(): indica el número de cartas que aún se puede repartir.
    public void cartasDisponibles() {
        System.out.println("La cantidad de cartas disponibles son: " + baraja.getMazoCartas().size());
    }

//darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
//cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
//debemos indicárselo al usuario.
    public void darCartas() {
        System.out.println("Cuantas cartas desea?");
        int cant = scan.nextInt();

        if (cant > baraja.getMazoCartas().size()) {
            System.out.println("No hay tantas cartas como desea");
        } else {
            for (int i = 0; i < cant; i++) {
                listaMonton.add(baraja.getMazoCartas().get(baraja.getMazoCartas().size() - 1));
                baraja.getMazoCartas().remove(baraja.getMazoCartas().size() - 1);
            }
        }
    }

//cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
//indicárselo al usuario
    public void cartasMonton() {
        for (Carta listMon : listaMonton) {
            System.out.println(listMon);
        }
        System.out.println("La cantidad de cartas usadas son: " + listaMonton.size());
    }

//mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
//luego se llama al método, este no mostrara esa primera carta.
    public void mostrarBaraja() {
        for (Carta maz : mazo) {
            System.out.println(maz);
        }
        System.out.println("La cantidad de cartas en la baraja es de: " + baraja.getMazoCartas().size());
    }

    public void menu() {
        crearCartas();
        int op = 0;

        while (!(op == 6)) {
            System.out.println("");
            System.out.println("----- MENU -----");
            System.out.println("Seleccione una opción: ");
            System.out.println("1. Barajar el mazo");
            System.out.println("2. Ver siguiente carta");
            System.out.println("3. Pedir cartas");
            System.out.println("4. Ver cartas ya usadas");
            System.out.println("5. Ver cartas aún en el mazo");
            System.out.println("6. Salir del programa");
            System.out.println("");
            op = scan.nextInt();

            switch (op) {
                case 1:
                    barajar();
                    break;
                case 2:
                    siguienteCarta();
                    break;
                case 3:
                    darCartas();
                    break;
                case 4:
                    cartasMonton();
                    break;
                case 5:
                    mostrarBaraja();
                    break;
                case 6:
                    System.out.println("Hasta la vista!");
                    break;

                default:
                    System.out.println("La opción indicada no es valida, ingrese una opción valida.");

            }

        }

    }
}
