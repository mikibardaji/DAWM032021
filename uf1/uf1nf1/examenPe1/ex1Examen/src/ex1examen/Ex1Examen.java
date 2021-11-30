/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1examen;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex1Examen {

    /**
     * Escribe un programa que pida números al usuario, el programa pedirá valores numéricos al usuario, y parará cuando lleve 3(1,25pt) números introducidos que sean superiores a 10 y menores que 20.
Al terminar, debe mostrar, cuántos números has introducido(1pt), hasta que ha parado, y debe mostrar la suma de los 3 números superior o igual a 10 y menor que 20(1)

     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //resultado_final intentos de numeros introducidos, y la suma
       int numIntroducidos=0; //cuantos numeros he escrito
       int sumaEntre10y20=0; //la suma de los 3 valores entre 10 y 20
       int contEntre10y20=0; //contara els numeros que he ficat entre 10 i 20
       int num;
       Scanner sc = new Scanner(System.in);
       
       do{
        System.out.print("Fica numero?");
        num = sc.nextInt();
        numIntroducidos++;
        if (num>=10 && num<20)
        {
            sumaEntre10y20 = sumaEntre10y20 + num;
            contEntre10y20++;
        }
        
       }while(contEntre10y20<3);
       
       
        System.out.println("has introducido " + numIntroducidos + " numeros");
        System.out.println("La suma de los numeros entre 10 y 20 es " + sumaEntre10y20 );
    }
    
}
