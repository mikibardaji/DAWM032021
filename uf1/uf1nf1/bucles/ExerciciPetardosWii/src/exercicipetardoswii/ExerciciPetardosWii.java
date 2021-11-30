/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicipetardoswii;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ExerciciPetardosWii {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        int petardo1,petardo2,petardo3;
        Random r = new Random();
         Scanner teclado = new Scanner(System.in);
        //valores de cada petardo
        petardo1=r.nextInt(20);
        petardo2=r.nextInt(20);
        petardo3=r.nextInt(20);
        //demanar elegir petardo
        System.out.println("Que petardo de los 3 eliges (1-3)");
        int opcion = teclado.nextInt();
        teclado.nextLine();
//        System.out.println("petardo1" + petardo1);
//        System.out.println("petardo2" + petardo2);
//        System.out.println("petardo3" + petardo3);
        //System.out.println("opcion " + opcion);
        int lineaPintada=0;
        System.out.println("P1   P2   P3   ");
//        while (petardo1>0 || petardo2 >0 || petardo3>0)
//        {
//            petardo1--;
//            petardo2--;
//            petardo3--;
//        }
        
        
        
        while(lineaPintada<petardo1 || lineaPintada< petardo2
                || lineaPintada< petardo3)
        {
            if (lineaPintada<petardo1)
            {
                System.out.print("*    ");
            }
            else
            {
                System.out.print("     ");
            }
            
            if (lineaPintada<petardo2)
            {
                System.out.print("*    ");
            }
            else
            {
                System.out.print("     ");
            }
                        
            if (lineaPintada<petardo3)
            {
                System.out.println("*    ");
            }
            else
            {
                System.out.println("     ");
            }            
            //System.out.println("linea " + lineaPintada);
            Thread.sleep(1500);
            lineaPintada++;
        }
        
        
        
        
        
        
        
        if (opcion==2) 
        {
            if (petardo2>=petardo1 && petardo2 >=petardo3)
            {
                System.out.println("has ganado tu petardo volo hasta " + petardo2 + " metros ");
            }
            else
            {
                System.out.println("Has perdido ");
            }    
               
        }
        else  if (opcion==1) 
        {
            if (petardo1>=petardo2 && petardo1 >=petardo3)
            {
                System.out.println("has ganado");
            }
            else
            {
                System.out.println("Has perdido ");
            }    
               
        }
        else  if (opcion==3) 
        {
            if (petardo3>=petardo2 && petardo3 >=petardo1)
            {
                System.out.println("has ganado");
            }
            else
            {
                System.out.println("Has perdido ");
            }    
               
        }
        
    }
    
}
