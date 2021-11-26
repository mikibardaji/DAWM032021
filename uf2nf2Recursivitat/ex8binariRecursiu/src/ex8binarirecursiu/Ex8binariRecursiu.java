/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex8binarirecursiu;

/**
 *
 * @author alumne
 */
public class Ex8binariRecursiu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num=11;
        binari(num);
    }
    
    
    
   public static void binari(int num)
    {
        if (num<2)
        {
            System.out.println(num);
        }
        else
        {
            System.out.print(num%2); //muestro parte resultado
            binari(num/2);//sigo con el recursivo
        }
        
    }
}
