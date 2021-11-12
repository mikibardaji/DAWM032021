/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex10validarfecha;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex10ValidarFecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia,mes,anyo;
        System.out.println("Pon el dia");
        dia=sc.nextInt(); //5
        System.out.println("Pon el mes");
        mes=sc.nextInt(); //3
        System.out.println("Pon el anyo");
        anyo=sc.nextInt(); //7
        
        //boolean FechaValida = validarFecha(dia,mes,anyo);
        int FechaValida=validarFecha2(dia,mes,anyo);
        if(FechaValida==1)
        {
            System.out.println("Fecha correcta");
        }
        else if(FechaValida ==-1)
        {
            System.out.println("dia incorrecto debe estar entre 1 y 30");
        }
        else if(FechaValida ==-2)
        {
            System.out.println("mes incorrecto debe estar entre 1 y 12");
        }
        else if(FechaValida ==-3)
        {
            System.out.println("any debe ser superio a 19000");
        }
    }

    public static boolean validarFecha(int dia, int mes, int anyo) {
        boolean correcta = true;
        if (dia<1 || dia>30) //dia incorrecto
        {
            correcta = false;
        }
        if (mes<1 || mes>12)
        {
            correcta=false;
        }
        if (anyo<1900)
        {
            correcta = false;
        }
        return correcta;
    }
    
    
    /**
     * 
     * @param dia
     * @param mes
     * @param anyo
     * @return 1 si fecha correcta, -1 dia es incorrecto, -2 el mes es incorrecto, -3 anyo es incorrecte
     */
    public static int validarFecha2(int dia, int mes, int anyo) {
        int valido = 1;
        if (dia<1 || dia>30) //dia incorrecto
        {
            valido=-1;
            return valido;
        }
        if (mes<1 || mes>12)
        {
            valido = -2;
            return valido;
        }
        if (anyo<1900)
        {
            valido = -3;
            return valido;
        }
        return valido;
    }
    
    
    
    
    
}
