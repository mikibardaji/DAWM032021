/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici4;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Exercici4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Pon un numero");
        int TOPE = teclado.nextInt();
        int contador;
        
        for (contador = 1; contador <= TOPE; contador++) ;
        {
            System.out.println(contador);
            
        }
        
//        contador=1;
//        while(contador<=TOPE);
//        {
//                 System.out.println(contador);
//                 contador++;
//        }
//        
//        contador=1;
//        do
//        {
//                 System.out.println(contador);
//                 contador++;
//        }while(contador<=TOPE);
    }
    
}
