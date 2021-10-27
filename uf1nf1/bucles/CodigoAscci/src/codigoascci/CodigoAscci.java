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
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char letra ;
        int codigoAscii;
        
        for (letra = 'a'; letra <= 'z'; letra++) {
            codigoAscii = (int) letra;
            System.out.println(letra + "-" + codigoAscii);
        }
        
        
    }
    
}
