/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1punto;

import ObjetosDAO.Persona;
import ObjetosDAO.Punto;
import java.util.Scanner;

/**
 *
 * @author usuari
 */
public class Ex1Punto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        trabajarPersonaMain();
        //trapabarPuntoMain();
        //trabajarPuntoStatic();
    }

    private static void trabajarPersonaMain() {
        Persona per1,per2,per3;
        Scanner sc = new Scanner(System.in);
        //System.out.println("pon dni");
        String dni = askInput("Pon dni");

        String nombre = askInput("pon nombre");
        System.out.println("pon edad");
        int  edad  = sc.nextInt();
        per1 = new Persona(dni, nombre, "miapellido", edad);
      
        dni = askInput("pon dni2");
        
        nombre = askInput("pon nombre2");
        System.out.println("pon edad2");
        edad  = sc.nextInt();
        
        
        
        per2 = new Persona(dni, nombre, "miapellido2", edad);
//        System.out.println(per1.getDNI() + "-" + per1.getNombre());
        per1.imprime();
        per2.imprime();
        System.out.println("mayor edad 1 -" + per1.esMayorEdad());
        System.out.println("mayor edad 2 -" + per2.esMayorEdad());
        int numero=5;
        int difer = per1.diferenciaEdad(per2);
        System.out.println("os llevais " + difer + " años");
        System.out.println("cambia el dni de la persona 1");
            nombre = askInput("Pon su nuevo nombre");
        per1.setNombre(nombre);
        per1.imprime();
        
//         System.out.println(per2.getDNI() + "-" + per2.getNombre());
    }

    private static void trapabarPuntoMain() {
        Punto p1,p2,p3;
        p1=new Punto(5,0);
        
        p2=new Punto(10,10);
        
        //System.out.println("p1.x " + p1.getX() + " p1.y " + p1.getY());
        //System.out.println("p2.x " + p2.getX() + " p2.y " + p2.getY());
        p1.imprime();
        p2.imprime();
        //p1.x += 5;
        
        p1.setXY(20, 10);
        //p1.setX(20);
        //p1.setX(5);
//        p2.setY(p2.getY()+7);
        p2.setXY(25, 100);
//         System.out.println("p1.x " + p1.getX() + " p1.y " + p1.getY());

//        System.out.println("p2.x " + p2.getX() + " p2.y " + p2.getY());
  p1.imprime();
        p2.imprime();
        
        p1.desplaza(5, 15);
        p2.desplaza(-7, -17);
        System.out.println("desplazados");
          p1.imprime();
        p2.imprime();
        
        //p1 - 25,25  y el p2 es 18,83
        double dist = p1.distancia(p2);
        System.out.println("la distancia entre etos puntos es" + dist);
    }

    private static String askInput(String frase) {
       Scanner sc = new Scanner(System.in);
        System.out.println(frase);
        return sc.nextLine();
    }

    private static void trabajarPuntoStatic() {
        Punto p1,p2,p3;
        p1 = new Punto(4, 5);
        p2 = Punto.creaPuntoAleatorio();
        p3= Punto.creaPuntoAleatorio();
        double aleatorio = Math.random();
        p1.imprime();
        p2.imprime();
        p3.imprime();
        
        double valor_pi = Math.PI;
        Punto nuevo = new Punto();
        Punto.creaPuntoAleatorio(nuevo);
        System.out.println("nuevo tendria los valores");
    }
    
}
