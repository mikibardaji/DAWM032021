/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caixabank;

import java.util.Scanner;
import objetosBank.CuentaBancaria;

/**
 *
 * @author alumne
 */
public class CaixaBank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaBancaria CCC;
        CCC= pedirDatos();
        int opcion;
        do{
        opcion = menu();
        switch(opcion)
        {
            case 1:
           //1. Datos de la cuenta. Mostrará el IBAN, el titular y el saldo.\n
                mostrarDatos(CCC);
                break;
            case 2:
              //"2. IBAN. Mostrará el IBAN.\n" +
                mostrarIBAN(CCC);                
                break;
            case 5:
                //"5. Ingreso. Pedirá la cantidad a ingresar y realizará el ingreso si es posible.\n" +
                realizarIngreso(CCC);
                break;
            case 6:
                realizarTransferencia(CCC);
                break;
            case 7:
                mostrarMovimientos(CCC);
                break;
               
        }
        
        
        
        
        
        
        }while(opcion!=8);
        
        
        
    }

    private static CuentaBancaria pedirDatos() {        
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon nombre titular");
        String titular = sc.nextLine();
        System.out.println("Pon IBAN");
        String IBAN = sc.nextLine();
        CuentaBancaria aux = new CuentaBancaria(IBAN, titular);
        return aux;
    }
    
    
    public static int menu(){
        System.out.println("1. Datos de la cuenta. Mostrará el IBAN, el titular y el saldo.\n" +
        "2. IBAN. Mostrará el IBAN.\n" +
        "3. Titular. Mostrará el titular.\n" +
        "4. Saldo. Mostrará el saldo disponible.\n" +
        "5. Ingreso. Pedirá la cantidad a ingresar y realizará el ingreso si es posible.\n" +
        "6. Retirada. Pedirá la cantidad a retirar y realizará la retirada si es posible.\n" +
        "7. Movimientos. Mostrará una lista con el historial de movimientos.\n" +
        "8. Salir. Termina el programa.");
        Scanner Sc = new Scanner(System.in);
        System.out.print("Escoge opcion:");
        int opcion = Sc.nextInt();
        return opcion;
    }

    
    /**
     * Datos de la cuenta. Mostrará el IBAN, el titular y el saldo.\n
     * @param CCC cuenta a mostrar sus datos
     */
    private static void mostrarDatos(CuentaBancaria CCC) {
        System.out.println("IBAN: " + CCC.getIBAN());
        System.out.println("Titular: " + CCC.getTitular());
        System.out.println("Saldo: " + CCC.getSaldo());
    }

    private static void mostrarIBAN(CuentaBancaria CCC) {
        System.out.println("IBAN: " + CCC.getIBAN());
    }

    private static void realizarIngreso(CuentaBancaria CCC) {   
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon dinero a ingresar");
        double ingresar = sc.nextDouble();
        CCC.ingreso(ingresar);
       
        
    }
    
    
    private static void realizarTransferencia(CuentaBancaria CCC) {   
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon dinero de la transferencia");
        double transf = sc.nextDouble();
        CCC.retirada(transf);
       
        
    }

    private static void mostrarMovimientos(CuentaBancaria CCC) {
        CCC.mostrarMovimientos();
        
        
    }
    
    
    private static void mostrarMovimientos2(CuentaBancaria CCC) {
        double[] numeroMovimientos = CCC.getMovimientos();
        for (int i = 0; i < numeroMovimientos.length; i++) {
            if (numeroMovimientos[i]<0)
            {
                System.out.println("Transferencia" + numeroMovimientos[i]);
            }
            else if(numeroMovimientos[i]>0)
            {
                System.out.println("Ingreso " + numeroMovimientos[i]);
            }
            //si es 0 no lo imprimo.
        }
        
    }
    
}
