/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici10nota10;

import java.util.Scanner;

/**
 * Realiza un programa que lea una secuencia de notas (con valores que van de 0 a 10) 
 * que termina con el valor -1 y nos dice si hubo o no alguna nota con valor 10.
 * @author alumne
 */
public class Exercici10nota10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota,contanotas=0,acumNotas=0;
         Scanner teclado = new Scanner(System.in);
         boolean hubo10=false;
         
         do{
             System.out.print("pon nota:");
            nota=teclado.nextInt();
            if (nota!=-1) //me cuenta las veces que pongo notas, sin contar el -1
            {
             contanotas++;  //se cuantas notas he puesto 
             acumNotas = acumNotas+nota; //voy sumnado notas a cada vuelta         
//              if (nota==10)
//            {
//                hubo10=true;
//            }            
            }           
            if (nota==10)
            {
                hubo10=true;
            }
            
         }while(nota!=-1);
         
         
         if (hubo10==true)
         {System.out.println("pusiste un 10");}
         else
         {System.out.println("no hay 10");}
         
         System.out.println("has puesto " + contanotas + " notas ");
         double media=(double) acumNotas/contanotas;
         System.out.println("La media es" + media);
    }
    
}
