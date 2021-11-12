/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3funcionminimo;

import java.util.Scanner;

/**
 *Escribe un programa que pida dos números enteros por teclado y muestre por pantalla cual es el
mínimo. Implementa y utiliza la función:
int minimo(int a, int b) // Devuelve el menor entre a y b
 * @author alumne
 */
public class Ex3funcionMinimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1,num2, min;// TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("valor1");
        num1=pedirValor(sc);
        System.out.println("valor2");
        num2=pedirValor(sc);
        min=minimo(num1, num2);
        System.out.println("el valor más pequeño es "+ min);
    }
    
    /**
     * función que retornara el valor minimo entre dos numeros
     * @param a es el primer valor entero
     * @param b es el segundo valor entero
     * @return devuelve el entero mas pequeño de los dos de entrada
     */
    
    public static int minimo(int a, int b)
    {
        if(a<b)
        {
            return a;
        }
        else
        {
            return b;
        }
        
    }
    
    public static int pedirValor(Scanner sc)
    {
        System.out.println("Pon un valor");
        int valor=sc.nextInt();
        return valor;
    }

}
