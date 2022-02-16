/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayvsarraylist;

import Objetos.PuntoCoordenadas;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ArrayVSArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] lista = new int[100];
        /* array normal pero con objetos en cada posicion*/
        PuntoCoordenadas[] lista_coordenadas = new PuntoCoordenadas[10];
        
        
        //metodos_array_normal(lista_coordenadas);
        //objecte arrayList es un array per contenir objectes
        ArrayList<PuntoCoordenadas> lista_coor_arrayList = new ArrayList<>();
        //ArrayList<Integer> listaEnteros = new ArrayList<> ();
        
        PuntoCoordenadas c = new PuntoCoordenadas(3,3);
        PuntoCoordenadas d = new PuntoCoordenadas(4,3);
        PuntoCoordenadas e = new PuntoCoordenadas(5,3);
        System.out.println("añado el punto c");
        lista_coor_arrayList.add(c);
        System.out.println("añado el punto d");
        lista_coor_arrayList.add(d);
        
        System.out.println("El arrayList tiene " + lista_coor_arrayList.size() + " objetos") ;
        System.out.println("todas las coordenadas " + lista_coor_arrayList.get(0).todasCoordenadas());
        System.out.println("todas las coordenadas " + lista_coor_arrayList.get(1).todasCoordenadas());
        
        listarArray(lista_coor_arrayList);
        
        lista_coor_arrayList.add(e);
        System.out.println("vuelvo a imprimir array");
        listarArray(lista_coor_arrayList);
        
        //voy a añadir mas puntos al arrayList
        PuntoCoordenadas anyadir;
        for (int i = 0; i < 3; i++) {
            anyadir = PedirDatosCoordenadas();
            lista_coor_arrayList.add(anyadir);
        }
        
        listarArray(lista_coor_arrayList);
        System.out.println("Dime que posicion quieres borrar");
        Scanner sc = new Scanner(System.in);
        int posicion = sc.nextInt();
        PuntoCoordenadas borrar = lista_coor_arrayList.remove(posicion);
        System.out.println("despues de borrar me queda asi el arrayList");
        listarArray(lista_coor_arrayList);
        System.out.println("El objeto que has borrado era" + borrar.todasCoordenadas());
                
        lista_coor_arrayList.add(0, borrar);
        listarArray(lista_coor_arrayList);
    }

    /**
     * recorrera todo el array y en cada posicion hare una 
     * llamada al constructor (new) de esta forma 
     * cada posición dejara de ser null y tendra la opsición
     * de memoria
     * @param lista_coordenadas 
     */
    private static void inicializarArray(PuntoCoordenadas[] lista_coordenadas) {
        int valor_x = 5;
        for (int i = 0; i < lista_coordenadas.length; i++) 
        {
            if (i%2==0) //posición par del array
            {
             lista_coordenadas[i] = new PuntoCoordenadas(valor_x, i);   
            }
            else //posición impar del array
            {
               lista_coordenadas[i] = new PuntoCoordenadas(valor_x);
            }
            
        }
        System.out.println("terminado inicialización");
    }

    private static void metodos_array_normal(PuntoCoordenadas[] lista_coordenadas) {
        inicializarArray(lista_coordenadas);
        
        
        for (int i = 0; i < lista_coordenadas.length; i++) {
            System.out.println(lista_coordenadas[i].getX() + "-" + 
                    lista_coordenadas[i].getY());
        }

    }

    private static void listarArray(ArrayList<PuntoCoordenadas> lista_coor_arrayList) {
         for (int i = 0; i < lista_coor_arrayList.size(); i++) {
            System.out.println("FOR coordenadas " + lista_coor_arrayList.get(i).todasCoordenadas());
        }
    }


    /**
     * va a pedir los datos de los dos atributos (x,y) va a crear un objeto
     * con el constructor y va a devolver este objeto
     * @return PuntoCorrdenadas a añadir
     */
    
    
    
    private static PuntoCoordenadas PedirDatosCoordenadas() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon el valor de x");
        int x = sc.nextInt();
        System.out.println("Pon el valor de y");
        int y = sc.nextInt();
        PuntoCoordenadas aux = new PuntoCoordenadas(x, y);
        return aux;
    }
    
}
