/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici1refuerzoif;

import java.util.Scanner;

/**
 *1.- Augment Sou
Calcular l’augment de sou al cap d’any a partir d’aquesta taula

SOU ACTUAL
Increment
inferior 18000
12%
entre 18000 i 30000
10%
superior a 30000 e inferior a 45000
8%
45000 o més
6%


Al final el programa te que imprimir quin augment de sou li pertoca i en una nova linea mostrar el sou que tindrà el any següent.

 * @author alumne
 */
public class Exercici1RefuerzoIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double sueldo;
        double aumento;
        Scanner sc = new Scanner(System.in);
        System.out.println("cual es tu sueldo y te dire el aumnent");
        sueldo=sc.nextDouble();
        
        if (sueldo<18000)
        {
            aumento = sueldo*12/100;
           /* System.out.println("tu aumento es " + aumento);
            sueldo = sueldo + aumento;
            System.out.println("tu nuevo sueldo es " + sueldo);*/
        }
        else if (sueldo>=18000 && sueldo <=30000)
        {
            aumento = sueldo*10/100;
            /*System.out.println("tu aumento es " + aumento);
            sueldo = sueldo + aumento;
            System.out.println("tu nuevo sueldo es " + sueldo);*/
        }
        else if (sueldo> 30000 && sueldo <=45000)
        {
            aumento = sueldo*8/100;
          /*  System.out.println("tu aumento es " + aumento);
            sueldo = sueldo + aumento;
            System.out.println("tu nuevo sueldo es " + sueldo);*/
        } 
        else  //nmas de 450000
        {
            aumento = sueldo*6/100;
         /*   System.out.println("tu aumento es " + aumento);
            sueldo = sueldo + aumento;
            System.out.println("tu nuevo sueldo es " + sueldo);*/
        }
        
         
            System.out.println("tu aumento es " + aumento);
            sueldo = sueldo + aumento;
            System.out.println("tu nuevo sueldo es " + sueldo);
        
    }
    
}
