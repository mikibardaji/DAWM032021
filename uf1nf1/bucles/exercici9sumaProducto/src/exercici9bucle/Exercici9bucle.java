/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici9bucle;

/**
 *
 * @author alumne
 */
public class Exercici9bucle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int acumSuma10=0;
        int producto10 = 1;
        int numero;
        
        for(numero=1;numero <=10;numero++)
        {
            System.out.println(acumSuma10 + "+" + numero);
            acumSuma10 = acumSuma10 + numero;
            System.out.println(producto10 + "*" + numero);
            producto10 = producto10*numero;
            System.out.println("fin vuelta");
        }
        
        
        
        System.out.println("la suma total es " + acumSuma10);
        System.out.println("el producto total es " + producto10);
    }
    
}
