/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebasexception;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumne
 */
public class PruebasException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Entrada de coeficients
        System.out.println("Voy a calcular si tienes dinero para comprar");
        try {
        	 System.out.print("Pon el precio sin impuestos");
        	 double a = sc.nextDouble();
        	 System.out.print("Pon el % de impuestos");
        	 double b = sc.nextDouble();
        	 System.out.print("Pon el dinero que tienes ahorrado ");
        	 double c = sc.nextDouble();  
        	 try {
        	 	CompraTest shop = new CompraTest(a, b, c);
        	 	shop.calcularSiPuedesComprar();
        	 	System.out.println(
        	 		"Cambio: "+shop.getCambio()
        	 	);
        	 }
        	 catch (AhorroException csr) {
        	 	System.out.println(csr.getMessage());
        	 } 
                 catch (NegativeNumberException ex) {      	 
                        System.out.println(ex.getMessage());
            }      	 
        }
        catch (NumberFormatException nfe) {
        	System.out.println("La dada entrada no es numerica. " + nfe.getMessage());
        }   
 
    }
}

class CompraTest { 
	private double precio_sin_impuestos, impuestos, ahorros; // coeficients de l'equacio ax2+bx+c=0  
	private double cambio; // solucions de l'equacio    
    public CompraTest(double a, double b, double c) {
    	this.precio_sin_impuestos=a; this.impuestos=b; this.ahorros=c;
    	cambio=0;
    }

    public double getCambio() {
        return cambio;
    }
    
    

   public void calcularSiPuedesComprar() throws NegativeNumberException, AhorroException
   {
       if (this.precio_sin_impuestos<0 
               || this.impuestos < 0
               || this.ahorros <0 )
       {
           throw new NegativeNumberException("Algunos parametros son negativos");
       }
       else
       {
           if (this.precio_sin_impuestos> this.ahorros)
           {
               throw new AhorroException("No tienes dinero, ni pagando sin factura(sin impuestos)");
           }
           else
           {
               double precio_impuestos = this.precio_sin_impuestos + this.impuestos;
               this.cambio = this.ahorros - precio_impuestos;
               if(this.cambio<0)
               {
                   this.cambio = 0;
                   throw new AhorroException("No tienes suficiente dinero");
               }
               
           }
       }
   }
}







   