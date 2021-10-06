/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici17;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Exercici17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int hh,mm,ss;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la hora : ");
        hh = sc.nextInt();
        System.out.print("Introduce el minuto : ");
        mm = sc.nextInt();
        System.out.print("Introduce el segundo : ");
        ss = sc.nextInt();
        
        ss = ss+1; //ss++; ss +=1;
        if (ss==60)
        {
            System.out.println("he pasado 60");
            ss=0;
            mm = mm +1;
            if (mm==60)
            {
                mm=0;
                ++hh;
                if (hh==24)
                {
                    hh=0;
                    System.out.println("Hora " + hh + " minutos " + mm + " segundos " + ss);
                }
                else //si no he pasado de 24 horas
                {
                    System.out.println("Hora " + hh + " minutos " + mm + " segundos " + ss);
                }
                
            }
            else //no he pasado de 60 minutosd
            {
                System.out.println("Hora " + hh + " minutos " + mm + " segundos " + ss);
            }
            
        }
        else //no he pasado de 60 segundos
        {
        System.out.println("Hora " + hh + " minutos " + mm + " segundos " + ss);
        }
    }
    
}
