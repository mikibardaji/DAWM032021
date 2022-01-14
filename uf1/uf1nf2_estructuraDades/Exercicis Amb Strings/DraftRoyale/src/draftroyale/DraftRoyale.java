/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package draftroyale;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class DraftRoyale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] todas_cartas = new String[20];
        String[] mazo = new String[8];
        inicializarMazoBlanco(mazo); //para que las posiciones no esten a null
        int posicion;
        int cartas_tengo = 0;
        cargar_cartas(todas_cartas);
        mostrar_cartas(todas_cartas); //mostrar array adaptado
        System.out.println("--------------------------------------");
        for(cartas_tengo=0;cartas_tengo<8;cartas_tengo++)
                {
                    //posicion = eleccionEntre2Cartas(todas_cartas); //version1
                    posicion = eleccionEntreCartas2Ampliacion(todas_cartas,mazo); //version
                    mazo[cartas_tengo] = todas_cartas[posicion];
                    mostrar_cartas(mazo);
                }
        //mostrar cartas aleatorias y elegir posicion
        System.out.println("Tu mazo");
         mostrar_cartas(mazo);
    }

    private static void cargar_cartas(String[] todas_cartas) {
        todas_cartas[0] = "El Tronco";
        todas_cartas[1] = "Ejército de esqueletos";
        todas_cartas[2] = "Barril de duendes";
        todas_cartas[3] = "Valquiria";
        todas_cartas[4] = "Megacaballero";
        todas_cartas[5] = "Mini P.E.K.K.A.";
        todas_cartas[6] = "Bebé dragón";
        todas_cartas[7] = "Descarga";
        todas_cartas[8] = "Bruja";
        todas_cartas[9] = "Mago eléctrico";
        todas_cartas[10] = "Montapuercos";
        todas_cartas[11] = "Mago";
        todas_cartas[12] = "Mosquetera";
        todas_cartas[13] = "Princesa";
        todas_cartas[14] = "Caballero";
        todas_cartas[15] = "Mini P.E.K.K.A.";
        todas_cartas[16] = "Dragón infernal";
        todas_cartas[17] = "Murciélagos";
        todas_cartas[18] = "Globo bombástico";
        todas_cartas[19] = "P.E.K.K.A.";
       
        
    }

    private static void mostrar_cartas(String[] todas_cartas) {
        for (int i = 0; i < todas_cartas.length; i++) {
            System.out.println(todas_cartas[i]);
        }
    }

    private static int eleccionEntre2Cartas(String[] todas_cartas) {
        Random rd = new Random();
        Scanner teclado = new Scanner(System.in);
        int carta1,carta2;
        do{
        carta1 = rd.nextInt(20);
        carta2 = rd.nextInt(20);
        }while(carta1==carta2); //por si es el mismo numero 
        
        
        int eleccion;
        System.out.println((carta1+1) + "-" + todas_cartas[carta1] + " o " + (carta2+1) + "-" + todas_cartas[carta2]);
        System.out.println("Que carta eliges");
        eleccion = teclado.nextInt();
        eleccion = eleccion-1;
        return eleccion;
        
    }
    
    
    
        private static int eleccionEntreCartas2Ampliacion(String[] todas_cartas, String[] mazo) {
        Random rd = new Random();
        Scanner teclado = new Scanner(System.in);
        int carta1,carta2;
        do{
        carta1 = rd.nextInt(20);
        carta2 = rd.nextInt(20);
        }while(carta1==carta2 || existeEnTumazo(carta1,carta2,todas_cartas,mazo)); //por si es el mismo numero 
        int eleccion;
        System.out.println(carta1 + "-" + todas_cartas[carta1] + " o " + carta2 + "-" + todas_cartas[carta2]);
        System.out.println("Que carta eliges");
        eleccion = teclado.nextInt();
        return eleccion;
        
    }

    private static boolean existeEnTumazo(int carta1, int carta2, String[] todas_cartas, String[] mazo) {
        for (int i = 0; i < mazo.length; i++) {
            
            //por eso al principio del main inicializao mazo a punts
            //por que si esta a null alguna posicion daria nullpointerexception
            if(mazo[i].equalsIgnoreCase(todas_cartas[carta1]))
            {
                return true;
            }
            if(mazo[i].equalsIgnoreCase(todas_cartas[carta2]))
            {
                return true;
            }
        }
        return false;
    }
    
    /** 
     * funcion pone el mazo, en lugar de todo a null, que se pone por defecto
     * se pone a puntos, para no tener los null
     * @param mazo 
     */

    private static void inicializarMazoBlanco(String[] mazo) {
        for (int i = 0; i < mazo.length; i++) {
            mazo[i] = "."; //per eliminar nulls
        }
    }
    
}
