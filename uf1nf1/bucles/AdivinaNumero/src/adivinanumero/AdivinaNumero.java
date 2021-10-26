/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adivinanumero;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class AdivinaNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random r = new Random();
        //el numero de dentro del nexint es el numero diferentes de valores
        //y la suma es el valor minimo por el que empezara
        int numAleatorio = r.nextInt(70)+1;
        //System.out.println("maquina" + numAleatorio);
        int numJugador;
        int intentos=0;
          System.out.println("Adivina el numero que he pensado");
        do{
            System.out.print("Escribe numero:");
            numJugador = teclado.nextInt();
            intentos++;
            //tengo numaleatori con el numero de la maquina
            //tengao numjugador con el numero que he puesto yo

            if(numJugador>numAleatorio)
            {
                System.out.println("Es menor ");
                System.out.println("Te quedan " + (8-intentos) + " intentos");
            }
            else if (numJugador<numAleatorio)
            {
                System.out.println("Es mayor ");
                System.out.println("Te quedan " + (8-intentos) + " intentos");
            }
            
        
        }while(numAleatorio != numJugador && intentos <= 8);
        //intentos >8
        //if numAleatorio == numJugador
        if (numAleatorio == numJugador)
        {
            System.out.println("adivinaste en" + intentos + " intentos");
        }
        else
        {
            System.out.println("LOSER!");
        }
        
        //terminara numAleatorio == numJugador
    }
    
}
