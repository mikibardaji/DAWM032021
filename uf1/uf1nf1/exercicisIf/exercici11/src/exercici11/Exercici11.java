/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici11;

import java.util.Scanner;

/**
 * Dibuja el ordinograma de un programa que lee 2 números y muestra el mayor.
 * @author alumne
 */
public class Exercici11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Leer A
        Scanner teclado = new Scanner(System.in);
        int a;
        System.out.print("Pon el numero primero: ");
        a = teclado.nextInt();
          //Leer B
        int b;
        System.out.print("Pon el numero segund: ");
        b = teclado.nextInt();
        if(a>b)
        {
            System.out.println("el mayor es el a ->" + a);
        }
        else
        {
            System.out.println("el mayor es el b ->" + b);
        }
          
    }
    
}
