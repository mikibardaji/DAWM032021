/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exponentebaserecursiu;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ExponenteBaseRecursiu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("pon una base");
        int base = sc.nextInt();
        System.out.println("pon exponenete");
        int exp = sc.nextInt();
        System.out.println(base + " elevado a " + exp + "=" + potencia(base,exp));
    }
    
    public static int potencia(int base1, int exponente1)
    {
        int calculo;
        //caso base
        if (exponente1==0)
        {
            return 1;
        }
        else if (exponente1==1)
        {
            System.out.println(base1 + " elevado a 1 = " + base1);
            return base1;
        }
        else  //caso recursivo
        {
            //return potencia(base1,1)*potencia(base1,exponente1-1);
            calculo= base1*potencia(base1,exponente1-1);
            System.out.println(base1+"^"+exponente1+"=" + calculo);
            return calculo;
        }
        
    
    }
    
    
}
