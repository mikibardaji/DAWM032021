/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex6ivaconprecio;

/**
 *
 * @author alumne
 */
public class Ex6IVAconprecio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double precio_final;
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Precio sin iva " + (i*100000000));
            precio_final= precioConIVA(i*100000000);
            System.out.println("El precio con iva es " + precio_final);
            
        }
        
        
    }
    
    /**
     * transforma precio a precio con iva
     * @param precio sin iva
     * @return precio con iva
     */
    public static double precioConIVA(double precio)
    {
        double precioIVA = precio * 1.21;
        return precioIVA;
    }
}
