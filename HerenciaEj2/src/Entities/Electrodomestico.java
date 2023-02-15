/*
 */
package Entities;

import Enum.Color;
import static Main.Electrodom.scan;

/**
 *
 * @author fitog
 */

//Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
//consumo energético (letras entre A y F) y peso.
public class Electrodomestico {
    protected double precio;
    protected Color color;
    protected char consumo;
    protected int peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, Color color, char consumo, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }


    
    
    public void crearElectrodomestico(Electrodomestico elecX){
        elecX.precio = 1000;
        System.out.println("El precio base es de " + precio);
        System.out.println("Ingrese el consumo energetico del electrodomestico: ");
        comprobarConsumoEnergetico(elecX);
        System.out.println("Ingrese el color del electrodomestico: ");
        comprobarColor(elecX);
        System.out.println("Ingrese el peso del electrodomestico");
        elecX.setPeso(scan.nextInt());
        precioFinalPeso(elecX);
        precioFinalConsumo(elecX);
        System.out.println(elecX.getPrecio());
        
    }
    
    private void comprobarConsumoEnergetico(Electrodomestico elecX){
        System.out.println("A, B, C, D, E o F");
        char letra = scan.next().charAt(0);

        if (letra !='a' && letra !='b'&& letra !='c'&& letra !='d'&& letra !='e'&& letra !='e'&& letra !='A'&& letra !='B'&& letra !='C'&& letra !='D'&& letra !='E'){
           elecX.setConsumo('f');
        }else{
           elecX.setConsumo(letra);
        }
    }
    
    private void comprobarColor(Electrodomestico elecX){
        System.out.println("Los colores disponibles son: ");      
        for (Color aux : Color.values()) {
            System.out.println(aux.toString());
        }
        
        String color2 = scan.next();
        for (Color aux : Color.values()) {
            if (aux.name().equalsIgnoreCase(color2)) {
                elecX.setColor(aux);
                break;
            }else{
                elecX.setColor(aux.BLANCO);
            }
        }
        
    }
    
    private void precioFinalPeso(Electrodomestico elecX){
     
       
        if (elecX.getPeso()>=1 && elecX.getPeso()<19){
            elecX.setPrecio(elecX.getPrecio()+100);
        }
        if (elecX.getPeso()>=20 && elecX.getPeso()<49){
            elecX.setPrecio(elecX.getPrecio()+500);
        }
        if (elecX.getPeso()>=50 && elecX.getPeso()<79){
           elecX.setPrecio(elecX.getPrecio()+800);
        }
        if (elecX.getPeso()>=80){
            elecX.setPrecio(elecX.getPrecio()+1000);
        }
    }
    
    private void precioFinalConsumo(Electrodomestico elecX){
        if(elecX.getConsumo() == 'a' || elecX.getConsumo() == 'A'){
            elecX.setPrecio(elecX.getPrecio()+1000);
        }
        if(elecX.getConsumo() == 'b' || elecX.getConsumo() == 'B'){
            elecX.setPrecio(elecX.getPrecio()+800);
        }
        if(elecX.getConsumo() == 'c' || elecX.getConsumo() == 'C'){
            elecX.setPrecio(elecX.getPrecio()+600);
        }
        if(elecX.getConsumo() == 'd' || elecX.getConsumo() == 'D'){
            elecX.setPrecio(elecX.getPrecio()+500);
        }
        if(elecX.getConsumo() == 'e' || elecX.getConsumo() == 'E'){
            elecX.setPrecio(elecX.getPrecio()+300);
        }
        if(elecX.getConsumo() == 'f' || elecX.getConsumo() == 'F'){
            elecX.setPrecio(elecX.getPrecio()+100);
        }
    }
    
    public void menuElectrodomestico(Electrodomestico e1){
        System.out.println("Que electrodomestico cotizar?");
        System.out.println("1.Lavadora"+"\n");
        System.out.println("2.Televisor"+"\n");
        System.out.println("3.Salir");
        int electro = scan.nextInt();
        switch(electro){
            case 1: 
                Lavadora lava = new Lavadora();
                lava.crearLavadora(lava);
                break;
            case 2:
                Televisor tele = new Televisor();
                tele.crearTele(tele);
                break;
            case 3:
                break;
        }
               
                
    }    

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + '}';
    }
    
}
