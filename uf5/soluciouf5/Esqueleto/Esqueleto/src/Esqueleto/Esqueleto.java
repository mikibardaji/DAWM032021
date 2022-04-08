/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Esqueleto;


import DAO.CollectionDAO;
import Exceptions.LimitAnimalException;
import Objetos.Specie;
import Utilities.Menu;
import Utilities.Option;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.LimitExceededException;

/**
 *
 * @author alumne
 */
public class Esqueleto {
     /*pots afegir atributs falta codigo SEGURO*/
    private CollectionDAO lista;
    private Menu menu_principal;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*falta codigo SEGURO*/
        Esqueleto app = new Esqueleto();
        app.run();
        
        
    }

    private void run() {

        lista = new CollectionDAO();
        menu_principal = new Menu("Listado de Especies");
        añadir_opciones(menu_principal);
        
        menu_principal.showMenu();
        
        
        System.out.println("=============");
        loadObjects();
        int opcion;
        do{
        opcion = menu_principal.choose("Select option: ");
        switch(opcion)
        {
            case 1:
                displayList();
                break;
            case 2:
                addSpecie();
                break;    
            case 3:
                removeSpecie(/*podria faltar variables o no*/);                
                break;
            case 4:
                updateAnimal(/*podria faltar variables o no*/);
                System.out.println("opcion aun no implementada");
                break;
            case 5:
                displayListLess5();
               
                break;
            case 6:
                //todo
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
    
    
    /* Cargar objetos de muestra*/
    private void loadObjects(/*falta codigo SEGURO*/) {
        System.out.println("Cargando items dede muestra....");
        try{
            lista.AfegirObjecte(new Specie("Perro", "Canis", 8));
            lista.AfegirObjecte(new Specie("Gato", "Felino", 3));
            lista.AfegirObjecte(new Specie("Cocodrilo", "Cocordilus", 5));
        }
        catch(LimitExceededException  | LimitAnimalException ex){
            System.out.println(ex.getMessage());
        } 
        
    }



    private  void displayList() {
        //TODO
        ArrayList<Specie> animals = lista.getCollectionInventada();
        for (Specie specie : animals) {
            System.out.println(specie.toString());
        }
        System.out.println("itens mostrados" + animals.size());
    }

    private  void addSpecie() {
       //TODO
       String name = AskStringData("Introduce nombre de la especie");
       String scientificName = AskStringData("introduce nombre científico");
       int numIndividual = AskIntData("Numero de animales de la especie");
       
       try{
           Specie addSpecie = new Specie(name, scientificName, numIndividual);
        
               if (lista.AfegirObjecte(addSpecie)) {
               System.out.println("Elemento " + addSpecie.toString() + " Añadido correctamente");
               System.out.println("Elementos de la lista: " + lista.getNum_animal());
                }
           else
                {
                    System.out.println("animal duplicado no lo añado");
                }
          
       }catch(LimitExceededException | LimitAnimalException e){
           System.out.println(e.getMessage());
       }
       
    }

    private  void removeSpecie() {
        //TODO 
        String name = AskStringData("Introduce el nombre cientifico de la especie a eliminar");
        Specie del_animal = new Specie(name);
        if (lista.EsborrarObjecte(del_animal)) {
            System.out.println("Eliminado con exito");
        }else{
            System.out.println("El elemento no existe, no se ha eliminado");
        }
    }

    private  void displayListLess5() {
        ArrayList<Specie> menos_5 = lista.shortList();
        
        //mostrar
        for (Specie animal : menos_5) {
            System.out.println(animal); //toString
        }
        System.out.println("items " + menos_5.size());
        
    }
    
    private  void updateAnimal() {
        //TODO 
        String scientific_name = AskStringData("Introduce el nombre cientifico");
        int num_individual = AskIntData("Introduce el numero a modificar");
        
        Specie old = new Specie(scientific_name);
        //old.setNumIndividuals(num_individual);
        
        try {
            if (lista.modificarEspecie(old, num_individual) != null) {
                System.out.println("Elemento modificado");
            }else{
                System.out.println("Elemento no modificado");
            }
            
        } catch (LimitExceededException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    /* añadir opciones del menú*/
    private void añadir_opciones(Menu menu_principal) {

        menu_principal.add(new Option("Salir \n"));
        menu_principal.add(new Option("Listar todas las especies \n"));
        menu_principal.add(new Option("Añadir especie \n"));
        menu_principal.add(new Option("Eliminar una especie \n"));
        menu_principal.add(new Option("Modificar número individual de especie \n"));
        menu_principal.add(new Option("Mostrar lista reducida de especies \n"));
    }
    
    public static int AskIntData(String phrase){
        Scanner sc = new Scanner(System.in);
        int option;
        System.out.println(phrase);
        option = sc.nextInt();
        return option;
    }
    
      public static String AskStringData(String phrase){
        Scanner sc = new Scanner(System.in);
        String option;
        System.out.println(phrase);
        option = sc.nextLine();
        return option;
    }


    
        
    
}

