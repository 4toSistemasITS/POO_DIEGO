/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploHashmap;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author DELL
 */
public class EjemploHashmap {
    public static void main(String[] args) {
        HashMap<String,String> ejemplo=new HashMap<>();
        ejemplo.put("nombre", "Diego");
        ejemplo.put("apellido", "Chavez");
        ejemplo.put("direccion", "Bolivar");
        ejemplo.put("telefono", "0989101545");
        ejemplo.put("correo", "Diego@gmail.com");
        for (Map.Entry<String, String> entry : ejemplo.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("clave: "+key+" valor: "+value);
        }
        System.out.println(ejemplo.containsValue("0989101545"));
        System.out.println(ejemplo.get("telefono"));
    }
//    public static void imprimirArrayList(ArrayList<String>lista){
//        for (String valor: lista) {
//            System.out.println(valor);
//        }
//    }
//    
//    public static void imprimirArrayListReverso(ArrayList<String>) {
//        
//    }
}
