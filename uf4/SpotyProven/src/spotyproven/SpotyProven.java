/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package spotyproven;

import Objetos.Cancion;
import Objetos.CancionDAO;
import java.util.ArrayList;

/**
 *
 * @author alumne
 */
public class SpotyProven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //ArrayList Canciones todas las canciones
        ArrayList<Cancion> spotify = new ArrayList<Cancion>();
        //CancionDao tambien lo definimos aquí
        CancionDAO utils = new CancionDAO();
        anyadirCancionesMuestra(spotify);
        //bucle con el menu
        
        //opcion=1;
            utils.InsertarCancion(spotify);
        //opcion=3;
            utils.listarCancion(spotify);
       
        
    }
    
    
    
    //menu

    private static void anyadirCancionesMuestra(ArrayList<Cancion> spotify) {
           spotify.add(new Cancion("Highway to hell","AC/DC"));
           spotify.add(new Cancion("Mi agüita amarilla","Los Toreros Muertos"));
           spotify.add(new Cancion("Smooth Criminal", "Michael Jackson"));
    }
}
