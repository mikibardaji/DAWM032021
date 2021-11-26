/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumaentrenumerosrecursivo;

/**
 *
 * @author alumne
 */
public class SumaentrenumerosRecursivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("suma entre 5 y 2 " + sumaEntreDosNumeros(5, 2));
    }
    
    public static int sumaEntreDosNumeros(int num1, int num2)
    {
        int mayor,menor;
        if (num1==num2)
        {
            return num2;
        }
        else //caso recursivo
        {
//            if (num1>num2)
//            {
//                mayor = num1;
//                menor=num2;
//            }
//            else
//            {
//                mayor = num2;
//                menor=num1;
//            }
//            return mayor + sumaEntreDosNumeros(mayor-1, menor);
            
            
            if (num1> num2) //decrezco el primero
            {
                return num1 + sumaEntreDosNumeros(num1-1, num2);
            }
            else //num2 es mas grande
            {
                return num2 + sumaEntreDosNumeros(num1, num2-1);
            }
            
            
        }
        
        
    }
}
