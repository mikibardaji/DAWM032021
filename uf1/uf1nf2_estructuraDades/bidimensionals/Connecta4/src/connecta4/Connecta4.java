/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package connecta4;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Connecta4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] tablero = new int[6][7];
        String nom1, nom2;
        
        //nom1 =pedirNombre();
        //nom2 =pedirNombre();
        
        //int turno = EmpezarTurno();
        int turno=1;
         int col ;
        mostrarTauler(tablero);
        System.out.println("jugadador "+ turno +"  escoge columna donde tiras la ficha");
        col= sc.nextInt()-1;
        tirada(tablero,col,turno);
        mostrarTauler(tablero);
        if (turno==1)
        {
            turno=2;
        }
        else
        {
            turno=1;
        }
        System.out.println("jugadador "+ turno +"  escoge columna donde tiras la ficha");
        col = sc.nextInt()-1;
        tirada(tablero,col,turno);
        mostrarTauler(tablero);
        //while guanador o tauler_ple
    }

    private static void mostrarTauler(int[][] tablero) {
            for (int fila = 0; fila < tablero.length; fila++) {
                for (int col = 0; col < tablero[0].length; col++) {
                    char pintar = MostrarCasellaUsuari(tablero, fila,col);
                    System.out.print("|"+ pintar);
                    
                }
                System.out.println("");//cambiar de linea
        }
    }

    private static char MostrarCasellaUsuari(int[][] tablero, int fila, int col) {
        if (tablero[fila][col]==0)
        {
            return '-';
        }
        else if (tablero[fila][col]==1)
        {
            return 'X';
        }
        else
        {
            return 'O';
        }
            
    }

    /**
     * colocara la ficha de turno en la columna elegida, en la posicion de mas abajo permitida
     * 
     * @param col columna elegida
     * @param turno  turno del jugador(1/2)
     */
    
    private static void tirada(int[][] tablero, int col, int turno) {
        
        for (int filas = tablero.length-1; filas >=0; filas--) {
            if (tablero[filas][col]==0)
            {//he encontrado el hueco
                tablero[filas][col] = turno;
                break;
            }
        }
        
    }
    
}
