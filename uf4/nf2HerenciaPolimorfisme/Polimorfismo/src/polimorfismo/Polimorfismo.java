/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfismo;

import objetos.Hija1;
import objetos.Hija2;
import objetos.Madre;

/**
 *
 * @author alumne
 */
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Madre m1 = new Madre();
        Hija1 h1 = new Hija1();
        Hija2 h2 = new Hija2();
        h2.edat =13;
        Madre polimadre;
       // polimadre.llamame();
        
       polimadre = m1;
       polimadre.llamame();
       
       polimadre = h1;
       polimadre.llamame();
        
        polimadre =  h2;
        ((Hija2) polimadre).edat = 24;
       //h2.edat =13;
       //polimadre.edat = 15;
       
       polimadre.llamame();
        System.out.println(((Hija2) polimadre).edat);
    }
    
}
