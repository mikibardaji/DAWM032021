/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicifotos;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ExerciciFotos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int fotos,segundosFoto;
       Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el numero de fotos que tienes:");
        fotos = teclado.nextInt();
        System.out.print("Introduce los segundos que se visualizara la foto: ");
        segundosFoto = teclado.nextInt();
        
        
        int segundosTodo = fotos*segundosFoto;
        
        int minutos = segundosTodo/60;
        int segundosRestantes = segundosTodo%60;
        
        System.out.println("Tu presentacion durara " + minutos + 
                " y " + segundosRestantes + " segundos.");
        
        
    }
    
}
