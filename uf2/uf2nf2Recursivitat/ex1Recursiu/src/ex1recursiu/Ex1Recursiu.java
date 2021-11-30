/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1recursiu;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex1Recursiu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("pon un valor y te dire la suma de ese valor con todos los otros numeros hasta 1");
        int valor_pedido = sc.nextInt();
        System.out.println("Del " + valor_pedido + " hasta el 1 su suma es " + suma(valor_pedido));
    }
    
    public static int suma(int valor)
    {
        //caso base
        if (valor==0)
        {
            return 0;
        }
        else if (valor==1)
        {
            return 1;
        }
        else
        {
            return valor + suma(valor-1);
        }
        
    }
    
}
