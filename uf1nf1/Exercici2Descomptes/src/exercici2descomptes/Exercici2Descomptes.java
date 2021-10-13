/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici2descomptes;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Exercici2Descomptes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double dineroGastado;
        double descuento=0,dineroDescontado;
        Scanner sc = new Scanner(System.in);
        System.out.println("cual es el dinero gastado");
        dineroGastado=sc.nextDouble();
        
        if (dineroGastado<800)
        {
            descuento=0;
        }
        else if (dineroGastado>=800 && dineroGastado <=1500)
        {
             descuento=0.06;
        }
        else if (dineroGastado>1500 && dineroGastado <=3000)
        {
             descuento=0.08;
        }
        else if (dineroGastado>3000)
        {
             descuento=0.10;
        }
        
        dineroDescontado = dineroGastado*descuento;
        System.out.println("Vas a pagar " + (dineroGastado-dineroDescontado));
    }
    
}
