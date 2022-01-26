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
        //calcularPositivosNegativosCero(tabla);
        //sumarTodosValoresPorFila(tabla);
        System.out.println("Dime la fila y te calculo la suma de esa sola fila");
        int fila = sc.nextInt(); //el usuario piensa que la tabla tiene 1,2,3,4,5,
        int suma_fila = calcularSumaFila(tabla,fila-1);
        System.out.println("la fila" + fila + " suma " + suma_fila);
        System.out.println("Dime la columnas y te calculo la suma de esa sola fila");
        int columna = sc.nextInt(); //el usuario piensa que la tabla tiene 1,2,3,4,5,
        int suma_columna = calcularSumaColumna(tabla,columna-1);
        System.out.println("la columna" + columna + " suma " + suma_columna);
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
        System.out.println("positivos="+ pos + "-negativos="+ + neg + "-zeros=" + zeros);
    }

    /**
     * funcion que recorre toda la tabla y calcula la suma de todos los valores 
     * de la MISMA FILA, y lo muestra por pantalla
     * si la tabla tiene 5 filas, debe mostrar 5 resultados
     * @param tabla 
     */
    private static void sumarTodosValoresPorFila(int[][] tabla) {
        int suma_acum;
        for (int fila = 0; fila < tabla.length; fila++) {
            suma_acum=0;
            for (int col = 0; col < tabla[0].length; col++) { //array de un sola dimensio []
                suma_acum = suma_acum + tabla[fila][col];
            }
            System.out.println("la suma de la fila " + (fila+1) + " es " + suma_acum);
        }
 
    }

    private static int calcularSumaFila(int[][] tabla, int fila) {
        //la fila no ha de canviar mai
        int suma_acum=0;
        for (int i = 0; i < tabla[fila].length; i++) {
            suma_acum = suma_acum + tabla[fila][i];
        }
        return suma_acum;
        
    }

    private static int calcularSumaColumna(int[][] tabla, int col) {
        int suma_acum=0;
        //nº de filas = tablas.length
        //nº columnas = tablas[0].length
        for (int filas = 0; filas < tabla.length; filas++) {
            suma_acum = suma_acum + tabla[filas][col];
        }
        // recorro todo menos la ultima fila
//                for (int filas = 0; filas < tabla.length-1; filas++) {
//            suma_acum = suma_acum + tabla[filas][col];
//        }
        return suma_acum;
    }
    
}
