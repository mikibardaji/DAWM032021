/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex11invertirvaloresarray;

import java.util.Random;

/**
 *
 * @author alumne
 */
public class Ex11invertirValoresArray {

    /**
     * . Crea un programa que cree dos arrays de enteros de tamaño 100. Luego introducirá en el
primer array todos los valores del 1 al 100. Por último, deberá copiar todos los valores del
primer array al segundo array en orden inverso, y mostrar ambos por pantalla.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] valores = new int[10];
        int[] invertido = new int[10];
        
        llenarPrimeraArray(valores);
        mostrarArray(valores);
        copiarFormaInvertida(valores, invertido);
        System.out.println("****************");
        mostrarArray(invertido);
    }

    private static void llenarPrimeraArray(int[] valores) {
        Random rd = new Random();
        for (int i = 0; i < valores.length; i++) {
            valores[i] = rd.nextInt(20)+1;
        }
    }

    private static void mostrarArray(int[] valores) {
        for (int i = 0; i < valores.length; i++) {
            System.out.println(" valores" + (i + 1) + "=" + valores[i]);

        }
    }

    private static void copiarFormaInvertida(int[] valores, int[] invertido) {

        int indice_invertido;
        for (int i = (valores.length-1); i >= 0; i--) {
             indice_invertido = (invertido.length-1) - i;
               invertido[indice_invertido]= valores[i];
        }
    }
    
}
