/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;


import javax.naming.LimitExceededException;

/**
 *
 * @author alumne
 */
public class Specie {
    private String name;
    private String scientificName;
    private int numIndividuals;

    public Specie(String name, String scientificName, int numIndividuals) throws LimitExceededException {
        this.name = name;
        this.scientificName = scientificName;
        setNumIndividuals(numIndividuals);
    }

    public Specie(String scientificName) {
        this.scientificName = scientificName;
        this.name="";
        
    }



   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public int getNumIndividuals() {
        return numIndividuals;
    }

    public void setNumIndividuals(int numIndividuals) throws LimitExceededException {
        if (numIndividuals > 1 && numIndividuals <= 10) {
             this.numIndividuals = numIndividuals;
        }else{
            this.numIndividuals = 10;
            throw new LimitExceededException("Número de animales no valido, se fija en 10 unidades");
            
        }
        
        
    }

    @Override
    public String toString() {
        return "Nombre especie: " + name + ", nombre científico: " + scientificName + ", número animales: " + numIndividuals;
    }

 

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Specie other = (Specie) obj;
        return this.name.equalsIgnoreCase(other.name) || this.scientificName.equalsIgnoreCase(other.scientificName);
        
    }
    
    
    
    
}
