/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author alumne
 */
public final class Loro extends Aves {
    private String origen;
    private boolean habla;

    public Loro( String nombre, int edat, boolean estado, int anyo_nacimiento, int pico, boolean vuela,String origen, boolean habla) {
        super(nombre, edat, estado, anyo_nacimiento, pico, vuela);
        this.origen = origen;
        this.habla = habla;
    }
    
    
    

    public String getOrigen() {
        return origen;
    }

    public boolean isHabla() {
        return habla;
    }

    @Override
    protected void volar() {
        if (this.vuela)
        {
            System.out.println("Vuelo poquito");
        }
        else
        {
            System.out.println("camino lento");
        }
    }

    @Override
    protected void habla() {
        if (habla)
        {
        System.out.println("hola");
        }
        else
        {
            System.out.println("beeerc");
        }
           
    }

    @Override
    public String toString() {
        String Ave = super.toString();
        return "Loro{" + Ave + "origen=" + origen + ", habla=" + habla + '}';
    }
    
    
    
    
}
