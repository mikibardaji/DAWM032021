/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ahorcado;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ahorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String palabra_oculta;
        int intentos = 7;
        palabra_oculta = pedirPalabra("Pon la palabra a buscar");
        
        char[] palabra_guiones = new char[palabra_oculta.length()];
        
        //funcion para inicializar todo a guiones palabra_guiones
        inicializarGuiones(palabra_guiones);
        
        do{
        //funcion que seria mostrar palabra_guiones (en ese momento tiene guiones) --> ImprimirGuiones
        mostrarPalabraGuiones(palabra_guiones, intentos);
        //Pedir Letra a Buscar
        char letra = PedirLetraBuscar();
        
        //Buscar la letra en el string, si esta, la copia en el aaray de char palabra_guiones 
        //y devuelvo true al final de recorrer toda la palabra
        boolean existeLetra = buscarLetraEnPalabra(palabra_oculta,letra,palabra_guiones);
        
        if (!existeLetra)
        {
            intentos--; //me queda un intento menos
            dibujar(intentos);
        }
        //Si he devuelto false resto un intento
        
        }while(!(heGanado(palabra_guiones) || intentos <=0));
        
        if (intentos>0)
        {
            System.out.println("Felicidades");
        }
        else
        {
            System.out.println("perdiste");
        }
        //}while(heGanado(palabra_guiones)==false && intentos >0);
        //mostrar ImprimirGuiones
        //comprobarsiheganado que es comprobar si existe algun - o no (True/False)
    }
    
    private static String pedirPalabra(String frase) {
        Scanner sc = new Scanner(System.in);
        String datos;  
        System.out.println(frase);
        datos = sc.nextLine();
        datos = datos.toLowerCase();
        //100 lineas en blanco
        for (int i = 0; i < 50; i++) {
            System.out.println("");
            
        }
        return datos;
    }

    /** poner todo el array a '-' (guiones)*/
    private static void inicializarGuiones(char[] palabra_guiones) {
        for (int i = 0; i < palabra_guiones.length; i++) {
            palabra_guiones[i] = '-';
        }
        
    }

    private static void mostrarPalabraGuiones(char[] palabra_guiones, int intentos) {
        for (int i = 0; i < palabra_guiones.length; i++) {
            System.out.print(palabra_guiones[i]);
        }
        System.out.println("");
        System.out.println("Te quedan " + intentos + " intentos ");
    }

    private static char PedirLetraBuscar() {
        char letra;
        Scanner teclat = new Scanner(System.in);
        System.out.print("Que letra quieres? ");
        letra = teclat.nextLine().toLowerCase().charAt(0);
        
        return letra;
    }

    private static boolean buscarLetraEnPalabra(String palabra_oculta, char letra, char[] palabra_guiones) {
        boolean encontrado = false;
        for (int index = 0; index < palabra_oculta.length(); index++) {
            if (palabra_oculta.charAt(index)==letra)
            {
                palabra_guiones[index] = letra; //asigo letra a la posicion que toca, elimino el guion
                //return true;//no hago return porque sino a la primera coincidencia 
                //para de buscar yu me interesa que busque en toda la palabra por si hay mas
                encontrado = true;
            }
            
        }
        return encontrado;
        
        
    }
    
    private static void dibujar(int i) {
        switch (i) {
            case 6:
                System.out.println(" ---------------------");
                for (int j = 0; j <= 15; j++) {
                    System.out.println(" |");
 
                }
                System.out.println("__________");
                break;
 
            case 5:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                for (int j = 0; j <= 10; j++) {
                    System.out.println(" |");
 
                }
                System.out.println("__________");
                break;
 
            case 4:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
                for (int j = 0; j <= 5; j++) {
                    System.out.println(" |");
 
                }
                System.out.println("__________");
                break;
 
            case 3:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                   / |   ");
                System.out.println(" |                 /   |   ");
                System.out.println(" |                /    |   ");
                System.out.println(" |                     |   ");
                for (int j = 0; j <= 5; j++) {
                    System.out.println(" |");
 
                }
                System.out.println("__________");
                break;
 
            case 2:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                   / | \\ ");
                System.out.println(" |                  /  |   \\ ");
                System.out.println(" |                 /   |     \\ ");
                System.out.println(" |                     |   ");
                for (int j = 0; j <= 5; j++) {
                    System.out.println(" |");
 
                }
                System.out.println("__________");
                break;
 
            case 1:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                   / | \\ ");
                System.out.println(" |                  /  |   \\ ");
                System.out.println(" |                 /   |     \\ ");
                System.out.println(" |                     |   ");
                System.out.println(" |                    /  ");
                System.out.println(" |                   /      ");
                System.out.println(" |                  /       ");
                for (int j = 0; j <= 2; j++) {
                    System.out.println(" |");
 
                }
                System.out.println("__________");
                break;
 
            case 0:
               System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | X  X  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                   / | \\ ");
                System.out.println(" |                  /  |   \\ ");
                System.out.println(" |                 /   |     \\ ");
                System.out.println(" |                     |   ");
                System.out.println(" |                    / \\");
                System.out.println(" |                   /   \\  ");
                System.out.println(" |                  /     \\ ");
                for (int j = 0; j <= 2; j++) {
                    System.out.println(" |");
 
                }
                System.out.println("__________");
                System.out.println("GAME OVER");
                break;
        }
    }

    private static boolean heGanado(char[] palabra_guiones) {
//        boolean ganado = true;
//        for (int index = 0; index < palabra_guiones.length; index++) {
//            if (palabra_guiones[index]=='-')
//            {
//                
//                ganado = false;
//            }
//            
//        }
//        return ganado;   
      
        for (int index = 0; index < palabra_guiones.length; index++) {
            if (palabra_guiones[index]=='-')
            { 
                return false;
            }
            
        }
        return true;
        
        //String palabra = String.copyValueOf(palabra_guiones);
    }
    
    

}
