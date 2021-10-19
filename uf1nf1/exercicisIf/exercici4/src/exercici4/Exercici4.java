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
        int x,y;
        int suma,resta,multi;
        double divi;
        Scanner teclado= new Scanner(System.in);
        System.out.println("Pon el valor de x:");
        x = teclado.nextInt();
        //System.out.println("x=" + x);
        System.out.println("Pon el valor de y:");
        y = teclado.nextInt();
        //System.out.println("y=" + y);
        suma = x+y;
        resta = x-y;
        multi = x*y;
        //castear al tipo que toque
        divi = (double) x/y;
        System.out.println("La suma es " + suma);
        System.out.println("La resta es " + resta);
        System.out.println("Multiplicacion es " + multi);
        System.out.println("Division es " + divi);
    }
    
}
