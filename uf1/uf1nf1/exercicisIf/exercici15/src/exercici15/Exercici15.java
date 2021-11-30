/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici15;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Exercici15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1,num2,num3;
       Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer numero: ");
        num1 = sc.nextInt();
        System.out.print("Introduce el segundo numero: ");
        num2 = sc.nextInt();
        System.out.print("Introduce el tercer numero: ");
        num3 = sc.nextInt();
        
        
        if (num1>num2)
        { //si i num1 es mes gran que el dos
            if(num1>num3)
            { //si que se cumple
                System.out.println("El mayor es num1 " + num1);
            }
            else
            {
                System.out.println("Este El moyor es  num3 " + num3);
            }            
        }
        else if (num2>num3) //aqui n2 es mes gran que n1
        { //n2 es mes gran que n3
            System.out.println("El mayorr es num2  " + num2);
        }
        else //num3 es el mes gran
        {
            System.out.println("el mayor es nmum3 "  + num3);
        }
    }
    
}
