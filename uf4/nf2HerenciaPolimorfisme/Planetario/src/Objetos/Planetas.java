/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author alumne
 */
public class Planetas extends Astros{
    private int distancia_sol;
    private int orbita_sol;
    private boolean tiene_satelites;

    public Planetas(int distancia_sol, int orbita_sol, boolean tiene_satelites, String nombre, int rotacion, double masa) {
        super(nombre, rotacion, masa);
        this.distancia_sol = distancia_sol;
        this.orbita_sol = orbita_sol;
        this.tiene_satelites = tiene_satelites;
    }

    public Planetas(String nombre) {
        super(nombre);
    }

    
    
    public int getDistancia_sol() {
        return distancia_sol;
    }

    public int getOrbita_sol() {
        return orbita_sol;
    }

    public boolean isTiene_satelites() {
        return tiene_satelites;
    }

    
    
    @Override
    public String toString() {
        String astros = super.toString();
        return "Planetas{" + "distancia_sol=" + distancia_sol + ", orbita_sol=" + orbita_sol + ", tiene_satelites=" + tiene_satelites + "-" + astros;
    }







    
    
    
}
