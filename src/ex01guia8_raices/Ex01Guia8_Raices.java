/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01guia8_raices;

import ex01guia8_raices.Entidad.Raices;
import ex01guia8_raices.Servicios.RaicesServicio;

/**
 *
 * @author demia
 */
public class Ex01Guia8_Raices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RaicesServicio rs1 = new RaicesServicio();
        
        Raices r1 = rs1.cargaValores();
        double discriminante = rs1.getDiscriminante(r1.a,r1.b,r1.c);
        boolean tieneDos = rs1.tieneRaices(discriminante);
        boolean tieneUna = rs1.tieneRaiz(discriminante);
        rs1.obtenerRaices(tieneDos,discriminante,r1.a,r1.b,r1.c);
    }
    
}
