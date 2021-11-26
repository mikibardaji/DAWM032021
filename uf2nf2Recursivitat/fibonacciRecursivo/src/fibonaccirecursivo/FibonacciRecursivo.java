/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonaccirecursivo;

/**
 *
 * @author alumne
 */
public class FibonacciRecursivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //  System.out.println("fibonacci(0) =  " + fibonacci(0));
      //  System.out.println("fibonacci(1) =  " + fibonacci(1));
      //  System.out.println("fibonacci(2) =  " + fibonacci(2));
          System.out.println("fibonacci(20) =  " + fibonacci(20));
    }
    
    public static long fibonacci(long valor)
    {
        //if(valor==0)
        // return 0;
        //else if(valor==1)
        //return 1;
        
        if (valor==0 || valor==1)
        {
          valor = valor;
            System.out.println("caso base devuelve " + valor);
        }
        else if(valor>1)
        {
            valor = fibonacci(valor-1) + fibonacci(valor-2);
            System.out.println("caso recursivo ya puede devolver "  + valor);
        }
        else
        {
            valor=-1;
        }
      return valor;
        
    }
    
}
