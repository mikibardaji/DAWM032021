/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorialrecursivo;

/**
 *
 * @author alumne
 */
public class FactorialRecursivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
//        System.out.println("factorial 0: " + factorial(0));
//        System.out.println("factorial 1: " + factorial(1));
//        System.out.println("factorial -10: " + factorial(-10));
         System.out.println("factorial 5: " + factorial(5));
    }
    
    /**
     * funcion que calucla el factorial de un numero
     * @param valor es el numero que queremos saber su factoria
     * @return el factorial de valor, -1 si me han pasado un valor negativo
     */
    public static int factorial(int valor) throws InterruptedException
    {
        int ms = 1000;
        int calculo, retornofactorial;
        Thread.sleep(ms);
        System.out.println("Soy el factorial(" + valor + ")");
        Thread.sleep(ms);
        if (valor==0) //caso base
        {
            System.out.println("valor=0;Retorno 1");
            Thread.sleep(ms);
            return 1;
        }
        else if (valor==1) //caso base
        {
            System.out.println("ya se 1!, retorno 1");
            Thread.sleep(ms);
            return 1;
        }
        else if (valor<0) // caso incorrecto
        {
            return -1;
        }
        else //caso recursivo valor >1
        {//solo tengo las variables que me llegan de entrada a la función
         //en este caso la variabe valor
         System.out.println("valor=" + valor + " y llamo al factorial(" + (valor-1) + ")");
         Thread.sleep(ms);
         retornofactorial = factorial(valor-1);
            System.out.println(valor + "*" + retornofactorial);
         calculo = valor*retornofactorial;
         
         System.out.println(valor +"! vale " + calculo + " y retorno para arriba " + calculo );
         Thread.sleep(ms);
         
           return calculo;         
        }
        
    }
    
}
