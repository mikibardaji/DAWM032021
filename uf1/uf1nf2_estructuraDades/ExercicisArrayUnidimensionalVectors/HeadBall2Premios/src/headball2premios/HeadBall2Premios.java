/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package headball2premios;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class HeadBall2Premios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] boletos = new int[4];
        int posicion_escoge;
        int acum_dinero=0;
        int premio;

        do{
        llenarArrayMonedas(boletos);
       
        ponerTarjetaRoja(boletos);
   
         posicion_escoge=escogerPosicion(boletos.length);
        
         premio = buscarPremio(boletos, posicion_escoge);
         if (premio!=-1)
         {
             acum_dinero = acum_dinero  + premio;
             System.out.println("has ganado " + premio + " llevas " + acum_dinero );
         }
         else
         {
             System.out.println("Tarjeta Roja");
         }
        } while ((premio!=-1) && preguntarPlantas());
         
    }

    /**
     * llenar todas las posiciones con monedas de forma aleatoria
     * @param boletos 
     */
    
    
    
    public static void llenarArrayMonedas(int[] boletos) {
        for (int i = 0; i < boletos.length; i++) {
            boletos[i] = darMonedas();
        }
    }

    
    /**
     * generar monedas aleatorias del 1 al 100
     * @return 
     */
    public static int darMonedas() {
        Random rd = new Random();
        return (rd.nextInt(100)+1);
    }
    
   public static void mostrarArray(int[] valores) {
        for (int i = 0; i < valores.length; i++) {
            System.out.println("indice " + i +"=" + valores[i]);
            
        }
    }

   /**
    * escoge una posicion aleatoria entre 0 y el tamaño y pone -1
    * @param boletos 
    */
    private static void ponerTarjetaRoja(int[] boletos) {
        Random rd = new Random();
        int posicion = rd.nextInt(boletos.length);
        boletos[posicion] = -1;
    }

    /** pedir al usuario que tarjeta quiere ver, tiene que ser una poscion valida
     * del 1 al 4
     * @return la posicion valida adaptada al array
     */
    private static int escogerPosicion(int tamanyo) {
        Scanner sc = new Scanner(System.in);
        int posicion;
        do{
        System.out.println("escoge posicion(1-" + tamanyo + ")");
        pintarAsteriscos(tamanyo);
        posicion = sc.nextInt();
        }while(!(posicion>=1 && posicion<=tamanyo));
        return (posicion-1);
    }

    /**
     * devuelve el premio o la tarjeta
     * @param boletos
     * @param posicion_escoge
     * @return 
     */
    private static int buscarPremio(int[] boletos, int posicion_escoge) {
        return boletos[posicion_escoge];
    }

    private static void pintarAsteriscos(int tamanyo) {
        for (int i = 0; i < tamanyo; i++) {
            System.out.print("* -");
        }
        System.out.println("");
    }

    /** te pregunta si queires seguir
     * 
     * @return false si te plantas (s)  true si sigues
     */
    private static boolean preguntarPlantas() {
          Scanner sc = new Scanner(System.in);
          char respuesta;
          do
          {
              System.out.println("te plantas (s/n)");
              respuesta = sc.nextLine().charAt(0);
          }while(!(respuesta=='s' || respuesta == 'n' || respuesta=='S' || respuesta == 'N'));
          if (respuesta=='s' || respuesta == 'S')
          {
              return false;
          }
          else
          {
              return true;
          }
    }
}
