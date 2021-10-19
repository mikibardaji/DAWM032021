/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici14;

import java.util.Scanner;

/**
 *Dibuja un ordinograma que lee dos números y nos dice cuál es el mayor o si son iguales.
 * @author alumne
 */
public class Exercici14 {

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
            System.out.println("El mas gradne es: " + num1);
        }else if(num1==num2){
            System.out.println("Son iguales ");
        }else
        {
            System.out.println("El mas grande es " + num2);
        }
    }
    
}
