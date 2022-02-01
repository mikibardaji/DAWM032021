/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2examen;

import java.util.Random;

/**
 *
 * @author alumne
 */
public class Ex2Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[][] numeros = new int[5][6];
       
       inicializarArray(numeros);
       mostrarArray(numeros);
       sumarFilasArray(numeros);
       mostrarArray(numeros);
    }

    private static void mostrarArray(int[][] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            for (int col = 0; col < numeros[0].length; col++) {
                System.out.print(numeros[i][col] + " ");
                
            }
            System.out.println("");
            
        }
    }

    private static void inicializarArray(int[][] numeros) {
          Random rd = new Random();
           for (int i = 0; i < numeros.length; i++) {
            for (int col = 0; col < (numeros[0].length-1); col++) {
               numeros[i][col]=rd.nextInt(100)+1;
                
            }
            
            
        }
    }

    private static void sumarFilasArray(int[][] numeros) {
        

        int suma;
        for (int i = 0; i < numeros.length; i++) {
            suma = 0;
            for (int col = 0; col < (numeros[0].length-1); col++) {
                suma = suma + numeros[i][col];
                
            }
            numeros[i][numeros[0].length-1] = suma;
         
            
        }
    }
    
}
