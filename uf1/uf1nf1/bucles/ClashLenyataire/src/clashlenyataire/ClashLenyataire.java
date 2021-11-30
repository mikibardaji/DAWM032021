/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clashlenyataire;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ClashLenyataire {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Scanner teclado = new Scanner(System.in);
        System.out.println("cual es nivel de tu leñador ");
        int nivelleniador= teclado.nextInt();
        System.out.println("cual es el nivel de tu torre");
        int niveltorre= teclado.nextInt();
        int fuerzaLenyador=0,fuerzaTorre=0;
        int vidaTorre=0, vidaLenyador=0;
        
        if (nivelleniador==9){
        fuerzaLenyador=200;
        vidaLenyador = 1060;
        }
        else if (nivelleniador==10)
        {
        fuerzaLenyador=220;
        vidaLenyador = 1166;
        }
        else if (nivelleniador==11){
        fuerzaLenyador=242;
        vidaLenyador = 1282;
        }
        else if (nivelleniador==12){
        fuerzaLenyador=266;
        vidaLenyador = 1409;
        }
        else if(nivelleniador==13){
        fuerzaLenyador=292;
        vidaLenyador = 1547;
        }
        
        if (niveltorre==9){
        vidaTorre=2534;
        fuerzaTorre=90*2;
        }
        else if (niveltorre==10)
        {
        vidaTorre=2786;
        fuerzaTorre=99*2;
        }
        else if (niveltorre==11){
        vidaTorre=3052;
        fuerzaTorre=109*2;
        }
        else if (niveltorre==12){
        vidaTorre=3346;
        fuerzaTorre=119*2;
        }
        else if(niveltorre==13){
        vidaTorre=3668;
        fuerzaTorre=131*2;
        }
        int golpe=0;
        /* tenemos informado
        vidaTorre, vidaLenyador
        fuerzaTorre, fuerzaLenyador
        */
        
        System.out.println("vidaTorre " + vidaTorre);
        System.out.println("vidaLenyador " + vidaLenyador);
        System.out.println("fuerzaTorre " + fuerzaTorre);
        System.out.println("fuerzaLenyador " + fuerzaLenyador);
        
        while (vidaTorre> 0 && vidaLenyador>0){
            golpe++;  
            vidaTorre=vidaTorre-fuerzaLenyador;
            vidaLenyador = vidaLenyador -fuerzaTorre;
            /* para arreglar si alguna vez es negativo*/
            if (vidaTorre<0)
            {
                vidaTorre=0;
            }
            if (vidaLenyador<0)
            {
                vidaLenyador=0;
            }
            Thread.sleep(500); /*pausa la ejecucion 0,5 seguns*/
            System.out.println("La torre le queda "+vidaTorre);
            System.out.println("El leñador le queda " + vidaLenyador);
        }
        
        
        if (vidaTorre<=0 && vidaLenyador>0)
        {
            System.out.println("Ha ganado el leñador");
        }
        else if (vidaLenyador<=0 && vidaTorre>0)
        {
            System.out.println("ha ganado la torre");
        }
        else
        {
            System.out.println("empate");
        }
        
        
        System.out.println("has hecho tantos golpes "+golpe);
    }
    
}
