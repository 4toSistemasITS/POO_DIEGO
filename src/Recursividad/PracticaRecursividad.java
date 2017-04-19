/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividad;

/**
 *
 * @author DELL
 */
public class PracticaRecursividad {
    
    public int recursivo(int numero, int limite){
            int valor;
            if(numero<limite){
                numero=numero+2;
                System.out.println("Entro al metodo recursivo");
                valor=recursivo(numero, limite);
            }else{
                valor=numero;
            }
            return valor;
        }
    
    
    public static void main(String[] args) {
        int numero=12;
        int limite=20;
        PracticaRecursividad Practica=new PracticaRecursividad();
        System.out.println(Practica.recursivo(numero, limite));
    }
        
}
