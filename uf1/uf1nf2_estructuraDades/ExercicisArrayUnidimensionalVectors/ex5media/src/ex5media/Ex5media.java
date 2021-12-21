/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex5media;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex5media {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tamanyo_array = 20;
        int[] valores = new int[tamanyo_array];
        
        pedirValores(valores);
        int suma = sumarValores(valores);
        double media = calcularMedia(suma, valores.length);
        System.out.println("Tu media es " + media);
    }

    private static void pedirValores(int[] valores) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Pon el valor numero " + (i+1));
            valores[i] = sc.nextInt();
        }
        
    }

    private static int sumarValores(int[] valores) {
        int acum_valores=0;
        for (int i = 0; i < valores.length; i++) {
            acum_valores = acum_valores + valores[i];            
        }
        return acum_valores;
    }

    private static double calcularMedia(int suma, int numero_notas) {
        double media = (double)suma/numero_notas;
        return media;
    }
    
}
