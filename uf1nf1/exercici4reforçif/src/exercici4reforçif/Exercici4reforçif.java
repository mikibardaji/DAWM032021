/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici4reforçif;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Exercici4reforçif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int horasExtra,dineroExtra;
        double sueldo,dineroTotal;
        int categoria;
        final int PREU_HORA_CATEGORIA1 = 30;
        final int PREU_HORA_CATEGORIA2 = 35;
        final int PREU_HORA_CATEGORIA3 = 40;
        final int PREU_HORA_CATEGORIA4 = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Quin es el teu sou base");
        sueldo=sc.nextDouble();
        System.out.println("Quantes hores extres has fet");
        horasExtra=sc.nextInt();
        System.out.println("Qina categoria tens");
        categoria=sc.nextInt();
        
        switch (categoria) {
            case 1:
                dineroExtra = horasExtra*PREU_HORA_CATEGORIA1;
                break; //para el switch
            case 2:
                dineroExtra = horasExtra*PREU_HORA_CATEGORIA2;
                break; //para el switch
            case 3:
                dineroExtra = horasExtra*PREU_HORA_CATEGORIA3;
                break; //para el switch
        //categoria==4 o el resto
            default:
                dineroExtra = horasExtra*PREU_HORA_CATEGORIA4;
                break;//para el switch
        }
        
        
        dineroTotal = (sueldo + dineroExtra);
        System.out.println("Este mes vas a cobrar" + (dineroTotal));
    }
    
}
