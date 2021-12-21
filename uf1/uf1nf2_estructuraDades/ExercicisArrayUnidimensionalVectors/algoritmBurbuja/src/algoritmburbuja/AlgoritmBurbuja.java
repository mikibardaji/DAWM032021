/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmburbuja;

/**
 *
 * @author alumne
 */
public class AlgoritmBurbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] valores = {34,56,33,78,23,90,120,5,35};
        
        mostrarArray(valores);
        algoritmoBurbuja(valores);
         mostrarArray(valores);
        
    }

    private static void mostrarArray(int[] valores) {
        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i]+"-");
        }
        System.out.println("");
    }

    /**
     * metodo que ordena el array de menor a mayot
     * utilizando el metodo de la burbuja
     * @param valores 
     */
    private static void algoritmoBurbuja(int[] valores) {
        int aux_valor;
        int pos_orden;
        for(pos_orden=valores.length-1;pos_orden>=0;pos_orden--)
        {
          for (int i = 0; i < pos_orden; i++) {
            if(valores[i]>valores[i+1])
            {
                aux_valor = valores[i+1];
                valores[i+1] = valores[i];
                valores[i] = aux_valor;
            }
        }   
        }
       
    }
    
    
    
}
