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
public class Triangulo implements FiguraGeometrica{

    @Override
    public double area() {
        return 15;
    }

    @Override
    public double perimetro(int valor) {
        valor=valor*3;
        return valor;
    }
    
}
