/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiendaanimales;

import Objetos.Canario;
import Objetos.Loro;
import Objetos.Perro;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class TiendaAnimales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Inventario tienda = new Inventario();
        
        loadAnimales(tienda);
        int opcion;
        do{
        opcion = menu();
        switch(opcion)
        {
            case 1:
                System.out.println("opcion aun no implementada");
                break;
            case 2:
                System.out.println("opcion aun no implementada");
                break;    
            case 3:
                mostrarDatosAnimales(tienda);
                break;
            case 4:
                InsertarAnimal(tienda);
                break;
            case 6:
                EliminarAnimales(tienda);
                break;
            case 0:
                System.out.println("saliendo");
                break;
            default:
                System.out.println("opcion no implementada");
                break;
        }
        } while(opcion!=0);
    }

    private static void loadAnimales(Inventario tienda) {
        System.out.println("Cargando animales de muestra....");
        tienda.InsertarAnimal(new Perro("Carlos", 10, true, 2000, "Bulldog", true));
        tienda.InsertarAnimal(new Perro("Paco", 20, true, 2020, "Bichon Maltes", false));
        tienda.InsertarAnimal(new Loro("Nicolas", 20, true, 2010, 5, true, "Brasil", true));
        tienda.InsertarAnimal(new Canario("Juan Carlos III", 80, true, 1942, 100, false, "multicolor", false));
    }

    private static int menu() {
        System.out.println("1 Mostrar la lista de animales (solo tipo y nombre, 1 línea por animal).\n" +
"2 Mostrar todos los datos de un animal concreto.\n" +
"3 Mostrar todos los datos de todos los animales.\n" +
"4 Insertar animales en el inventario.\n" +
"5 Eliminar animales del inventario.\n" +
"6 Vaciar el inventario\n 0 Salir");
        
        
        System.out.print("Escoge opcion: ");
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        return opcion;
        
    }

    private static void mostrarDatosAnimales(Inventario tienda) {
        tienda.MostrarListaAnimales();
    }

    private static void EliminarAnimales(Inventario tienda) {
        tienda.VaciarInventario();
    }

    private static void InsertarAnimal(Inventario tienda) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre animal");
        String nombre = sc.nextLine();
        System.out.println("edad animal");
        int edad = sc.nextInt();
        System.out.println("anyo nacimiento animal");
        int anyo = sc.nextInt();
        boolean vivo = true;
        sc.nextLine(); //limpio buffer porque vengo de un nextint()
        System.out.println("Que tipo de animal es");
        String tipo = sc.nextLine();
        tipo = tipo.toUpperCase();//paso a maysucula
        Perro dog;
        Canario canary;
        switch(tipo)
        {
            case "PERRO":
                 System.out.println("Que raza de perro  es");
                String raza = sc.nextLine();
                boolean pulgas = false;
                dog = new Perro(nombre, edad, vivo, anyo, raza, pulgas);
                tienda.InsertarAnimal(dog);
                break;
            case "CANARIO":
                System.out.println("Que color es el canario");
                String color = sc.nextLine();
                boolean canta = true;
                boolean vuela = true;
                int pico = 5;
                canary = new Canario(nombre, edad, canta, anyo, pico, vuela, color, canta);
                tienda.InsertarAnimal(canary);
                break;
        }
        
        
        
    }
    
        
    
}
