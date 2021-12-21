/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex10numerosigualesan;

import java.util.Random;
import java.util.Scanner;

/**
 *Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con valores
enteros aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). Luego pedirá un valor N y
mostrará en qué posiciones del array aparece N
 * @author alumne
 */
public class Ex10NumerosIgualesaN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] valores= new int[20];
        
        inicializarArray(valores);
        mostrarArray(valores);
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon valor entre 1 y 20");
        int valorMarca = sc.nextInt();
        BuscarNumerosSuperiores(valores, valorMarca);
    }
    
    
        private static void inicializarArray(int[] valores) {
        Random rd = new Random();
        int aleatorio;
        for (int i = 0; i < valores.length; i++) {
            aleatorio = rd.nextInt(10)+1;
            valores[i] = aleatorio;
        }
        
        

    }
        
        
    private static void BuscarNumerosSuperiores(int[] valores, int valorMarca) {
        
        for (int index = 0; index < valores.length; index++) {
            if (valores[index]== valorMarca)
            {
                System.out.println(valorMarca + "esta en la posición " + index);
            }
        }
       
    }
    
    
    private static void mostrarArray(int[] valoresEntre1y1000) {
        for (int i = 0; i < valoresEntre1y1000.length; i++) {
            System.out.println("indice " + i +"=" + valoresEntre1y1000[i]);
            
        }
    }
}
