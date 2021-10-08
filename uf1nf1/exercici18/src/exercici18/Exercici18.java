/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici18;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Exercici18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int tarifa, horas;
       double sueldoNeto, sueldoBruto, sueldoHorasNormales, sueldoHorasExtra, hora_extra;

       double dineroImpuestos, impuestos,impuestos900,dineroImpuestosMaximos;
       Scanner sc = new Scanner(System.in);
        System.out.print("Introduce precio hora: ");
        tarifa = sc.nextInt();
        System.out.print("Introduce horas trabajadas: ");
        horas = sc.nextInt();
        
        
        if (horas<=35)
        { //si no me paso de horas
            sueldoBruto = tarifa * horas;
        }
        else
        {
            sueldoHorasNormales = 35*tarifa;
            hora_extra = horas - 35;
            sueldoHorasExtra = hora_extra*tarifa*1.5;
            sueldoBruto = sueldoHorasExtra + sueldoHorasNormales;
        }
        System.out.println("Tu sueldo bruto es " + sueldoBruto);
        
        //impuestos
        if (sueldoBruto<500)
        {
            impuestos=0;
        }
        else if (sueldoBruto<900)
        {
            dineroImpuestos = sueldoBruto - 500;
            impuestos = (dineroImpuestos * 25) /100;
        }
        else //es que el sueldo bruto es mas de 900
        {
            dineroImpuestos = 400;
            impuestos = (dineroImpuestos * 25) /100;
            //System.out.println("los 4000 tiene impuesto de " + impuestos);
            dineroImpuestosMaximos = sueldoBruto - 900;
            impuestos900=(dineroImpuestosMaximos*45)/100;
            //System.out.println("los que se pasan de 900 tiene impuesto de " + impuestos900);
            impuestos = impuestos + impuestos900;
            
        }
         System.out.println("impuestos son " + impuestos);
        sueldoNeto = sueldoBruto - impuestos;
        System.out.println("Tu sueldo neto  es " + sueldoNeto);
    }
    
}
