/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2examen;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex2examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        int opcion;
        Scanner sc = new Scanner(System.in);
        int num1,num2;
        int peque, grande;
        do{
            System.out.println("0.- Salir");
            System.out.println("1.- Escribir 10 veces");
            System.out.println("2.- Cuenta atras");
            System.out.println("3.- Numeros pares entre 2 valores");
            System.out.print("Escoge opcion:");
            opcion = sc.nextInt();
            switch(opcion){
                case 1://repetir
                    for (int i = 1; i <= 10; i++) 
                    {
                        System.out.println(i + " A clase se viene a trabajar");
                    }
                break;
                
                case 2:
                    for (int i = 10; i > 0; i--) {
                        System.out.print(i + "  ");
                         Thread.sleep(500);
                    }
                    System.out.println("RIIIING");
                break;
                case 3:
                    System.out.print("pon valor 1: ");
                    num1 = sc.nextInt();
                    System.out.print("pon valor 2: ");
                    num2 = sc.nextInt();
                    if (num1<num2)
                    {
                        grande=num2;
                        peque = num1;
                    }
                    else
                    {
                        grande=num1;
                        peque = num2;
                    }
                    
                    for (int numero = peque+1; numero < grande; numero++) {
                        if (numero%2==0)
                        {
                            System.out.println(numero);
                        }
                    }
                    
                break;
                default:
                    System.out.println("Opción no valida (0-3)");
                    break;
            }
            Thread.sleep(1000);
        }while(opcion!=0);
        System.out.println("ADios");
        
        
    }
    
}
