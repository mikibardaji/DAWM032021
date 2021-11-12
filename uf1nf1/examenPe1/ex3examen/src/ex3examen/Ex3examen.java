/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3examen;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex3examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int acumMetrosCasa=0,metrosHabitacionSola;
       char seguir;
       Scanner sc = new Scanner(System.in);
       do{
        System.out.println("Metros cuadrados habitación:");
        metrosHabitacionSola = sc.nextInt();
        acumMetrosCasa = acumMetrosCasa + metrosHabitacionSola;
        sc.nextLine(); //limpie buffer y el enter despues del numero
        System.out.println("Hay más habitaciones (s/n):");
        seguir = sc.nextLine().charAt(0);
         }while(seguir!='n' && seguir!='N');
        System.out.println("Tu casa mide " + acumMetrosCasa);
    }
    
}
