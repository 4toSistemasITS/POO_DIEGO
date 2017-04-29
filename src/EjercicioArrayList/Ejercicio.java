/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioArrayList;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class Ejercicio {
    public static void main(String[] args) {
            ArrayList lista=new ArrayList<String>();
//            for (int i = 0; i < 6; i++) {
//                lista.add("");
//            }
            lista.add("Programacion IV");
            lista.add("Calculo III");
            lista.add("Base de Datos II");
            lista.add("Analisis de Sistemas II");
            lista.add("Ingles IV");
            lista.add("Hardware");
            imprimirLongitud(lista);
    }
    
    public static void imprimirLongitud(ArrayList<String> lista){
        ArrayList lista2=new ArrayList<String>();
        int s=0;
        int a=0;
        for (int i = 0; i < lista.size(); i++) {
            int valor1=lista.get(i).length();
            for (int j = 0; j <lista.size(); j++) {
                
                int valor2=lista.get(j).length();
//                System.out.println(valor1);
//                System.out.println(valor2); 
                if(valor2>valor1){
//
//                    System.out.println("entro");
                    System.out.println(lista.get(j));
                    lista2.add(s,lista.get(j));
                    s+=1;
                }
            
            }
            
            System.out.println(lista2);
            
            
//            if(s==0){
//                System.out.println(lista.get(i).length());
//                System.out.println(lista.set(0, lista.get(i)));
//            }
        }
               
            
        
        
       
        
    }
}
