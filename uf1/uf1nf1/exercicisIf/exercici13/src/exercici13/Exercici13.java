/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici13;

import java.util.Scanner;

/**
 * Dibuja un ordinograma de un programa que 
 * lee dos números y los visualiza en orden ascendente.
 */
public class Exercici13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num1;
       int num2;
       Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número");
        num1 = sc.nextInt();
        System.out.println("Introduce un segundo número");
        num2 = sc.nextInt();
        
        if(num1 > num2){
            System.out.println("El resultado ascendente es: " + num2 + " , " + num1);
        }else{
        System.out.println("El resultado ascendente es: " + num1 + " , " + num2);
        }
    }
    
}
