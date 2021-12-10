/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package setimig;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Setimig {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int cartaJ,cartaB,paloJ,paloB;
       double puntosJ = 0, puntosB=0;
       char seguir='n';
       boolean bancaSigue=false;
       do{
           cartaJ = numero_carta_aleatori();
           paloJ = pal_carta_aleatori();
           System.out.println("Has sacado la carta ");
           imprimir_carta(cartaJ, paloJ);
           puntosJ = puntosJ + punts_carta(cartaJ);
           
           cartaB = numero_carta_aleatori();
           paloB = pal_carta_aleatori();
           System.out.println("Banca  sacado la carta ");
           imprimir_carta(cartaB, paloB);
           puntosB = puntosB + punts_carta(cartaB);
           
           System.out.println("Puntos Jugador " + puntosJ);
           System.out.println("Puntos Banca " + puntosB);
           if (puntosJ<7.5)
           {
               seguir = jugador_continua();
           }
           if(puntosJ<=7.5 && puntosB<7.5)
           {
               bancaSigue = banca_demana_carta(puntosJ,puntosB);
           }
           
       }while(puntosJ<7.5 && puntosB < 7.5
               && (seguir == 's' || seguir == 'S')
               && bancaSigue ==true);
       
       boolean ganador= guanya_jugador(puntosJ,puntosB);
       if(ganador)    
       {
           System.out.println("has ganado");
       }
       else
       {
           System.out.println("Banca gana");
       }
           
    }
    
    public static int numero_carta_aleatori()
    {
        Random rd = new Random();
        return (rd.nextInt(10)+1);
    }
    
    public static int pal_carta_aleatori()
    {
        Random rd = new Random();
        return (rd.nextInt(4)+1);
    }
    
    public static void imprimir_carta(int carta, int pal)
    {
        if (carta>=1 && carta<=7)
        {
            System.out.print(carta);
        }
        else if (carta==8)
        {
            System.out.print("Sota");
        }
        else if (carta==9)
        {
            System.out.print("Cavallo");
        }
        else if (carta==10)
        {
            System.out.print("Rey");
        }

        if (pal==1)
        {
            System.out.println(" de Oros.");
        }
        else if (pal==2)
        {
            System.out.println(" de Copas");
        }
        else if (pal==3)
        {
            System.out.println(" de Bastos");
        }
        else if (pal==4)
        {
            System.out.println(" de Espadas");
        }        
        
        
    }
    
    
    public static double punts_carta(int carta)
    {
        if (carta>=1 && carta<=7)
        {
            return carta;
        }
        else if (carta>=8 && carta <=10) //8,9,10
        {
            return 0.5;
        }
        else
        {
            return 0;
        }
    }
    
    
    public static char jugador_continua()
    {
        Scanner sc = new Scanner(System.in);
        char respuesta;
        do
        {
            System.out.println("Quieres continuar(s/n)");
            respuesta = sc.nextLine().charAt(0);
        }while(!(respuesta=='s' || respuesta == 'n' || 
                respuesta=='S' || respuesta == 'N'));
        return respuesta;
    }
    
    public static char jugador_continua2(int puntosJ, int puntosB)
    {
        Scanner sc = new Scanner(System.in);
        char respuesta;
        if (puntosJ < 7.5 && puntosB < 7.5)
        {
          do
            {
                System.out.println("Quieres continuar(s/n)");
                respuesta = sc.nextLine().charAt(0);
            }while(!(respuesta=='s' || respuesta == 'n' || 
                    respuesta=='S' || respuesta == 'N'));  
        }
        else
        {
            respuesta='n';
        }

        return respuesta;
    }
    
    
    public static boolean banca_demana_carta(double puntosJ, double puntosB)
    {
        if ((puntosJ <= 7.5) && (puntosJ > puntosB))
        {
            return true;
        }
        else if (puntosB <= 5.5)
        {
            return true;            
        }
        else
        {
            return false;
        }
        
    }
    
    public static boolean guanya_jugador(double puntosJ, double puntosB)
    {
        if ((puntosJ <= 7.5) && (puntosJ > puntosB))
        {
            return true;
        }
        else if ((puntosJ <= 7.5) && ( puntosB>7.5))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
}
