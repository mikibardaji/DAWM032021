/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3examen;

import java.util.Random;

/**
 *
 * @author alumne
 */
public class Ex3examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros_1_20 = new int[10];
        inicialiazarArray(numeros_1_20);
        mostrarArray(numeros_1_20);
        cambiarArraya0(numeros_1_20);
        mostrarArray(numeros_1_20);
    }

    private static void mostrarArray(int[] numeros_1_20) {
        for (int i = 0; i < numeros_1_20.length; i++) {
            System.out.print(numeros_1_20[i]);
            if (i<(numeros_1_20.length-1))
            {
                System.out.print("-");
            }
        }
        System.out.println("");
    }

    private static void inicialiazarArray(int[] numeros_1_20) {
        Random rd = new Random();
        for (int i = 0; i < numeros_1_20.length; i++) {
            numeros_1_20[i]=rd.nextInt(20)+1;
        }
    }

    
    private static void cambiarArraya0(int[] numeros_1_20) {
        for (int i = 0; i < numeros_1_20.length; i++) {
            if(numeros_1_20[i]>10)
            {
                numeros_1_20[i]=0;
            }
                
        }
    }
    
}
