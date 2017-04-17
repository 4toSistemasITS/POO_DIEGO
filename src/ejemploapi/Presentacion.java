/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploapi;

import Interfaz.Resultados;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Presentacion {
    public static void main(String[] args) {
        int opcion;
         Scanner SCPresentacion= new Scanner(System.in);
         System.out.println("Operaciones Basicas\n"+"Seleccione una opción: \n"+"1)Suma\n"+"2)Resta\n"+"3)Multiplicacion\n"+"4)Division");
         opcion=SCPresentacion.nextInt();
         Resultados resultado= new Resultados();
        switch(opcion){ 
            case 1:
                Scanner scSuma= new Scanner(System.in);
                System.out.println("Ingrese el valor A: ");
                int ValorAS=scSuma.nextInt();
                System.out.println("Ingrese la valor B: ");
                int ValorBS= scSuma.nextInt();
                System.out.println("El resultado de la suma es: "+resultado.suma(ValorAS,ValorBS));
                break;
            case 2:
                Scanner scResta= new Scanner(System.in);
                System.out.println("Ingrese el valor A: ");
                int ValorAR=scResta.nextInt();
                System.out.println("Ingrese la valor B: ");
                int ValorBR= scResta.nextInt();
                System.out.println("El resultao de la resta es: "+resultado.resta(ValorAR,ValorBR));
                break;
            case 3:
                Scanner scMultiplicacion= new Scanner(System.in);
                System.out.println("Ingrese el valor A: ");
                int ValorAM=scMultiplicacion.nextInt();
                System.out.println("Ingrese la valor B: ");
                int ValorBM= scMultiplicacion.nextInt();
                System.out.println("El resultado de la Multiplicacion es: "+resultado.multiplicacion(ValorAM, ValorBM));
                break;
            case 4:
                Scanner scDivision= new Scanner(System.in);
                System.out.println("Ingrese el valor A: ");
                double ValorAD=scDivision.nextDouble();
                System.out.println("Ingrese la valor B: ");
                double ValorBD= scDivision.nextDouble();
                System.out.println("El resultado de la division es: "+resultado.division(ValorAD,ValorBD));

            
        }
    }
   
}
