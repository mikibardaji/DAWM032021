/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clashlenyatairefuncions;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ClashLenyataireFuncions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        
        
        System.out.println("leñador ");
        int nivelleniador= dime_nivel();
        System.out.println("Torre");
        int niveltorre= dime_nivel();
        int fuerzaLenyador=0,fuerzaTorre=0;
        int vidaTorre=0, vidaLenyador=0;
        
        
        fuerzaLenyador = calcularFuerzaLenyador(nivelleniador);
        vidaLenyador = calcularVidaLenyador(nivelleniador);
        
        //vidaTorre=calcularFuerzaTorre(niveltorre);
        //fuerzaTorre=calcularVidaTorre(niveltorre);
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
        
        mostrar_datos(vidaTorre,vidaLenyador,fuerzaTorre, fuerzaLenyador);
      
        
        int resultado = lucha(vidaTorre,vidaLenyador,fuerzaLenyador,fuerzaTorre);
        if(resultado==1)
        {
            System.out.println("ha gando leñador");
        }
        else if (resultado==-1)
        {
            System.out.println("ha ganado torre");
        }
        else
        {
            System.out.println("empate");
        }
    }

    private static int dime_nivel() {
        Scanner teclado = new Scanner(System.in);
        int nivel;
        
        do
        {
            System.out.println("Pon nivel del 9 al 12");
            nivel = teclado.nextInt();
        }while(!(nivel>=9 && nivel<=13));
        return nivel;
    }

    private static int calcularFuerzaLenyador(int nivelleniador) {
        int fuerzaLenyador=0;
        if (nivelleniador==9){
        fuerzaLenyador=200;
        }
        else if (nivelleniador==10)
        {
        fuerzaLenyador=220;
        }
        else if (nivelleniador==11){
        fuerzaLenyador=242;

        }
        else if (nivelleniador==12){
        fuerzaLenyador=266;

        }
        else if(nivelleniador==13){
        fuerzaLenyador=292;

        }
        
        return fuerzaLenyador;
    }

    private static int calcularVidaLenyador(int nivelleniador) {
        int vidaLenyador=0;
        if (nivelleniador==9){
        vidaLenyador = 1060;
        }
        else if (nivelleniador==10)
        {
        vidaLenyador = 1166;
        }
        else if (nivelleniador==11){
        vidaLenyador = 1282;
        }
        else if (nivelleniador==12){
        vidaLenyador = 1409;
        }
        else if(nivelleniador==13){
        vidaLenyador = 1547;
        }
        
        
        return vidaLenyador;
    }

    private static void mostrar_datos(int vidaTorre, int vidaLenyador, int fuerzaTorre, int fuerzaLenyador) {
          System.out.println("vidaTorre " + vidaTorre);
        System.out.println("vidaLenyador " + vidaLenyador);
        System.out.println("fuerzaTorre " + fuerzaTorre);
        System.out.println("fuerzaLenyador " + fuerzaLenyador);
    }

    private static int lucha(int vidaTorre, int vidaLenyador, int fuerzaLenyador, int fuerzaTorre) throws InterruptedException {
        int golpe=0;
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
        
         System.out.println("has hecho tantos golpes "+golpe);
        if (vidaTorre<=0 && vidaLenyador>0)
        {
            return 1;
        }
        else if (vidaLenyador<=0 && vidaTorre>0)
        {
            return -1;
        }
        else
        {
            return 0;
        }
        
        
       
    }
    
}
