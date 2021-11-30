/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici9;

import java.util.Scanner;

/**
 * Dibuja un ordinograma de un programa que pide la edad por teclado 
 * y nos muestra el mensaje de “eres mayor de edad” o el mensaje de “eres menor de edad”.
 * @author alumne
 */
public class Exercici9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad;
        System.out.print("Que edad tienes: ");
        edad = teclado.nextInt();
        
        if (edad>=18)
        {
            System.out.println("mayor de edad");
        }
        else
        {
            System.out.println("Eres menor ");
        }
    }
    
}
