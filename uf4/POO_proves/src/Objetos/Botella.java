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
    
    public Botella()
    {
        this.setMaterial("Vidre");
//        capacitad_total = 1000;
        this.setCapacitad_total(1000);
        this.capacidad_actual = 0;
        //this.rellenarCapacidadActual(0);
        this.tapada = false; //this.taparBotella()
        
    }
    
    public Botella(String Material)
    {
        this.setMaterial(Material);
        this.setCapacitad_total(1000);
        this.capacidad_actual = 0;
        //this.rellenarCapacidadActual(0);
        this.tapada = false; //this.taparBotella()
    }

    public Botella(String material, int capacitad_total) {
        this.setMaterial(material);
        this.capacitad_total = capacitad_total;
        this.capacidad_actual = 0;
        //this.rellenarCapacidadActual(0);
        this.tapada = false; //this.taparBotella()

    }
    
    
    
    
    
    
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
        //capacitad_total = 1500;
        ////capacitad_total = capacitad_total;
    }

    public int getCapacidad_actual() {
        return capacidad_actual;
    }

//    public void setCapacidad_actual(int capacidad_actual) {
//        this.capacidad_actual = capacidad_actual;
//    }
    
    public void rellenarCapacidadActual(int capacidad_actual) {
        if ((this.capacidad_actual + capacidad_actual)
                < capacitad_total) //<-- esta ya es el this por defecto
        {
        this.capacidad_actual = this.capacidad_actual + capacidad_actual;
    }   
        else
        {
            this.capacidad_actual = this.capacitad_total;
        }
    
    
    }
    
    

    public boolean isTapada() {
        return tapada;
    }

    //elimino el setter perque ja existeix obrir i tancar
//    public void setTapada(boolean tapada) {
//        this.tapada = tapada;
//    }

    public void obrirBotella()
    {
        tapada = false;
    }
    
    public void taparBotella()
    {
        tapada = true;
    }
    
    /**
     * metodo que simula , els ml que tira una botella cada vez que la decantamos
     * @return el liquido vertido, o devuelve -1 si la botella esta tapada.
     */
    public int vessarBotella()
    {
        final int cantitat_vessada = 25;
        if (!this.isTapada())
        {
            if (this.capacidad_actual< cantitat_vessada)
            {
               int mlqueda = this.capacidad_actual;
               this.capacidad_actual = 0; //botella sin liquido
               return mlqueda;
            }
            else
            {
            this.capacidad_actual = this.capacidad_actual - cantitat_vessada;
            return cantitat_vessada;
            }
        }
        else
        { //si esta tapada
            return -1;
        }
        
    }

    public boolean isPlena()
    {
        return this.capacidad_actual == this.capacitad_total;
    }


}



