/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import java.util.Objects;

/**
 *
 * @author alumne
 */
public class Astros {
    protected String nombre;
    protected int rotacion;
    protected double masa;

    public Astros(String nombre, int rotacion, double masa) {
        this.nombre = nombre;
        this.rotacion = rotacion;
        this.masa = masa;
    }

    public Astros(String nombre) {
        this.nombre = nombre;
    }

    
    public String getNombre() {
        return nombre;
    }

    public int getRotacion() {
        return rotacion;
    }

    public double getMasa() {
        return masa;
    }

    
    @Override
    public String toString() {
        return "nombre=" + nombre + ", rotacion=" + rotacion + ", masa=" + masa + '}';
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
        final Astros other = (Astros) obj;
        return this.nombre.equalsIgnoreCase(other.getNombre());
    }
    
    
    
    
}
