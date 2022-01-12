/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ahorcado;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ahorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String palabra_oculta;
        int intentos = 7;
        palabra_oculta = pedirPalabra("Pon la palabra a buscar");
        
        char[] palabra_guiones = new char[palabra_oculta.length()];
        
        inicializarGuiones(palabra_guiones);
        
        mostrarPalabraGuiones(palabra_guiones, intentos);
        //funcion para inicializar todo a guiones palabra_guiones
        
        //funcion que seria mostrar palabra_guiones (en ese momento tiene guiones) --> ImprimirGuiones
        
        //Pedir Letra a Buscar
       // char letra = PedirLetraBuscar();
        
       // boolean existeLetra = buscarLetraEnPalabra(palabra_oculta,letra,palabra_guiones)
        //Buscar la letra en el string, si esta, la copia en el char palabra_guiones y devuelvo true
        
        //Si he devuelto false resto un intento
        
        //mostrar ImprimirGuiones
        //comprobarsiheganado que es comprobar si existe algun - o no (True/False)
    }
    
    private static String pedirPalabra(String frase) {
        Scanner sc = new Scanner(System.in);
        String datos;  
        System.out.println(frase);
        datos = sc.nextLine();
        return datos;
    }

    /** poner todo el array a '-' (guiones)*/
    private static void inicializarGuiones(char[] palabra_guiones) {
        for (int i = 0; i < palabra_guiones.length; i++) {
            palabra_guiones[i] = '-';
        }
        
    }

    private static void mostrarPalabraGuiones(char[] palabra_guiones, int intentos) {
        for (int i = 0; i < palabra_guiones.length; i++) {
            System.out.print(palabra_guiones[i]);
        }
        System.out.println("");
        System.out.println("Te quedan " + intentos + " intentos ");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    


}
