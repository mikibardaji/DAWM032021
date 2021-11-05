/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadorasumaresta;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class CalculadoraSumaResta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1,valor2;
        double resultado=0; //operacion 
        int opcion;
        
        mostrarFraseValor(1);
        valor1=introducirPositivo(sc);
        
        mostrarFraseValor(2);
        valor2 = introducirPositivo(sc);
        
        mostrarMenu();
        
        opcion = validarOpcion(sc);
        
        resultado=hacerCalculoCalculadora(opcion,valor1,valor2);
        
        
        System.out.println("El resultado de la operación elegida es " + resultado);
        
    }

    public static int calcularSuma(int valor1, int valor2) {
        int calc = valor1+valor2;
        return calc;
    }

    private static int calcularResta(int valor1, int valor2) {
        int calc = valor1-valor2;
        return calc;
    }

    public static int calcularMulti(int valor1, int valor2) {
          int calc = valor1*valor2;
        return calc;
    }

    public static double calcularDivision(int valor1, int valor2) {
         double calc = (double) valor1/valor2;
        return calc;
    }

    /**
     * te muestra el menu de la calculadora
     */
    public static void mostrarMenu() {
        System.out.println("1.- Calcular suma");
        System.out.println("2.- Calcular resta");
        System.out.println("3.- Calcular multiplicación");
        System.out.println("4.- Calcular división"); 
    }

    /**
     * pedirte la opción de la calculadora y solo te aceptara
     * del 1 al 4, sino volvera a pedir el 
     * @return 
     */
    /*private static int validarOpcion() {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do{  
            System.out.print("Pon opcion menu(1-4): ");
            opcion = sc.nextInt();
            if(opcion <1 || opcion>4)
                {
                    System.out.println("opción incorrecta");
                    System.out.println("*****************");
                    mostrarMenu();
                }
        }while(opcion <1 || opcion>4);
        //Salir opcion >=1 && opcion<=4
        return opcion;
    }*/
    private static int validarOpcion(Scanner sc) {
        int opcion;
        do{  
            System.out.print("Pon opcion menu(1-4): ");
            opcion = sc.nextInt();
            if(opcion <1 || opcion>4)
                {
                    System.out.println("opción incorrecta");
                    System.out.println("*****************");
                    mostrarMenu();
                }
        }while(opcion <1 || opcion>4); //Salir opcion >=1 && opcion<=4
        return opcion;
    }

    /**
     * funcion introducirPositivo
     * Devuelve un entero solo cuando es mayor que 0
     * sino vuelve a pedir que introduzcan datos
     * 
     */
    public static int introducirPositivo(Scanner sc) {
            int valor;
            do
            {
                System.out.println("Introduce un valor positivo");
                valor = sc.nextInt();
                if(valor<=0)
                {
                    System.out.println("Burro el numero " + valor + " no es positivo ");
                }
            }while(valor<=0); //si es negativo o 0 volvere apedir
            
            
            
            return valor;
    }

    private static void mostrarFraseValor(int i) {
        System.out.println("Valor "+ i);
    }

    /**
     * realiza el calculo indicado en la variable opcion con los valores pasados
     * @param opcion 1 es suma,2 es resta, 3 multiplicacion, 4 division
     * @param valor1 primer valor del calculo
     * @param valor2 segundo valor
     * @return el resultado de realizar la operacion indicada en la variable opción
     */
    
    private static double hacerCalculoCalculadora(int opcion, int valor1, int valor2) {
        double resultado=0;
        if (opcion==1)
        {
            resultado = calcularSuma(valor1,valor2);
        }
        else if(opcion==2)
        {
            resultado = calcularResta(valor1, valor2);
        }
        else if(opcion==3)
        {
            resultado = calcularMulti(valor1, valor2);
        } 
        else if(opcion==4)
        {
            resultado = calcularDivision(valor1, valor2);
        } 
        return resultado;
    }
    
    
    
}
