/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex5bidimensional;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex5bidimensional {

    /**
     * @param args the command line arguments
     * Necesitamos crear un programa para registrar sueldos de hombres y mujeres de una
empresa y detectar si existe brecha salarial entre ambos. El programa pedirá por teclado la
información de N personas distintas (valor también introducido por teclado). Para cada
persona, pedirá su género (0 para varón y 1 para mujer) y su sueldo. Esta información debe
guardarse en una única matriz. Luego se mostrará por pantalla el sueldo medio de cada
género.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Cuantos trabajadores hay en tu empresa");
        int trabajadores = sc.nextInt();
        int[][] salarios = new int[trabajadores][2];
        
        introducirDatos(salarios, sc);
        mostrarArrayBidimensional(salarios);
        double brecha_salarial;
        brecha_salarial = calculcarSueldoxGenero(salarios);
        System.out.println("brecha " + brecha_salarial);
    }

    private static void introducirDatos(int[][] salarios, Scanner sc) {
        int genero,sueldo;
        for (int filas_trabaj = 0; filas_trabaj < salarios.length; filas_trabaj++) {
            System.out.println("pon genero trabajador" + (filas_trabaj+1));
            genero = sc.nextInt();
            System.out.println("pon sueldo trabajador" + (filas_trabaj+1));
            sueldo = sc.nextInt();
            salarios[filas_trabaj][0]=genero;
            salarios[filas_trabaj][1]=sueldo;
        }
        
    }

    private static double calculcarSueldoxGenero(int[][] salarios) {
        int sueldoT_hombres=0, sueldoT_mujeres=0;
        int n_hombres=0,n_mujeres=0;
        
        for (int filas_t = 0; filas_t < salarios.length; filas_t++) {
            if (salarios[filas_t][0] ==0) //hombres
            {
                sueldoT_hombres = sueldoT_hombres + salarios[filas_t][1];
                //--> sueldoT_hombres += salarios[filas_t][1];
                n_hombres++;
            }
            else if(salarios[filas_t][0] ==1)
            {
                sueldoT_mujeres = sueldoT_mujeres + salarios[filas_t][1];
                //--> sueldoT_hombres += salarios[filas_t][1];
                n_mujeres++;
            }
        }
        double media_salario_hombres = (double)sueldoT_hombres/n_hombres;
        System.out.println("salario medio  hombres"  + media_salario_hombres);
        double media_salario_mujeres = (double)sueldoT_mujeres/n_mujeres;
        System.out.println("salario medio  mujeres"  + media_salario_mujeres);
        return (media_salario_hombres-media_salario_mujeres);
        
    }
    
    
    private static void mostrarArrayBidimensional(int[][] tabla) {
        for (int filas = 0; filas < tabla.length; filas++) {
            for (int columnas = 0; columnas < tabla[0].length; columnas++) {
                System.out.print(tabla[filas][columnas] + " ");
            }
            System.out.println(""); //salto de linea
        }
    }
}
