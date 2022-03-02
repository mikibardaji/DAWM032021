/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author alumne
 */
public class CartaEpica extends Carta {

    public CartaEpica() {
        nivel=1;
        puntos_vida=1000;
        this.numero_cartas=0;
        this.fuerza_ataque =100; 
    }

    
    
    @Override
    public void mejorarCarta() {
        if (numero_cartas>=20)
        {
            nivel++;
            System.out.println("Epica he subido al nivel" + nivel);
            numero_cartas=0;
        }
    }
    
}
