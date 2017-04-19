/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaExcepciones;

/**
 *
 * @author DELL
 */
public class ExcepcionPractica extends Exception{

    public ExcepcionPractica(String message) {
        super(message);
    }
    
    public static void ValidarPositivo(int N1, int N2)throws ExcepcionPractica{
        if(!(N1>0 && N2>0)){
             throw new ExcepcionPractica("Existe un numero negativo");
        }
    }
}
