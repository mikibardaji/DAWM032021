/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exericici8bucles;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Exericici8bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int npositivo=0, nnegativo=0;
        int numIntroducido=0;
         Scanner teclado = new Scanner(System.in);
        
        do{
            System.out.println("introduce numero , 0 para salir");  
            numIntroducido = teclado.nextInt();
            if (numIntroducido>0)
            {
                npositivo++;
            }
            else if (numIntroducido<0)
            {
                nnegativo++;
            }
            
        }while(numIntroducido != 0);
        
        
      
        
        System.out.println("Has puesto " + npositivo + " positivos ");
        System.out.println("Has puesto " + nnegativo + " negativos ");
        if (nnegativo>0)
        {
            System.out.println("has puesto algun negativo");
        }
        else
        {
            System.out.println("no has puesto negativos.");
        }
    }
    
}
