/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemple2buclespedirnumerodiferente0;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Exemple2BuclesPedirNumerodiferente0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, acumulandoSuma=0;
        
   //     do{
   //         System.out.print("Introduce numeros(pon 0 para terminar): ");
   //         num=teclado.nextInt();
   //         acumulandoSuma=acumulandoSuma + num;
   //         System.out.println("El acumulado parcial " + acumulandoSuma);
   //         //acumulandoSuma += sum;
   //     }while(num!=0);
   //     System.out.println("El total de la suma es " + acumulandoSuma);
        //System.out.println("Has escrito 0 , se terminó el programa");
        
        
        
//        do{
//            System.out.print("Introduce numeros(pon -1 para terminar): ");
//            num=teclado.nextInt();
//            if (num!=-1) //para que entre y lo suma
//            {
//                acumulandoSuma=acumulandoSuma + num;
//                System.out.println("El acumulado parcial " + acumulandoSuma);
//            }
//            //no es necesario el else porque no hace nada
//            //else
//           // {
//           //     System.out.println("has puesto el final y no paso por la instruccion de acumular suma");
//           // }
//            //acumulandoSuma += sum;
//        }while(num!=-1);
//        System.out.println("El total de la suma es " + acumulandoSuma);
        
        boolean finalBucle = false;
        
//         do{
//            System.out.print("Boolean: Introduce numeros(pon -1 para terminar): ");
//            num=teclado.nextInt();
//            if (num!=-1) //para que entre y lo suma
//            {
//                acumulandoSuma=acumulandoSuma + num;
//                 //acumulandoSuma += sum;
//                System.out.println("El acumulado parcial " + acumulandoSuma);
//            }
//            else //he introducido -1 que es el final y activo el boolean
//            {
//                finalBucle=true;
//            }
//           
//        }while(!finalBucle);
//        System.out.println("El total de la suma es " + acumulandoSuma);
        
//ejericicio que sume numeros hasta pasar de 100
         do{
            System.out.print("Boolean: Introduce numeros cuando acumulado sume mas de 100 parare: ");
            num=teclado.nextInt();
            if(num>0)
            {
                acumulandoSuma=acumulandoSuma + num;
            }
            else
            {
                System.out.println("Numero 0 o negativo, no lo sumo");
            }
            
                 //acumulandoSuma += sum;
            System.out.println("El acumulado parcial " + acumulandoSuma);

            if(acumulandoSuma>=100)//activat fin de bucle
            {
                finalBucle=true;
            }
           
        }while(!finalBucle);
        System.out.println("El total de la suma es " + acumulandoSuma);






        
    }
    
}
