/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Fecha;
import java.util.Scanner;

/**
 *
 * @author fitog
 */
public class ServicioFecha {

    Scanner scan = new Scanner(System.in);

    public void crearFecha(Fecha f) {

        System.out.println("Ingrese una fecha: día, mes y año: ");

        f.setDia(scan.nextInt());
        f.setMes(scan.nextInt());
        validarAño(f);

        validarFecha(f);
    }

    public void validarFecha(Fecha f) {

        int d = f.getDia();
        int m = f.getMes();
        while (m > 12) {
            System.out.println("Recorda que solo tenemos 12 meses, ingresa un mes valido.");
            m = scan.nextInt();
        }

        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
            while (d > 31) {
                System.out.println("El mes " + m + " solo tiene hasta 31 días por favor ingrese nuevamente una día valido ");
                d = scan.nextInt();
            }
        } else if (m == 2) {
            while (d > 28) {
                System.out.println("El mes " + m + " solo tiene hasta 28 días por favor ingrese nuevamente una día valido ");
                d = scan.nextInt();
            }
        } else {
            while (d > 30) {
                System.out.println("El mes " + m + " solo tiene hasta 30 días por favor ingrese nuevamente una día valido ");
                d = scan.nextInt();
            }
        }

        f.setDia(d);
        f.setMes(m);

    }

    public void validarAño(Fecha f) {
        int a = scan.nextInt();
        if (a < 2021 && a > 1900) {
            f.setAño(a);
        }
    }

    public void conocerDias(Fecha f) {
        int m = f.getMes();

        switch (m) {
            case 1:
                System.out.println("Ingreso mes Enero, que tiene 31 días.");
                break;
            case 3:
                System.out.println("Ingreso mes Marzo, que tiene 31 días.");
                break;
            case 5:
                System.out.println("Ingreso mes Mayo, que tiene 31 días.");
                break;
            case 7:
                System.out.println("Ingreso mes Julio, que tiene 31 días.");
                break;
            case 8:
                System.out.println("Ingreso mes Agosto, que tiene 31 días.");
                break;
            case 10:
                System.out.println("Ingreso mes Octubre, que tiene 31 días.");
                break;
            case 12:
                System.out.println("Ingreso mes Diciembre, que tiene 31 días.");
                break;
            case 2:
                System.out.println("Ingreso mes Febrero, que tiene 28 días.");
                break;
            case 4:
                System.out.println("Ingreso mes Abril, que tiene 30 días.");
                break;
            case 6:
                System.out.println("Ingreso mes Junio, que tiene 30 días.");
                break;
            case 9:
                System.out.println("Ingreso mes Septiembre, que tiene 30 días.");
                break;
            case 11:
                System.out.println("Ingreso mes Noviembre, que tiene 30 días.");
                break;
        }
    }

    public void diaAnterior(Fecha f) {
        int d = f.getDia();
        int m = f.getMes();
        int a = f.getAño();
        if (d==1) {
            if (m == 1) {
                m = 12;
                a = a - 1;
            } else {
                m = m - 1;
            }

            switch (m) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    d = 31;
                    break;
                case 2:
                    d = 28;
                            break;
                default:
                    d = 30;
                            break;
            }
        } else {
            d = d - 1;
        }

        System.out.println("la fecha anterior es: Fecha{dia=" + d + ", mes=" + m + ", año=" + a + "}");
    }
    
    public void diaPosterior (Fecha f){
    int d = f.getDia();
        int m = f.getMes();
        int a = f.getAño();
        
d=d+1;
            switch (m) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                 if (d>31) {
                        if (m == 12) {
                            m=1;
                            a=a+1;
                            d=1;
                        }else{
                            m=m+1;
                            d=1;
                        }
                    }
                    break;
                case 2:
                    if (d>28) {
                            m=m+1;
                            d=1;
                    }
                            break;
                default:
                    if (d>30) {
                        m=m+1;
                        d=d+1;
                        }
                            break;
            }
        

        System.out.println("la fecha anterior es: Fecha{dia=" + d + ", mes=" + m + ", año=" + a + "}");    
    
    }
    
    public boolean añoBisiesto (Fecha f){
        
        if (f.getAño()%4==0) {
            System.out.println("El año ingresado es bisiesto.");   
            return true;
        }else{
            System.out.println("El año ingresado no es bisiesto.");
            return false;
        }
       
    }
}
