/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundofunciones;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class HolaMundoFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //sc.
        helloWorld();
        String nombre = "Miquel Angel Bardaji";
        helloWorldNombre(nombre);
        int valor = 5;
        System.out.println("valor no clonado antes de la funcion valor=  " + valor);
        aumentaEnDos(valor);
        System.out.println("valor no clonado despues de la funcion valor=   " + valor);
    }
    
    
    /**
     * Funcion que muestra por pantalla HelloWorld
     * void no devuelve ningún valor al mail
     */
    public static void helloWorld()
    {
        System.out.println("Hello World in functions");  
    } //helloWorld
    
    /**
     * Escribira hello world acompañado del nombre
     * @param nom es la variable que contiene el nombre
     */
    public static void helloWorldNombre(String nom)
    {
        System.out.println("Hello World." + nom + ", How are you?");
    }

    /**
     * Aumentara el valor pasado en dos
     * @param valor tendra el numero que me pasan desde el main
     */
    private static void aumentaEnDos(int valor) {
        System.out.println("valor clonado antes de ningun cambio valor=   " + valor);
        valor = valor + 2;
        System.out.println("valor clonado aumentado valor=   " + valor);
        valor = valor * 2;
        System.out.println("valor clonado multiplicado por dos valor=   " + valor);
    }
}
