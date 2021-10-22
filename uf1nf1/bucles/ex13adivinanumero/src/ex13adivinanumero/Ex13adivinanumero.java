/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex13adivinanumero;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex13adivinanumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int minimo=1;
        int maximo=100;
        int numAdivina;
        char respuesta; //declaracion sin informar
        do{
        numAdivina = (minimo+maximo+1)/2;
        System.out.println("El numero adivina es " + numAdivina);
        System.out.println("Mayor (M), inFerior(F), Igual(I) al numero -> " + numAdivina);
        respuesta = teclado.nextLine().charAt(0);
        System.out.println("tu respuesta es " + respuesta);
        //si es mayor cambio el minimo
            if (respuesta=='M')
            {
                minimo=numAdivina;
            }
            else if (respuesta=='F')
            {
                maximo = numAdivina;
            }
  
        }while(respuesta!='I' && respuesta !='i');
        //salir bucle respuesta != 'I' && respuesta!='i'
//        
//        char respuesta = teclado.nextLine().charAt(0);
//        if (respuesta == 'M' || respuesta == 'm')
//            
            
        
        
    }
    
}
