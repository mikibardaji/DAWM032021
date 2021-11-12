/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex11taulamultiplicar;

/**
 *
 * @author alumne
 */
public class Ex11TaulaMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        tablaMultiplicar(5);
    }
    
    public static void tablaMultiplicar(int num_tabla)
    {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num_tabla + "*" + i + "=" + (i*num_tabla));
        }
    }
}
