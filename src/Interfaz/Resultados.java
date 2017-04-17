/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Resultados implements OperacionesBasicas{

    @Override
    public int suma(int ValorA, int ValorB) {
        int resultado=ValorA+ValorB;
        return resultado;
    }

    @Override
    public int resta(int ValorA, int ValorB) {
        int resultado=ValorA-ValorB;
        return resultado;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int multiplicacion(int ValorA, int ValorB) {
        int resultado=ValorA*ValorB;
        return resultado;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double division(double ValorA, double ValorB) {
        double resultado=ValorA/ValorB;
        return resultado;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
