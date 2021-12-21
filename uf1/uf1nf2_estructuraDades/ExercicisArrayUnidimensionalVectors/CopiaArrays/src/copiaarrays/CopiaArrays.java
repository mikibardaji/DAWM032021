/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package copiaarrays;

import java.util.Random;

/**
 *
 * @author alumne
 */
public class CopiaArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] notas = new int[4];
        int[] notas_finales = new int[4];
        int[] notas_finales_systemcopy = new int[40];
        
        Random rd = new Random();
        for (int indice = 0; indice < notas.length; indice++) {
            notas[indice] = rd.nextInt(11);
        }
        
        for (int indice = 0; indice < notas.length; indice++) {
            System.out.println("posicion " + indice + " = " + notas[indice]) ;
        }
        
        //copia sumandole 2
        for (int indice = 0; indice < notas.length; indice++) {
              notas_finales[indice] = notas[indice] +2;
        }
        
         for (int indice = 0; indice < notas_finales.length; indice++) {
            System.out.println("copia posicion " + indice + " = " + notas_finales[indice]) ;
        }
         
         System.arraycopy(notas, 0, notas_finales_systemcopy, 10, 4);
         
        for (int indice = 0; indice < notas_finales_systemcopy.length; indice++) {
            System.out.println("systemcopy posicion " + indice + " = " + notas_finales_systemcopy[indice]) ;
        }
    }
    
}
