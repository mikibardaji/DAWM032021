/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4acumpositivonegativos;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex4Acumpositivonegativos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int[] numeros = new int[5];
       
         
         
         introducir_datos(numeros);
         

        listar_array(numeros);
        
        acumularPositivosNegativos(numeros);
        
    }

    private static void introducir_datos(int[] numeros) {
         //introduzco valores
        Scanner sc = new Scanner(System.in);
        for (int indice = 0; indice < numeros.length; indice++) {
            System.out.print("pon valores : ");
            numeros[indice] = sc.nextInt();
        }     
    }

    private static void listar_array(int[] numeros) {
        for (int indice = 0; indice < numeros.length; indice++) {
            System.out.println("posicion " + indice + " = " + numeros[indice]) ;
        }
        
    }

    private static void acumularPositivosNegativos(int[] numeros) {
        int acum_positivos=0, acum_negativos=0;
        for (int indice = 0; indice < numeros.length; indice++) {
            //recorrer el array
            if (numeros[indice]<0)
            {
                System.out.println("negativo " + numeros[indice]);
                acum_negativos = acum_negativos + numeros[indice];
            }
            else
            {
                System.out.println("positivo " + numeros[indice]);
                acum_positivos = acum_positivos + numeros[indice];
            }
            
           
        }//acaba el for aqui 
        
         System.out.println(" acumulado positivos " + acum_positivos);
            System.out.println("acumulado negativos " + acum_negativos);
        
    }
    
}
