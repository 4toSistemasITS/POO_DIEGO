/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploHashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class EjemploLogin {
    public static void main(String[] args) {
        SegundoMetodo();
//        HashMap<String, String> login=new HashMap<>();
//        login.put("usuario", "Diego");
//        login.put("contraseña", "diegoch29");
//        login.put("Nombres", "Diego Alejandro");
//        login.put("Apellidos", "Chavez Gonzalez");
//        login.put("Especialidad", "Analisis de Sistemas");
//        login.put("Ciclo", "4to Ciclo");
//        for (Map.Entry<String, String> entry : login.entrySet()) {
//            String key = entry.getKey();
//            String value = entry.getValue();
//            Scanner scDatos=new Scanner(System.in);
//            System.out.println("Ingrese el nombre de usuario: ");
//            String usuario=scDatos.nextLine();
//            System.out.println("Ingrese la contraseña: ");
//            String contraseña=scDatos.nextLine();
//            if(login.get("usuario").equals(usuario)&&login.get("contraseña").equals(contraseña)){
//                System.out.println("\n-----------Bienvenido "+login.get("usuario")+"-------");
//                System.out.println(login.get("Nombres"));
//                System.out.println(login.get("Apellidos"));
//                System.out.println(login.get("Especialidad"));
//                System.out.println(login.get("Ciclo"));
//                break;
//            }else{
//                JOptionPane.showMessageDialog(null, "Los datos son incorrectos");
//
//                
//            }
//            
//        }
    }
    
    public static void SegundoMetodo(){
        HashMap<Integer, String> login=new HashMap<>();
        login.put(1, "Diego");
        login.put(2, "diegoch29");
        login.put(3, "Diego Alejandro");
        login.put(4, "Chavez Gonzalez");
        login.put(5, "Analisis de Sistemas");
        login.put(6, "4to Ciclo");
        for (Map.Entry<Integer, String> entry : login.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            Scanner scDatos=new Scanner(System.in);
            System.out.println("Ingrese el nombre de usuario: ");
            String usuario=scDatos.nextLine();
            System.out.println("Ingrese la contraseña: ");
            String contraseña=scDatos.nextLine();
            if(login.get(1).equals(usuario)&&login.get(2).equals(contraseña)){
                System.out.println("\n-----------Bienvenido "+login.get(1)+"-------");
                System.out.println(login.get(3));
                System.out.println(login.get(4));
                System.out.println(login.get(5));
                System.out.println(login.get(6));
                break;
            }else{
                JOptionPane.showMessageDialog(null, "Los datos son incorrectos");

                
            }
            
        }
    }
}
