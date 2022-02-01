/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package morales;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Morales {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("¿Cuántos trabajadores hay en tu empresa?");
        int trabajadores = sc.nextInt();
        int[][] salarios = new int [trabajadores][2];
        mostrarArray(salarios);
        introducirdatos(salarios, sc);
        double brecha;
        brecha= sueldoGenero(salarios);
    }

    public static void introducirdatos(int[][] salarios, Scanner sc) {
        int genero, sueldo;
        for (int trabaj = 0; trabaj < salarios.length; trabaj++) {
            System.out.println("Pon genero del trabajador " + (trabaj+1));
            genero= sc.nextInt();
            System.out.println("Pon sueldo del trabajador " + (trabaj+1));
            sueldo= sc.nextInt();
            salarios[trabaj][0]=genero;
            salarios[trabaj][1]=sueldo;
        }
    }

    public static double sueldoGenero(int[][] salarios) {
        int hom=0, muj=0;
        int numH=0, numM=0;
        for (int trabaj = 0; trabaj < salarios.length; trabaj++) {
            if(salarios[trabaj][0]==0)
            {
               hom+= salarios[trabaj][1];
               numH++;
            }
            else if (salarios[trabaj][0]==1)
            {
               muj+= salarios[trabaj][1];
               numM++;
            }
        }
        double media_hom = (double)hom/numH;
        double media_muj = (double)muj/numM;
        return (media_hom-media_muj);
    }
    
    public static void mostrarArray(int[][] salarios) {
        for (int i = 0; i < salarios.length; i++) {
            for (int j = 0; j < salarios[0].length; j++) {
                System.out.print(salarios[i][j] + " ");
            }
            System.out.println(""); //salto de linea
        }
    }
    

    
}
