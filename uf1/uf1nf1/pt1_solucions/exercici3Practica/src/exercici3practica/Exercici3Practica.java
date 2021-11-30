/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici3practica;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Exercici3Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int totalEntradas, infantiles, adultos;
        double eurosPagar;
        double descuentoRealizar;
        final int ENTRADAADULTOPRECIO = 20;
        final int  ENTRADANIÑOPRECIO = 10;
        final double DESCUENTO = 0.25;
        System.out.println("dime el numero de entradas que quieres");
        Scanner teclado = new Scanner(System.in);
        totalEntradas = teclado.nextInt();
        System.out.println("Cuantos niños hay");
        infantiles = teclado.nextInt();
        adultos = totalEntradas-infantiles;
        
        if (totalEntradas>25)
        {
            if(adultos>0)
            {
                adultos--;
            }
            else
            {
                infantiles--;
            }
        }
        
        eurosPagar = (adultos*ENTRADAADULTOPRECIO) + (infantiles*ENTRADANIÑOPRECIO);
        
     
        
        if (totalEntradas>=10) //&& totalEntradas<25
        {
            descuentoRealizar = eurosPagar*DESCUENTO;
            eurosPagar = eurosPagar -descuentoRealizar;
            //eurosPAgar = eurosPagar*0.75;
        }
//        else if (totalEntradas>=25)
//        {
//            eurosPagar = eurosPagar-20;
//            descuentoRealizar = eurosPagar*DESCUENTO;
//            eurosPagar = eurosPagar -descuentoRealizar;
//        }
        
        System.out.println("Tienes que pagar " + eurosPagar);
        
        
    }
    
}
