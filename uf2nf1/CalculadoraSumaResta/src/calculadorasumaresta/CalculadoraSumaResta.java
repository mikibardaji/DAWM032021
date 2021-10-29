/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadorasumaresta;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class CalculadoraSumaResta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1,valor2;
        int resultado=0; //operacion 
        int opcion;
        System.out.println("Pon el primer valor");
        valor1 = sc.nextInt();
        System.out.println("Pon el segundo valor");
        valor2 = sc.nextInt();
        System.out.println("1.- Calcular suma");
        System.out.println("2.- Calcular resta");
        System.out.print("Pon opcion");
        opcion = sc.nextInt();
        
        
        
        System.out.println("El resultado de la operación elegida es " + resultado);
        
    }
    
}
