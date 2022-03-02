/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package planetario;

import Objetos.Astros;
import Objetos.Planetas;
import Objetos.Satelites;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Planetario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Astros> planetario = new ArrayList<Astros>();

        rellenar_planetario(planetario);
        int opcion;
        do{
            opcion=menu();
            switch(opcion){
                case 1:
                    buscarIndice(planetario);
                    break;
                case 2:
                    buscarNombreObjeto(planetario);
                    break;
                case 0:
                    System.out.println("saliendo....");
                    break;    
                default:
                    System.out.println("opcion no valida");
            }
            
        }while(opcion!=0);
    }

    private static void rellenar_planetario(ArrayList<Astros> planetario) {
        Planetas p1 = new Planetas(1000, 100, true, "Jupiter", 5, 50000);
        Planetas p2 = new Planetas(2000, 200, true, "Tierra", 7, 100000);
        Satelites s1 = new Satelites(10, 3, "Jupiter", "satelite1Jupiter", 1, 1);
        Satelites s2 = new Satelites(20, 6, "Jupiter", "satelite2Jupiter", 1, 1);
        Satelites s3 = new Satelites(30, 9, "Tierra", "satelite1Tierra", 1, 1);
        
        planetario.add(p1);
        planetario.add(s1);
        planetario.add(s2);
        planetario.add(p2);
        planetario.add(s3);
        System.out.println("Planetas cargados... ");
    }

    private static int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.- Mostrar por indice");
        System.out.println("2.- Mostrar por nombre");
        System.out.println("0.- Salir");
        System.out.print("Popn opcion: ");
        int opcion = sc.nextInt();
        return opcion;
    }

    private static void buscarIndice(ArrayList<Astros> planetario) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que astros quieres ver , pon su indice");
        int num = sc.nextInt()-1;
        System.out.println(planetario.get(num).toString());
    }

    private static void buscarNombre(ArrayList<Astros> planetario) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que astros quieres ver , pon su nombre");
        //sc.nextLine(); //limpiar buffer
        String nombre_buscado = sc.nextLine();
        boolean encontrado=false;
        //satelite1Jupiter
        for (int i = 0; i < planetario.size(); i++) {
//            System.out.println("->" + planetario.get(i).getNombre());
            if(planetario.get(i).getNombre().equalsIgnoreCase(nombre_buscado))
            {
                System.out.println("He encontrado el astro");
                System.out.println(planetario.get(i).toString());
                encontrado = true;
            }
            
        }
        
        if (!encontrado)
        {
            System.out.println("El astro" + nombre_buscado + " no lo tienes");
        }
        
    }
    
    private static void buscarNombreObjeto(ArrayList<Astros> planetario) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que astros quieres ver , pon su nombre");

        String nombre_buscado = sc.nextLine();
//        System.out.println("Es Planeta o Satelite");
//        String planeta_satelite = sc.nextLine();
        Astros buscado;
        //buscado = new Astros(nombre_buscado,0,0);
        buscado = new Astros(nombre_buscado);
//        if (planeta_satelite.equalsIgnoreCase("Planeta"))
//        {
//            //buscado = new Planetas(0,0,true,nombre_buscado, 0, 0);
//            buscado = new Planetas(nombre_buscado);
//        }
//        else
//        {
//            //buscado = new Satelites(0,0,"planetaquepertenece",nombre_buscado, 0, 0);
//            buscado = new Planetas(nombre_buscado);
//        }
       
        int posicion = planetario.indexOf(buscado);
        if (posicion==-1)
        {
            System.out.println("El astro" + nombre_buscado + " no lo tienes");
        }
        else
        {
            System.out.println(planetario.get(posicion).toString());
        }

    }
    
    
    
    
    
    
    
}

