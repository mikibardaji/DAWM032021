/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici3arraysmaximominimo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Exercici3ArraysMaximoMinimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int[] numeros = new int[5];
       
        
        Scanner sc = new Scanner(System.in);
        for (int indice = 0; indice < numeros.length; indice++) {
            numeros[indice] = sc.nextInt();
        }
        
        for (int indice = 0; indice < numeros.length; indice++) {
            System.out.println("posicion " + indice + " = " + numeros[indice]) ;
        }
        
        int minimo, maximo;
        
        minimo = numeros[0];//la primera posicion
        maximo = numeros[0];//la primera posicion
        
        for (int indice = 0; indice < numeros.length; indice++) {
            //indice 1
            if (numeros[indice]<minimo)
            { //si esta posicion es mas pequeña que el numero que tenia
                //guardado , sustituyo minimo por el contenido
                //de esta posicion del array
                minimo = numeros[indice];
            }
            if (numeros[indice]>maximo)
            { //si esta posicion es mas grande que el numero que tenia
                //guardado , sustituyo minimo por el contenido
                //de esta posicion del array
                maximo = numeros[indice];
            }
        }
        
    }
    
}
