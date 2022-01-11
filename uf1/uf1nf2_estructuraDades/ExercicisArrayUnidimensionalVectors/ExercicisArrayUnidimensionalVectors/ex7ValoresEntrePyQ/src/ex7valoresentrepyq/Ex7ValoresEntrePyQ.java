/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex7valoresentrepyq;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex7ValoresEntrePyQ {

    /**
     * Crea un programa que pida dos valores enteros P y Q, luego cree un array que contenga
todos los valores desde P hasta Q, y lo muestre por pantalla.
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Pon un valor ");
       int P = sc.nextInt();
            System.out.println("Pon otro valor ");
       int Q = sc.nextInt();
       
       int tamanyo = calcularTamanyo(P,Q);
       int[] valores = new int[tamanyo];
       
       llenarArray(valores,P,Q);
       mostrarArray(valores);
    }

    private static int calcularTamanyo(int P, int Q) {
        int pequenyo,grande;
        if (P>Q)
        {
            pequenyo = Q;
            grande = P;
        }
        else
        {
            pequenyo = P;
            grande = Q;
        }
        return (grande-pequenyo + 1);
    }

    private static void llenarArray(int[] valores, int P, int Q) {
        int pequenyo,grande;
        
        if (P>Q)
        {
            pequenyo = Q;
            grande = P;
        }
        else
        {
            pequenyo = P;
            grande = Q;
        }
        
        for (int index = 0; index < valores.length; index++) {
            valores[index] = pequenyo;
            pequenyo++;
        }
        
        

    }

    private static void mostrarArray(int[] valores) {
        for (int i = 0; i < valores.length; i++) {
            System.out.println("indice " + i +"=" + valores[i]);
            
        }
    }
    
}
