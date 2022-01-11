/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2frasesiguales;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex2FrasesIguales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("Escriu una frase");
        String frase1 = teclado.nextLine();
         System.out.println("Escriu una altra frase");
        String frase2 = teclado.nextLine();
        
        if (frase1.equalsIgnoreCase(frase2))
        {
            System.out.println("frases iguals");
        }
        else
        {
            System.out.println("diferents ");
        }
    }
    
}
