/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex10alumnes;

import java.util.Scanner;

/**
 * Crea un programa para realizar cálculos relacionados con la altura (en
 * metros) de personas. Pedirá un valor N y luego almacenará en un array N
 * alturas introducidas por teclado. Luego mostrará la altura media, máxima y
 * mínima así como cuántas personas miden por encima y por debajo de la media
 *
 * @author alumne
 */
public class Ex10Alumnes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n_Alumnos, contador;
        System.out.println("Quants alumnes tens?");
        n_Alumnos = sc.nextInt();

        double[] altura_alumnos = new double[n_Alumnos];

        introducirDatos(altura_alumnos, sc);
        mostrarArray(altura_alumnos);
        //EncontrarMediaAltura
        double media_altura = encontrar_media(altura_alumnos);
        System.out.println("la media es: " + media_altura);
        double maximo = EncontrarMaximoAltura(altura_alumnos);
        System.out.println("la altura maxima és = " + maximo);
        
        //EncontrarNumeroAlumnosSuperenMedia
        contador = SuperanMedia(media_altura, altura_alumnos);
        System.out.println("Los alumnos que superan le media son: " + contador);
    }

    /**
     * pido alturas que guardare en el array altura_alumons
     *
     * @param altura_alumnos
     * @param teclado
     */
    private static void introducirDatos(double[] altura_alumnos, Scanner teclado) {

        for (int i = 0; i < altura_alumnos.length; i++) {
            System.out.println("Pon altura del alumno" + (i + 1));
            altura_alumnos[i] = teclado.nextDouble();
        }

    }

    private static void mostrarArray(double[] altura_alumnos) {
        for (int i = 0; i < altura_alumnos.length; i++) {
            System.out.println(" altura del alumno" + (i + 1) + "=" + altura_alumnos[i]);

        }
    }

    public static double encontrar_media(double[] altura_alumnos) {
        double media = 0;
        for (int i = 0; i < altura_alumnos.length; i++) {
            media = (media + altura_alumnos[i]);
        }
        media = (double) media / altura_alumnos.length;
        return media;
    }

    private static double EncontrarMaximoAltura(double[] altura_alumnos) {

        double maximo = altura_alumnos[0];

        for (int i = 0; i < altura_alumnos.length; i++) {
            if (maximo < altura_alumnos[i]) {
                maximo = altura_alumnos[i];
            }

        }

        return maximo;
    }
    private static int SuperanMedia(double media, double[]arrayAlumnos) {
        int contador=0;
        for (int i = 0; i < arrayAlumnos.length; i++) {
            if(arrayAlumnos[i]>media){
                contador++;
            }
        }
        return contador;

    }

}
