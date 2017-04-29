/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaEstructuraDatos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class EstructuraDatos {
    public static void main(String[] args) {
        ArrayList<String>lista=new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            lista.add("vacio");
        }
        imprimirArrayListReverso(lista);
        lista.add(5,"uno");
        lista.add(3,"dos");
        lista.add(2,"tres");
        lista.add(8,"cuatro");
        lista.add(1,"cinco");
        //simprimirArrayList(lista);
        imprimirArrayListReverso(lista);
        lista.remove(1);
        lista.set(8, "Hola ");
        imprimirArrayListReverso(lista);
    }
    
    public static void imprimirArrayList(ArrayList<String> lista){
        for (String valor : lista) {
            System.out.println(valor);
        }
        
    }
    
    public static void imprimirArrayListReverso(ArrayList<String> lista){
        for (int i = lista.size()-1; i >= 0; i--) {
            System.out.println(lista.get(i)+"Posicion "+i);
        }
    }
}
