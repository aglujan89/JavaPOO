/*
 */
package herenciaej2ex;

import Entities.Edificio;
import Entities.EdificioDeOficinas;
import Entities.Polideportivo;
import java.util.ArrayList;

/**
 *
 * @author fitog
 */
public class HerenciaEj2Ex {

    /**
     * @param args the command line arguments
     */
    
//Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase
//edificio tendrá como métodos:
//• Método calcularSuperficie(): calcula la superficie del edificio.
//• Método calcularVolumen(): calcula el volumen del edifico.
//Estos métodos serán abstractos y los implementarán las siguientes clases:
//• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
//Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
//• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
//por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
//los atributos del padre.
//De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
//usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
//(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
//cuantas personas entrarían en un piso y cuantas en todo el edificio.
//
//16
//Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
//dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
//métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
//superficie y el volumen de cada edificio.
//Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
//techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
//cantPersonas() y mostrar los resultados de cada edificio de oficinas.
    
    public static void main(String[] args) {
        ArrayList<Edificio> edificios = new ArrayList();
        
        Edificio pol1 = new Polideportivo("El grande", "Techado", 80, 120, 70);
        edificios.add(pol1);
        Edificio pol2 = new Polideportivo("El redondo", "Abierto", 50, 100, 120);
        edificios.add(pol2);
        Edificio of1 = new EdificioDeOficinas(20, 15, 20, 160, 50, 50);
        edificios.add(of1);
        Edificio of2 = new EdificioDeOficinas(10, 12, 10, 80, 40, 60);
        edificios.add(of2);
        
        for (Edificio edificio : edificios) {
            if (edificio instanceof Polideportivo) {
                Polideportivo p = (Polideportivo) edificio;
                System.out.println("Superficie poli: " + p.calcularSuperficie());
                System.out.println("Volumen poli: " + p.calcularVolumen());
                System.out.println("El poli es de tipo: " + p.getTipo());
            }
            if (edificio instanceof EdificioDeOficinas) {
                EdificioDeOficinas e = (EdificioDeOficinas) edificio;
                System.out.println("Superficie oficinas: " + e.calcularSuperficie());
                System.out.println("Volumen oficinas: " + e.calcularVolumen());
                e.cantPersonas();
            }
            System.out.println("");
        }
    }
    
}
