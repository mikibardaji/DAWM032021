/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex13descuento;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex13Descuento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon precio sin descuento");
        double precio_sin_descuento = sc.nextDouble();
        System.out.println("Pon precio con descuento");
        double precio_con_descuento = sc.nextDouble();
        
        double descuento = calcularDescuento(precio_sin_descuento,precio_con_descuento);
        System.out.println("Tienes un descuento del " + descuento + "%");
    }

    public static double calcularDescuento(double precio_sin_descuento, double precio_con_descuento) {
        double descuento;
        descuento = (100*precio_con_descuento)/precio_sin_descuento;
        //el % de lo que he pagado hasta aqui
        descuento = 100 - descuento;
        //el % descontado
        return descuento;
    }
    
        
}
