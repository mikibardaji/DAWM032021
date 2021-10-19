/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici7;

import java.util.Scanner;

/**
 *
 * 
 * @author alumne
 * Dibuja un ordinograma que lea un valor correspondiente a 
 * una distancia en millas marinas y escriba la distancia en metros. 
 * Sabiendo que una milla marina equivale a 1.852 metros.
 */
public class Exercici7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int millas;
        final int MILLA_METRO = 1852; //constante
        Scanner teclado = new Scanner(System.in);
        //toma un valor y no se puede canviar en todo el programa
        System.out.print("Cuantas millas quieres transformar: ");
        
        millas = teclado.nextInt();
        
        int metros;
        metros = millas * MILLA_METRO;
        System.out.println("En metros son " + metros);
       
    }
    
}
