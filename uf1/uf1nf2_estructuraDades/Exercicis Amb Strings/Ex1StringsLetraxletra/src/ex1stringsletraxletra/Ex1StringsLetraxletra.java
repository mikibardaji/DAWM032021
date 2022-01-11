/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1stringsletraxletra;

import java.util.Scanner;

/**
 *Crea un programa que pida una cadena de texto por teclado y luego muestre cada palabra
de la cadena en una línea distinta
 * @author alumne
 */
public class Ex1StringsLetraxletra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("Escriu una frase");
        String frase = teclado.nextLine();
        
        /*separa por letra*/
        for (int index = 0; index < frase.length(); index++) {
             System.out.println(frase.charAt(index));
        }
        
        String[] palabras_sueltas = frase.split(" ");
        
        for (int i = 0; i < palabras_sueltas.length; i++) {
            System.out.println(palabras_sueltas[i]);
        }
        
       
        
        
    }
    
}
