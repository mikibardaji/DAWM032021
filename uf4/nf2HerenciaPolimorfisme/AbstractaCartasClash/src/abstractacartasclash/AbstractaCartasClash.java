/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstractacartasclash;

import Objetos.Carta;
import Objetos.CartaComun;
import Objetos.CartaEpica;

/**
 *
 * @author alumne
 */
public class AbstractaCartasClash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Carta padre; //no puedo hacer new porque esta clase es Abstracta
        CartaComun comun = new CartaComun();
        CartaEpica epica = new CartaEpica();
        System.out.println("comun " + comun.getNivel());
        System.out.println("epica " + epica.getNivel());
        while(comun.getNivel()<3 || epica.getNivel()<3)
        {
            comun.setNumero_cartas(200);
            epica.setNumero_cartas(5);
            System.out.println("comun " + comun.getNumero_cartas());
            System.out.println("epica " + epica.getNumero_cartas());
            comun.mejorarCarta();
            epica.mejorarCarta();
            Thread.sleep(1000);
        }
    }
    
}
