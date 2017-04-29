/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackCine;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author DELL
 */
public class EjercicioStack {
    public static void main(String[] args) {
        Stack<Integer> Cine=new Stack<>();
        VenderEntrada(Cine);
        Salir(Cine);
        Imprimir(Cine);
    }
    public static void VenderEntrada(Stack<Integer> Cine){
        
        int numeroEntradas;
        Scanner scVender=new Scanner(System.in);
        System.out.println("Ingrese el numero de entradas vendidas: ");
        numeroEntradas=scVender.nextInt();
        if (numeroEntradas>0){
            System.out.println("------Valores que entran--------");
            for (int i = 0; i <= numeroEntradas; i++) {
                
                System.out.println(Cine.push(i));
            }
            
            
        }
    }
    
    public static void Salir(Stack<Integer> Cine){
        System.out.println("--------Valores que salen----------");
        System.out.println(Cine.pop());
            
        
    }
    
    public static void Imprimir(Stack<Integer> Cine){
        for (int i = 0; i < Cine.size(); i++) {
            System.out.println(Cine.get(i));
            
        }
    }
}