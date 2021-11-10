/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex18dni;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex18DNI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char letra = 'T';
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon tu dni y te dire la letra");
        int DNI = sc.nextInt();
        
        letra = calculaLetra(DNI);
        
        System.out.println("Tu letra es" + letra);
        
        
    }

    /**
     * 
     * @param DNI
     * @return letra de tu dni si dni es invalido devuelvo *
     */
    private static char calculaLetra(int DNI) {
        int residuo = DNI%23;
        char letra;
        switch(residuo)
        {
            case 0:
                letra = 'T';
                break;
            case 1:
                letra = 'R';
                break;
            case 2:
                letra = 'W';
                break;
            case 15:
                letra = 'S';
                break;
            default:
                letra = '*';
                break;
        }
        return letra;
    }
    
}
