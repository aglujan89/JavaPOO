/*
 */
package Service;

import Entities.Alumno;
import Entities.Voto;
import Enum.apellidoAlum;
import Enum.nombreAlum;
import static LaTerceraSeguros.VotaEgg.scan;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author fitog
 */
public class Simulador {

    private ArrayList<Alumno> Alumnos;
    private ArrayList<Integer> auxdni;
    private ArrayList<Voto> votos;

    public Simulador() {
        this.Alumnos = new ArrayList();
        this.auxdni = new ArrayList();
        this.votos = new ArrayList();
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

//    Agrego los DNI generados a la lista de alumnos
    public void crearAlumnos() {
        listaAlumnos();
        generarDni();
        int cero = 0;
        for (Alumno Alumno1 : Alumnos) {
            Alumno1.setDni(auxdni.get(cero));
            cero++;
        }
    }

//    Muestra los alumnos de la lista
    public void mostrarAlumnos() {
        for (Alumno listaAl : Alumnos) {
            System.out.println(listaAl);
        }

    }

    public void votar(Alumno alumno) {
        Voto vx = new Voto();
        vx.setAlumnoVotante(alumno);
        HashSet listx = new HashSet();
        for (int i = 0; i < 3; i++) {
            Alumno alumaux = Alumnos.get((int) (Math.random() * Alumnos.size()));
            if (!(alumaux == alumno)) {
                if (!(listx.contains(alumaux))) {
                    listx.add(alumaux);
                    for (Alumno alumnoX : Alumnos) {
                        if (alumaux == alumnoX) {
                            alumnoX.setCantVotos(alumnoX.getCantVotos() + 1);
                        }
                    }
                }
            }
        }
        vx.setAlumnosVotados(listx);
        votos.add(vx);
    }

    public void iniciarVotacion() {
        for (Alumno Alumno1 : Alumnos) {
            votar(Alumno1);
        }
    }
    
    public void mostrarVotos(){
        for (Voto Votos1 : votos) {
            System.out.println(Votos1);
        }
    }

}
