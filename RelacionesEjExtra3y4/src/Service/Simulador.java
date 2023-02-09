/*
 */
package Service;

import Entities.Alumno;
import Enum.apellidoAlum;
import Enum.nombreAlum;
import static LaTerceraSeguros.VotaEgg.scan;
import java.util.ArrayList;

/**
 *
 * @author fitog
 */
public class Simulador {

    private ArrayList<Alumno> Alumnos;
    private ArrayList<Integer> auxdni;

    public Simulador() {
        this.Alumnos = new ArrayList();
        this.auxdni = new ArrayList();
    }

    public void listaAlumnos() {

//       Determino la cantidad de alumnos a generar:
        System.out.println("Cuantos alumnos quiere generar?");
        int cantidadAlumno = scan.nextInt();
        System.out.println("----------LA CANTIDAD DE ALUMNOS GENERADOS ES: " + cantidadAlumno + "-------------------");

//        Genero un bucle hasta esa cantidad de alumnos para generar el nombre y apellido aleatoriamente en base a los enum de Apellido y Nombre
        for (int i = 0; i < cantidadAlumno; i++) {
            String nombrecompleto = "";

//          Variable auxiliar genera random para luego buscar en el enum un NOMBRE con ese orden random
            int aux2 = (int) ((Math.random() * 22));
            for (nombreAlum aux : nombreAlum.values()) {

                if (aux.ordinal() == (aux2)) {

                    nombrecompleto = aux.toString();
                }
            }
//          Variable auxiliar genera random para luego buscar en el enum un APELLIDO con ese orden random
            int aux3 = (int) ((Math.random() * 12));

            for (apellidoAlum ape : apellidoAlum.values()) {

                if (ape.ordinal() == (aux3)) {
                    nombrecompleto = nombrecompleto + " " + ape.toString();
                }
            }
//        Agrego a la lista de alumnos los alumnos generados con el nombre random
            Alumnos.add(new Alumno(nombrecompleto, null, null));
        }

    }

//    Genero DNI random y devuelvo lista
    public void generarDni() {
        int cantidadDni = Alumnos.size();

        for (int i = 0; i < cantidadDni; i++) {
            int n = (int) (Math.random() * 45000000 + 10000000);
            if (auxdni.contains(n)) {
                continue;
            }
            auxdni.add(n);

        }
    }

    public void crearAlumnos() {
        listaAlumnos();
        generarDni();
        int cero = -1;
        for (Alumno Alumno1 : Alumnos) {
            cero++;
            Alumno1.setDni(auxdni.get(cero));

        }
    }

    public void mostrarAlumnos() {
        for (Alumno listaAl : Alumnos) {
            System.out.println(listaAl);
        }

    }

}
