/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablamultiplicar;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class TablaMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont;
        Scanner teclado = new Scanner(System.in);
        System.out.println("que tabla de multiplicar quieres");
        int tabla = teclado.nextInt();
        for (cont= 1; cont <= 10; cont++) {
            System.out.println(tabla +"*" + cont + "=" + (tabla*cont));   
        }
        
        
        cont=1;
        int multi;
        while(cont<=10)
        {
            multi = tabla*cont;
            System.out.println(tabla +"*" + cont + "=" + (multi));
            cont=cont+1;
        }
        cont=1;
        do{
           multi = tabla*cont;
           System.out.println(tabla +"*" + cont + "=" + (multi)); 
           cont=cont+1; 
        }while(cont<=10);
        
        System.out.println("7x1=" + (7*1));
        System.out.println("7x2=" + (7*2));
        System.out.println("7x3=" + (7*3));
        System.out.println("7x4=" + (7*4));
        System.out.println("7x5=" + (7*5));
        System.out.println("7x1=" + (7*1));
        System.out.println("7x1=" + (7*1));
        System.out.println("7x1=" + (7*1));
        System.out.println("7x1=" + (7*1));
        System.out.println("7x1=" + (7*1));
        System.out.println("7x1=" + (7*1));
    }
    
}
