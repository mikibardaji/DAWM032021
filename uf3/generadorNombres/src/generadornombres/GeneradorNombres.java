/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generadornombres;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumne
 */
public class GeneradorNombres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<String> apellidos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        File lectura = new File("usa_nombres.txt");
        File lectura2 = new File("usa_apellidos.txt");
        File escritura = new File("usa_inventados.txt");
        System.out.println(lectura.getAbsolutePath());
        
        
        Random rd = new Random();
        
        try {
            nombres = leer_fichero_datos(lectura);
        
            apellidos = leer_fichero_datos(lectura2);
            System.out.println("Cuantos nombres quieres generar?");

            int num = sc.nextInt();

            for (int i = 0; i < num; i++) 
            {
                int pos_n = rd.nextInt(nombres.size()); //nombre aleatorio
                int pos_a = rd.nextInt(apellidos.size());
                escribirNombreInventado(nombres.get(pos_n), apellidos.get(pos_a), escritura);
                System.out.println("He escrito" + (i+1) + "nombres");
            }
        } catch (FileNotFoundException ex) {
            System.out.println("fichero entrada  " + ex.getMessage());
        }
        
        System.out.println("saliendo del programa");
    }

    private static ArrayList<String> leer_fichero_datos(File lectura) throws FileNotFoundException {
        ArrayList guardar =  new ArrayList<>();

            Scanner lector = new Scanner(lectura);
            while(lector.hasNextLine()) /*recorrro fichero y guardo*/
            {
                String palabra = lector.nextLine();
                guardar.add(palabra);
            }
            lector.close();
       
        return guardar;
    }

    private static void escribirNombreInventado(String nombre, String apellido, File fichero) {
        try {
            FileWriter escritura = new FileWriter(fichero,true);
            escritura.write(nombre + "-" + apellido + "\n");
            escritura.close();
        } catch (IOException ex) {
            Logger.getLogger(GeneradorNombres.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
