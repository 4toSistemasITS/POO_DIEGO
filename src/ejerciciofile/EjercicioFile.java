/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciofile;

import Excepecion.ExcepcionDiego;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class EjercicioFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cadena;
        File archivo= new File("archivo.txt");
        archivo.getName();
        try {
            ExcepcionDiego.ValidarLongitud(archivo.getName(), 15);
        } catch (ExcepcionDiego ex) {
            
            System.out.println(ex);
        }
        try {
            ExcepcionDiego.ValidarLetra(archivo.getName(), "y");
        } catch (ExcepcionDiego ex) {
            System.out.println(ex);
        }
        try {
            
            FileReader FR=new FileReader(archivo);
            BufferedReader BF= new BufferedReader(FR);
            while((cadena=BF.readLine())!=null){
                System.out.println(cadena);
            }            
            
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(EjercicioFile.class.getName()).log(Level.SEVERE, null, ex);
//            System.out.println(ex);
        } catch (IOException ex) {
            //Logger.getLogger(EjercicioFile.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
        
    }
    
}
