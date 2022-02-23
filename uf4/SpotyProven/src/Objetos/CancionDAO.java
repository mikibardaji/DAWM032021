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
        else
        {
            System.out.println("Fica el album de la canço");
            String album = sc.nextLine();
            System.out.println("Fica la duració de la cnaço");
            int duracion  = sc.nextInt();
            anyadir.setAlbum(album);
            anyadir.setDuracion(duracion);
            spotify.add(anyadir);
            System.out.println("he insertado la cancion");
            return true;
        }
        
        //pedir datos clave de cancion
        //buscar si existe
        //si existe avisar que ya no la inserta
        //si no existe, pedir los otros datos(no importantes) de cancion
        //insertar en la lista 
        //returnara true si kla ha insertado , fasle sino
               
    }

    public void listarCancion(ArrayList<Cancion> spotify) {
        for (int i = 0; i < spotify.size(); i++) {
            System.out.println(spotify.get(i).toString());
        }
        System.out.println("Canciones mostradas: " + spotify.size());
    }

    public void EliminarCancion(ArrayList<Cancion> spotify) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Fica el titol de la canço a eliminar");
        String titol = sc.nextLine();
        System.out.println("Fica el autor de la canço a eliminar");
        String autor = sc.nextLine();
        Cancion borrar = new Cancion(titol, autor);
        
        if (spotify.remove(borrar))
        {
            System.out.println("Cancion borrada " + borrar.toString());
        }
        else
        {
            System.out.println("Canción no estaba en la lista");
        }
        
    }

    /** pedira el album que quieres mostrar
     * y a partir de alli recorrare el array y mostrara slo los que coincidan
     * @param spotify 
     */
    public void listarCancionAlbum(ArrayList<Cancion> spotify) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que album quieres ver");
        String album_buscar = sc.nextLine();
        
        int cont=0;
        for (int i = 0; i < spotify.size(); i++) {
            if (spotify.get(i).getAlbum().equalsIgnoreCase(album_buscar))
            {
                System.out.println(spotify.get(i).toString());
                cont++;
            }
        }
        System.out.println("canciones mostradas " + cont);
        
    }
    
}
