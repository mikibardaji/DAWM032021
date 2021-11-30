/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayteoria;

import static java.lang.System.exit;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ArrayTeoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //array que pugui guardar 7 valors
        int[] notas = new int[4];
//        notas[0] = 6;
//        notas[6] = 8;
//        notas[3] = 5;
//        notas[1] = 2;
//        notas[2] = 10;
//        notas[5] = 2;
//        notas[4] = 3;
        
       


        /*inicializacion por usuario*/
//        Scanner sc = new Scanner(System.in);
//        for (int indice2 = 0; indice2 < notas.length; indice2++) {
//            System.out.print("Pon la nota para el alumno " + (indice2+1)+": ");
//            notas[indice2] = sc.nextInt();
//        }
        
        Random rd = new Random();
        for (int indice = 0; indice < notas.length; indice++) {
            notas[indice] = rd.nextInt(11);
        }



        //notas.lengt devuelve el numero de enteros que puede guardar
        //el indice sera desde el 0.... length-1
        for (int indice = 0; indice < notas.length; indice++) {
            System.out.println("posicion " + indice + " = " + notas[indice]) ;
        }
        
        int acum_notas=0;
        //recorrer array desde la posicion 0 hasta length -1
        for (int ind_notas = 0; ind_notas < notas.length; ind_notas++) {
            //acumulo notas
            acum_notas = acum_notas + notas[ind_notas];
        }
        System.out.println("acumulado " + acum_notas);
        double media = (double) acum_notas/notas.length;
        System.out.println("Nota media tienes un " + media);
    }
    
}
