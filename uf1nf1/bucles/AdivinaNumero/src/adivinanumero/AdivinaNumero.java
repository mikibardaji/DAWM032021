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
        int numAleatorio = r.nextInt(20)+1;
        System.out.println("maquina" + numAleatorio);
        int numJugador;
        System.out.println("Adivina el numero que he pensado");
        numJugador = teclado.nextInt();
        if(numJugador>numAleatorio)
        {
            System.out.println("Es menor");
        }
        
    }
    
}
