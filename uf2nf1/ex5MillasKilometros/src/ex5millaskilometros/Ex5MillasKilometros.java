/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex5millaskilometros;

/**
 *Escribe un programa que pida un valor entero en millas y muestre su equivalente en kilómetros.
Recuerda que una milla son 1,60934 kilómetros. Implementa y utiliza la función:
double millas_a_kilometros(int millas) // Devuelve la conversión de millas a kilómetros
 * @author alumne
 */
public class Ex5MillasKilometros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int millas= -50;
        
        double km = millas_a_kilometros(millas);
        
        mostrar_resultado_transformacion(km, millas);
        
        
    }
    
    /**
     * transforma las millas a km
     * @param millas son el valor a transformar
     * @return te devuelve los km que son las millas de entrada, si las millas de entrada son negativas 
     * devuelve -1
     */
    public static double millas_a_kilometros(int millas)
    {
        final double CONVERSION_KM = 1.609;
        if (millas<0)
        {
            return -1;
        }
        else
        {
            return millas*CONVERSION_KM;
        }
                
        
    }

    private static void mostrar_resultado_transformacion(double km, int millas) {
        if (km ==-1)
        {
            System.out.println("Las millas no pueden ser negativas");
        }
        else
        {
            System.out.println(millas + " millas son en km " + km);
        }
    }
}
