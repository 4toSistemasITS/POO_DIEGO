/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepecion;

/**
 *
 * @author DELL
 */
public class ExcepcionDiego extends Exception{

    public ExcepcionDiego(String message) {
        super(message);
    }
    
    public static void ValidarLongitud(String nombre,int cantidad)throws ExcepcionDiego{
        if (nombre.length()<cantidad){
            throw new ExcepcionDiego("La longitud no es valida");
        }
        
    }
    
    public static void ValidarLetra(String nombre, String letra)throws ExcepcionDiego{
        if (!nombre.contains(letra)){
            throw new ExcepcionDiego("No existe esa letra");
        }
    }
}
