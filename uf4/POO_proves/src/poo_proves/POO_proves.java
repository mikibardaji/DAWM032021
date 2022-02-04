/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_proves;

import Objetos.Botella;
import Objetos.Vaso;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class POO_proves {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Botella primera; //NULL
        //primera.isPlena();
        primera=new Botella(); //constructor (reserva memoria)
        
        Botella segona = new Botella("Cartro");
        Botella tercera = new Botella("Cartro", 500);
        System.out.println("esta plena" + primera.isPlena());
        Vaso got1=new Vaso();
        Vaso got2=new Vaso(100);
        Vaso got3=new Vaso(100);
        Vaso got4=new Vaso();
        Vaso got5=new Vaso();
        
       // String material = "Vidre";
        //primera.setMaterial(material);
        //got1.setMaterial(material);
//        got2.setMaterial(material);
//        got3.setMaterial(material);
//        got4.setMaterial(material);
//        got5.setMaterial(material);
        
       // primera.setCapacitad_total(1000);
        primera.rellenarCapacidadActual(950);
        tercera.rellenarCapacidadActual(500);
//        got1.setCapacitad_total(300);
//        got2.setCapacitad_total(300);
//        got3.setCapacitad_total(300);
//        got4.setCapacitad_total(300);
//        got5.setCapacitad_total(300);
        
        //primera.obrirBotella();
        //System.out.println("esta tapada " + primera.isTapada());
        while (tercera.getCapacidad_actual()!=0)
        {
            if(tercera.isTapada())
            {
                System.out.println("abro botella");
                tercera.obrirBotella();
            }
            if (!got1.isLleno())
            {
                got1.llenarVaso(tercera.vessarBotella());
                System.out.println("relleno got1");
                Thread.sleep(1000);
                if(got1.isLleno())
                {
                    System.out.println("vaso 1 lleno");
                }
            }
            else if (!got2.isLleno())
            {
                got2.llenarVaso(tercera.vessarBotella());
                System.out.println("relleno got2");
                Thread.sleep(1000);
                if(got2.isLleno())
                {
                    System.out.println("vaso 2 lleno");
                } 
            }
            else if (!got3.isLleno())
            {
                got3.llenarVaso(tercera.vessarBotella());
                System.out.println("relleno got3");
                Thread.sleep(1000);
                if(got3.isLleno())
                {
                    System.out.println("vaso 3 lleno");
                } 
            }           
            else if (!got4.isLleno())
            {
                got4.llenarVaso(tercera.vessarBotella());
                System.out.println("relleno got4");
                Thread.sleep(1000);
                if(got4.isLleno())
                {
                    System.out.println("vaso 4 lleno");
                } 
            }              
            else if (!got5.isLleno())
            {
                got5.llenarVaso(tercera.vessarBotella());
                System.out.println("relleno got5");
                Thread.sleep(1000);
                if(got5.isLleno())
                {
                    System.out.println("vaso 5 lleno");
                } 
            }            
            
        }
        
        
        System.out.println("vaso 4 " + got4.getCapacidad_actual());
        System.out.println("vaso 5 " + got5.getCapacidad_actual());
        
        
        Scanner sc= new Scanner(System.in);
        
        
    }
    
}
