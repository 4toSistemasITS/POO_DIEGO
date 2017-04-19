/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaExcepciones;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class PracticaMain {
    public static void main(String[] args) {
        int Numero1=-2;
        int Numero2=10;
        try {
            ExcepcionPractica.ValidarPositivo(Numero1, Numero2);
            System.out.print("El resulatado de "+Numero1+"+"+Numero2+"="+(Numero1+Numero2));
        } catch (ExcepcionPractica ex) {
            System.out.println(ex);
        }
    }
    
    
}
