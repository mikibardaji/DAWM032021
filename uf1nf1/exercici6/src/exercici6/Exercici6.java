/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici6;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Exercici6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int precioArticulo, precioVenta;
        Scanner teclado = new Scanner(System.in);
        //pedir precioArticulo
        System.out.println("Pon precio articulo");
        precioArticulo = teclado.nextInt();
        //pedir precioVenta final
        System.out.println("pon el precio que lo has comprado");
        precioVenta = teclado.nextInt();
        //calcular descuento
        double descuento = ((precioArticulo-precioVenta)*100)/precioArticulo;
        
        //mostrar el descuento
        System.out.println("descuento del " + descuento);
        
    }
    
}
