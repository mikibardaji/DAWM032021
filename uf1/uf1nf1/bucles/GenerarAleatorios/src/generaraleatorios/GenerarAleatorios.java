/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generaraleatorios;

import java.util.Random;

public class GenerarAleatorios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        //el numero de dentro del nexint es el numero diferentes de valores
        //y la suma es el valor minimo por el que empezara
        int numAleatorio = r.nextInt(10)+21;
        System.out.println("numero generado " + numAleatorio);
        numAleatorio = r.nextInt(21)+20;
        System.out.println("numero generado " + numAleatorio);
        numAleatorio = r.nextInt(101)+500;
        System.out.println("500-600 numero generado " + numAleatorio);
        numAleatorio = r.nextInt(3)+13;
        System.out.println("13-15numero generado " + numAleatorio);
        
        numAleatorio = r.nextInt(10)+150;
        System.out.println("150-159numero generado " + numAleatorio);
        
        
        
        
    }
    
}
