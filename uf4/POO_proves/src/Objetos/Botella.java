/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author alumne
 */
public class Botella {
    private String material;
    private int capacitad_total;
    private int capacidad_actual;
    private boolean tapada;
    //public Vaso prueba;
    //lleno no lo ponemos porque se puede calcular 
    //a partir de los otros atributos.
    
    
    //metodes
    
    public void setMaterial(String nouMaterial)
    {
        if (nouMaterial.equalsIgnoreCase("Vidre")
                || nouMaterial.equalsIgnoreCase("Cartro"))
        {
            material = nouMaterial.toUpperCase();
            //this.material = nouMaterial.toUpperCase();
        }
        else
        {
            System.out.println("Material no permés");
        }
        
    }
    
    public String getMaterial()
    {
        return material;
    }

    public int getCapacitad_total() {
        return capacitad_total; //this.capacitat_total
    }

    public void setCapacitad_total(int capacitad_total) {
        this.capacitad_total= capacitad_total;
        capacitad_total = 1500;
        //capacitad_total = capacitad_total;
    }

    public int getCapacidad_actual() {
        return capacidad_actual;
    }

    public void setCapacidad_actual(int capacidad_actual) {
        this.capacidad_actual = capacidad_actual;
    }

    public boolean isTapada() {
        return tapada;
    }

    public void setTapada(boolean tapada) {
        this.tapada = tapada;
    }





}



