/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1ex2bidimensional;

/**
 *
 * @author alumne
 */
public class ex1ex2Bidimensional {

    /**
     * @param args the command line arguments
     * 1. Crea un programa que cree una matriz de tamaño 5x5 que almacene los números del 1 al 25
     * y luego muestre la matriz por pantalla.
     * 2. Crea un programa que cree una matriz de 10x10 e introduzca los valores de las tablas de
     * multiplicar del 1 al 10 (cada tabla en una fila). Luego mostrará la matriz por pantalla.
     */
    
    public static void main(String[] args) {
        int[][] tabla_filas = new int[5][5];
        int[][] tabla_columnas = new int[5][5];
        int[][] tabla_multiplicar = new int[10][10];
        
        llenarPorColumnas(tabla_columnas);
        mostrarArrayBidimensional(tabla_columnas);
        System.out.println("************************");
        
        
        llenarPorFilas(tabla_filas);
        mostrarArrayBidimensional(tabla_filas);
        
         System.out.println("Tablas de multiplicar");
        llenarTablasMultiplicar(tabla_multiplicar);
        mostrarArrayBidimensional(tabla_multiplicar);
      
    }

    private static void mostrarArrayBidimensional(int[][] tabla_columnas) {
        for (int filas = 0; filas < tabla_columnas.length; filas++) {
            for (int columnas = 0; columnas < tabla_columnas[0].length; columnas++) {
                System.out.print(tabla_columnas[filas][columnas] + " ");
            }
            System.out.println(""); //salto de linea
        }
    }

    private static void llenarPorColumnas(int[][] tabla_columnas) {
        int valor=1;
        for (int filas = 0; filas < tabla_columnas.length; filas++) {
            for (int columnas = 0; columnas < tabla_columnas[0].length; columnas++) {
                tabla_columnas[filas][columnas]=valor;
                valor++;
            }
            System.out.println(""); //salto de linea
        }
    }

    private static void llenarPorFilas(int[][] tabla_filas) {
        int valor=1;
        for (int columnas = 0; columnas < tabla_filas[0].length; columnas++) {
            for (int filas = 0; filas < tabla_filas.length; filas++) {
                tabla_filas[filas][columnas]=valor;
                valor++;
            }
            
        }
          
    }

    private static void llenarTablasMultiplicar(int[][] tabla_multiplicar) {        
        for (int fil = 0; fil < tabla_multiplicar.length; fil++) {
            for (int col = 0; col < tabla_multiplicar[0].length; col++) {
                tabla_multiplicar[fil][col] = (fil+1)*(col+1);
            }
            
        }
        
    }
    
}
