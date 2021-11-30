/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codigoascci;

/**
 *
 * @author alumne
 */
public class CodigoAscci {

    /**
     * Escriu un programa que mostri el codi ASCII dels caràcters 
     * des de l'A fins la Z
     */
    public static void main(String[] args) {
        char letra ;
        int codigoAscii;
        
        for (letra = 'A'; letra <= 'Z'; letra++) {
            codigoAscii = (int) letra;
            System.out.println(letra + "-" + codigoAscii);
        }
        
        
    }
    
}
