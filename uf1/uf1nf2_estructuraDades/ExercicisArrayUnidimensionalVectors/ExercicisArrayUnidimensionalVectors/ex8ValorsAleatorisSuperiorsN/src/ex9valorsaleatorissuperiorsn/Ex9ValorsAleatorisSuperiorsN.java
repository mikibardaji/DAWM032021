/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex9valorsaleatorissuperiorsn;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex9ValorsAleatorisSuperiorsN {

    /**
     * Crea un programa que cree un array con 100 números reales aleatorios entre 0.0 y 1.0,
utilizando Math.random(), y luego le pida al usuario un valor real R. Por último, mostrará
cuántos valores del array son igual o superiores a R
     */
    public static void main(String[] args) {
        int[] valoresEntre1y1000 = new int[20];
        
        inicializarArray(valoresEntre1y1000);
        mostrarArray(valoresEntre1y1000);
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon valor entre 1 y 1000");
        int valorMarca = sc.nextInt();
        int cuantos = BuscarNumerosSuperiores(valoresEntre1y1000,valorMarca);
        System.out.println("Hay " + cuantos + " numeros que superan " + valorMarca);
    }

    private static void inicializarArray(int[] valoresEntre1y1000) {
        Random rd = new Random();
        int aleatorio;
        for (int i = 0; i < valoresEntre1y1000.length; i++) {
            aleatorio = rd.nextInt(1000)+1;
            valoresEntre1y1000[i] = aleatorio;
        }
    }


    /**
     * recorrer el array y encontrar cuantas posiciones superar al valor indicado
     * @param valoresEntre1y1000
     * @param valorMarca el valor que deben superar
     * @return la cantidad de numeros que superan valorMarca
     */
    private static int BuscarNumerosSuperiores(int[] valoresEntre1y1000, int valorMarca) {
        int cont=0;
        for (int index = 0; index < valoresEntre1y1000.length; index++) {
            if (valoresEntre1y1000[index]>= valorMarca)
            {
                cont++;
            }
        }
        return cont;
    }
    
        private static void mostrarArray(int[] valoresEntre1y1000) {
        for (int i = 0; i < valoresEntre1y1000.length; i++) {
            System.out.println("indice " + i +"=" + valoresEntre1y1000[i]);
            
        }
    }

}
