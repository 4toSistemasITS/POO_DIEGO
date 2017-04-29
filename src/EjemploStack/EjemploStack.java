/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploStack;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author DELL
 */
public class EjemploStack {
    public static void main(String[] args) {
        Stack<String> ejemplo=new Stack<>();
        ejemplo.add("Diego");
        ejemplo.add("Angel");
        ejemplo.add("Valeria");
        Imprimir(ejemplo);
        ejemplo.pop();
        Scanner scAgg=new Scanner(System.in);
        System.out.println("Ingrese un nueva entrada: ");
        String nuevaEntrada=scAgg.nextLine();
        ejemplo.push(nuevaEntrada);
        System.out.println("-------Nueva Entrada--------");
        Imprimir(ejemplo);
    }
    
    public static void Imprimir(Stack<String> ejemplo){
        EjemploStack eS=new EjemploStack();
        for (int i = 0; i < ejemplo.size(); i++) {
           
            System.out.println(ejemplo.get(i));
            
        }
    }
}
