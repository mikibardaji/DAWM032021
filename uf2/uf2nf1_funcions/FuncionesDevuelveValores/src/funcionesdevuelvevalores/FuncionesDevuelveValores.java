/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionesdevuelvevalores;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class FuncionesDevuelveValores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ValorDoble=0, ValorTriple=0;
        System.out.println("Pon un valor y lo doblare por 2, luego el resultado lo multiplicare por 3");
        int numero = sc.nextInt();
         System.out.println("numero " + numero + " ValorDoble" + 
        ValorDoble + " ValorTriple" + ValorTriple);
        ValorDoble = doblarNumero(numero);
        System.out.println("despues de llamar funcion doblar: numero " + numero + " ValorDoble" + 
                ValorDoble + " ValorTriple" + ValorTriple);

        ValorTriple = triplicarNumero(ValorDoble);
        mostrarResultados(numero,ValorDoble,ValorTriple);
         
       // System.out.println("El resultado es " + numero);
//        numero = doblarNumero(numero);
//        System.out.println("despues de llamar funcion doblar: numero " + numero + " ValorDoble" + 
//                ValorDoble + " ValorTriple" + ValorTriple);
//        //numero = numero*3;
//        
//        numero = triplicarNumero(numero);
//         System.out.println("despues de llamar funcion triplicar: numero " + numero + " ValorDoble" + 
//                ValorDoble + " ValorTriple" + ValorTriple);
//
//        doblarNumero(numero); //devuelve el doble pero no lo recogo en ninguna variable
//        System.out.println("despues de llamar funcion doblar: numero " + numero + " ValorDoble " + 
//                ValorDoble + " ValorTriple " + ValorTriple);
//        //numero = numero*3;
//        
//        triplicarNumero(ValorDoble); //devuelve el tripe pero no lo recojo en ninguna variabe
//         System.out.println("despues de llamar funcion triplicar: numero " + numero + " ValorDoble " + 
//                ValorDoble + " ValorTriple " + ValorTriple);

    }
    
    /**
     * Funcion que dobla cualquier valor
     * @param valor de entrada que sera doblado
     * @return el doble del valor entrada
     */
    
    public static int doblarNumero(int valor)
    {
        int doble = valor * 2;
        return doble;
    }
    
    /**
     * funcion que triplica cualquier valor
     * @param valor de entrada que sera triplicado
     * @return el triple del valor de entrada
     */
    public static int triplicarNumero(int valor)
    {
        int triple = valor*3;
        return triple;
    }

    private static void mostrarResultados(int numero, int ValorDoble, int ValorTriple) {
        System.out.println("despues de llamar funcion triplicar: numero " + numero + " ValorDoble" + 
                ValorDoble + " ValorTriple" + ValorTriple);
    }
}
