/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex17primo;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex17primo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         double numero;
         boolean es_primo;
        do{
         System.out.println("Pon numero y te digo si es primo");
        numero = sc.nextDouble();
        if(numero!=0)
            {
                //es_primo = dimeSiEsPrimo(numero);
                //true es primo sino no lo es
                if (dimeSiEsPrimo(numero))                  //(es_primo==true)
                {
                    System.out.println("Numeroo primo");
                }
                else
                {
                    System.out.println("No es primo");
                }
            } 

        }while(numero!=0);
        System.out.println("Saliendo programa");
    }

    /**
     * mira si el numero es primo o sea que no se puede  dividir por ninguno que no sea el mismo
     * y el numero 1 (2...numero-1).
     * @param numero que quiero saber si es primo
     * @return true numero primo, false si no lo es
     */
    private static boolean dimeSiEsPrimo(double numero) {
        
        for (int i = 2; i <= numero-1; i++) {
            if (numero%i==0) //lo divide por tanto no es primo
            {
                return false;
            }
            //si no lo divie aun no puedo informar porque tengo que 
            //probar todos los numeros hasta el terminar el bucle
            //para saber si es primo
        }
        return true; //nunca he entrado en el if, por tanto ningún numero divide al de entrada
    }
    
}
