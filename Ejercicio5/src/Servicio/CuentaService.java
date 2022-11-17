/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author fitog
 */
public class CuentaService {
    
    public Cuenta crearCuenta(){
        Scanner scan = new Scanner(System.in);
        Cuenta c = new Cuenta();
        System.out.println("Ingrese el numero de cuenta: ");
        c.setNCuenta(scan.nextInt());
        System.out.println("Ingrese el DNI: ");
        c.setDNI(scan.nextLong());
        System.out.println("Ingrese el saldo a la cuenta: ");
        c.setSaldo(scan.nextInt());
        
        return c;
    }
    
    public void ingresar(Cuenta c, double ingreso) {
        c.setSaldo(c.getSaldo() + (int) ingreso);

    }

    public void retirar(Cuenta c, double retiro) {
        if (retiro > c.getSaldo()) {
            c.setSaldo(0);
        } else {
            c.setSaldo(c.getSaldo() - (int) retiro);
        }
    }

    public int extraccionRapida(Cuenta c) {
        int veinte = (int) (c.getSaldo() * 0.2);
        c.setSaldo((int) (c.getSaldo() * 0.8));
        return veinte;
    }

    public int consultarSaldo(Cuenta c) {
        return c.getSaldo();
    }
    
    public void consultarDatos(Cuenta c){
        System.out.println(c);
    }





}

