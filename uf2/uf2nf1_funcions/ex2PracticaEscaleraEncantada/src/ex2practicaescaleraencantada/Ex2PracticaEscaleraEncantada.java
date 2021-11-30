/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2practicaescaleraencantada;

import java.util.Random;

/**
 *
 * @author alumne
 */
public class Ex2PracticaEscaleraEncantada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int casilla=0;
       int ronda=0;
       int dados;
       do{
           ronda++;
           dados = tirada_dados();
           System.out.println("Ha salido" + dados);
           casilla = casilla + dados;
           //tirar dados hasta que llegue a 50 o a 10 rondas
           mostrarResultadoParcial(casilla, ronda);
       }while(!(casilla>=50 || ronda>10));

        ganador(casilla);
    }
    
    
    public static int tirar_dado()
    {
       Random rd = new Random();
       int dado = rd.nextInt(6)+1;
       if (dado ==5)
       {
           dado=-1;
       }
       else if (dado==6)
       {
           dado = -2;
       }
       return dado;
       
    }
    
    public static int tirada_dados()
    {
        int dado1=tirar_dado();
        int dado2=tirar_dado();
        
        return dado1+dado2;
        
        
    }
    
    public static void mostrarResultadoParcial(int casilla, int ronda)
    {
        System.out.println("**************");
        System.out.println("*** casilla : " + casilla +" *");
        System.out.println("*** ronda   : " + ronda + " *");
        System.out.println("**************");
    }
    
    public static void ganador(int casilla)
    {
        if (casilla>=50)
        {
            System.out.println("Has ganado");
        }
        else
        {
            System.out.println("Has perdido");
        }
    }
}
