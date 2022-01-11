/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex5palindromo;

import java.util.Scanner;

/**
 * Realiza un programa que lea una frase por teclado e indique si la frase es un palíndromo o
no (ignorando espacios y sin diferenciar entre mayúsculas y minúsculas). Supondremos que
el usuario solo introducirá letras y espacios (ni comas, ni puntos, ni acentos, etc.). Un
palíndromo es un texto que se lee igual de izquierda a derecha que de derecha a izquierda.
Por ejemplo:
Amigo no gima
Dabale arroz a la zorra el abad = Dabalearrozalazorraelabad
Amo la pacífica paloma
A man a plan a canal Panama
 * @author alumne
 */
public class Ex5Palindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("Escriu una frase");
        String frase1 = teclado.nextLine();
        
        boolean palindromo = esPalindromo(frase1);
        
        if (palindromo==true)
        {
            System.out.println("Es palindromo");
        }
        else
        {
            System.out.println("no es palindromo");
        }
    }

    private static boolean esPalindromo(String frase1) {
        frase1 = frase1.toLowerCase();
        System.out.println("frase en minuscula: " + frase1);
        frase1 = frase1.replace(" ","");
          System.out.println("frase sin espacios: " + frase1);
          
        int paraAtras=frase1.length()-1;
        for (int i = 0; i < frase1.length(); i++) {
            if (frase1.charAt(i)!=frase1.charAt(paraAtras)) //si es diferente ya no es pallindrom
            {
                return false;
            }
            paraAtras--;
        }
          
        return true;
    }
    
}
