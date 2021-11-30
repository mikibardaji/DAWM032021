/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicitodastablasmultiplicar;

/**
 *
 * @author alumne
 */
public class ExerciciTodasTablasMultiplicar {

    /**
     * Dissenya una aplicació que mostri les taules de multiplicar 
     * de l'1 al 10 (pista: dos bucles anidats).
     */
    public static void main(String[] args) {
        int tabla=6;
        
        for (tabla = 1; tabla <= 10; tabla++) {
            System.out.println("Tabla del " + tabla);
            for (int contador = 1; contador <= 10; contador++) 
            {
            System.out.println(contador + "*" + tabla + "=" + tabla*contador);
            
            }
        }
        //me pinte la tabla del 5
        
    }
    
}
