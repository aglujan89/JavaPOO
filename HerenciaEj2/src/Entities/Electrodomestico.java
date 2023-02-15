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


    
    
    public void crearElectrodomestico(){
        this.precio = 1000;
        System.out.println("El precio base es de " + precio);
        System.out.println("Ingrese el consumo energetico del electrodomestico: ");
        comprobarConsumoEnergetico();
        System.out.println("Ingrese el color del electrodomestico: ");
        comprobarColor();
        System.out.println("Ingrese el peso del electrodomestico");
        this.peso = scan.nextInt();
        precioFinalPeso();
        precioFinalConsumo();
        System.out.println(precio);
        
    }
    
    private void comprobarConsumoEnergetico(){
        System.out.println("A, B, C, D, E o F");
        char letra = scan.next().charAt(0);

        if (letra !='a' && letra !='b'&& letra !='c'&& letra !='d'&& letra !='e'&& letra !='e'&& letra !='A'&& letra !='B'&& letra !='C'&& letra !='D'&& letra !='E'){
            this.consumo = 'f';
        }else{
            this.consumo = letra;
        }
    }
    
    private void comprobarColor(){
        System.out.println("Los colores disponibles son: ");      
        for (Color aux : Color.values()) {
            System.out.println(aux.toString());
        }
        
        String color2 = scan.next();
        for (Color aux : Color.values()) {
            if (aux.name().equalsIgnoreCase(color2)) {
                this.color=aux;
                break;
            }else{
                this.color=aux.BLANCO;
            }
        }
        
    }
    
    private void precioFinalPeso(){
     
       
        if (peso>=1 && peso<19){
            this.precio = precio +100;
        }
        if (peso>=20 && peso<49){
            this.precio = precio +500;
        }
        if (peso>=50 && peso<79){
            this.precio = precio +800;
        }
        if (peso>=80) {
            this.precio = precio +1000;
        }
    }
    
    private void precioFinalConsumo(){
        if(consumo == 'a' || consumo == 'A'){
            this.precio = precio +1000;
        }
        if(consumo == 'b' || consumo == 'B'){
            this.precio = precio +800;
        }
        if(consumo == 'c'|| consumo == 'C'){
            this.precio = precio +600;
        }
        if(consumo == 'd'|| consumo == 'D'){
            this.precio = precio +500;
        }
        if(consumo == 'e'|| consumo == 'E'){
          this.precio = precio +300;
        }
        if(consumo == 'f'|| consumo == 'F'){
            this.precio = precio +100;
        }
    }
    
    public void menuElectrodomestico(){
        System.out.println("Que electrodomestico cotizar?");
        System.out.println("1.Lavadora"+"\n");
        System.out.println("2.Televisor"+"\n");
        System.out.println("3.Salir");
        int electro = scan.nextInt();
        switch(electro){
            case 1: 
                Lavadora lava = new Lavadora();
                lava.crearLavadora();
                break;
            case 2:
                Televisor tele = new Televisor();
                tele.crearTele();
                break;
            case 3:
                break;
        }
            
                
                
    }    
    
}
