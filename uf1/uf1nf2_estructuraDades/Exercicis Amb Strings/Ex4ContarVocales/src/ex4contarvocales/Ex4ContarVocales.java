/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4contarvocales;

import java.util.Scanner;

/**
 *Crea un programa que muestre por pantalla cuantas vocales de cada tipo hay (cuantas ‘a’,
cuantas  ‘e’,  etc.)  en una  frase  introducida  por  teclado. No  se  debe   diferenciar  entre
mayúsculas y minúsculas. Por ejemplo dada la frase “Mi mama me mima” dirá que hay:
Nº de A's: 3
Nº de E's: 1
Nº de I's: 2
Nº de O's: 0
Nº de U's: 0
 * @author alumne
 */
public class Ex4ContarVocales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       int[] valores= new int[5];
       
       
        
        System.out.println("Escriu una frase");
        String frase1 = teclado.nextLine();
        frase1 = frase1.toLowerCase();
        int contA=0,contE=0,contI=0,contO=0,contU=0;
        
        for (int i = 0; i < frase1.length(); i++) {
            switch (frase1.charAt(i)) {
                case 'a':
                    contA++;    
                    break;
                case 'e':
                    contE++;    
                    break;        
                case 'i':
                    contI++;    
                    break;
                case 'o':
                    contO++;    
                    break;
                case 'u':
                    contU++;    
                    break;    
 
                default:
                    ;
            }
            
            
        }
        
        System.out.println("a's" + contA + " e: " + contE + " i: " + contI + " o: " + contO + " u: " + contU);
        
        
        
        
        
    }
    
}
