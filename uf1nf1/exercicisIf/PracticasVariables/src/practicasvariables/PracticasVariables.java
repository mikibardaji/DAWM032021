/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicasvariables;

/**
 *
 * @author alumne
 */
public class PracticasVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //tipodata(int,float,...) nombreinventado=valor;
        int numero;
        double numeroConDecimales ;
        double x=9.25;
        boolean cierto_falso = true;
        
        numero=40;
        numeroConDecimales= 10.25;
        int doble;
        //calcular el doble de la variabe numero
        
        
        doble = numero*2;
        cierto_falso= (numeroConDecimales != x);
        System.out.println("numero-> " + numero);
        System.out.println("Su doble es " + doble);
        System.out.println("decimales " + numeroConDecimales);
        System.out.println("el numero x es " + x);
        System.out.println("el booleano vale " + cierto_falso);
        
    }
    
}
