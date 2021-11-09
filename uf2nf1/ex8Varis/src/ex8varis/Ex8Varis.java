/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex8varis;

/**
 *
 * @author alumne
 */
public class Ex8Varis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero_maximo=20;
        int resultado = suma1aN(numero_maximo);
        System.out.println("La suma de todos los numeros es " + resultado);
        resultado = producte1aN(numero_maximo);
        System.out.println("El producto de todos los numeros es " + resultado);
        double medio = intermedio1aN(numero_maximo);
        System.out.println("LA mitad es  " + medio);
    }
    
    public static int suma1aN(int n)
    {
        int acum=0;
        for (int i = 1; i <= n; i++) {
            acum = acum + i;
        }
        return acum;
    }

    public static int producte1aN(int numero_maximo) {
        int acum=1;
        for (int i = 1; i <= numero_maximo; i++) {
            acum = acum * i;
        }
        return acum;
    }

    public static double intermedio1aN(int numero_maximo) {
        double mitad = (1+numero_maximo)/2;
        return mitad;
    }
}
