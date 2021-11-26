/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici5numeroinvertitrecursiu;

/**
 *
 * @author alumne
 */
public class Exercici5numeroInvertitRecursiu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num=752;
        System.out.print("numero invertit " + num + " = " );
        numeroInvertit(num);
        System.out.println( sumaCifrasNumero(num));
    }
    
    public static void numeroInvertit(int num)
    {
        if (num<10)
        {
            System.out.println(num);
        }
        else
        {
            System.out.print(num%10); //muestro parte resultado
            numeroInvertit(num/10);//sigo con el recursivo
        }
        
    }
    
    
    public static int sumaCifrasNumero(int num)
    {
        if (num<10)
        {
            System.out.println(num+"=");
            return num;
        }
        else
        {
            System.out.print(num%10 + "+");
            return num%10 + sumaCifrasNumero(num/10);
        }
        
    }
    
}
