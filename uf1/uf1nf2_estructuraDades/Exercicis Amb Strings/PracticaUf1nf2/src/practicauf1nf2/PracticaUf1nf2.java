/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicauf1nf2;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class PracticaUf1nf2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double valor = 66;
        String nombre = pedirDatos("Pon tu nombre: ");
        String apellido = pedirDatos("Pon tu apellido: ");
        String DNI = pedirDatos("Pon tu DNI: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos productos has comprado? ");
        int num_productos = sc.nextInt();
        
        double[] lista_productos = new double[num_productos];
        pedirProductos(lista_productos, sc);
        
        
        System.out.println("Codigo cliente: " + calcularCodigo(nombre, apellido, DNI));
        
        listarProductos(lista_productos);
        double total = suma(lista_productos);
        System.out.println("suma total sin descuento " + total);
        
        int descuento = calcularDescuento(lista_productos,valor,total);
        
       
        double euros_descuento = (double)(total * descuento)/100;
        double precio_final = total - euros_descuento;
        
        System.out.println("Descuento a aplicar: " + descuento + "%");
        System.out.println("Precio final con descuento :" + precio_final);
        
        
    }
    
    
    private static String pedirDatos(String frase) {
        Scanner sc = new Scanner(System.in);
            System.out.print(frase);
            String accion = sc.nextLine();
            return accion;
    }

    private static void pedirProductos(double[] lista_productos, Scanner sc) {
        for (int i = 0; i < lista_productos.length; i++) {
            System.out.println("pon precio producto" + (i+1) + ":");
            lista_productos[i] = sc.nextDouble();
        }
    }
    
    
    private static void listarProductos(double[] lista_productos) {
        for (int i = 0; i < lista_productos.length; i++) {
            System.out.println("precio producto" + (i+1) + "=" + lista_productos[i]);
        }
    }
    
    
    public static double suma(double lista_productos[])
    {
        double acum_compra=0;
        for (int i = 0; i < lista_productos.length; i++) {
            acum_compra = acum_compra + lista_productos[i];
        }
        
        return acum_compra;
    }
    
    public static String calcularCodigo (String nombre, String apellido, String DNI)
    {
        String codigo = nombre.substring(0, 2)+ apellido.substring(0, 2) + DNI.substring(4, 8);
        return codigo;
        
    }

    private static boolean hayMayorQue(double[] lista_productos, double valor) {
        for (int i = 0; i < lista_productos.length; i++) {
            if(lista_productos[i]>valor)
            {
                return true;
            }
                
        }
        return false;
    }

    private static double difmaxmin(double[] lista_productos) {
        double max,min;
        max = lista_productos[0];
        min = lista_productos[0];
        for (int i = 0; i < lista_productos.length; i++) {
                if(lista_productos[i]>max)
                {
                    max = lista_productos[i];
                }
                if (lista_productos[i]<min)
                {           
                    min = lista_productos[i];
                }
            }
        
        double diferencia = max - min;
        return diferencia;
        }

    private static int calcularDescuento(double[] lista_productos, double valor, double total) {
        int descuento = 3;
        if (total>100)
        {
            descuento = descuento + 5;
        }
      
        if (hayMayorQue(lista_productos, valor))
        {
            descuento = descuento + 6;
        }
        //double diferencia = difmaxmin(lista_productos);
        if (difmaxmin(lista_productos)> 50)
        {
            descuento = descuento + 10;
        }    
        return descuento;
    }
        
    }

