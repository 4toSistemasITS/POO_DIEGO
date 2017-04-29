/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploLinkedList;

import java.util.LinkedList;

/**
 *
 * @author DELL
 */
public class EjemploLinked {
    public static void main(String[] args) {
        LinkedList<String> ejemplo=new LinkedList<>();
        ejemplo.add("Diego");
        ejemplo.add("Valeria");
        ejemplo.add("Angel");
        ejemplo.add("Fabian");
        
        Imprimir(ejemplo);
        System.out.println("--------Nuevo LinkedList-----");
        System.out.println(ejemplo.peek());
        System.out.println("--------Nuevo LinkedList 2---------");
        ejemplo.poll();
        Imprimir(ejemplo);
        System.out.println("--------Nuevo LinkedList 2---------");
        System.out.println(ejemplo.element());
    }
    
    public static void Imprimir(LinkedList<String> ejemplo){
        for (int i = 0; i < ejemplo.size(); i++) {
            System.out.println(ejemplo.get(i));
        }
    }
}
