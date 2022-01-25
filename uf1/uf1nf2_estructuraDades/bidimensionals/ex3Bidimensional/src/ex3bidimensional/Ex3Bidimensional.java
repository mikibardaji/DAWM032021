/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3bidimensional;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex3Bidimensional {

    /**
     * @param args the command line arguments
     * 3. Crea un programa que cree una matriz de tamaño NxM (tamaño introducido por teclado) e
     * introduzca en ella NxM valores (también introducidos por teclado). Luego deberá recorrer la
     * matriz y al final mostrar por pantalla cuántos valores son mayores que cero, cuántos son
     * menores que cero y cuántos son igual a cero.
     */
    public static void main(String[] args) {
        int filas, columnas;
        Scanner sc = new Scanner(System.in);
        System.out.println("Posa les files");
        filas = sc.nextInt();
        System.out.println("Posa les columnes");
        columnas = sc.nextInt();
        
        int[][] tabla = new int[filas][columnas];
        
        rellenarAleatorios(tabla);
        mostrarArrayBidimensional(tabla);
        calcularPositivosNegativosCero(tabla);
        sumarTodosValoresPorFila(tabla);
    }
    
    
    
    
    private static void mostrarArrayBidimensional(int[][] tabla) {
        for (int filas = 0; filas < tabla.length; filas++) {
            for (int columnas = 0; columnas < tabla[0].length; columnas++) {
                System.out.print(tabla[filas][columnas] + " ");
            }
            System.out.println(""); //salto de linea
        }
    }

    private static void rellenarAleatorios(int[][] tabla) {
        Random rd = new Random();
        int numero = rd.nextInt(11);
        for (int filas = 0; filas < tabla.length; filas++) {
            for (int columnas = 0; columnas < tabla[0].length; columnas++) {
                tabla[filas][columnas]= rd.nextInt(11)-5;
            }
            
        }
    }

    private static void calcularPositivosNegativosCero(int[][] tabla) {
        int pos=0,zeros=0,neg=0;
        for (int filas = 0; filas < tabla.length; filas++) {
            for (int columnas = 0; columnas < tabla[0].length; columnas++) {
                if (tabla[filas][columnas]>0)
                {
                    pos++;
                }
                else if (tabla[filas][columnas]<0)
                {
                    neg++;
                }
                else
                {
                    zeros++;
                }
            }
            
        }
        System.out.println(pos + "-" + neg + "- " + zeros);
    }

    /**
     * funcion que recorre toda la tabla y calcula la suma de todos los valores 
     * de la MISMA FILA, y lo muestra por pantalla
     * si la tabla tiene 5 filas, debe mostrar 5 resultados
     * @param tabla 
     */
    private static void sumarTodosValoresPorFila(int[][] tabla) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
