/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3concatenarstrings;

import java.util.Scanner;

/**
 *Crea un programa que pida por teclado tres cadenas de texto: nombre y dos apellidos. Luego
mostrará un código de usuario (en mayúsculas) formado por la concatenación de las tres
primeras letras de cada uno de ellos. Por ejemplo si se introduce “Lionel”, “Tarazón” y
“Alcocer” mostrará “LIOTARALC”.
 * @author alumne
 */
public class Ex3ConcatenarStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
         opcionA(teclado);
         opcionB(teclado);
        

        //System.out.println(nom.substring(0, 3).toUpperCase() + cognom1.substring(0, 3).toUpperCase() + cognom2.substring(0, 3).toUpperCase());
    }

    private static void opcionB(Scanner teclado) {
     
        System.out.println("Escriu el teu nom: ");
        String nom = teclado.nextLine().toUpperCase();
         System.out.println("Escriu el teu cognom: ");
        String cognom1 = teclado.nextLine().toUpperCase();
           System.out.println("Escriu el teu 2 cognom: ");
        String cognom2 = teclado.nextLine().toUpperCase();
        System.out.println(nom.substring(0, 3) + cognom1.substring(0, 3) + cognom2.substring(0, 3));
    }

    private static void opcionA(Scanner teclado) {
                System.out.println("Escriu el teu nom: ");
        String nom = teclado.nextLine();
         System.out.println("Escriu el teu cognom: ");
        String cognom1 = teclado.nextLine();
           System.out.println("Escriu el teu 2 cognom: ");
        String cognom2 = teclado.nextLine();
        
       // nom = nom.substring(0, 3);
        String nomRetallat =  nom.substring(0, 3);
        String cognom1Retallat = cognom1.substring(0, 3);
        String cognom2Retallat =  cognom2.substring(0, 3);
        
        String nomRetallatM = nomRetallat.toUpperCase();
        String cognom1RetallatM = cognom1Retallat.toUpperCase();
        String cognom2RetallatM = cognom2Retallat.toUpperCase();
        
        String codigo = nomRetallatM + cognom1RetallatM + cognom2RetallatM;
        
        System.out.println(codigo);
    }
    
}
