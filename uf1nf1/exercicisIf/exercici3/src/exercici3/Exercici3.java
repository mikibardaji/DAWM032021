/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici3;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Exercici3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double lado, area;
        /*variable de tipo scanner 
        sirve para recoger datos por teclado
        y lo devuelve*/
        Scanner teclado = new Scanner(System.in);
       
        System.out.println("Cuanto mide el lado de tu cuadrado");
        
        lado=teclado.nextDouble();
        area = lado*lado;
        System.out.println("El lado del cuadrado es " + lado);
        System.out.println("Su area es " + area);
    }
    
}
