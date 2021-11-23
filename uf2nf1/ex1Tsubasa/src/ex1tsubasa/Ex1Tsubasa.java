/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1tsubasa;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex1Tsubasa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tiroMaquina, tiroUsuario, tanda=0;
        int golJ=0, golM=0;
        do{
            tiroUsuario =elegirLadoUsuario();
            System.out.print("Tu tiro ");
            mostrarLadoTexto(tiroUsuario);
            tiroMaquina = elegirLadoMaquina();
            System.out.print("portero Maquina ");
            mostrarLadoTexto(tiroMaquina);
            if (hayGol(tiroUsuario, tiroMaquina))
            {
                golJ++;
            }
            Marcador(golJ, golM);

            tiroMaquina = elegirLadoMaquina();           
            tiroUsuario =elegirLadoUsuario();
            
            System.out.print("Maquina tiro ");
            mostrarLadoTexto(tiroMaquina);
            System.out.print("Tu portero  ");
            mostrarLadoTexto(tiroUsuario);
            
            
            if (hayGol(tiroUsuario, tiroMaquina))
            {
                golM++;
            }
            Marcador(golJ, golM);
            tanda++;
        }while(seguirTirando(golJ, golM, tanda));
        
        if (golJ>golM)
        {
            System.out.println("Has ganado");
        }
        else if (golM>golJ)
        {
            System.out.println("Has perdido");
        }
        else
        {
            System.out.println("Empate");
        }
        
    
    }
    
    public static int elegirLadoMaquina()
    {
        Random rd = new Random();
       int tiro = rd.nextInt(3)+3;
       return tiro;
    }
    
    
    public static int elegirLadoUsuario()
    {
        Scanner sc = new Scanner(System.in);
        int tiro_usuario;
        do{
         System.out.println("Escoge donde tiras 3-Left, 4-Right, 5 Center");
         tiro_usuario = sc.nextInt();
        }while(!(tiro_usuario>=3 && tiro_usuario<=5  ));
    //}while(tiro_usuario<3 || tiro_usuario>5);
         return tiro_usuario;    
    }
    
    public static void mostrarLadoTexto(int lado)
    {
        if (lado==3)
        {
            System.out.println("va a la izquierda");
        }
        else if (lado==4)
        {
             System.out.println("va a la derecha");
        }
        else if(lado==5)
        {
            System.out.println("va al centro");
        }
        else
        {
            System.out.println("tiro incorrecto");
        }
            
    }
    
    public static boolean hayGol(int tiro1, int tiro2)
    {
        if (tiro1==tiro2)
        {
            System.out.println("Paradon");
            return false;
        }
        else
        {
            System.out.println("GOOOOOOOOOOOOOOOOL");
            return true;
        }
             
    }
    
    public static void Marcador(int golJ, int golP)
    {
        System.out.println("*******************");
        System.out.println(" Jugador : " + golJ);
        System.out.println(" Maquina : " + golP);
        System.out.println("*******************");
    }
    
    public static boolean seguirTirando(int golJ, int golM, int tanda)
    {
        int tandaQueda = 5 - tanda; //calculo tandas que me quedan
        int diferencia_goles;
        if (golJ>golM)
        {
            diferencia_goles = golJ - golM;
        }
        else
        {
            diferencia_goles = golM - golJ;
        }
        
        if (diferencia_goles>tandaQueda)
        {
            return false; //ya no se puede remontar
        }
        else
        {
            return true; //aun se puede remontar
        }
        
        
        
    }
}
