/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clashroyaleelecciocarta;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ClashRoyaleEleccioCarta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int copas;
        char opcion;
        Scanner sc = new Scanner(System.in);
        final int MAGOELECTRICO=0;
        System.out.println("cuantas copas tienes");
        copas = sc.nextInt();
        sc.nextLine(); //limpiar buffer, fijaros que no lo pongo a ninguna variable
        if (copas<2000)
            {
                System.out.println("Escoge entre Mago Electrico(M) i megaEsbirro(E)");
                opcion = sc.nextLine().charAt(0);

                //if (opcion == MAGOELECTRICO)
                if (opcion == 'm' || opcion == 'M') {
                    System.out.println("Tienes Mago Electrico");
                } else if (opcion == 'e'|| opcion == 'E') {
                    System.out.println("Tienes megaEsbirro");
                } else {
                    System.out.println("opcion incorrecta");
                }   
            } //copas < 2000
        else if (copas>=2000 && copas<3000)
        {
            System.out.println("Escoge entre Cavallero(C) i Bandida(B)");
             opcion = sc.nextLine().charAt(0);

                //if (opcion == MAGOELECTRICO)
                if (opcion == 'c'|| opcion == 'C') {
                    System.out.println("Tienes Cavallero");
                } else if (opcion == 'b' || opcion == 'B') {
                    System.out.println("Tienes Bandida");
                } else {
                    System.out.println("opcion incorrecta");
                } 
        }
        else //copas mas de 3000
        {
             System.out.println("Escoge entre EjercitoEsqueleto(E) i Gigante(G)");
             opcion = sc.nextLine().charAt(0);

                //if (opcion == MAGOELECTRICO)
                if (opcion == 'e'|| opcion == 'E') {
                    System.out.println("Tienes Ejercito de Esqueleto");
                } else if (opcion == 'g' || opcion == 'G') {
                    System.out.println("Tienes Gigante");
                } else {
                    System.out.println("opcion incorrecta");
                } 
        }
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
