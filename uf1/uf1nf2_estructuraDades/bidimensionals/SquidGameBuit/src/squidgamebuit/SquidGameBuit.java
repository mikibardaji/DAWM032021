/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package squidgamebuit;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class SquidGameBuit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int[][] CrystalBridge = new int[5][2];
         
         int fila=0;
          int lado;
          boolean vivo;
         String nombre = askName();
         System.out.println("bienvenido " + nombre);
         fillSafeBoxes(CrystalBridge);
        // mostrarArray(CrystalBridge);
         
         do{
               showBridgeStatus(CrystalBridge);

               lado = chooseBox(fila,nombre);
               vivo = stillAlive(CrystalBridge,fila,lado);
               if (vivo)
               {
                   System.out.println("sigues vivo");
               }
               else
               {
                   System.out.println("RIP");
               }
               fila++;
         }while(vivo && fila<5);
        
        if(vivo)
        {
            System.out.println("has ganado 100000000000 €");
        }
        
    }

      /**
     * askName pide tu nombre y lo retorna el nombre en mayusculas
     * si el usuario no responde o sea lo deja en blanco, debe seguir pidiendo
     * el nombre
     * @return devuelve el string en mayusculas
     */
    private static String askName() {
       String nom;
       Scanner sc = new Scanner(System.in);
       do{
        System.out.println("Pon tu nombre participanete ");
       nom = sc.nextLine();
       }while(nom.isEmpty());
       
       return nom.toUpperCase();
    }


    
   
    
    
     /**
     * fillSafeBoxes
     * En cada fila, se marcara un sitio de los dos posibles como zona segura (1)
     * la eleccion es aleatoria.
     * @param CrystalBridge 
     */
      private static void fillSafeBoxes(int[][] CrystalBridge) {
          int valor_seguro=1;
          int col;
          Random rd = new Random();
          for (int filas = 0; filas < CrystalBridge.length; filas++) {
              col = rd.nextInt(CrystalBridge[0].length);
              CrystalBridge[filas][col] = valor_seguro;
          }        
    }
    
   private static void mostrarArray(int[][] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            for (int col = 0; col < numeros[0].length; col++) {
                System.out.print(numeros[i][col] + " ");
                
            }
            System.out.println("");
            
        }
    }


    
     /**
     * showBridgeStatus Muestra el puente falseado
     * si las casillas son lugares por descubrir aún mostrara ("█" + " ")
     * si la casilla es un lugar pisado y era seguro("O" + " ")
     * y si es un lugar donde se ha caio se mostrara ("X" + " ")
     * @param CrystalBridge  
     */
    private static void showBridgeStatus(int[][] CrystalBridge) {
        for (int i = 0; i < CrystalBridge.length; i++) {
            for (int col = 0; col < CrystalBridge[0].length; col++) {
                if (CrystalBridge[i][col] ==3)
                {
                    System.out.print("O" + " ");
                }
                else if (CrystalBridge[i][col] ==2)
                {
                    System.out.print("X" + " ");
                }
                else
                {
                    System.out.print("█" + " ");
                }
                
            }
            System.out.println("");
            
        }
        
    }    


    
     /**
     * chooseBox: Pregunta al jugador que lado elige para saltar
     * las opciones validas son izquierda/derecha (string) , de cualquier forma escrita
     * si no pone estas opciones, seguira pidiendo que pongas el lado
     * @param fila donde vas a elegir, solo sirve para el display de elige fila xxxx
     * @param nom nombre del jugador solo sirve para el display
     * @return devuelve la posición elegida en tipo entero, contando que la fila solo tiene
     * dos columnas, la 0 o la 1.
     */
    private static int chooseBox(int fila, String nombre) {
        String lado;
       Scanner sc = new Scanner(System.in);
       do{
        System.out.println("A donde saltas de la fila " + (fila+1) + ", " + nombre + " izquierda/derecha");
        lado = sc.nextLine();
       }while (!(lado.equalsIgnoreCase("Izquierda") || lado.equalsIgnoreCase("Derecha")));
       if (lado.equalsIgnoreCase("Izquierda"))
       {
           return 0;
       }
       else
       {
           return 1;
       }
       
    }

    
    
    
     /**
     * stillAlive: función que recibe la fila del puente done se encuentra y el lado que ha votado
     * el jugador, si ese sitio es un lugar seguro (1), marca la casilla como pasada (3) 
     * y devuelve que estas vivo (true)
     * en cambio si una casilla que se rompe (0), la marca como casilla rota(2) y devuelve muerto(false)
     * cualquier otra opción posible, retornas falso (mueres)
     * Ayuda no tiene que recorrer todo el tablero porque sabemos que casilla queremos comprobar
     * @param CrystalBridge tablero bidimensional
     * @param fila entero que refleja la fila a la que va a saltar el jugador
     * @param lado entero que indica cual de los dos lados ha elegido el jugador
     * @return true(vivo) false (muerto
     */
    private static boolean stillAlive(int[][] CrystalBridge, int fila, int lado) {
        if(CrystalBridge[fila][lado]==0)
        {
            CrystalBridge[fila][lado]=2;
            return false;
        }
        if(CrystalBridge[fila][lado]==1)
        {
            CrystalBridge[fila][lado]=3;
            return true;
        }
        return false;
    }
    
}



