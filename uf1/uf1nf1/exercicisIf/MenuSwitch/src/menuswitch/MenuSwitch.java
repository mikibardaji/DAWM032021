/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menuswitch;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class MenuSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("==Menu===================");
        System.out.println("= 1.Nueva partida       =");
        System.out.println("= 2.Cargar partida vieja=");
        System.out.println("= 3.Records             =");
        System.out.println("= 0.Salir               =");
        System.out.println("=========================");
        System.out.println("Escoge opcion:");
        Scanner teclado = new Scanner(System.in);
        int opcion = teclado.nextInt();
        
        
        switch(opcion){
            case 1: //if (opcion==1)
                System.out.println("Empezando partida");
                break;
            case 2:
                System.out.println("Recuperando partida");
                break;
            case 3:
                System.out.println("El record es 50000 puntos");
                break;
            case 0:
                System.out.println("Saliendo juego");
                break;
            default:
                System.out.println("opcion no correcta");
                break;                
        }
            
        
    }
    
}
