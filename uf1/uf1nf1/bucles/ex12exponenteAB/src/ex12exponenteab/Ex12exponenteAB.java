/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex12exponenteab;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex12exponenteAB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int base, cont, exponente, resultado=1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime la base:");
        base = teclado.nextInt();
        System.out.println("Dime el exponente:");
        exponente = teclado.nextInt();
        
        for (cont=1; exponente>=cont; cont++){
            System.out.println("resultado: " + resultado + "base " + base);
            resultado= resultado * base;
            System.out.println("resultado " + resultado);
        }
         System.out.println("El resultado es: " + resultado);
    }
    
}
