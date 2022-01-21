/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplebidimensional;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ExempleBidimensional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        int alumnos=3;
        int notas_modulo = 4;
        double[][] notas_alumnos = new double[alumnos][notas_modulo];
        //notas_alumnoss
        // 0,0 | 0,1 | 0,2 | 0,3 |
        // 1,0 | 1,1 | 1,2 | 1,3 |
        // 2,0 | 2,1 | 2,2 | 2,3 |
        
        
        //introducirNotas(notas_alumnos);
        introducirNotasAutomatico(notas_alumnos);
        mostrarNotas(notas_alumnos);
        mostrarNotasMatriz(notas_alumnos);
        calcularSumaAcumuladaPorFilas(notas_alumnos);
        double todo = calcularSumaTodosValores(notas_alumnos);
        System.out.println("todos los valores sumados son" + todo);
    }
    
    /**
     * recorre el array de dos dimensiones y pone valor en cada celda
     * @param notas_alumnos 
     */

    private static void introducirNotas(double[][] notas_alumnos) {
        Scanner sc = new Scanner(System.in);
        for (int alumno = 0; alumno < notas_alumnos.length; alumno++) 
        {
            //alumno = fila
            System.out.println("Alumno " + (alumno+1));
            for (int nota = 0; nota < notas_alumnos[0].length; nota++) { 
                //nota = columna
                System.out.println("pon la nota " + (nota+1));
                notas_alumnos[alumno][nota]=sc.nextDouble();
            }
            
        }
    }

    
    /**introducimos valores automaticos empezando por el 1
     * y poniendo primero todas las notas del primer alumno
     * luego del segundo
     * @param notas_alumnos 
     */
    
    private static void introducirNotasAutomatico(double[][] notas_alumnos) {
        int acum=1;
        for (int alumno = 0; alumno < notas_alumnos.length; alumno++) 
        {
            //alumno = fila
            System.out.println("Alumno " + (alumno+1));
            for (int nota = 0; nota < notas_alumnos[0].length; nota++) { 
                //nota = columna
                System.out.println("pon la nota " + (nota+1));
                notas_alumnos[alumno][nota]=acum;
                acum++;
            }
            
        }
    }
    
    
    /**introducimos valores automaticos empezando por el 1
     * y poniendo una nota a cada alumno para la nota 1 (examen1) (columnas)
     * una vez puestas a todos los alumnos
     * sigo poniendo todas las notas para el sigioente examen (columnas siguiente
     * luego del segundo
     * @param notas_alumnos 
     */
    
    private static void introducirNotasAutomaticoPorColumnas(double[][] notas_alumnos) {
        int acum=1;
        
        for (int nota = 0; nota < notas_alumnos[0].length; nota++) {  
            
            for (int alumno = 0; alumno < notas_alumnos.length; alumno++) 
            {
                //nota = columna
                System.out.println("pon la nota " + (nota+1));
                notas_alumnos[alumno][nota]=acum;
                acum++;
            }
            
        }
    }    
    private static void mostrarNotas(double[][] valores) throws InterruptedException {
        for (int filas = 0; filas < valores.length; filas++) {
                
            for (int columnas = 0; columnas < valores[0].length; columnas++) {
                System.out.println("Notas del Alumno " + (filas) + "nota " + (columnas) + "-" + valores[filas][columnas]);
                Thread.sleep(500);
                
            }
            
        }
    }

    private static void mostrarNotasMatriz(double[][] valores) throws InterruptedException {
        System.out.println("**************************");
      for (int filas = 0; filas < valores.length; filas++) {
                
            for (int columnas = 0; columnas < valores[filas].length; columnas++) {
                System.out.print("[" + (filas) + "][" + (columnas) + "]=" + valores[filas][columnas] + "||");
                Thread.sleep(500);
                
            }
            System.out.println(""); //salto
            
        }  
    }

    private static void calcularSumaAcumuladaPorFilas(double[][] valores) {
        
        double suma;
        for (int filas = 0; filas < valores.length; filas++) {
             suma=0;   
            for (int columnas = 0; columnas < valores[filas].length; columnas++) {
                suma = suma + valores[filas][columnas];
                
            } //for colunas
            System.out.println("el total de la fila" + filas + " es " + suma);
        }
    }
    
    
    private static double calcularSumaTodosValores(double[][] valores)
    {
        double suma=0;
        for (int filas = 0; filas < valores.length; filas++) {
            for (int columnas = 0; columnas < valores[filas].length; columnas++) {
                suma = suma + valores[filas][columnas];
            }
            
        }
        return suma;
    }
}
