/*
 */
package Servicio;

import Entidad.Juego;
import Entidad.Jugador;
import Entidad.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author fitog
 */
public class ServicioJuego {
    
//llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
//y el revolver para guardarlos en los atributos del juego.
    public Juego llenarJuego(){
        Scanner scan = new Scanner(System.in);
        ServiceRevolver serv = new ServiceRevolver();
        Revolver r = new Revolver();
        serv.llenarRevolver(r);
        ArrayList<Jugador>jugadores = new ArrayList();
        System.out.println("Indique la cantidad de jugadores");
        int cant = scan.nextInt();
        if (cant >6 || cant <1){
            cant=6;
        }
        for (int i = 0; i < cant; i++) {
            Jugador j = new Jugador();
            j.setId(i+1);
            jugadores.add(j);
        }
        
        return new Juego(r, jugadores);
    }    
    
    
//• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
//aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
//moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
//mojar. Al final del juego, se debe mostrar que jugador se mojó.
//Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
    
    public void ronda(Juego juego){
        
        ArrayList<Jugador> lista = juego.getJugadores();
        ServicioJugador servJ = new ServicioJugador();
        for (Jugador jugador : lista) {
            if (servJ.disparo(juego.getRevolver(), jugador)) {
                System.out.println("");
                System.out.println(jugador + "MOJADO!!!");
                break;
            }else{
                System.out.println("OLEEEEE!!!!");
            }
            
        }
        
    }
    
    
}
