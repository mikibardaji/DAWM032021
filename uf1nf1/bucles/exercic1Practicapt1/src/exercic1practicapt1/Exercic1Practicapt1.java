/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercic1practicapt1;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Exercic1Practicapt1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double criptomoneda; //dada inicial
        int opcion;
        double euros; //dada final
        final double BitcoinsEuros = 49561;
        final double XMREuros = 233.81;
        
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Pon el numemro de criptomonedas que tienes");
        criptomoneda = teclado.nextDouble();
        System.out.println("Menú de conversión ");
        System.out.println("   1.- Bitcoins a Euros");
        System.out.println("   2.- XMR a Eruos");
        System.out.println("=================");
        System.out.print("que opcion escoges?: ");
        opcion = teclado.nextInt();
        
        switch (opcion) {
            case 1:
                euros = criptomoneda*BitcoinsEuros;
                System.out.println("Tus bitcoins son " + euros );
                break;
            case 2:
                euros = criptomoneda*XMREuros;
                System.out.println("Tus XMR son " + euros );
                break;
            default:
                System.out.println("Opción no valida");
                break;
        }
        
      
    }
    
}
