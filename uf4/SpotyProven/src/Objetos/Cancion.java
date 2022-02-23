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
public class Cancion {
    private final String titol;
    private final String autor;
    private String album;
    private int duracion;

    public Cancion(String titol, String autor) {
        this.titol = titol;
        this.autor = autor;
        album = "Desconocido";
        duracion = 0;
    }

    public Cancion(String titol, String autor, String album, int duracion) {
        this.titol = titol;
        this.autor = autor;
        this.album = album;
        this.duracion = duracion;
    }

    public String getTitol() {
        return titol;
    }

    public String getAutor() {
        return autor;
    }

    public String getAlbum() {
        return album;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
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
        final Cancion other = (Cancion) obj;
        if (!this.titol.equalsIgnoreCase(other.titol)) {
            return false;
        }
        return this.autor.equalsIgnoreCase(other.autor);
    }

    @Override
    public String toString() {
        return "La canción " + titol + " es del autor " + autor + " incluida en el  album " + album + " y dura " + duracion + " segundos";
    }





    
    
    
}
