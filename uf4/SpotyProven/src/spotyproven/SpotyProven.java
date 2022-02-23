/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package spotyproven;

import Objetos.Cancion;
import Objetos.CancionDAO;
import java.util.ArrayList;
import java.util.Scanner;

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
        int opcion;
        do{
        opcion = menu();
        
        switch (opcion) {
            case 1:
                utils.InsertarCancion(spotify);
                break;
            case 2:
                utils.EliminarCancion(spotify);
                break;
            case 3:
                utils.listarCancion(spotify);
                break;
            case 4:
                utils.listarCancionAlbum(spotify);
                break;
            default:
                System.out.println("opcion incorrecta");
        }
        }while(opcion!=6);
        
        
        
    }
    
    
    
    //menu

    private static void anyadirCancionesMuestra(ArrayList<Cancion> spotify) {
           spotify.add(new Cancion("Highway to hell","AC/DC","Back is black",250));
           spotify.add(new Cancion("Mi agüita amarilla","Los Toreros Muertos"));
           spotify.add(new Cancion("Smooth Criminal", "Michael Jackson"));
           spotify.add(new Cancion("Highway to hell2","AC/DC","Back is black",150));
           spotify.add(new Cancion("Highway to hell3","AC/DC","Back is black",350));
           spotify.add(new Cancion("Mi agüita amarilla2","Los Toreros Muertos"));
    }
    
    
    private static int menu()
    {
        System.out.println("1. Inserir Canción\n" +
        "2. Esborrar Canción\n" +
        "3. Llistar Canciónns\n" +
        "4. Llistar Canciónns d'un àlbum\n" +
        "5. Generar Llista de Canciónns dinàmica per reproduir\n" +
        "6. Sortir");
        Scanner sc = new Scanner(System.in);
         int opcion ;
        do{
        System.out.println("que opcion quieres");
         opcion = sc.nextInt();
        }while(opcion<1 || opcion>6);
        //do while validando si esta entre 1 y 6
        return opcion;
    }
}
