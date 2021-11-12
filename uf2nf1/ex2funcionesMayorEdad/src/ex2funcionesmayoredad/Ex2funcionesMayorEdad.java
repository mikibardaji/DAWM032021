/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2funcionesmayoredad;

import java.util.Scanner;

/**
 *Escribe un programa que pida la edad por teclado y muestre por pantalla si eres mayor de edad
o no. Implementa y utiliza la función:
boolean esMayorEdad(int a) // Devuelve verdadero si a>=18, falso en caso contrario
 * @author alumne
 */
public class Ex2funcionesMayorEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad;
     
        
        edad = introducirPositivo();
        boolean MayorEdad = esMayorEdad(edad);
        if(MayorEdad==true)
        {
            System.out.println("Eres mayor de edad pasa");
        }
        else
        {
            System.out.println("Vuelve a tu casa eres menor");
        }
    }
 
    
    public static int introducirPositivo() {
           Scanner sc = new Scanner(System.in);
            int valor;
            do
            {
                System.out.println("Introduce tu edad");
                valor = sc.nextInt();
                if(valor<=0)
                {
                    System.out.println("Burro tu edad " + valor + " no es positiva ");
                }
            }while(valor<=0); //si es negativo o 0 volvere apedir
            
            return valor;
    }

    public static boolean esMayorEdad(int a) {
        if (a>=18)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}