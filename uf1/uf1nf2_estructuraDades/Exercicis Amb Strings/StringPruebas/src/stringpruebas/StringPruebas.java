/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringpruebas;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class StringPruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        String nombre = "Miquel Angel";
//        System.out.println(nombre);
//        char[] palabra = {'M','i','k'};
//        String nueva_palabra =new String(palabra);
//        System.out.println(nueva_palabra);
//        System.out.println(palabra);
//        
//        String tuNombre;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Hola como te llamas?");
//        tuNombre = sc.nextLine();
//        System.out.println("Hola " + tuNombre + " como estas hoy?");
//        System.out.println("tu nombre tiene " + tuNombre.length() + " caracteres");
        
        String pruebas = "DAW1";
        System.out.println("pruebas " + pruebas);
        //System.out.println(tuNombre.repeat(3));
        
        String pruebasCanviado = pruebas.replace('D', 'T');
        System.out.println("replace --> " + pruebas.replace('D', 'T'));
        pruebas = "    DAW121324389348       ";
        System.out.println("pruebas ." + pruebas + ".");
        System.out.println("." + pruebas.trim() + ".");
        pruebas = pruebas.trim();
        System.out.println("toLowerCase: " + pruebas.toLowerCase());
        System.out.println("Substring 2,5" + pruebas.substring(2, 5));
        String pruebas2 = "alejandro";
        String nombre = "Alejandro";
        System.out.println("compare to cuantos caracteres se parecen" + pruebas2.compareTo(nombre));
        System.out.println("Equals " + nombre.equalsIgnoreCase(pruebas2));
        String[] nombreArray = nombre.split(pruebas);
        System.out.println("tiene la ej " + nombre.contains("ej"));
        char letra = nombre.charAt(3);
        System.out.println("en la posicion 3 de " + nombre + "-" + letra);
        
    }
    
}
