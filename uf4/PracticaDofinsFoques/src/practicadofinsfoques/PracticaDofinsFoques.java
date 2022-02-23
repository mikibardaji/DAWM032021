/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicadofinsfoques;

import java.util.Scanner;
import objetos.Dofi;
import objetos.Foca;

/**
 *
 * @author alumne
 */
public class PracticaDofinsFoques {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Dofi flipper = new Dofi(10,"fosc");
        Foca seaber = new Foca(140, 5);
        Scanner sc = new Scanner(System.in);
        System.out.println("Que distancia recorrera");
        int distancia = sc.nextInt();
        
        int vueltas=0;
        do
        {
            flipper.sprint();
            seaber.sprint();
            vueltas++;
            if(vueltas%6==0)
            {
                seaber.AugmentarResistencia(1);
            }
            
        }while (!(seaber.getDistancia_recorreguda()> distancia
                || flipper.getDistancia_recorreguda()> distancia));
        
        
        if(seaber.getDistancia_recorreguda()>flipper.getDistancia_recorreguda())
        {
            System.out.println("ha ganado la foca");
        }
        else
        {
            System.out.println("ha ganado el delfin");
        }
                
        
    }
    
}
