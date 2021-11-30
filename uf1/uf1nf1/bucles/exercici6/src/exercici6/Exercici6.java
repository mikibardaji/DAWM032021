/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici6;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Exercici6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //System.out.println("Pon un numero");
        int numero;
        int contador;
        boolean negativo=false;
        for (contador = 1; contador <= 10; contador++) {
            System.out.println("Pon un numero");
            numero=teclado.nextInt();
            if(numero<0)
            {
                negativo=true;
            }
            
        } //fin for
        
        if(negativo==true)
        {
            System.out.println("has puesto un negativo");
        }
        else
        {
            System.out.println("NO has puesto un negativo");
        }
        
    }
    
}
