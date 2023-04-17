/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01guia8_raices.Servicios;

import ex01guia8_raices.Entidad.Raices;
import java.util.Scanner;

/**
 *
 * @author demia
 */
public class RaicesServicio {
    Scanner leer = new Scanner(System.in);
    
    
    
    public Raices cargaValores(){
        System.out.println("Ingrese el valor de A");
        double a = leer.nextDouble();
        System.out.println("Ingrese el valor de B");
        double b = leer.nextDouble();
        System.out.println("Ingrese el valor de C");
        double c = leer.nextDouble();
        
        return new Raices(a,b,c);
    }    


    public double getDiscriminante(double a,double b,double c){
        double discri = (Math.pow(b, 2))-4*a*c;
        return discri;
    }
    
    public boolean tieneRaices(double dis){
        boolean tieneDos = dis>=0;
        return tieneDos;
    }
    public boolean tieneRaiz(double dis){
        boolean tieneUna = dis==0;
        return tieneUna;
    }
    
    public void obtenerRaices(boolean dos,double dis,double a,double b,double c){
        if (dos==true) {
            System.out.println("El resultado del discriminante es:"+dis+", o sea positivo");
            System.out.println("Solucion 1");
            
        }
        
    }
}
