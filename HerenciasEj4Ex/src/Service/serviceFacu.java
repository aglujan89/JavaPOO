/*
 */
package Service;

import Entities.Empleado;
import Entities.Estudiante;
import Entities.Persona;
import Entities.PersonalServicio;
import Entities.Profesor;
import Enum.EstadoCivil;
import static Enum.EstadoCivil.CASADO;
import static Enum.EstadoCivil.DIVORCIADO;
import static Enum.EstadoCivil.SOLTERO;
import static Enum.EstadoCivil.CONCUBINATO;
import static Enum.EstadoCivil.VIUDO;
import static herenciasej4ex.HerenciasEj4Ex.scan;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author fitog
 */
public class serviceFacu {

    private ArrayList<Persona> personas = new ArrayList<>();

    public serviceFacu() {
        Estudiante est = new Estudiante(new ArrayList(Arrays.asList("Matematica", "Literatura")), "Pepito", "Gomez", 11111, SOLTERO);
        personas.add(est);
        Profesor pro = new Profesor("Matematica", 2010, 4081, "Alberto", "Funji", 22222, CASADO);
        personas.add(pro);
        PersonalServicio ps = new PersonalServicio("Biblioteca", 1990, 4080, "Roberto", "Strub", 33333, VIUDO);
        personas.add(ps);
    }

    private Persona buscarPersona() {
        System.out.println("Ingrese el DNI de la persona:");
        int dni = scan.nextInt();
        for (Persona persona : personas) {
            if (persona.getID() == dni) {
                return persona;
            }
        }
        return null;
    }

    private Estudiante buscarEstudiante() {
        System.out.println("Ingrese el DNI de la persona:");
        int dni = scan.nextInt();
        for (Persona persona : personas) {
            if (persona.getID() == dni) {
                if (persona instanceof Estudiante) {
                    Estudiante e = (Estudiante) persona;
                    return e;
                }

            }
        }
        return null;
    }

    private Empleado buscarEmpleado() {
        System.out.println("Ingrese el DNI de la persona:");
        int dni = scan.nextInt();
        for (Persona persona : personas) {
            if (persona.getID() == dni) {
                if (persona instanceof Empleado) {
                    Empleado e = (Empleado) persona;
                    return e;
                }

            }
        }
        return null;

    }

    private Profesor buscarProfesor() {
        System.out.println("Ingrese el DNI de la persona:");
        int dni = scan.nextInt();
        for (Persona persona : personas) {
            if (persona.getID() == dni) {
                if (persona instanceof Profesor) {
                    Profesor p = (Profesor) persona;
                    return p;
                }
            }
        }
        return null;

    }

    private PersonalServicio buscarPersonal() {
        System.out.println("Ingrese el DNI de la persona:");
        int dni = scan.nextInt();
        for (Persona persona : personas) {
            if (persona.getID() == dni) {
                if (persona instanceof PersonalServicio) {
                    PersonalServicio per = (PersonalServicio) persona;
                    return per;
                }
            }
        }
        return null;

    }

    public void cambioEstadoCivil(Persona p) {

        boolean aux = true;

        while (aux) {
            System.out.println("Ingrese su nuevo estado civil - CASADO/SOLTERO/VIUDO/DIVORCIADO/CONCUBINATO");
            String resp = scan.next();
            for (EstadoCivil estado : EstadoCivil.values()) {
                if (estado.name().equalsIgnoreCase(resp)) {
                    p.cambioEstadoCivil(estado);
                    aux = false;
                    break;
                }
            }
        }

    }

    public void cambioDespacho(Empleado e) {

        System.out.println("Ingrese el numero de despacho:");

        while (!scan.hasNextInt()) {
            System.out.println("el numero es incorrecto, ingreselo nuevamente");
            scan.next();
        }
        int nroD = scan.nextInt();
        System.out.println("El número ingresado es: " + nroD);

        e.cambioNroDespacho(nroD);
    }

    public void cambioMatricula(Estudiante e) {
        System.out.println("Ingrese el curso al que se va a inscribir: ");
        String curs = scan.next();
        ArrayList<String> cur = e.getCurso();
        cur.add(curs);
        e.setCurso(cur);
    }

    private void presioneTecla() {
        System.out.println("");
        System.out.println("Presione ENTER para continuar...");
        String letra = scan.next();
    }
    
    private void mostrarPersonas() {
        for (Persona persona : personas) {
            if (persona instanceof Estudiante) {
                Estudiante e = (Estudiante) persona;
                System.out.println(e);
                continue;
            }
            if (persona instanceof Profesor) {
                Profesor p = (Profesor) persona;
                System.out.println(p);
                continue;
            }
            if (persona instanceof PersonalServicio) {
                PersonalServicio s = (PersonalServicio) persona;
                System.out.println(s);
                continue;
            }
            

        }
    }
    
    

    public void menu() {
        System.out.println("*------------ Gestion Inegral Facultad ------------*");
        System.out.println("");
        System.out.println("1. Cambio del estado civil de una persona");
        System.out.println("2. Reasignación de despacho a un empleado");
        System.out.println("3. Matriculación de un estudiante en un nuevo curso");
        System.out.println("4. Cambio de departamento de un profesor");
        System.out.println("5. Traslado de sección de un empleado del personal de servicio");
        System.out.println("6. Imprimir toda la información de cada tipo de individuo");
        System.out.println("7. Salir");
        System.out.println("");
        System.out.println("Ingrese una opcion: ");
        int op = scan.nextInt();
        switch (op) {
            case 1:
                Persona p = buscarPersona();
                if (p == null) {
                    System.out.println("La persona no existe");

                } else {
                    cambioEstadoCivil(p);
                }
                presioneTecla();
                menu();
                break;
            case 2:
                Empleado p2 = buscarEmpleado();
                if (p2 == null) {
                    System.out.println("El empleado no existe");

                } else {
                    cambioDespacho(p2);

                }

                presioneTecla();
                menu();
                break;
            case 3:
                Estudiante e = buscarEstudiante();
                if (e == null) {
                    System.out.println("El estudiante no existe");

                } else {
                    cambioMatricula(e);

                }

                presioneTecla();
                menu();
                break;
            case 4:
                Profesor pro = buscarProfesor();
                if (pro == null) {
                    System.out.println("El profe no existe");

                } else {
                    System.out.println("Ingrese en nuevo dpto: ");
                    pro.cambiarDepto(scan.next());
                }
                presioneTecla();
                menu();
                break;
            case 5:
                PersonalServicio per = buscarPersonal();
                if (per == null) {
                    System.out.println("El profe no existe");

                } else {
                    System.out.println("Ingrese la nueva seccion: ");
                    per.setSeccion(scan.next());
                }
                presioneTecla();
                menu();
                break;
            case 6:
                mostrarPersonas();
                presioneTecla();
                menu();
                break;
            case 7:
                presioneTecla();

                break;
            default:
                System.out.println("Opcion incorrecta!!!");
                presioneTecla();
                menu();
                break;
        }

    }

}
