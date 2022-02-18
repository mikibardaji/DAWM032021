/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class CancionDAO {

    public boolean InsertarCancion(ArrayList<Cancion> spotify) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Fica el titol de la canço");
        String titol = sc.nextLine();
        System.out.println("Fica el autor de la canço");
        String autor = sc.nextLine();
        Cancion anyadir = new Cancion(titol, autor);
        
        if (spotify.contains(anyadir)){
            System.out.println("Cancion ya existente");
            return false;
        }
        
        
        //pedir datos clave de cancion
        //buscar si existe
        //si existe avisar que ya no la inserta
        //si no existe, pedir los otros datos(no importantes) de cancion
        //insertar en la lista 
        //returnara true si kla ha insertado , fasle sino
          return true;      
    }

    public void listarCancion(ArrayList<Cancion> spotify) {
        
    }
    
}
