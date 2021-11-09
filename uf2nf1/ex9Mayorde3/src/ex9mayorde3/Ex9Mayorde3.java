/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex9mayorde3;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex9Mayorde3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v1,v2,v3;
        System.out.println("Pon el valor 1");
        v1=sc.nextInt(); //5
        System.out.println("Pon el valor 2");
        v2=sc.nextInt(); //3
        System.out.println("Pon el valor 3");
        v3=sc.nextInt(); //7
                           //llamas con 5,3
        int ValorMasGrande = mayorDeDos(v1,v2);
        //valorMasgrande = 5
        //ahora pregunto por el 3 comparado con el mayor de los 
        //otros dos
                        //llamas con 7,5
        ValorMasGrande = mayorDeDos(v3, ValorMasGrande);
        System.out.println("El mas grande " + ValorMasGrande);
        
    }
    
    
    /**
     * mayorDeDos: devuelve el valor maximo de 2 numeros
     * @param valor1 primer valor
     * @param valor2 segundo valor
     * @return el valor mas grande de los 2
     */
    
    public static int mayorDeDos(int valor1, int valor2)
    {
        if (valor1>valor2)
            return valor1;
        else
            return valor2;
    }
}
