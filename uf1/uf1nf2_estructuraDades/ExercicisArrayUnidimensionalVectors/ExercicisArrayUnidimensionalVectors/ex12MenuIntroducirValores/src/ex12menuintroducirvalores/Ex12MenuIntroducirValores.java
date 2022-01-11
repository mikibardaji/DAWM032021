/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex12menuintroducirvalores;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex12MenuIntroducirValores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[]valores = new int[10];
           char opcion;
        do{
        mostrarMenu();
        opcion = escogerOpcion();
        
        if (opcion=='a')
        {
            mostrarArray(valores);
        }
        else if (opcion=='b')
        {
            cambiarValor(valores);
        }
           
        }while( opcion!='c');
    }

    private static void mostrarMenu() {
        System.out.println("a. Mostrar valores.\n" +
                            "b. Introducir valor.\n" +
                            "c. Salir.");
    }

    private static char escogerOpcion() {
        Scanner sc = new Scanner(System.in);
        char respuesta;
        do
        {
            System.out.println("Escoge opcion (a/b/c)");
            respuesta = sc.nextLine().charAt(0);
        }while (!(respuesta=='a' || respuesta == 'b'|| respuesta == 'c'));
        return respuesta;
    }


       public static void mostrarArray(int[] valores) {
        
           for (int i = 0; i < valores.length; i++) {
            System.out.print( valores[i]+"-");
        }
        
    }

    private static void cambiarValor(int[] valores) {
        Scanner sc = new Scanner(System.in);
        System.out.println("que posicoin quieres cambiar");
        int posicion =sc.nextInt();
        posicion--; //para adecuarlo al array que empieza por 0
        System.out.println("que valor  quieres poner");
        int valor = sc.nextInt();
        
        valores[posicion] = valor; //cambio el valor en la posicion --> posicion
    }
    
}
