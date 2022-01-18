/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alexa;

import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Alexa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            String alexa_instruccion, nom, instruccion;
            //Pedir tu nombre y guardarlo(String)
            boolean salir=false;
            nom = alexaPideAlgo("Como te llamas? ");
            //Pedir la instrucción (String)
            do{
            alexa_instruccion = alexaPideAlgo("Dime la instruccion que quieres: ");
            
            //Pasarlo todo a mayusculas (Alexa e instruccion)
            alexa_instruccion = alexa_instruccion.toUpperCase();
            //Validar que empiece por alexa (StartWith)
           // boolean valida = validarInstruccion(alexa_instruccion);
            
            if(validarInstruccion(alexa_instruccion))
            {
                //recorto y me quedo con la instruccion
                instruccion = alexa_instruccion.substring(6);
                salir=instrucciones_menu(instruccion,nom);
            }
            else
            {
                System.out.println("No has dicho ALEXA!");
            }
            
            }while(salir==false);
            //}while(!salir);
            //en el caso que no termine porgrama o que en un bucle vuelva a esperar instrucción
            //en el caso que si REcortar string para eliminar "Alexa " (String instruccion)
            

            //si (if o swithc) instruccion es "Buenos dias" llamar a funcion_buenos_dias
            //si (if o swithc) instruccion es "Buenos noches" funcion buenas_noches y activar para terminar
            
    }

    private static String alexaPideAlgo(String frase) {
        Scanner sc = new Scanner(System.in);
            System.out.print(frase);
            String accion = sc.nextLine();
            return accion;
    }

    /**
     * funcion que devuelve true si empieza por alexa  por tanto es valido
     * @param alexa_instruccion
     * @return 
     */
    private static boolean validarInstruccion(String alexa_instruccion) {
            return alexa_instruccion.startsWith("ALEXA ");
    }

    /** a par
     * Funcion que haras todas las funcionalidades de Alexa
     * @param instruccion La función que queremos uqe ejecute alexa
     * @param nom nombre del usuario que ejecuta el programa 
     * @return true si debo salir de alexa /false si aun no tengo que salir
     */
    private static boolean instrucciones_menu(String instruccion, String nom) {
        System.out.println("instruccion " + instruccion);
        boolean salir = false;
        if (instruccion.equalsIgnoreCase("Buenas noches")) //
        {
            System.out.println("Buenas noches " + nom);
            salir=true; //para que termine
        }
        else if (instruccion.equalsIgnoreCase("Buenos dias"))
        {
            System.out.println("Buenos dias " + nom);
          //  salir=false;
        }
        else if (instruccion.equalsIgnoreCase("Canta una cancion"))
        {
           cantaCancion();
        }
        else if (instruccion.equalsIgnoreCase("Tablas de multiplicar"))
        {
           tablasMultiplicar();
        }
        else if (instruccion.equalsIgnoreCase("Dime mi edad"))
        {
           calcularEdad();
        }
        else if (instruccion.startsWith("HABLA CON LA ")) //PORQUE TENEMOS LA INSTRUCCION EN MAYYS
        {
            char letra = instruccion.charAt(13);
            //System.out.println("la letra es " + letra);
            String frase = instruccion.substring(20);
            //System.out.println("frase-->" + frase);
            frase = frase.replace('A', letra);
            frase = frase.replace('E', letra);
            frase = frase.replace('I', letra);
            frase = frase.replace('O', letra);
            frase = frase.replace('U', letra);
            System.out.println("-->" + frase);
        }
        else //instruccion no reconocida
        {
            //saber si es habla con o instruccions
           
            
            
            
            System.out.println("Leete el manual de Alexa, porque no has dicho nada");
           // salir=false;
        }
        
        return salir;
    }

    /**
     * va a cantar la canción de los elefantes del 2 al 10
     * Dos elefantes se balanceaban
Sobre la tela de una araña, como veía que resistía, fueron a llamar otro elefante
     */
    private static void cantaCancion() {
        String numero_texto;
        for (int i = 2; i <= 10; i++) {
            numero_texto=conviertoNumeroTexto(i);
            System.out.println( numero_texto + " elefantes se balanceaban  " +
"Sobre la tela de una araña, como veía que resistía, fueron a llamar otro elefante");
        }
    }

    private static String conviertoNumeroTexto(int i) {
        switch (i) {
            case 2:
                return "Dos";
            case 3:
                return "Tres";    
            default:
                return "Nada";
        }

    }

    private static void calcularEdad() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Año en que naciste: ");
        int birth_year = sc.nextInt();
        
        Calendar cal= Calendar.getInstance();
        int current_year= cal.get(Calendar.YEAR);

        System.out.println("Tu edad es " + (current_year-birth_year));
    }

    private static void tablasMultiplicar() {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int num1 = rd.nextInt(10)+1;
        int num2 = rd.nextInt(10)+1;
        int resul;
        System.out.println("Cuanto es " + (num1) + " x " + num2);
        long inicio = System.currentTimeMillis(); /*temps en ms*/

        resul = sc.nextInt();
        long fin = System.currentTimeMillis(); /*temps en ms*/
        int segundos = (int) (fin - inicio) / 1000;
        
        if (resul == (num1*num2) && segundos < 5)
        {
            System.out.println("perfecto");
        }
        else
        {
            System.out.println("Vuelve a primaria");
        }
    }
    
}
