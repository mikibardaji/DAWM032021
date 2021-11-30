/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebasfunciones;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class PruebasFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador_jugador=0, contador_maquina=0;
        
        do{
        int jugada_usuario=tirada_usuario();
        
        System.out.print("Has elegido ...");
        mostrar_jugada(jugada_usuario);
        
        int jugada_maquina = tirar_ordenador();
        System.out.print("La maquina ha  elegido ...");
        mostrar_jugada(jugada_maquina);
        
        int ganador=comprobar_quien_gana(jugada_usuario, jugada_maquina);
        System.out.println(ganador);
        if (ganador==1)//aumento contador de jugador
        {
            contador_jugador=aumentar_contador(contador_jugador);
        }
        else if (ganador==-1)
        {
             contador_maquina=aumentar_contador(contador_maquina);
        }
        mostrar_marcador(contador_jugador,contador_maquina);
        }while(seguir_jugando(contador_jugador, contador_maquina));
//        int d = tirar_ordenador();
//        System.out.println(d);
//          int r = tirada_usuario();
//          System.out.println(r);
//         int contad = aumentar_contador(7);
//         System.out.println(contad);
       // mostrar_jugada(4);
       //boolean s = seguir_jugando(5, 5);
       // System.out.println(s);
       //1 piedra, 2 papel y 3 tijera
      // int gan = comprobar_quien_gana(2, 3);
      //  System.out.println(gan);
    }
    
    /**
     * int tirar_ordenador()   , la maquina triara un numero random 1 al 3, o 0, a2 
     */
    public static int tirar_ordenador()
            {
                Random rd = new Random();
                int tirada = rd.nextInt(3)+1;
                return tirada;
            }
    
    /**
     * int tirada_usuario , amb un scanner demanes que tiri el usuari  i retorna el valor, 
     * per retornar el valor ha de comprovar abans que sigui valid (1,2,3)int tirada_usuario , amb un scanner demanes que tiri el usuari  
     * i retorna el valor, per retornar el valor ha de comprovar abans que sigui valid (1,2,3)
     */
    public static int tirada_usuario()
    {
        Scanner sc = new Scanner(System.in);
        int respuesta;
        do{
        System.out.println("pon piedra(1) papek(2) o tijera(3) ");
        respuesta=sc.nextInt();
        }while(respuesta !=1 && respuesta !=2 && respuesta!=3);
        //si respuesta ==1, o resppuesta ==2 o respuesta==3
        return respuesta;
        
    }
    
    
    /**
     * int aumentar_contador(int contador), aumentara el contador en 1 y lo retornara
     */
    public static int aumentar_contador(int contador)
    {
        contador++;
        return contador;
    }
    
    /**
     * void mostrar_jugada(int jugada), 1 al 3
     * transforma la jugada (numerica) en una salida por pantalla (Piedra/Papel/Tiejra)
     */
    public static void mostrar_jugada(int jugada)
    {
        switch (jugada) {
            case 1:
                System.out.println("piedra");
                break;
            case 2:
                System.out.println("Papel");
                break;
            case 3:
                System.out.println("tijera");
                break;
            default:
                System.out.println("incorrectoe");
                break;
        }
        
    }
    
    
    /**
         * boolean seguir_jugando(int contadorj, int contadorm) si algun contador es 5 o mas, 
         * ua no debo volver a jugar(false) sino devuelve un TRUE
         */
        public static boolean seguir_jugando(int contadorj, int contadorm)
        {
            boolean seguir = true;
            if (contadorj>=5 || contadorm>=5)
            {
                seguir=false;
            }
            return seguir;
        }
        
        /**
         * int comprobar_quien_gana(int tirada_jugador,int tirada_maquina) . 
         * comprueba la jugada para saber quien gana y 
         * retorna un valor que determina quien ha ganado. 
         * /* ganajugador(1), ganamaquina(-1),empate(0)
         * 1 piedra, 2 papel y 3 tijera
         */
        
        public static int comprobar_quien_gana(int tirada_jugador,int tirada_maquina) 
        {
            if (tirada_jugador==tirada_maquina)
            {
                return 0;
            }
            else if (tirada_jugador==1 && tirada_maquina==3) //piedra . tijera
            {
                return 1;
            }
            else if (tirada_jugador==2 && tirada_maquina==1) //papel . piedra
            {
                return 1;
            }
            else if (tirada_jugador==3 && tirada_maquina==2) //tijera,papel
            {
                return 1;
            }
            else if (tirada_jugador==3 && tirada_maquina==1) // tijera, piedra .
            {
                return -1;
            }
            else if (tirada_jugador==1 && tirada_maquina==2) // piedra papel .
            { 
                return -1;
            }
            else //if (tirada_jugador==2 && tirada_maquina==3) //papel tijera,
            {
                return -1;
            }
        }

    private static void mostrar_marcador(int contador_jugador, int contador_maquina) {
        System.out.println("*********************************");
        System.out.println("**** jugador " +  contador_jugador + "********");
         System.out.println("**** contador_maquina " +  contador_maquina + "********");
        System.out.println("*********************************");
    }
}
