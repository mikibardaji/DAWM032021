/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistence;

import Objetos.Mascotas;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumne
 */
public class PersistenciaArchivo {
 
    private final static String nombre_archivo = "tienda.dat";
    
    public static boolean saveAllItems(ArrayList<Mascotas> tienda) throws FileNotFoundException, IOException
    {
          FileOutputStream escritura = null;
          escritura = new FileOutputStream(nombre_archivo);
          ObjectOutputStream StreamDatos = new ObjectOutputStream(escritura);
             
          StreamDatos.writeObject(tienda);
             
        
        return true;
    }

    public static ArrayList<Mascotas> readAllItems(ArrayList<Mascotas> tienda) throws FileNotFoundException, IOException, ClassNotFoundException
    {
         
          
          
          FileInputStream fichero= new FileInputStream(nombre_archivo);
          ObjectInputStream StreamDatos = new ObjectInputStream(fichero);
          
          ArrayList<Mascotas> leer = (ArrayList < Mascotas >) StreamDatos.readObject();
          
        return leer;
    }

    
}
