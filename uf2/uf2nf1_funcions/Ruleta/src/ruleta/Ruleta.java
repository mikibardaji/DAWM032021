/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ruleta;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ruleta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int caja=50; //dinero jugador
       int dinero_apuesta,numero_apostado, numero_ruleta, premio_ganado;
       boolean ganador;
       
       do{
       dinero_apuesta = pedirDineroApuesta(caja);
       numero_apostado = pedirNumeroApuesta();
       numero_ruleta = tirar_bola();
        System.out.println("apuesta " + dinero_apuesta + " numero " + numero_apostado +  " bola " + numero_ruleta);
       
        ganador = comprobarResultado(numero_apostado, numero_ruleta);
        System.out.println("ganado " + ganador);
        if (ganador) //ganado==true
        {
            premio_ganado=Calcular_premio(numero_apostado, dinero_apuesta);
            System.out.println("Has ganado " + premio_ganado + " euro");
           // caja = actualizarDinero(caja, premio_ganado, ganador);//aqui gando es true
            caja = actualizarDinero(caja, premio_ganado, true);
        }
        else //he perdido
        {
            System.out.println("Has perdido " + dinero_apuesta);
            //caja = actualizarDinero(caja, dinero_apuesta, ganador);//ganado es igual false
            caja = actualizarDinero(caja, dinero_apuesta, false);
        }
        System.out.println("Tienes aun " + caja);
       }while(Seguir_jugando(caja)==true);
        System.out.println("TE has quedado con " + caja + "euros");
    }
    
    
    /**
     * Boolean Comprobar_resultado(int num_apostado, int bola), decide si has ganado o no. 
     * Si es igual ganas y si es 37 o 38 
     *  calcular que si es 37 y 38, tendrá que mirar si es par o no la bola(2 pts)
     */
    public static boolean comprobarResultado(int num_apostado, int bola)
    {
        boolean ganado=false;
        if(num_apostado==bola) //guanyant si he encertat la bola exacta
        {
            ganado=true;
        }
        else if (num_apostado==38) //par
        {
            if (bola%2==0)
            {
                ganado=true;
            }
            //else
            //{ ganado=false;}
            
        }else if(num_apostado==37)
        {
            if(bola%2==1)
            {
                ganado=true;
            }
        }
        
        return ganado;
        }
        
    /**calculara la ganancia y la retornara. 
     * Si es par/impar el doble si es un numero normal por 36.
     * 
     * @param num_apostado sera un numero del 0 al 38
     * @param cantidad que he apostado
     * @return devolvera la ganancia
     */
    
    public static int Calcular_premio(int num_apostado,int cantidad) 
    {
        int premio;
        if(num_apostado==37 || num_apostado==38)
            premio=cantidad*2;
        else
            premio = cantidad * 36;
        return premio;
    }

    /**
     * retornar el total del dinero, en función de si has ganado sumas, sino lo restas
     * @param dinero_tienes dinero tienes en tu bolsillo
     * @param dinero_sumar_restar dinero que has ganado/perdiod
     * @param ganado true si has ganado
     * @return  devuelves el dinero que queda en el bosillo despues de ganar o perder
     */
    private static int actualizarDinero(int dinero_tienes, int dinero_sumar_restar, boolean ganado) {
        if (ganado) //ganado==true
        {
            dinero_tienes = dinero_tienes + dinero_sumar_restar;
        }
        else
        {
            dinero_tienes = dinero_tienes - dinero_sumar_restar;
        }
        return dinero_tienes;
    }
    
    
    /**
     * Boolean Seguir_jugando(int dinero), 
     * decidir si sigues jugando o no dependerá de si tienes dinero, 
     * y si a la pregunta ¿Quieres continuar? Escribes s o S. 
     * En cualquier otro caso no debe seguir jugando (1pt=
     */
    
    public static boolean Seguir_jugando(int dinero)
    {
        if (dinero<=0)
        {
            return false; //no juegas
        }
        else
        {
            Scanner sc = new Scanner(System.in);
            char respuesta;
            do{
                System.out.println("Quieres jugar mas(S/N)");
                respuesta = sc.nextLine().charAt(0);
         //   }while(respuesta!='s' && respuesta != 'n' && respuesta!='S' && respuesta != 'N');
              }while(!(respuesta=='s' || respuesta == 'n' || respuesta =='S' || respuesta == 'N'));
            if (respuesta=='s' || respuesta=='S')
            {
                return true;
            }
            else
            {
                return false;
            }
                
        }
        
    }
    
    /**
     * Int Tirar_bola(), aleatorio entre 0 y 36 (0,75)
     */
    public static int tirar_bola()
    {
        Random rd = new Random();
        int bola = rd.nextInt(37);
        return bola;
    }
    
    /**
     * Int Pedir_numero_apuesta(), pedir un valor al usuario que debe 
     * estar entre 0 y 38 37 impar y 38 par (1pt)
     */
    public static int pedirNumeroApuesta()
    {
        Scanner sc = new Scanner(System.in);
        int apuesta;
        do{
         System.out.println("A que numero apuestas(0-36) , el 37 es apostar impar y 38 par");
         apuesta = sc.nextInt();
        }while(!(apuesta<=38 && apuesta>=0));
         return apuesta;      
    }
   
    /**
     * Int pedir_dinero_apuesta(int dinero_tengo), pedir el dinero que quieres apostar, 
     * debe ser positivo y no superior a el dinero disponible(1pt)
     */
    public static int pedirDineroApuesta(int dinero_tengo)
    {
        Scanner sc = new Scanner(System.in);
        int dinero_apuesta;
        do{
         System.out.println("cuanto quieres apostar");
         dinero_apuesta = sc.nextInt();
        }while(!(dinero_apuesta<=dinero_tengo && dinero_apuesta>=0));
         return dinero_apuesta;    
    }
}
