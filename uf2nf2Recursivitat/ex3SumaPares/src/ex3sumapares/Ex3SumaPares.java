/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3sumapares;

/**
 *
 * @author alumne
 */
public class Ex3SumaPares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num=0;
        System.out.println("Suma de los pares del numero " + num + "=" + sumaPares(num) );
    }
    
    
    public static int sumaPares(int num)
    {
        //caso base
        if (num==0)
        {
            return 0;
        }
        else if (num==2) //es podria eliminar aquest SI tenim el cas 0
        {
            return num;
        }
        else if (num%2!=0) //impar
        {
            return -1;
        }
        else if (num<2) //si tenim aquest, no faria falta el del 0
        {
            return -1;
        }// fin casos base
        else
        {
            return num+sumaPares(num-2);
        }
        
        
        
    }
}
