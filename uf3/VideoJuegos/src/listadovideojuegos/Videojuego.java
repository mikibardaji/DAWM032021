/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadovideojuegos;

import java.io.Serializable;




/**
 *
 * @author usuari
 */
public class Videojuego implements Serializable{
    private String nombre;
    private int precio;

    public Videojuego(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Videojuego(String nombre) {
        this.nombre = nombre;
        this.precio = 0;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        if (precio<0)
        {
            this.precio = 5;
        }
        else
        {
            this.precio = precio;
        }
        
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Videojuego)) {
            return false;
        }
        final Videojuego other = (Videojuego) obj;
        if (this.nombre.equalsIgnoreCase(other.nombre)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder mostrar = new StringBuilder();
        
        mostrar.append(" name -> " + nombre);
        mostrar.append(" == ");
        mostrar.append(" prize->" + precio);
       
        return mostrar.toString();
    }
    
    
}
