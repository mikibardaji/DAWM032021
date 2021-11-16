/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ruleta;

/**
 *
 * @author alumne
 */
public class Ruleta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean he_ganado = comprobarResultado(37, 2);
        System.out.println("ganado" + he_ganado);
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
        
    
    
}
