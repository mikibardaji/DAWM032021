/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici2practica;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Exercici2Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        System.out.println("dime el numero");
        Scanner teclado = new Scanner(System.in);
        num = teclado.nextInt();
        
        if (num%2 ==0)
        { //si se cumple cierto
            if (num%3==0)
            {//cierto
                System.out.println("numero par y divisible entre 3");
            }
            else
            {
                System.out.println("numero par");
            }
        }
        else
        {
            System.out.println("Numero impar");
        }
        
    }
    
}
