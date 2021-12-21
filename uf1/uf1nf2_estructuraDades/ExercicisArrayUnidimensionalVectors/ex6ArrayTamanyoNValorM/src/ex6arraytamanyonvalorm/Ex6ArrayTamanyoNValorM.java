/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex6arraytamanyonvalorm;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex6ArrayTamanyoNValorM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pon tamaño del array: ");
        int tamanyo = sc.nextInt();
        System.out.print("Pon valor a poner en todo el array: ");
        int valor = sc.nextInt();
        
        //array con dimension tamany
        int[] numeros = new int[tamanyo];
        //bucle para inicializar a valor todo el array
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = valor;
        }
        
        listar_array(numeros);
         
    }
    
    
    
    
        private static void listar_array(int[] numeros) {
        for (int indice = 0; indice < numeros.length; indice++) {
            System.out.println("posicion " + indice + " = " + numeros[indice]) ;
        }
        
    }
    
}
