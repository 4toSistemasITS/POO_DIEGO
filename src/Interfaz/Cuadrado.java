/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

/**
 *
 * @author DELL
 */
public class Cuadrado implements FiguraGeometrica{

    @Override
    public double area() {
        return 16;
    }

    @Override
    public double perimetro(int valor) {
        valor=valor*2;
        return valor;
    }
    
}
