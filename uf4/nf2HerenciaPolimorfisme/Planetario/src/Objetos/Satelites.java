/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author alumne
 */
public class Satelites extends Astros{
    private int distancia_planeta;
    private int orbita_planeta;
    private String planeta_pertenece;

    public Satelites(int distancia_planeta, int orbita_planeta, String planeta_pertenece, String nombre, int rotacion, double masa) {
        super(nombre, rotacion, masa);
        this.distancia_planeta = distancia_planeta;
        this.orbita_planeta = orbita_planeta;
        this.planeta_pertenece = planeta_pertenece;
    }

    public Satelites(String nombre) {
        super(nombre);
    }

    
    public int getDistancia_planeta() {
        return distancia_planeta;
    }

    public int getOrbita_planeta() {
        return orbita_planeta;
    }

    public String getPlaneta_pertenece() {
        return planeta_pertenece;
    }


    
    @Override
    public String toString() {
       String astro = super.toString();
        
        return "Satelites{" + astro + "distancia_planeta=" + distancia_planeta + ", orbita_planeta=" + orbita_planeta + ", planeta_pertenece=" + planeta_pertenece ;
    }
    
    
    
}
