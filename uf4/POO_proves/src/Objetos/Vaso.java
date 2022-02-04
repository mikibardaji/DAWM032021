/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author alumne
 */
public class Vaso {
    private String material;
    private int capacitad_total;
    private int capacidad_actual;
    //private boolean lleno;

    public Vaso()
    {
        this.material = "Vidre";
        this.capacitad_total = 300; //se podria llamar al set, pero como no tiene validaciones
        this.capacidad_actual = 0;
    }

    public Vaso(int capacitad_total) {
        this.material = "Vidre";
        this.capacitad_total = capacitad_total;
        this.capacidad_actual = 0;
    }
    
    
    
    public void setMaterial(String material) {
        this.material = material;
    }

    public void setCapacitad_total(int capacitad_total) {
        this.capacitad_total = capacitad_total;
    }

    //public void setCapacidad_actual(int capacidad_actual) {
    //    this.capacidad_actual = capacidad_actual;
    //}
    public void llenarVaso(int liquido_llenar) //seria el sinonimo de setCapacidadActual
    {
        if ((this.capacidad_actual + liquido_llenar)
                < capacitad_total) //<-- esta ya es el this por defecto
        {
        this.capacidad_actual = this.capacidad_actual + liquido_llenar;
    }   
        else
        {
            this.capacidad_actual = this.capacitad_total;
        }
        
    }
    
    

    public String getMaterial() {
        return material;
    }

    public int getCapacitad_total() {
        return capacitad_total;
    }

    public int getCapacidad_actual() {
        return capacidad_actual;
    }
    
    public boolean isLleno()
    {
        //if (capacidad_actual==capacitad_total)
        if (this.capacidad_actual==this.capacitad_total)
            return true;
        else
            return false;
    }
    
    public int beberLiquido(int sorbo)
    {
//        final =50;
        //this.capacidad_actual -= sorbo;
        if (this.capacidad_actual>= sorbo)
        {
            this.capacidad_actual = this.capacidad_actual - sorbo;
        }
        else
        {
            sorbo = this.capacidad_actual;
            this.capacidad_actual = 0;
        }
        
        return sorbo;
    }
    
    
}
