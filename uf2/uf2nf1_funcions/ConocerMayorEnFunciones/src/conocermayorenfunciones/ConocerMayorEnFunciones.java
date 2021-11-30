/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conocermayorenfunciones;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ConocerMayorEnFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1,valor2;
        int mayor=0;
        System.out.print("Pon un valor1:");
        valor1 = sc.nextInt();  
        System.out.print("Pon un valor2:");
        valor2 = sc.nextInt();
        //vosotros
        mayor=numeroMasGrande(valor1,valor2);
        System.out.println("El numero mas grande que has puesto es " + mayor);
    }

   
    
    /**
     * numeroMasGrande
     * Función que a partir de dos numeros RETORNA del valor más grande
     * @param v1 es el primer valor de entrada
     * @param v2 es el segundo valor de entrada
     * @return devuelve el numero(valor) mas grande de los 2 de entrada
     */
     public static int numeroMasGrande(int valor1, int valor2) {
         int MasGrande=0;
         if (valor1>= valor2)
         {
             MasGrande=valor1;
         }
         else 
         {
             MasGrande = valor2;
         }
         
         
        return MasGrande; //la variable MasGrande despues de esta linea
        //deja de existir
    }
   
//     private static int numeroMasGrande(int valor1, int valor2) {
//         
//         if (valor1>= valor2)
//         {
//             return valor1;
//         }
//         else 
//         {
//             return valor2;
//         }
         
         
       
    }

}
