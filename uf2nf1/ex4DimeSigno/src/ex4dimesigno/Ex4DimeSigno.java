/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4dimesigno;

/**
 * Escribe un programa que pida un número entero por teclado y muestre por pantalla si es
positivo, negativo o cero. Implementa y utiliza la función:
int dimeSigno(int a) // Devuelve -1 si es negativo, 0 si es igual a 0, 1 si es positivo
 * @author alumne
 */
public class Ex4DimeSigno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int signo = dimeSigno(0);
        
        if (signo==-1)
        {
            System.out.println("negativo");
        }
        else if (signo==1)
        {
            System.out.println("positivo");
        }else
        {
            System.out.println("Es cero");
        }
            
    }
   
    /**
     * Devuelve un valor para indicar si es positivo,negativo o cero
     * @param a entero
     * @return Devuelve -1 si es negativo, 0 si es igual a 0, 1 si es positivo
     */
    public static int dimeSigno(int a)
    {
        if (a<0)
        {
            return -1;
        }
        else if (a>0)
        {
            return 1;
        }
        else
        {
            return 0;
        }
        
    }
    
}
