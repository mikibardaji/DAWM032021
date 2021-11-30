/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici10;

import java.util.Scanner;

/**
 * Dibuja un ordinograma que lee dos números, 
 * calcula y muestra el valor de su suma, resta, producto y división. 
 * (Ten en cuenta la división por cero ).
 * @author alumne
 */
public class Exercici10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int suma,resta,multi,divi=0;
        System.out.print("Pon el numero 1: ");
        
        int num1 = teclado.nextInt();
        System.out.print("Pon el numero 2: ");
        
        int num2 = teclado.nextInt();
        suma = num1+num2;
        resta = num1-num2;
        multi = num1*num2;
        System.out.println("suma : " + suma);
        System.out.println("resta : " + resta);
        System.out.println("multiplicacion : " + multi);
        
        if (num2!= 0)
        {
           divi = num1/num2;
           System.out.println("division : " + divi); 
        }
        else //entonces es 0
        {
            System.out.println("No puedo dividir por 0");
        }
        
        System.out.println(divi);
    }
    
}
