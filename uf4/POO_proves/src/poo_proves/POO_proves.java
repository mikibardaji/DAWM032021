/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_proves;

import Objetos.Botella;
import Objetos.Vaso;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class POO_proves {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Botella primera=new Botella(); //constructor (reserva memoria)
        Vaso primer_got=new Vaso();
        Scanner sc= new Scanner(System.in);
        
        primera.setMaterial("Metall");
        
        System.out.println(primera.getMaterial());
        
        primera.setMaterial("vidre");
        System.out.println(primera.getMaterial());
        
        primera.setCapacitad_total(500);
        System.out.println(primera.getCapacitad_total());
        
        
        
        
        
        
        
    }
    
}
